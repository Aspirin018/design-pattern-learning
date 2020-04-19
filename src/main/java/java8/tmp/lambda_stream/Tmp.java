package java8.tmp;

import java8.tmp.entity.Apple;
import java8.tmp.entity.Currency;
import java8.tmp.entity.Transaction;

import java.io.File;
import java.io.FileFilter;
import java.nio.file.DirectoryStream;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

/**
 * @Description: TODO
 * @Author: liyu
 * @Date: 2020/4/18
 */
public class Tmp {

    private static List<Apple> apples = new ArrayList<>();
    private static List<Transaction> transactions = new ArrayList<>();
    static {
        apples.add(new Apple(100, "green"));
        apples.add(new Apple(150, "red"));
        Currency a = new Currency("a");
        Currency b = new Currency("b");
        transactions.add(new Transaction(a, 100));
        transactions.add(new Transaction(a, 120));
        transactions.add(new Transaction(b, 120));
    }

    public void compareApple() {
        Collections.sort(apples, new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return o1.getWeight().compareTo(o2.getWeight());
            }
        });
    }

    public void compareAppleWithLambda() {
        apples.stream().sorted(Comparator.comparing(Apple::getWeight));
    }

    public void filterFiles() {
        File[] files = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isHidden();
            }
        });
    }

    public void filterFilesWithLambda() {
        File[] files = new File(".").listFiles(File::isHidden);
    }

    public void filterApples() {
        List<Apple> greenApples = new ArrayList<>();
        for(Apple apple : apples) {
            if("green".equals(apple.getColor())) {
                greenApples.add(apple);
            }
        }
    }

    private boolean isGreen(Apple apple) {
        return "green".equals(apple.getColor());
    }

    public List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> greenApples = new ArrayList<>();
        for(Apple apple : inventory) {
            if(p.test(apple)) {
                greenApples.add(apple);
            }
        }
        return greenApples;
    }

    public void usePredicateFilterApples() {
        filterApples(apples, this::isGreen);
        filterApples(apples, (Apple a) -> "green".equals(a.getColor()));
    }
    
    public void groupTransactions() {
        Map<Currency, List<Transaction>> transGrouped  = new HashMap<>();
        for(Transaction transaction : transactions) {
            if(transaction.getPrice() > 90) {
                Currency currency = transaction.getCurrency();
                List<Transaction> transactionList = transGrouped.get(currency);
                if(transactionList == null) {
                    transactionList = new ArrayList<>();
                    transGrouped.put(currency, transactionList);
                }
                transactionList.add(transaction);
            }
        }
    }
    
    public void groupTransByStream() {
        transactions.stream().filter(t -> t.getPrice() > 90).collect(Collectors.groupingBy(Transaction::getCurrency));
    }

    public static void testRunnable() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("run ...");
            }
        });
        thread.start();
        Thread thread1 = new Thread(() -> System.out.println("test lambda run ..."));
        thread1.start();
    }

    public static void main(String[] args) {
        testRunnable();
    }

    public void testLambda() {
        Comparator<Apple> appleComparator = (Apple a, Apple b) -> a.getWeight().compareTo(b.getWeight());
        Predicate<List<String>> listFilter = (List<String> s) -> s.isEmpty();
        Supplier<Apple> a = () -> new Apple(1, "a");
        Consumer<Apple> appleConsumer = (Apple a) -> System.out.println(a.getWeight());
        Function<Apple, Integer> appleIntegerFunction = (Apple b) -> b.getWeight();
        IntBinaryOperator intBinaryOperator = (int i, int j) -> i + j;
        Comparator<Apple> appleComparator1 = (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());
    }

    public void processRun(Runnable a) {
        a.run();
    }

    public void testProcessRun() {
        Runnable runnable = () -> System.out.println("start running...");
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("new runnable start running...");
            }
        };

        processRun(runnable);
        processRun(runnable1);
        processRun(() -> System.out.println("lambda start running..."));
    }



}
