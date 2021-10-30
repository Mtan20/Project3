
public class MayleeTanNaotoOkaProjectThreeTask1 
{

	public static void main(String[] args) 
	{
			

	}
	
	// Task #2
	public static double[] celsius(double[] fahrenheit1)
	{
		double[] celsius = new double[5];
 
		for(int i = 0; i < fahrenheit1.length; i++)
		{
			celsius[i] = (5.0 / 9) * (fahrenheit1[i] - 32);
		}
		
		return celsius;
	}

}
