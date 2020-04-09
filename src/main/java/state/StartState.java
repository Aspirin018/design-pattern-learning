package state;

/**
 * @Description: TODO
 * @Author: liyu
 * @Date: 2020/4/9
 */
public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("starting...");
        context.setState(new StopState());
        System.out.println("started, set stop state.");
    }
}
