//Calculate monthly payement, last payement, total amount paid and interest paid.
//This is inspired by the following calculator; https://www.nerdwallet.com/blog/loans/car-loan-calculator, but
//with the additionnal requirement that if car_price = $100, down_payement = 0 , interest = 0 and number_of_months = 3
//the first two payements should be $33.3 and the last payement $33.4 in order to add up to $100.

package package1;

import java.text.DecimalFormat;

public class Calculator {
	private double car_price, down_payement, interest;
	private int num_months;
	
	Calculator(double car_price, double down_payement,
			double interest, int num_months){
		
		this.car_price = car_price;
		this.down_payement = down_payement;
		this.interest = interest;
		this.num_months = num_months;
	}
	
	public String monthly_payement() {
		DecimalFormat twoDigits = new DecimalFormat(".00");
		double result;
		double r  = (interest / 12) / 100;
		if(r > 0.0) {
			result = (r * (car_price - down_payement)) / (
				1 - (Math.pow(1 + r, -num_months)));
			
			return twoDigits.format(result);
		}	
		else
			result = (car_price - down_payement) / num_months;
		
			return twoDigits.format(result);
	}
	
	public String subtotal() {
		DecimalFormat twoDigits = new DecimalFormat(".00");
		double monthly = Double.parseDouble(monthly_payement());
		double subtotal = monthly * num_months;

		
			return twoDigits.format(subtotal);
		
	}
	

	
	public String remainder (){
		DecimalFormat twoDigits = new DecimalFormat(".00");
		double subtotal = Double.parseDouble(subtotal());
		double interest = Double.parseDouble(interest());
		double remainder =  (car_price - down_payement) - subtotal + interest;
		return twoDigits.format(remainder);
		
	}
	
	public String interest() {
		DecimalFormat twoDigits = new DecimalFormat(".00");
		double subtotal = Double.parseDouble(subtotal());
		double interest = subtotal - (car_price -  down_payement);
		if(interest > 0 )
			return twoDigits.format(interest);
		else
			return String.valueOf(0);
	}
	
	public String total() {
		DecimalFormat twoDigits = new DecimalFormat(".00");
		double subtotal = Double.parseDouble(subtotal());
		double remainder = Double.parseDouble(remainder());
		
		double total = subtotal + remainder;
		
		return twoDigits.format(total);
	}
	
	public String last_payement() {
		DecimalFormat twoDigits = new DecimalFormat(".00");
		double monthly = Double.parseDouble(monthly_payement());
		double remainder = Double.parseDouble(remainder());
		double last = monthly + remainder;
		return twoDigits.format(last);
	}

}