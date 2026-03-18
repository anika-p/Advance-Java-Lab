@FunctionalInterface
interface Calc{
    String square(int n1);
}

public class MainFunctionalInterface {
    public static void main(String[] args) {
        // Add a=new Add() {

        //     @Override
        //     public int calculate(int n1, int n2) {
        //         // TODO Auto-generated method stub
        //         return (n1+n2);
        //     }
            
        // };
        // System.out.println("Sum="+a.calculate(23,34));
        // Add a1=(int n1,int n2)->{
        //     return (n1+n2);
        // };  //lambda expression
        // System.out.println("Sum="+a1.calculate(23, 34));
        // int num1=10,num2=30;
        Calc a1=n1->"Square="+(n1*n1);
        // {
            
        //     System.out.println("calculate func using lambda function");
        //     return (n1*n1);
        // };
        String result=a1.square(20);
        System.out.println(result);
    }
}
