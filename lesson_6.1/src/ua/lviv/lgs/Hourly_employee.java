package ua.lviv.lgs;

public class Hourly_employee implements Salary {

	private int Rate;
	private int hours;
	private int Day;

	@Override
	public void salary(double summ_Salary) {
		System.out.println("The employee's hourly wage rate is: " + summ_Salary);

	}

	public Hourly_employee (int Rate, int hours,int Day) {
		super();
		this.Rate = Rate;
		this.hours = hours;
	    this.Day = Day;
	}

	public int getRate() {
		return Rate;
	}

	public void setRate(int rate) {
		Rate = rate;
	}

	public double getHours() {
		return hours;
	}

	public void setHours_worked(int hours) {
		this.hours = hours;
	}

	public int getDay() {
		return Day;
	}

	public void setDay(int day) {
		Day = day;
	}

}
