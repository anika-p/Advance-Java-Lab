class Animal{
    String name;
    String sound;
    Animal(){
        
        this("Cat","");
    }
    Animal(String name,String sound){
        this.name=name;
        this.sound=sound;
    }
    String getInfo(int a){
        return "";
    }
    void getInfo(){
        System.out.println("Name="+name);
        System.out.println("Sound="+sound);
    }
    void getInfo(String name,String Sound,int legs){
        System.out.println("Name="+name);
        System.out.println("Sound="+sound);
        System.out.println("Legs="+legs);
    }
}
class Cat extends Animal{
    Cat(String name,String sound){
        super(name,sound);
    }
    void getInfo(){
        System.out.println("Cat Name="+name);
        System.out.println("Cat Sound="+sound);
    }
}
public class PolyMain {
    public static void main(String[] args) {
        // Animal an1=new Animal("Horse","Hingggg");
        // an1.getInfo();
        // an1.getInfo("Cat","Meaow",4);
        Cat c1=new Cat("Cat2","meow");
        c1.getInfo();
    }
}
