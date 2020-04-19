package java8.tmp.entity.strategy_pattern;

import java8.tmp.entity.Apple;

/**
 * @Description: TODO
 * @Author: liyu
 * @Date: 2020/4/19
 */
public interface ApplePredicate {
    boolean test(Apple apple);
}
