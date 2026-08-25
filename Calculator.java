public class calculator
{
  public int add(int a,int b)
  {
	  int c=a+b;
	  return c;
  }
  public static void main(string arges[])
  {
	  calculator cal = new calculator();
	  system.out.println("Thw sum of two numbers is "+(cal.add(2,3)));
  }
}
