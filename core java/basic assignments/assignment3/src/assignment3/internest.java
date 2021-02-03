package assignment3;
import java.Lang.Math;
public class internest {
	public double simpleinterest(double p,double r,double n)
	{
		 double si=(p*r*n)/100;
		 return si;
	}
	public double compoundinterest(double p,double r,double t)
	{
		double ci=p*Math.pow((1+r/100),t)-p;

		return ci;
	}
}
