package expensemanager.expense;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ExpenseSqlRepository extends ExpenseRepository, JpaRepository<Expense,Integer> {
}
