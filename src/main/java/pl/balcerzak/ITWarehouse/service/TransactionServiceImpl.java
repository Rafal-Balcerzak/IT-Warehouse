package pl.balcerzak.ITWarehouse.service;

import org.springframework.stereotype.Service;
import pl.balcerzak.ITWarehouse.entity.Transaction;
import pl.balcerzak.ITWarehouse.repository.TransactionRepository;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    @Override
    public Transaction getTransactionById(long id) {
        return transactionRepository.findByIdTransaction(id);
    }

    @Override
    public Transaction addTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
