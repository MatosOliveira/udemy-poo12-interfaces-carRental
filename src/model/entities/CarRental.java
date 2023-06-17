/**
 * 
 */
package model.entities;

import java.time.LocalDateTime;

/**
 * Classe que contem as informacoes do aluguel de carros
 * 
 * @author Matos - 16.06.2023
 *
 */
public class CarRental {

	private LocalDateTime startDate;
	private LocalDateTime finishtDate;
	
	private Vehicle vehicle;
	private Invoice invoice;
	
	public CarRental() {
	}

	public CarRental(LocalDateTime startDate, LocalDateTime finishtDate, Vehicle vehicle, Invoice invoice) {
		this.startDate = startDate;
		this.finishtDate = finishtDate;
		this.vehicle = vehicle;
		this.invoice = invoice;
	}

	public LocalDateTime getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}

	public LocalDateTime getFinishtDate() {
		return finishtDate;
	}

	public void setFinishtDate(LocalDateTime finishtDate) {
		this.finishtDate = finishtDate;
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
