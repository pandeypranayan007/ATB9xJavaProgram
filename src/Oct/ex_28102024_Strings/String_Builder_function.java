package Oct.ex_28102024_Strings;

public class String_Builder_function {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        stringBuffer.append("Dutta");
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);


        System.out.println("Pramod" + "Sharma");


        System.out.println("Hello" + " World!" // Modifies sb to "Hello World!"
        ); // Output: Hello World!

        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2; // Creates a new string "Hello World!"
        System.out.println(s3); // Output: Hello World!
        System.out.println(s1);


    }
}
