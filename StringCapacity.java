class StringCapacity
{
	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer(); //default capacity
		System.out.println(sb.capacity()); 	// (previouscapacity+1)*2

		sb.append("Welcome everyone to fortune");
		System.out.println(sb.capacity());

		StringBuffer sb1 = new StringBuffer(10); 
		sb1.append("Hello fct students");
		System.out.println(sb1.capacity()); 

		StringBuffer s3 = new StringBuffer(10); 
		s3.append("Hello Students");
		System.out.println("Reverse String:" +s3.reverse()); 
		System.out.println("Length of String:" +s3.length());
		System.out.println("Character of String:" +s3.charAt(5));
	
		s3.setCharAt(5,'M');
		System.out.println("Add Character at Specific Index:" +s3);
		System.out.println("Delete Character at Specific String:" +s3.deleteCharAt(5));
		System.out.println("Index of S:" +s3.indexOf("f"));
		System.out.println("Is empty:" +s3.isEmpty());
		System.out.println("Hash Code:" +s3.hashCode());
		System.out.println("Substring:" +s3.substring(3,7));
		System.out.println("String Class:" +s3.getClass());
	}
}