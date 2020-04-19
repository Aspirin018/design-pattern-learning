package java8.tmp.entity.strategy_pattern;

import java8.tmp.entity.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Author: liyu
 * @Date: 2020/4/19
 */
public class Context {
    private ApplePredicate predicate;

    public Context(ApplePredicate predicate) {
        this.predicate = predicate;
    }

    public List<Apple> filterApples(List<Apple> appleList) {
        List<Apple> filteredApples = new ArrayList<>();
        for(Apple apple : appleList) {
            if (predicate.test(apple)) {
                filteredApples.add(apple);
            }
        }
        return filteredApples;
    }

}
