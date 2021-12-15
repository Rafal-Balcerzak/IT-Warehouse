package pl.balcerzak.ITWarehouse.controller;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.balcerzak.ITWarehouse.entity.Transaction;
import pl.balcerzak.ITWarehouse.service.TransactionService;

import java.util.List;

@RestController
@RequestMapping("/api/transaction")
@CrossOrigin("*")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    ResponseEntity<List<Transaction>> getAllTransactions() {
        return ResponseEntity.ok(transactionService.getAllTransactions());
    }

    @GetMapping("/{id}")
    ResponseEntity<Transaction> getTransactionById(@PathVariable long id) {
        return ResponseEntity.ok(transactionService.getTransactionById(id));
    }

    @PostMapping
    ResponseEntity<Transaction> addTransaction(@RequestBody Transaction transaction) {
        return ResponseEntity.ok(transactionService.addTransaction(transaction));
    }

    @DeleteMapping("/{id}")
    void deleteTransactionById(@PathVariable long id) {
        transactionService.deleteTransactionById(id);
    }

    @PatchMapping
    ResponseEntity<Transaction> editTransaction(@RequestBody Transaction transaction) {
        return ResponseEntity.ok(transactionService.editTransaction(transaction));
    }

    @GetMapping("/download/{id}")
    public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable long id) throws Exception {
        try {
            Transaction transaction = transactionService.getTransactionById(id);
            String fileType = transaction.getAttachmentContentType().substring(0, 15);
            String fileName = transaction.getAttachmentContentType().substring(16);
            return ResponseEntity.ok()
                    .contentType(MediaType.parseMediaType(fileType))
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileName + "\"")
                    .body(new ByteArrayResource(transaction.getAttachment()));
        } catch (Exception e) {
            throw new Exception("Error downloading file");
        }
    }
}
