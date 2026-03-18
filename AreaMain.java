interface Area{
    double PI=3.14;
    double getArea();
}

class Circle implements Area{
    double r;

    public Circle(double r) {
        this.r=r;
    }
    
    public double getArea(){
        return (PI*r*r);
    }
    public void displayArea(){
        System.out.println("Area of circle="+this.getArea());

    }
}


public class AreaMain {
    public static void main(String[] args) {
        Circle c1=new Circle(14.5);
        c1.displayArea();
        //System.out.println("Area of circle="+c1.getArea());
        Area c2=new Circle(16.5);
        System.out.println("Area of circle="+c2.getArea());
        //shortcut of inheritance below
        Area r1=new Area(){

            @Override
            public double getArea() {
                // TODO Auto-generated method stub
                int l=10,b=40;
                return (l*b);
            }};
        System.out.println("Area of rectangle="+r1.getArea());
        
    }
}
