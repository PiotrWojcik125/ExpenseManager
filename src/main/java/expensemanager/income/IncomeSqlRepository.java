package expensemanager.income;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface IncomeSqlRepository extends IncomeRepository, JpaRepository<Income,Integer> {

}
