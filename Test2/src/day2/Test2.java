package day2;

public class Test2 {
	
	double a;
	Integer meth1(double a)
	{
		int I1=5;
		Integer I=Integer.valueOf(I1);
		return I;
	}
	float meth2(Integer b)
	
	{
		int i=b.intValue();
		float f=i;
		return f;
		
	}
	
	
	public static void main(String[] args)
	{
		Test2 o=new Test2();
	int I=o.meth1(5);
	System.out.println("int"+I);
	 float f=o.meth2(I);
	 System.out.println("float"+f);
	}

}
