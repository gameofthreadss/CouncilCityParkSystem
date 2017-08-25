package bcccp.carpark.paystation;

import bcccp.carpark.ICarpark;
import bcccp.tickets.adhoc.IAdhocTicket;

public class PaystationController 
		implements IPaystationController {
	
	private IPaystationUI ui;	
	private ICarpark carpark;

	private IAdhocTicket  adhocTicket = null;
	private float charge;

	public PaystationController(ICarpark carpark, IPaystationUI ui) {
	 //Constructor implementation
                ui.registerController(this);
                this.carpark = carpark;
                this.ui = ui;
                 ui.display("Idle"); 
	}



	@Override
	public void ticketInserted(String barcode) {
		
		
	}



	@Override
	public void ticketPaid() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void ticketTaken() {
		// TODO Auto-generated method stub
		
	}

	
	
}
