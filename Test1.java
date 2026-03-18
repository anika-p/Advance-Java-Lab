interface Printer{
    default void print(String msg){
        System.out.println("Default:");
        show(msg);
    }
    private void show(String msg){
        System.out.println(msg.toUpperCase());
    }
}
public class Test1 implements Printer{
    public static void main(String[] args) {
    //     Printer p2=new Test1()::custom;
    //     p2.print("lambda");

    // }
    // void custom(String msg){
    //     System.out.println("Custom"+msg);
    // }
    var x=10;
    Runnable r=->{
        x=20;
        System.out.println(x);
    };
    r.run();
}
