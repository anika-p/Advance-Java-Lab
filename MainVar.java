public class MainVar {
    //var i=10;
    public static void main(String[] args) {
        int a=10;
        var b=20;
        var value=10.34;
        var c=20;
        c=19;

        String name=new String("This is string");
        var name1=new String("this is string with var");
        int[] arr={1,2,3,4};
        for (var elem : arr) {
            System.out.println(elem);
        }
    }
}
