import java.util.Stack;
class StackTest
{
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();
	st.push(11);
        st.push(22);
        st.push(33);
	System.out.println(st);
        System.out.println("Top element : " + st.peek());
        System.out.println("Removed element : " + st.pop());
        System.out.println("Is empty? : " + st.empty());
        System.out.println("Position of 10 : " + st.search(10));
        System.out.println("Final Stack : " + st);
    }
}
