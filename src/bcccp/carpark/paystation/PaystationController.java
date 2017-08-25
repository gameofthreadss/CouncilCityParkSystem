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
            //get the AdhocTiket detail and comapre with datetime 
		if (carpark.getAdhocTicket(barcode).getEntryDateTime() == adhocTicket.getEntryDateTime()) {
      charge = carpark.calculateAddHocTicketCharge(adhocTicket.getEntryDateTime());
      ui.display("AU " + charge);

    }
                else {
      ui.display("Go to the office");
    }
		
	}



	@Override
	public void ticketPaid() {
		//Calculate the ticketPaidon Adhoc ticket
            adhocTicket.pay(adhocTicket.getExitDateTime(), charge);
            carpark.recordAdhocTicketExit();
          ui.printTicket(
        carpark.getName(),
        adhocTicket.getTicketNo(),
        adhocTicket.getEntryDateTime(),
        adhocTicket.getPaidDateTime(),
        charge,
        adhocTicket.getBarcode());
		
	}



	@Override
	public void ticketTaken() {
            //Display and deregister the controller
		ui.display("Idle");
                ui.deregisterController();
		
	}

	
	
}
