package design_pattern.state;

/**
 * @Description: TODO
 * @Author: liyu
 * @Date: 2020/4/9
 */
public class StopState implements State {
    public void doAction(Context context) {
        System.out.println("stopping....");
        context.setState(new StartState());
        System.out.println("stopped, set start state.");
    }
}
