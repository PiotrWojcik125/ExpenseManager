package expensemanager.income;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.net.URI;
import java.util.List;

@RestController
public class IncomeController {
    private final IncomeRepository repository;
    IncomeController(IncomeRepository repository){
        this.repository=repository;
    }
    @GetMapping("/incomes")
    ResponseEntity<List<Income>> getAllIncomes(){
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping("/incomes")
    ResponseEntity<Income> createIncome(@RequestBody Income toCreate){
        Income createdIncome = repository.save(toCreate);
        return ResponseEntity.created(URI.create("/"+createdIncome.getId())).body(createdIncome);
    }
}
