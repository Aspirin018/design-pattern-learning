package state;

/**
 * @Description: TODO
 * @Author: liyu
 * @Date: 2020/4/9
 */
public class Context {
    private State state;

   public void doAction(){
       state.doAction(this);
   }



    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
