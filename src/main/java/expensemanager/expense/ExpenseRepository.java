package expensemanager.expense;

import java.util.List;

public interface ExpenseRepository {
    List<Expense> findAll();
    Expense save(Expense expense);
}
