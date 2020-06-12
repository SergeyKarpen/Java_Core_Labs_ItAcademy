package labs.itacademy.skarpen.hierarchy;

public class TechniquesBig extends InfoTechnique implements NeedDeliveryImp {

    public TechniquesBig(String name, int saleYear, double weight) {
        super(name, saleYear, weight);
    }

    @Override
    public String NeedDelivery() {
        return "You will need home delivery of this item. Because it is very hard";
    }
}
