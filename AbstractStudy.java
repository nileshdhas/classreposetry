package abstract_Class_STUDY;

public abstract class AbstractStudy // we cant abstract class as private, default ,protected,final , static this is iilegal combination
{
	int a;// constructor of abstract class
	public AbstractStudy(int a) // userdefined construcotr in abstract class
	{
		this .a=a;
	}
	
	
	
/*public abstract class Abstractstudy// nested abstract class
{

}
	 abstract class abstractstudy// nested abstract class
	{
	
	
	}
	public static void main(String[] args) // we can write main inside the abstract class 
	{
		
		//cant created a object for abstract class....for calling a method we have to create a concrete class 
	//	raju();// you can call a static method inside a abstract class
		
		/*AbstractStudy N=new AbstractStudy()
		N.test9(); You cant create a object of abstract class and dont give the body here(overrride)
		{
			
			@Override
			public void test9() {
				System.out.println("hi iam 9th method");
				
			}
			
			@Override
			public void test6() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void test4() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void test() {
				// TODO Auto-generated method stub
				
			}
		};*/		
	
	public abstract void test();// incomplet method...>method without body
	//1.static method inside the abstract class
	public static void raju()
	{
		System.out.println("hi i am raju");
	}
	public void test1() // complete method with body(non static method)
	{
		System.out.println("hi i am test 1 method ");
	}
	public void test2() // complete method with body
	{
		System.out.println("hi i am test2 method");
	}
	public void test3() // complete method with body
	{
		System.out.println("hi i am test3 method ");
		
	}
	protected abstract void test4();// incomplet method...>method without body
	
	public abstract void test6();// incomplet method...>method without body
	public abstract void test9();// incomplet method...>method without body
	
}
