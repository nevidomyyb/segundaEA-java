package entities;

public class Ticket {

	private Movie movie;
	private String ticketType;
	private String session;

	public Ticket(Movie movie, int ticketType, int session) {
		this.movie = movie;
		this.ticketType = ticketType == 1 ? "Inteira" : "Meia";
		
		if (session == 1) this.session = "12:00";
		if (session == 2) this.session = "15:00";
		if (session == 3) this.session = "18:00";
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public String getTicketType() {
		return ticketType;
	}

	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

}
