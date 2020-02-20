public class Exercise2 {
    public static void main (String arg[]){
        Newclass newclass = new Newclass();
        // 1 - Constructor that will initialize a class variable
        System.out.println("1 - Constructor that will initialize a class variable");
        newclass.setstr("My String 1 value");
        // 2 - Apply constructor overloading
        System.out.println("\n2 - Apply constructor overloading");
        newclass.setstr("My String 1 value", "My String 2 value");
        // 3 - Apply method overloading
        System.out.println("\n3 - Apply method overloading");
        newclass.secuenceofnumbers(1);
        newclass.secuenceofnumbers("a");
        // 4 - Create a property that returns a string.
        newclass.setMystring("This is my String");
        System.out.println("\n4 - Create a property that returns a string \nString value: " + newclass.getMystring());
        // 5 - Create a method to separate a list of 20 numbers between odds and even
        newclass.OddsEven();
        // 6 - Create a method to print numbers in the following pattern - from 0 to 20
        newclass.pattern();
    }
}
