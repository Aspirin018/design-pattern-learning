package builder;

/**
 * @Description: TODO
 * @Author: liyu
 * @Date: 2020/4/9
 */
public class SonyBuilder extends Builder {

    private TV tv = new TV();

    void buildBrand() {
        tv.setBrand(new Brand());
    }

    void buildVendor() {
        tv.setVendor(new Vendor());
    }

    TV build() {
        return tv;
    }
}
