package day6;

public class enumm1 {
public static void main(String[] args) {
	enum Day{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}
	Day today=Day.Sunday;
//	switch(today){
//	case Monday:System.out.println("Today is "+today);
//	break;
//	case Tuesday:System.out.println("Today is "+today);
//	break;
//	case Wednesday:System.out.println("Today is "+today);
//	break;
//	case Thursday:System.out.println("Today is "+today);
//	break;
//	case Friday:System.out.println("Today is "+today);
//	break;
//	case Saturday:System.out.println("Today is "+today);
//	break;
//	case Sunday:System.out.println("Today is "+today);
//	break;
//	}
	if(today==Day.Saturday || today==Day.Sunday){
		System.out.println("Weekend");
		
	}
	else {
		System.out.println("weekday");
	}
}
}