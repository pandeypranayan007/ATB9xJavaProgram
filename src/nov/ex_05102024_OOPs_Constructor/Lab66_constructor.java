package nov.ex_05102024_OOPs_Constructor;

public class Lab66_constructor {
    public static void main(String[] args) {
        car tesla = new car();
        System.out.println(tesla.year);
        System.out.println(tesla.name);
        System.out.println(tesla.model);

        car nano = new car();
        nano.name = "Tata Nano";
        System.out.println(nano.name);


    }
}
