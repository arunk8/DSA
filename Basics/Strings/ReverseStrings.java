package Strings;
import java.util.*;
class ReverseStrings
{
public static void main(String[] args)
{
	String s = "This is the input string";
	System.out.println("After reversing words: ");
	System.out.println(s);
	s += " ";
	Stack<String> st = new Stack<String>();
	int i;
	String str = "";
	for (i = 0;i < s.length();i++)
	{
		if (s.charAt(i) == ' ')
		{
			st.push(str);
			str = "";
		}
		else
		{
			str += s.charAt(i);
		}
	}
	String ans = "";
	while (st.size() != 1)
	{
		ans += st.peek() + " ";
		st.pop();
	}
	ans += st.peek(); // The last word should'nt have a space after it
	System.out.println("After reversing words: ");
	System.out.print(ans);
}
}