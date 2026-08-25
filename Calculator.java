public class calculator
{
  public int add(int a,int b)
  {
	  int c=a+b;
	  return c;
  }
  public int square(int x)
  {
	  int z=x*x;
	  return z;
  }
  	
  public static void main(string arges[])
  {
	  calculator cal = new calculator();
	  system.out.println("Thw sum of two numbers is "+(cal.add(2,3)));
	  system.out.println("The square of the number is "+(cal.square(4));
  }
}
