package uk.ac.westminster.products_api;

public class PhyscialProduct extends Product {
    private double weightKg;
    private String dimensions;

    public PhyscialProduct () {

    }

    public PhyscialProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public double getWeightKg() {
        return weightKg;
    }
    public String getDimensions() {
        return dimensions;
    }
}
