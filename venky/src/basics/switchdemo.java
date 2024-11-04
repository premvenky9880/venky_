package basics;

public class switchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String day="saturday";
		   
		switch(day)
		{
		case "Monday":
		case "monday":
			System.out.println("attend the mettings");
			break;
				
		case "Tuesday":
		case "tuesday":
			System.out.println("work on project work");
			break;
		
			
		case "Wednesday":
		case "wednesday":
			System.out.println("submit the progress report");
			break;
			
		case "Thursday":
		case "thursday":
			System.out.println("client call and review");
			break;
			
			
			case "Friday":
			case "friday":
				System.out.println("wrap up weekl;y task");
				break;
				
				
			case "Saturday":
			case "saturday":
			case "Sunday":
			case "sunday":
				System.out.println("Enjoy the weekend");
				break;
			
		}		

	}

}
