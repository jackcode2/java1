package wxl;
import java.math.BigDecimal;
public class test {
	public BigDecimal add(double value1,double value2)
	{
		BigDecimal b1=new BigDecimal(Double.toString(value1));
		BigDecimal b2=new BigDecimal(Double.toString(value2));
		return b1.add(b2);
	}
	public BigDecimal sub(double value1,double value2)
	{
		BigDecimal b1=new BigDecimal(Double.toString(value1));
		BigDecimal b2=new BigDecimal(Double.toString(value2));
		return b1.subtract(b2);
	}
	public BigDecimal mul(double value1,double value2)
	{
		BigDecimal b1=new BigDecimal(Double.toString(value1));
		BigDecimal b2=new BigDecimal(Double.toString(value2));
		return b1.multiply(b2);
	}
	public BigDecimal div(double value1,double value2,int b)
	{
		if(b<0)
		{
			System.out.println("b值必须大于0");
		}
		BigDecimal b1=new BigDecimal(Double.toString(value1));
		BigDecimal b2=new BigDecimal(Double.toString(value2));
		return b1.divide(b2,b,BigDecimal.ROUND_HALF_UP);
	}
	public static void main(String[]args)
	{
		test b=new test();
		System.out.println("两数相加的值是"+b.add(4.2,4.6));
		System.out.println("两数相减的值是"+b.sub(4.9, 7.8));
		System.out.println("两数相乘的值是"+b.mul(4.8, 3.0));
		System.out.println("两数相除的值是"+b.div(5.6, 3.4, 5));
	}
		


}
