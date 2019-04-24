package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		Fixed_time_employee fixed = new Fixed_time_employee();
        fixed.salary(15000);
        
        Hourly_employee hourlh = new Hourly_employee(15000,8,22);
        hourlh.salary(hourlh.getRate()/hourlh.getDay()/hourlh.getHours());
        
	}

}
