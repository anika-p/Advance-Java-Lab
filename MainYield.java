
public class MainYield {
    public static void main(String[] args) {
        int day=1;
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
            default:
                System.out.println("no day");
        }

        String result=switch(day){
            case 1,3,4->{
                System.out.println("this is 1,3 and 4");
                yield "Monday";
            }
            case 2->"Tuesday";
            default->"no day";
        };
        System.out.println(result);
    }
}
