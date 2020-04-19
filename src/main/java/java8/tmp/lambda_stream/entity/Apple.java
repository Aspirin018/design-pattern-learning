package java8.tmp.entity;

/**
 * @Description: TODO
 * @Author: liyu
 * @Date: 2020/4/18
 */
public class Apple {
    private Integer weight;
    private String color;

    public Apple() {
    }

    public Apple(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
