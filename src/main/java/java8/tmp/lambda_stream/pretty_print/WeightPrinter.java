package java8.tmp.entity.pretty_print;

import java8.tmp.entity.Apple;

/**
 * @Description: TODO
 * @Author: liyu
 * @Date: 2020/4/19
 */
public class WeightPrinter implements Printer {
    @Override
    public String print(Apple apple) {
        return "weight: " + apple.getWeight();
    }
}
