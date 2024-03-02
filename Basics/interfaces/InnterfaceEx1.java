package interfaces;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

interface Phone{
	void call();
	default void message() {
		System.out.println("message method created using default keyword");
	}
}

class Android implements Phone{
	public void call() {
		System.out.println("call method");
	}
}

public class InnterfaceEx1 {
	public static void main(String args[]) {
		Phone p = new Android();
		p.call();
		p.message();
		int[] values = {2,32,3,2,1,4};
		List<Integer> v = Arrays.asList(3,4,5,6,2,4);
		
		for(int i = 0; i<values.length;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		v.forEach(i -> System.out.print(i + " ")); //lambda exp //consumer interface		
		
	}
}
