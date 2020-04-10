package design_pattern.builder;

/**
 * @Description: TODO
 * @Author: liyu
 * @Date: 2020/4/9
 */
public class TV {

    private Brand brand;

    private Vendor vendor;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }
}
