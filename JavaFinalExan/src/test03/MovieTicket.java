package test03;

public class MovieTicket {
	private String movieTitle;
	private String screenTime;
	private String seatNumber;
	private boolean isBooked;
	
	
	

	public MovieTicket(String movieTitle, String screenTime, String seatNumber) {
		super();
		this.movieTitle = movieTitle;
		this.screenTime = screenTime;
		this.seatNumber = seatNumber;
		this.isBooked = false;
	}


	@Override
	public String toString() {
		return "MovieTicket [movieTitle=" + movieTitle + ", screenTime=" + screenTime + ", seatNumber=" + seatNumber
				+ ", isBooked=" + isBooked + "]";
	}
	

	public String getMovieTitle() {
		return movieTitle;
	}

	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}

	public String getScreenTime() {
		return screenTime;
	}

	public void setScreenTime(String screenTime) {
		this.screenTime = screenTime;
	}

	public String getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	public void bookTicket() {
			if(!isBooked) {
				isBooked = true;
				System.out.println(movieTitle + "," + screenTime +"," + seatNumber + "예매완료");
				System.out.println("-------------");
			}else {
				System.out.println("이미 예매됨");
				System.out.println("-------------");
			}
			
		}

	public void cancelBook() {
		
			if(isBooked) {
				isBooked = false;
					System.out.println(movieTitle + "," + screenTime +"," + seatNumber + "취소완료");
					System.out.println("-------------");
		}else {
			System.out.println("예매되지 않은 티켓");
			System.out.println("-------------");
		}
			
	}
	

	public void printTicketInfo() {
		System.out.println("영화제목 : "+movieTitle);
		System.out.println("상영시간 : "+screenTime);
		System.out.println("좌석번호 : "+seatNumber);
		System.out.println("예매여부 : "+(isBooked ? "Yes":"No"));
	}
}
