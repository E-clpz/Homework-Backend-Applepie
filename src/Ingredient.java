public class Ingredient {
    private double amount;
    private String unit;
    private String name;

    public Ingredient() {
    }

    public Ingredient(double amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double newAmount) {
        this.amount = newAmount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String newUnit) {
        this.unit = newUnit;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String toString() {
        if (amount % 1 == 0) {
            return (int)amount + " " + unit + " " + name;
        }
        else {
            return amount + " " + unit + " " + name;
        }
    }
}










