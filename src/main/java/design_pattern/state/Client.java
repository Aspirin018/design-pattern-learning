package design_pattern.state;

/**
 * @Description: TODO
 * @Author: liyu
 * @Date: 2020/4/9
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        StartState startState = new StartState();
        context.setState(startState);
        context.doAction();
    }
}
