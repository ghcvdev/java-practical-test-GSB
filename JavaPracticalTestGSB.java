import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class JavaPracticalTestGSB {
    public static void main (String[] args){
        // Initialing variable that will be used in the method
        String newString = "";
        System.out.print("Enter the String to be evaluated: "); //Getting user input
        String string = new Scanner(System.in).nextLine();

        for(int i = 0; i < string.length(); i++){ //verifying if there are numbers, and then, replacing them with " "
            char c = string.charAt(i);
            if(c == '0' || c == '1' || c == '2' || c == '3' || c == '4' ||
                    c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
                newString += " ";
            }else{
                newString += c;
            }
        }

        //Removing spaces and running in the method
        Map<String, Integer> map = stringCount(newString.replace(" ", ""));
        System.out.println("Original String: " + string); //printig origial String
        printString(map);
    }
    public static Map<String, Integer> stringCount(String s){
        //Initializing a TreeMap, so there will be no repeated characters, and they will be in order
        Map<String, Integer> map = new TreeMap<>();
        for(char item : s.toCharArray()){
            Integer i = map.get(String.valueOf(item)); //using the .get method of the map to retrieve the array position value
            if (i != null) {
                map.put(String.valueOf(item), ++i);
            }else{
                map.put(String.valueOf(item), 1);
            }
        }
        return map; //returnin a sorted and numbered list of characters
    }

    public static void printString(Map<String, Integer> items){
        for(Map.Entry<String, Integer> a : items.entrySet()){ //getting the key/value pair, and printing it
            System.out.println(a.getKey() + ": " +  a.getValue());
        }
    }
}
