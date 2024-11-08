package nov.ex_05102024_OOPs_Constructor;

public class car {

    String model;
    int year;
    String name;


    // Default Constructor - No Arg.
    car() {
        name = "Unknown Name";
        model = "XYZ";
        year = 0;
        System.out.println("DC is executed!");
    }
}