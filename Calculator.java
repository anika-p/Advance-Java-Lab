class Sum{
    int a=5;
    int b=6;
    Sum(){
        int sum=this.a+this.b;
        System.out.println("Sum="+sum);
    }
}
class Product{
    int a;
    int b;
    Product(int a,int b){
        this.a=a;
        this.b=b;
        int prod=this.a*this.b;
        System.out.println("product="+prod);
    }
}
public class Calculator {
    public static void main(String[] args) {
        Sum s=new Sum();
        Product p=new Product(5, 10);
        
    }
}

