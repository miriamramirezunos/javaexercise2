import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Newclass {
    private String mystring, mystring2;

    public String getMystring(){
        return mystring;
    }
    public void setMystring(String mystring){
        this.mystring = mystring;
    }

    public void setstr(String mystring){
       this.mystring = mystring;
        System.out.println("Value of the variable (Constructor 1): " + this.mystring);
    }

    public void setstr(String mystring, String mystring2){
        this.mystring = mystring;
        this.mystring2 = mystring2;
        System.out.println("Value of the variables (Second constructor overloading): " + this.mystring + ", " + this.mystring2);
    }

    public void secuenceofnumbers (int a){
        ArrayList<Integer> arrayofnumbers = new ArrayList<Integer>();
        arrayofnumbers.add(1982);
        arrayofnumbers.add(1928);
        arrayofnumbers.add(2020);
        Collections.sort(arrayofnumbers);
        Iterator<Integer> iter = arrayofnumbers.iterator();
        System.out.println("Sequence of numbers 1st method:");
        while (iter.hasNext()) {
            System.out.println("" + iter.next());
        }
    }
    public void secuenceofnumbers (String a){
        ArrayList<Integer> arrayofnumbers = new ArrayList<Integer>();
        arrayofnumbers.add(1982);
        arrayofnumbers.add(1928);
        arrayofnumbers.add(2020);
        Collections.sort(arrayofnumbers, Collections.reverseOrder());
        Iterator<Integer> iter = arrayofnumbers.iterator();
        System.out.println("Sequence of numbers 2nd method:");
        while (iter.hasNext()) {
            System.out.println("" + iter.next());
        }
    }
    public void OddsEven (){
        List<Integer> listofnumbers = new ArrayList<Integer>();
        List<Integer> listofodds = new ArrayList<Integer>();
        List<Integer> listofevens = new ArrayList<Integer>();
        for (int i=0; i<20; i++){
            listofnumbers.add(i+1);
        }
        System.out.println("\n5 - Create a method to separate a list of 20 numbers between odds and even. List: " + listofnumbers);
        for (int i=0; i<listofnumbers.size(); i++){
            if (listofnumbers.get(i) % 2 == 1){
                listofodds.add(listofnumbers.get(i));
            }
            else{
                listofevens.add(listofnumbers.get(i));
            }
        }
        System.out.println("Odds:  " + listofodds);
        System.out.println("Evens: " + listofevens);
    }
    public void pattern(){
        List<Integer> listofnumbers = new ArrayList<Integer>();
        StringBuilder strbuilder = new StringBuilder();
        int max = 21;
        String blank_space = " ", break_space = "\n";
        for (int i=0; i<max; i++){
            if (i<max/2) {
                for (int j = 0; j <= i && j < max/2; j++) {
                    strbuilder.append(blank_space);
                }
            }
            else{
                for (int j=Math.abs(max-i); j>=0 ; j--) {
                    strbuilder.append(blank_space);
                }
            }
            strbuilder.append(i);
            strbuilder.append(break_space);
        }
        System.out.println("\n 6 - Create a method to print numbers in the following pattern - from 0 to 20");
        System.out.println(strbuilder.toString());
    }
}
