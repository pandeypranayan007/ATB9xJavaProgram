package Oct.ex_30102024_Arrays;

public class Lab59_foreach_ {
    public static void main(String[] args) {
       //  int[] myNum = {10, 20, 30, 40};// we can declare array like this way it is more good way
        //String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

         int a[]= new int[4];
        //System.out.println(cars.length);
        a[0] = 90;
        a[1] = 91;
        a[2] = 92;
        a[3]=76;
//        for(int i=0; i<a.length; i++){
//            System.out.println(a[i]);
//    }
        for(int i:a){
            System.out.println(i);
        }
        String[] names = {"pramod", "amit", "lucky", "anil"};
        for (String name : names) {
            System.out.println(name);
        }

        for (String n : names) {
            System.out.println(n);
        }
}
}
