package in.cg.stringbuffer;

import java.util.StringTokenizer;

public class Example5 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("marry-go-round","-");
		while(st.hasMoreTokens())
		{
		System.out.println(st.nextToken());
		}
	}

}
