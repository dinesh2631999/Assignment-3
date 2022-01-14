
public class Shape {
	
	//member variable
	
	static int shape;
	
	static
	{
		shape=0;
	}
	
	public static int getShape()
	{
		 shape++;
		return shape=shape;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getShape());
	}

}
