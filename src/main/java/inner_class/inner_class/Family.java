package inner_class.inner_class;

//成员内部类
public class Family {

    private String name; //和内部类同名的私有成员变量
    private int memberNum; //和内部类不同名的私有成员变量
    private static String city = "shenzhen"; //静态成员变量

    public Family(String name, int memberNum) {
        this.name = name;
        this.memberNum = memberNum;
    }

    public void hangout() {
        System.out.println("Outer class " + name + " hang out.");
    }

    public void gameTogether() {
        System.out.println("Outer class " + name + " game together.");
    }

    public class Mother {

        private String name;

        public Mother(String name) {
            this.name = name;
        }

        public void hangout(){
            System.out.println("Inner class " + name + " hang out.");
        }

        public void testSysout() {
            System.out.println("Inner class name: " + name); //内部类访问自己的成员变量--直接访问
            System.out.println("Outer class name: " + Family.this.name); //内部类访问与外部类同名的成员变量 --- 需要『外部类.this.成员变量』
            System.out.println("Outer class city: " + city); //内部类访问外部类静态成员变量 --- 直接访问

            hangout(); //内部类访问自己的成员方法 --- 直接访问
            Family.this.hangout();  //内部类访问与外部类同名的成员方法 --- 需要『外部类.this.成员方法』
            gameTogether(); //内部类访问外部类不重名的成员方法 --- 直接访问
        }
    }

    public static void main(String[] args) {
        Family family = new Family("family", 3);
        Mother mother = family.new Mother("mother"); // 内部类要通过外部类对象创建
        mother.testSysout();
    }


}
