package data;

/**
 * Created by kamila on 05.04.17.
 */
public class Customer {
    private Integer id;
    private String password;
    private String surname;
    private String adress;
    private Double money;

    public Customer(Integer id, String password, String surname, String adress, Double money) {
        this.id = id;
        this.password = password;
        this.surname = surname;
        this.adress = adress;
        this.money = money;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
