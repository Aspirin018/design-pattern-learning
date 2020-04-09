package builder;

/**
 * @Description: TODO
 * @Author: liyu
 * @Date: 2020/4/9
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director(new SharpBuilder());
        TV tv = director.construct();
    }
}
