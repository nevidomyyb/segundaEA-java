package application;

import java.util.Scanner;

import entities.Movie;
import entities.Ticket;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Ticket[] tickets = new Ticket[100];
		MenuController menu = new MenuController();
		int posicao = 0;
		while (true) {
			System.out.println("--- BILHETERIA ---");
			System.out.println("Qual filme deseja assistir?");
			System.out.println("[1] Adão Negro");
			System.out.println("[2] One Piece Film - RED");
			System.out.println("[3] A Órfã 2");
			System.out.println("[0] para finalizar");
			System.out.println("------------------");
			int movie = sc.nextInt();
			sc.nextLine();
			if (movie == 0) break;
			Movie movieSelected = menu.selectMovie(movie);
			Ticket ticketPurchased = menu.buyTicket(movieSelected);
			tickets[posicao] = ticketPurchased;
			posicao++;
		}
		System.out.println("Total à pagar: R$ " + menu.result(tickets));
	}
}
