package basicjava;

public class Assignment1 {
	public static void main(String [] args){
		int gear=4;
		switch(gear){
		case(1):
			System.out.println("Speed of Vehicle should be less than 20kmph");
		break;
		case(2):
			System.out.println("Speed of Vehicle should be less than 400kmph");
		break;
		case(3):
			System.out.println("Speed of Vehicle should be less than 60kmph");
		break;
		case(4):
			System.out.println("Speed of Vehicle should be less than 80kmph");
		break;
		case(5):
			System.out.println("Speed of Vehicle should be less than 100kmph");
		break;
		default:
			System.out.println("Vehicle is in Neutral Condition");
			break;
			
		}
	}

}
