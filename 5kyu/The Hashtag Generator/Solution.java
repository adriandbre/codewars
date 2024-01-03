public class HashtagGenerator {

    public static void main(String[] args) {
	    isValid("This is a test with some words");
    }
	
    public static String isValid(String word) {
		if (word.trim().isEmpty()) {
			System.out.println("False");
			return "false";	
		} else {
			String[] strArray = null;
			strArray = word.split(" ");
			String resault = "#";
			
			for (int i = 0; i < strArray.length; i++) {
				resault += strArray[i].substring(0, 1).toUpperCase() + "" +strArray[i].substring(1, strArray[i].length());
			}
			
			System.out.println(resault.length() > 140 ? "false" : resault);
			return resault.length() > 140 ? "false" : resault;	
		}
	}

}