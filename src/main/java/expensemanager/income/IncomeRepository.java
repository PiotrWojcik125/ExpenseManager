package expensemanager.income;


import java.util.List;


public interface IncomeRepository {

    Income save(Income income);

    List<Income> findAll();

}
