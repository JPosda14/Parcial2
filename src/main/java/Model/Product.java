package Model;

public class Product {
    private String code;
    private String name;
    private String category;
    private double value;
    private int amount;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Product(String code, String name, String category, double value, int amount) {
        this.code = code;
        this.name = name;
        this.category = category;
        this.value = value;
        this.amount = amount;
    }
}
