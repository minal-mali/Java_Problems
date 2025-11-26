class StringMethod
{
	public static void main(String args[])
	{
		String s1 = "Hello";
		String s6 = new String("hello");
		String s2 = "Minal";
		String s5 = "Minal";
		String s4 = "Programmer";
		String s9 = "  coding is  ";
		String s7 = 						String.join("","This","year","recieved","huge","rain","in","maharashtra","::","12","10","03");
		String s3 = s1+s2; //using + operator
		String s8 = String.join("::","12","22","23");
		System.out.println(s3);
		System.out.println(s1.concat(s2)); //standard method 
		System.out.println("Length of String:" + s1.length()); //gives string length
		System.out.println("Character index:" + s4.charAt(4));	// gives character index
		System.out.println("Substring method:" + s4.substring(4,8)); // gives start and end index
		System.out.println("Substring method:" + s4.substring(4)); // gives start to end characters
		System.out.println("Equals method:" + s2.equals(s5));  //check strings are equal or not
		System.out.println("Equals method:" + s1.equals(s6));
		System.out.println("To Uppercase method:" + s4.toUpperCase()); //gives uppercase letters
		System.out.println("To Lowercase method:" + s4.toLowerCase()); //gives lowercase letters
		System.out.println(s7);//use joins to separate comma 
		System.out.println(s8);
		System.out.println("Contains character of the string or not:" +s4.contains("rammer"));
		System.out.println(s9.trim()+" awsome ");
		System.out.println(s9 +" awsome ");
		String s10 = "have a nice day";
		System.out.println("Replace Method:" + s10.replace('a','m'));

	}
}
