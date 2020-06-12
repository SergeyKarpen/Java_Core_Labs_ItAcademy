package labs.itacademy.skarpen.hierarchy;

public class InfoTechnique extends Technique {
    public InfoTechnique(String name, int saleYear, double weight) {
        super(name, saleYear, weight);
    }
    // This method displays information about a specific technique.

    public String Info() {
        return getName() + ": " + "Date of sale: " + getSaleYear() + " The total mass of the product: " + getWeight();
    }

    //This method warranty service time


    public int count() {
        return getSaleYear() + Constants.AMOUNTELEMENTS;
    }

    public String countDate() {
        return "End of service " + count();
    }

    //This method specifies whether the delivery of goods

    public String NeedDelivery() {
        return "Will you need home delivery of this item?";
    }
}
