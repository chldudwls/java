package Sub8;

public class Cable implements Socket {

	
		private Bulb bulb;
		public Cable(Bulb bulb) {
			this.bulb = bulb;

		}
	
	@Override
	public void switcgOn() {
			bulb.lightOn();
	}

	@Override
	public void switcgOff() {
			bulb.lightOff();
		
	}

	
	
	
	
	
	
	
}
