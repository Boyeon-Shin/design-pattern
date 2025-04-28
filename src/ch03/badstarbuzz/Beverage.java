package ch03.badstarbuzz;

public class Beverage {
    String description = "Unknown Beverage";
    boolean milk;
    boolean soy;
    boolean mocha;
    boolean whip;
    double milkCost = 0.1;
    double soyCost = 0.2;
    double mochaCost = 0.2;
    double whipCost = 0.15;

    public double cost() {
        double condimentCost = 0.0;

        if (isMilk()) {
            condimentCost += milkCost;
        }
        if (isSoy()) {
            condimentCost += soyCost;
        }
        if (isMocha()) {
            condimentCost += mochaCost;
        }
        if (isWhip()) {
            condimentCost += whipCost;
        }
        return condimentCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public boolean isMilk() {
        return milk;
    }

    public void setMilk(final boolean milk) {
        this.milk = milk;
    }

    public boolean isSoy() {
        return soy;
    }

    public void setSoy(final boolean soy) {
        this.soy = soy;
    }

    public boolean isMocha() {
        return mocha;
    }

    public void setMocha(final boolean mocha) {
        this.mocha = mocha;
    }

    public boolean isWhip() {
        return whip;
    }

    public void setWhip(final boolean whip) {
        this.whip = whip;
    }
}
