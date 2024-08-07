package StringJoiner;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		StringJoiner sj=new StringJoiner("[","@","]");
		sj.add("Anitha");//2		  // 3,5  1,  7
		sj.add("Raghu");//4
		sj.add("Yagna");//6
		System.out.println(sj);
		
		StringJoiner sj1=new StringJoiner("*","[","]");
		sj1.add("Amma");//2		  // 3,5  1,  7
		sj1.add("Nanna");//4
		sj1.add("Attama");//6
		System.out.println(sj1);
	}

}
