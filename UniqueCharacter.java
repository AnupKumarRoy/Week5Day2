package week5day2;
import java.util.Set;
import java.util.TreeSet;
public class UniqueCharacter {
public static void main(String[] args) {
	String input = "babub";
	System.out.println("String is "+input);
	Set<Character> unique=new TreeSet<Character>();//Introduce TreeSet
	char[] charArray = input.toCharArray();			//String to charArray
	for (int i = 0; i < charArray.length; i++) {	//To Iterate 
		unique.add(charArray[i]);					//To remove b
		unique.remove('b');	
	}
	//System.out.println(unique);		
	StringBuilder string = new StringBuilder();		//Introduce StringBuilder
	for (char c : unique) {							//Iterate by using for Each
		string.append(c);							//add to new String 
	}
	String string2 = string.toString();				//convert to String
	System.out.println("Print Only the Unique Character is "+string2);
	}

}
