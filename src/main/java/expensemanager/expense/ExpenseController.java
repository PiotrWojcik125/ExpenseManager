package expensemanager.expense;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {
    private final ExpenseRepository repository;

    public ExpenseController(ExpenseRepository repository){
        this.repository=repository;
    }

    @GetMapping
    ResponseEntity<List<Expense>> getAllExpenses(){
        return ResponseEntity.ok(repository.findAll());
    }
    @PostMapping
    ResponseEntity<Expense> createExpense(@RequestBody Expense toCreate){
        Expense created = repository.save(toCreate);
        return ResponseEntity.created(URI.create("/"+created.getId())).build();
    }

}
