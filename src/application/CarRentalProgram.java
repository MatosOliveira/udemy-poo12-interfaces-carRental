/**
 * 
 */
package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Invoice;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

/**
 * @author Matos
 *
 */
public class CarRentalProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		
		System.out.print("Modelo do carro: ");
		String model = sc.nextLine();
		
		System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
		LocalDateTime dataRetirada = LocalDateTime.parse(sc.nextLine(), fmt);
		
		System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
		LocalDateTime dataRetorno = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental cr = new CarRental(dataRetirada, dataRetorno, new Vehicle(model), new Invoice());
		
		System.out.print("Entre com o preco por hora: ");
		double precoHora = sc.nextDouble();
		
		System.out.print("Entre com o preco por dia: ");
		double precoDia = sc.nextDouble();
		
		
		RentalService rs = new RentalService(precoHora, precoDia, new BrazilTaxService());
		rs.processInvoice(cr);
		
		System.out.println("\nFATURA: ");
		System.out.print("Pagamento basico: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
		System.out.print("\nImposto: " + String.format("%.2f", cr.getInvoice().getTax()));
		System.out.print("\nPagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));
		
		sc.close();

	}

}
