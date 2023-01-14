import java.util.Arrays;

public class CheckPermutation {

	public static void main(String[] args) {
		String a = "shilpa";
		String b = "phils";
		
		System.out.println(CheckPermutation(a,b));
	}
	
	public static boolean CheckPermutation(String a, String b) {
		char firstString [] = a.toLowerCase().toCharArray();
		char secondString [] = b.toLowerCase().toCharArray();
				
		Arrays.sort(firstString);
		Arrays.sort(secondString);

		if (firstString.length != secondString.length) {
			return false;
		}
		
		
		for (int i = 0 ; i < firstString.length ; i++) {
			if (firstString[i] == secondString[i]) {
				continue;
			}else {
				return false; 
			}
		}
		
		return true; 
	}

}
