package FunctionInterface;

interface Calculate{
	int sum(int a,int b);
}
public class LambdaExamp {

	public static void main(String[] args) {
   Calculate c1=(a,b)->(a+b);
   System.out.println(c1.sum(10,20));
   
   Calculate c2=(int a,int b)->{
	 return a+b;
   };
   System.out.println(c2.sum(100, 200));
	}

}
