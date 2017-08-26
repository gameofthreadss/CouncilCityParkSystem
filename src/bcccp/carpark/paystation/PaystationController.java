package bcccp.carpark.paystation;

import bcccp.carpark.ICarpark;
import bcccp.tickets.adhoc.IAdhocTicket;

/*
Claas for control the logic for payment
Modificatons - Oshan.s
*/
public class PaystationController 
		implements IPaystationController {
	
	private IPaystationUI ui;	
	private ICarpark carpark;

	private IAdhocTicket  adhocTicket = null;
	private float charge;
	
	
        /*
        Initializing
        Oshan.s
        2107-8-23
        */
	public PaystationController(ICarpark carpark, IPaystationUI ui) {
		this.carpark = carpark;
                this.ui = ui; 
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
