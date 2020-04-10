package design_pattern.builder;

/**
 * @Description: TODO
 * @Author: liyu
 * @Date: 2020/4/9
 */
public abstract class Builder {

    abstract void buildBrand();
    abstract void buildVendor();
    abstract TV build();
}
