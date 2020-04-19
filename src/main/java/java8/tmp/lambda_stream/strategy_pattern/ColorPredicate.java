package java8.tmp.entity.strategy_pattern;

import java8.tmp.entity.Apple;

/**
 * @Description: TODO
 * @Author: liyu
 * @Date: 2020/4/19
 */
public class ColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
