import java.util.ArrayList;


class Lists{

public static void main (String [] args ) {

ArrayList<String>  list = new ArrayList<String>();

list.add ("Alfa");

list.add ("Delta"); list.add ("Charlie"); System.out.println("List: " + list);

System.out.println("Change: " + list.get(1) + "\n");

list.set(1, "Bravo");

list.forEach((x) ->System.out.println("Element : " + x + "STACKING MF"));
}




}