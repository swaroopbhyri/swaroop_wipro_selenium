package day6;

interface State { 
	State next(); 
	}
enum TrafficLight implements State {
	RED {
		@Override 
		public State next() { 
			System.out.println("RED -> GREEN");
			return GREEN;
			}
		},
	GREEN {
			@Override
			public State next() {
				System.out.println("GREEN -> YELLOW");
				return YELLOW; }
			},
	YELLOW {
				@Override
				public State next() { 
					System.out.println("YELLOW -> RED");
					return RED;
					}
				};
	}
public class signal { 
	public static void main(String[] args) { 
		State currentLight = TrafficLight.RED;
		System.out.println("Starting traffic light simulation from RED:"); 
		for (int i = 0; i < 6; i++) { 
			currentLight = currentLight.next();
			} 
		}
	}