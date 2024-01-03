public class PangramChecker {

  public static boolean check(String sentence){
    String pattern = "[^a-zA-Z]";
	String resault = sentence.replaceAll(pattern, "").toLowerCase();
	boolean isPanagram = true;
			  
	for (char letter = 'a'; letter <= 'z'; letter++) {
		if (!resault.contains(String.valueOf(letter))) {
			isPanagram = false;
			break;
		}
	}
			  
	return isPanagram;
  }
  
}


// ======================== OR ========================



import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class PangramChecker {

  public static boolean check(String sentence){
	String pattern = "[^a-zA-Z]";
	String[] alphabetArray = "abcdefghijklmnopqrstuvwxyz".split("");
		  
	String[] sentenceArray = sentence.replaceAll(pattern, "").toLowerCase().split(" ");
	String[] lettersArray = String.join("", sentenceArray).split("");
	Arrays.sort(lettersArray);
		  
	ArrayList<String> lettersList = new ArrayList<>(Arrays.asList(lettersArray));
	ArrayList<String> alphabetList = new ArrayList<>(Arrays.asList(alphabetArray));
		  
	Set<String> listWithoutDuplicates = new LinkedHashSet<String>(lettersList);
	lettersList.clear();
	lettersList.addAll(listWithoutDuplicates);
		  
	return alphabetList.equals(lettersList);
  }

}