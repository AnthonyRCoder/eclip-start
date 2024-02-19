import java.util.Arrays;

public class stringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abdc:psdv:sdvosdv:dfpbkdd";
		
		// split the array using ':' as a delimiter
		
		String[] parts = str.split(",");
		System.out.println("Using : as a delimiter " + Arrays.toString(parts));
		
		// split the array using 'd' as a delimiter
		
		parts = str.split("d");
		System.out.println(Arrays.toString(parts));
		
		String str2 = "This is a string to tokenize";
		
		// tokenize the string into words simply by splitting with " "
		
		parts = str2.split(" ");
		System.out.println(Arrays.toString(parts));
	
		
		String str3 = "abdc124psdv456sdvos456dv568dfpbk0dd";
		
		// split the array using a single digit, e.g 1,2,3...
		
		String[]part = str3.split("[0-9]");
		
		System.out.println(Arrays.toString(part));
		
		// split the aray using a whloe number, e.g 12,346,756
		
		part = str3.split("[0-9]+");
		System.out.println(Arrays.toString(part));
		
	}

}
