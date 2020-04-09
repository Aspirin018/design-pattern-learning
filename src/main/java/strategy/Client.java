package strategy;

/**
 * @Description: TODO
 * @Author: liyu
 * @Date: 2020/4/9
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context( new FirstStrategy());
        context.doSomething();
    }
}
