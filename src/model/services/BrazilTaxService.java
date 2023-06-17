/**
 * 
 */
package model.services;

/**
 * Classe de Serviço que calcula a taxa de imposto no Brasil.
 * 
 * @author Matos - 17.06.2023
 *
 */
public class BrazilTaxService implements TaxService {

	public Double taxService(Double amount) {
		
		if(amount <= 100.00) {
			return amount * 0.20;
		} else {
			return amount * 0.15;
		}
	}
}
