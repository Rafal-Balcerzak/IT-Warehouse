package pl.balcerzak.ITWarehouse.service;

import pl.balcerzak.ITWarehouse.entity.Transaction;

import java.util.List;

public interface TransactionService {

    List<Transaction> getAllTransactions();

    Transaction getTransactionById(long id);

    Transaction addTransaction(Transaction transaction);

    void deleteTransactionById(long id);

    Transaction editTransaction(Transaction transaction);
}
