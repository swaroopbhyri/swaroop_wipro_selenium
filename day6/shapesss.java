package day6;

public class shapesss {
	enum Shape { 
		CIRCLE { 
			double area(double... params) { 
				if (params.length != 1) throw new IllegalArgumentException("Circle requires 1 parameter (radius)"); 
				return Math.PI * params[0] * params[0]; 
				}
			},
		SQUARE {
				@Override
				double area(double... params) { 
					if (params.length != 1) throw new IllegalArgumentException("Square requires 1 parameter (side)"); 
					return params[0] * params[0]; 
					}
				},
		RECTANGLE {
				@Override 
				double area(double... params) { 
					if (params.length != 2) throw new IllegalArgumentException("Rectangle requires 2 parameters (length, width)");
					return params[0] * params[1];
					} 
				}, 
		TRIANGLE { 
					@Override
					double area(double... params) { 
						if (params.length != 2) throw new IllegalArgumentException("Triangle requires 2 parameters (base, height)"); 
						return 0.5 * params[0] * params[1]; 
						}
					};
		abstract double area(double... params);
	}
	public static void main(String[] args) {
		double[] circleParams = {5.0};
		double[] squareParams = {4.0};
		double[] rectangleParams = {6.0, 3.0};
		double[] triangleParams = {4.0, 7.0}; 
		for (Shape shape : Shape.values()) { 
			try { 
				double area = 0;
				switch (shape) { 
				case CIRCLE:
					area = shape.area(circleParams[0]);
					break; 
				case SQUARE: 
					area = shape.area(squareParams[0]); 
					break; 
				case RECTANGLE: 
					area = shape.area(rectangleParams[0], rectangleParams[1]); 
					break; 
				case TRIANGLE: 
					area = shape.area(triangleParams[0], triangleParams[1]);
					break;
					} 
				System.out.printf(" %s area =%.2f%n", shape, area); 
				} 
			catch (IllegalArgumentException e) { 
				System.out.println(e); 
				}
			}
		}
}