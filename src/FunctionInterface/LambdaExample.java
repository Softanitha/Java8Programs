package FunctionInterface;

 interface Shape{

	  public void show();
}
  public class  LambdaExample{
	public static void main(String[] args) {
		int width=20;
     Shape s=()->{
     System.out.println("Drawing shape with width is: "+width);
	};
	s.show();

}
  }
