package lu.uni.programming1.lab6.exercise3;

public class Ticket {
	
	private int eTicketNumber;
	private Flight flight;
	private Passenger passenger;
	
	public Ticket(int eTicketNumber, Flight flight, Passenger passenger) {
		this.eTicketNumber = eTicketNumber;
		this.flight = flight;
		this.passenger = passenger;
	}

	public int geteTicketNumber() {
		return eTicketNumber;
	}

	public Flight getFlight() {
		return flight;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	@Override
	public String toString() {
		return String.format("eTicket Nr. %s\nPassenger: %s (Passport %s, Loyalty Card Number: %d)\nFlight: %s", this.eTicketNumber, this.getPassenger(), this.getPassenger().getPassportNumber(), this.getPassenger().getLoyaltyCardNumber(), this.getFlight());
	}
	
}