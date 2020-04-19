package java8.tmp.entity;


/**
 * @Description: TODO
 * @Author: liyu
 * @Date: 2020/4/18
 */
public class Transaction {
    private Currency currency;
    private double price;


    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Transaction(Currency currency, double price) {
        this.currency = currency;
        this.price = price;
    }
}
