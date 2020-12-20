package expensemanager.expense;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
@Table(name="expenses")
class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    Double value;
    String description;
    LocalDateTime date;
    /**
    * Hibernate needs it
    **/
    public Expense(){
    }
    Integer getId(){
        return id;
    }
    Double getValue() {
        return value;
    }

    void setValue(final Double value) {
        this.value = value;
    }

    String getDescription() {
        return description;
    }

    void setDescription(final String description) {
        this.description = description;
    }

    LocalDateTime getDate() {
        return date;
    }

    void setDate(final LocalDateTime date) {
        this.date = date;
    }
}
