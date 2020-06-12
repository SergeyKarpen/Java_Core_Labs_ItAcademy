package labs.itacademy.skarpen.hierarchy;

public class Technique {
    private String name;
    private int saleYear;
    private double weight;

    public Technique(String name, int saleYear, double weight) {
        this.name = name;
        this.saleYear = saleYear;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSaleYear() {
        return saleYear;
    }

    public void setSaleYear(int saleYear) {
        this.saleYear = saleYear;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}



