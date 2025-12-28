import java.util.*;
class StackDemo
{
	public static void main(String args[])
	{
		Stack<Integer> st = new Stack<Integer>();
		boolean  res = st.empty();
		System.out.println("Is stack empty?" +res);
		st.push(33);
		st.push(44);
		st.push(55);
		st.push(66);
		st.push(77);
		System.out.println("Elements of Stack:" + st);
		System.out.println("Top of Stack:" + st.peek());

		st.pop();
		st.pop();
		System.out.println("Elements of Stack after pop:" +st);
		System.out.println("Top of Stack:" + st.peek());
		System.out.println("Index of 55:" + st.search(55));
		System.out.println("Index of 55:" + st.search(18));//element is not part of our stack 


	}
}
//what is Stack?
//What is Push and Pop
//FILO or LIFO
//What is Peek?