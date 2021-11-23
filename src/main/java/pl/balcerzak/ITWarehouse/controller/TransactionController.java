package pl.balcerzak.ITWarehouse.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.balcerzak.ITWarehouse.entity.Transaction;
import pl.balcerzak.ITWarehouse.service.TransactionService;

import java.util.List;

@RestController
@RequestMapping("/api/transaction")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping
    ResponseEntity<List<Transaction>> getAllTransactions(){
        return ResponseEntity.ok(transactionService.getAllTransactions());
    }

    @GetMapping("/{id}")
    ResponseEntity<Transaction> getTransactionById(@PathVariable long id){
        return ResponseEntity.ok(transactionService.getTransactionById(id));
    }

    @PostMapping
    ResponseEntity<Transaction> addTransaction(@RequestBody Transaction transaction){
        return ResponseEntity.ok(transactionService.addTransaction(transaction));
    }
}
