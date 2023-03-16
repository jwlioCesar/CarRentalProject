package entities;

import java.time.LocalDateTime;

import exceptions.ProblemException;

public class CarRental {

	private LocalDateTime start;
	private LocalDateTime finish;

	private Vehicle vehicle;
	private Invoice invoice;

	public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) throws ProblemException {
		
		if (start.isAfter(finish)) {
			throw new ProblemException("error: Retirada deve ser antes de retorno");
		}else {
		this.start = start;
		this.finish = finish;
		this.vehicle = vehicle;
		}
	}

	public LocalDateTime getStart() {
		return start;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public LocalDateTime getFinish() {
		return finish;
	}

	public void setFinish(LocalDateTime finish) {
		this.finish = finish;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

}
