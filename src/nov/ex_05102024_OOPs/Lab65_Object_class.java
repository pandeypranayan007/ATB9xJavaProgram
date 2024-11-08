package nov.ex_05102024_OOPs;

public class Lab65_Object_class {
    public static void main(String[] args) {
        Cat c1= new Cat();
        c1.name = "rosey";
        c1.sleep();
        System.out.println(c1.name);
    }
}

class Cat{
    String name;


    void sleep(){
        System.out.println("Sleeping");
    }
}

