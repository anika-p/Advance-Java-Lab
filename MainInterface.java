interface Calc{
    void calculate(int n1,int n2);
    default void calculate(int n1,int n2,int n3){
        int s=n1+n2+n3;
        //System.out.println("Sum="+s);
        getPrivateInfo("msg");
    }
    static String getInfo(){
        return "This is getInfo method inside Calc interface";
    }
    private void getPrivateInfo(String msg){
        System.out.println(msg);
    }
}
class Sum implements Calc{
    public void calculate(int n1,int n2){
        int s=n1+n2;
        System.out.println("Sum="+s);
    }
    public void calculate(int n1,int n2,int n3){
        int s=n1+n2+n3;
        System.out.println("Sum of 3 numbers="+s);

    }
}
public class MainInterface {
    public static void main(String[] args) {
        Sum c=new Sum();
        c.calculate(2,3);
        c.calculate(1,2,3);
        System.out.println(Calc.getInfo());
    }
}
