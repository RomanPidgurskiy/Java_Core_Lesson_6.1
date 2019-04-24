package ua.lviv.lgs;

public class Fixed_time_employee implements Salary {

	@Override
	public void salary(double summ_Salary) {
		 
		System.out.println("The hour of employee pay is: " + summ_Salary );
		
	}

}
