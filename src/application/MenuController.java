package application;

import java.util.Scanner;

import entities.Movie;
import entities.Ticket;

public class MenuController {
	
	private Scanner sc = new Scanner(System.in);
	
	Movie adaoNegro = new Movie("Adão Negro", "Jaume Collet-Serra", "Adão Negro é o filme solo do anti-herói, baseado no personagem em quadrinhos Black Adam (Dwayne Johnson) da DC Comics.", "Ação Fantasia", "02:05");
	Movie onePieceRed = new Movie("One Piece - Red", "Gorō Taniguchi", "Em ONE PIECE FILM RED todos conhecerão Uta, a cantora mais amada do planeta,", "Fantasia Aventura", "01:55");
	Movie aOrfa2 = new Movie("A Órfã 2", "William Brent Bell", "Continuação do primeiro filme", "Terror Drama", "1:39");
	Movie invalid = new Movie("Inválido", "Inválido", "Inválido", "Inválido", "Inválido");
	
	public Movie selectMovie(int movie) {
		if (movie == 1) return adaoNegro;
		if (movie == 2) return onePieceRed;
		if (movie == 3) return aOrfa2;
		return invalid;
	}
	
	public Ticket buyTicket(Movie movie) {
		System.out.println("Selecione o tipo de ingresso:");
		System.out.println("[1] Inteira R$ 24.00");
		System.out.println("[2] Inteira R$ 12.00");
		int type = sc.nextInt();
		sc.nextLine();
		System.out.println("Selecione a sessão: ");
		System.out.println("[1] 12:00");
		System.out.println("[2] 15:00");
		System.out.println("[3] 18:00");
		int session = sc.nextInt();
		sc.nextLine();
		Ticket ticket = new Ticket(movie, type, session);
		return ticket;
	}
	
	public double result(Ticket[] tickets) {
		double total = 0;
		for (int i = 0; i<tickets.length; i++) {
			if (tickets[i] == null) break;
			if (tickets[i].getTicketType() == "Inteira") total += 24;
			if (tickets[i].getTicketType() == "Meia") total += 12;
		} 
		return total;
		
	}
}
