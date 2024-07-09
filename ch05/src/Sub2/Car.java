package Sub2;

public class Car {
		
		
		private String name;
		private String color;
		private int speed;
		
		public static int count;
		
		public Car(String name, String color, int speed) {
			this.name = name;
			this.color = color;
			this.speed = speed;
			
		}
		
		// Getter, setter : 캡슐화된 속성에 대한 추가적인 수정을 위한 메서드
		
			public void setColor(String color) {
				this.color = color;
			}
			
			public String getColor() {
				return color;
			}
			// 기능(멤버 메서드)
			public void speedUp(int speed) {
				this.speed += speed;
			}
			
			public void speedDown(int speed) {
				this.speed -= speed;
			}
			
			public void show() {
				System.out.println("차량명 : " +this.name);
				System.out.println("차량색 : " +this.color);
				System.out.println("현제속도 : " +this.speed);
			}
			
	}
		
	

