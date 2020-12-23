package expensemanager.income;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/incomes")
public class IncomeController {
    private final IncomeRepository repository;
    IncomeController(IncomeRepository repository){
        this.repository=repository;
    }
    @GetMapping
    ResponseEntity<List<Income>> getAllIncomes(){
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    ResponseEntity<Income> createIncome(@RequestBody Income toCreate){
        Income createdIncome = repository.save(toCreate);
        return ResponseEntity.created(URI.create("/"+createdIncome.getId())).body(createdIncome);
    }
}
