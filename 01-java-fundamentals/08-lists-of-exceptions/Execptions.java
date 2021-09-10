import java.util.ArrayList;
//import java.lang.*;


public class Execptions {
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
        //myList.add(20);
            myList.add("13");
            myList.add("hello world");
            myList.add(48);
            //myList.add("48");
            myList.add("Goodbye World");

            try {
                for(int i = 0;i<myList.size();i++){
                int castedValue = Integer.parseInt((String) myList.get(i));
                System.out.println(castedValue);
            }
            } catch(Exception e){
                System.out.println(e);
            }
        }

}
