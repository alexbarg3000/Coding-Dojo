import java.util.*;

public class ExceptionsList {
    public void DeliverMessage(){

        // Create a hardcoded array list with strings and integers

        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");

        // Looping through the array list, it tries to assign each item to an integer object

        for(int i = 0; i < myList.size(); i++) {
            try {
                Integer castedValue = (Integer) myList.get(i);
            }
        // If the item is not an integer, it will catch the exception
        // and print that it is an exception along with what the exception was
            catch(Exception exception){
                exception.printStackTrace();
                System.out.println("Caught exception: "+myList.get(i));

            }
        }

    }
}