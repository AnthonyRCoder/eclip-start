
public class stringSplitpart2 {

	public static void main(String[] args) {
		
		// Declare string object
		
		String StringValue = "John Gibert:43:UK";
		
		// define the regex parameter
		
		String regex = ":";
		
		// split the string object
		
		String[]output = StringValue.split(regex);
		
		System.out.println();
		
		// printnig the array contents
		
		System.out.println("Name:"+output[0]);
		System.out.println("Age:"+output[1]);
		System.out.println("Country:"+output[2]);
		System.out.println();
		
		String str = new String("28/12/1972");
		
		System.out.println();
		
	  
		System.out.println("split(String regex):");
		String array2[]= str.split("/" );
		for (String abc: array2){
		System.out.println(abc);
		}
		
		System.out.println("split(String regex, int limit) with limit=2:");
		
		String array1[]= str.split("/",2);
		for (String abc: array1){
			System.out.println(abc);
		}
		System.out.println("split(String regex, int limit) with limit=0: ");
	
		String array3[]= str.split("/", 0);
		for (String abc: array3){
		System.out.println(abc);
		}
		System.out.println("split(String regex, int limit) with limit=-5:");
		
		String array4[]= str.split("/", -5);
		for (String abc: array4){
		System.out.println(abc);
		System.out.println();
		}

	}
}
