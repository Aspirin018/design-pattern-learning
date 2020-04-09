package builder;

/**
 * @Description: TODO
 * @Author: liyu
 * @Date: 2020/4/9
 */
public class Director {
    private Builder builder = null;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public TV construct() {
        builder.buildBrand();
        builder.buildVendor();
        return builder.build();
    }
}
