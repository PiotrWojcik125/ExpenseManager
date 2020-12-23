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
    public Integer getId(){
        return id;
    }
    public Double getValue() {
        return value;
    }

    public void setValue(final Double value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }
    public LocalDateTime getDate(){
        return date;
    }
    @PrePersist
    void created(){
        date=LocalDateTime.now();
    }
}
