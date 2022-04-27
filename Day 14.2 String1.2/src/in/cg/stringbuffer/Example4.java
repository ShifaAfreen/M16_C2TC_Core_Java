package in.cg.stringbuffer;

import java.util.StringTokenizer;

public class Example4 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("marry-go-round","-");
		System.out.println(st.nextToken());
	}

}
