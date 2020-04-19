package java8.tmp.entity.pretty_print;

import java8.tmp.entity.Apple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Author: liyu
 * @Date: 2020/4/19
 */
public class Context {

    public static void prettyPrintApples(List<Apple> apples, Printer printer) {
        for(Apple apple : apples) {
            System.out.println(printer.print(apple));
        }
    }


    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(100, "green"));
        apples.add(new Apple(80, "green"));
        prettyPrintApples(apples, new WeightPrinter());
        prettyPrintApples(apples, new FullPrinter());

        prettyPrintApples(apples, new Printer() {
            @Override
            public String print(Apple apple) {
                return "this is a apple.";
            }
        });

        prettyPrintApples(apples, (apple) -> "hello apple");
    }
}
