package expensemanager.balance;

import javax.persistence.*;

@Entity
@Table(name = "Balances")
class Balance {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    Double value;
    /**
     * Hibernate needs it
     **/
    public Balance(){}
    Integer getId(){
        return id;
    }
    Double getValue(){
        return value;
    }
}
