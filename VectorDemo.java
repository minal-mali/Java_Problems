import java.util.*;
class VectorDemo
{
	public static void main(String args[])
	{
		Vector<String> v1 = new Vector<String>();
		v1.add("Tiago");
		v1.add("Tigor");
		v1.add("Altroz");
		v1.add("Harrier");
		v1.add("Punch");
		v1.add("Curve");
		v1.add("Safari");

		v1.addElement("Sierra");

		System.out.println(v1);
		System.out.println("First Element:"+ v1.firstElement());
		System.out.println("Last Element:" + v1.lastElement());
		System.out.println("Address of Element:" + v1.elements());
		System.out.println("Index of 4th Element:" + v1.elementAt(4));
		System.out.println("Remove Last Element:" + v1.removeElement());
		System.out.println("Index of 3rd Element:" + v1.removeElementAt(3));

		
	}
}
//what is vector?
//Methods of vector 
//capacity,clone,size,indexof,remove,add,set,get,isempty,sublist,toarray