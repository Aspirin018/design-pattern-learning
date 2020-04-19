package java8.tmp.entity.pretty_print;

import java8.tmp.entity.Apple;

/**
 * @Description: TODO
 * @Author: liyu
 * @Date: 2020/4/19
 */
public class FullPrinter implements Printer {
    @Override
    public String print(Apple apple) {
        return "color: " + apple.getColor() + ", weight: " + apple.getWeight() +  (apple.getWeight() > 90 ? ", heavy." : ", light.");
    }
}
