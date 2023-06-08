package devera.kit.bean.model;

public class CandyFactory {
    public String[] products;

    public CandyFactory(String[] products) {
        this.products = products;
    }

    public static CandyFactory create() {
        return new CandyFactory(new String[] {"sugar"});
    }
}
