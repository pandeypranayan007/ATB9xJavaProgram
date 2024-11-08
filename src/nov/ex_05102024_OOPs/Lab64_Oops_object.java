package nov.ex_05102024_OOPs;

public class Lab64_Oops_object {
    String name="virat";
    public static void main(String[] args) {
        StudentATB s1 = new StudentATB();
        s1.name = "Pramod"; // A
        s1.eat(10); // B
        System.out.println(s1);



        // ```
        //1. StudentsATB - Class Loading
        //2. s1 - Object Ref.
        //3. new StudentsATB() -> Object creation
        //```

        StudentATB s2 = new StudentATB();
        s2.name = "Amit";
        s2.eat(20); // B
        System.out.println(s2);





       // Person p1;
        // Person - Class Loaders - Load the class
        // p1 -> ref - null
        // Byte, Bits -> 8, 64



    }
}
