package wxl;
public class Time {
	public int hour;
	public int minute;
	public int second;	
public Time(int hour,int minute,int second)
{
	if(hour<0||hour>23)
	{
		System.err.println("小时的支持范围是 [0, 23]");
		return;
	}
	if (minute < 0 || minute > 59) {
		System.err.println("不是地球人的分");
		return;
	}
	if(second<0||second>59)
	{
		System.err.println("不是地球人的秒");
		return;
	}
	this.hour=hour;
	this.minute=minute;
	this.second=second;
}
public Time after(int seconds) {
	second+=seconds;
	while(second>=60)
	{
		second-=60;
		minute++;
		if(minute>=60)
		{
			minute-=60;
			hour++;
		}
		if(hour>=24)
		{
			hour=hour%24;
		}
	}	
	return this;
}
public String toString() {
	return String.format("%4d:%02d:%02d", hour, minute, second);
}
public static void main(String[] args) {
	Time d = new Time(23,58,58);
	Time r = d.after(7200);
	System.out.println(r.toString());
}
}

	
	