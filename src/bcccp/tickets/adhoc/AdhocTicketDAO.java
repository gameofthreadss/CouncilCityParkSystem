package bcccp.tickets.adhoc;

import java.util.List;
import bcccp.tickets.adhoc.IAdhocTicket;//access iAdhocTicket Class methods
import bcccp.tickets.adhoc.AdhocTicket;//access AdhocTicket Class data
import bcccp.carpark.Carpark;
import bcccp.carpark.entry.EntryUI;
import bcccp.carpark.entry.IEntryController;
import java.util.ArrayList;
public class AdhocTicketDAO  implements IAdhocTicketDAO  {

	private IAdhocTicketFactory factory;
	private int currentTicketNo;
        private IAdhocTicket iAdhocTicket; // object creation to access iAdhocTicket Class methods
        private AdhocTicket adhocTicket; //object creation to access AdhocTicket Class data
        private Carpark carPark;
	private EntryUI entryUI;
        private IEntryController iEntryController;
	
	public AdhocTicketDAO(IAdhocTicketFactory factory) {
		//Constructor Implementation
                //initialize with IAdhocTicketFactory interface
                this.factory = factory;
	}

	@Override
	public IAdhocTicket createTicket(String carparkId) {
		// if car park is full no ticket issued
                if(carPark.isFull())
                      entryUI.display("Full");
                else
                {
                    // if not full customer has to push button first and it wil create ticket.
                    entryUI.pushButton();
                    iAdhocTicket.getBarcode();
                    iAdhocTicket.getTicketNo();
                    iAdhocTicket.getCarparkId();
		
                }
                return iAdhocTicket;
	}



	@Override
	public IAdhocTicket findTicketByBarcode(String barcode) {
		// it will match the barcode with exixting  one and find the car Id and ticket no for the car.
                String barCode2 =iAdhocTicket.getBarcode(); 
                if(barCode2.equals(barcode))
                {
		 iAdhocTicket.getTicketNo();
                 iAdhocTicket.getCarparkId();
                }
            return iAdhocTicket;
	}



	@Override
	public List<IAdhocTicket> getCurrentTickets() {
		// TODO Auto-generated method stub
                ArrayList<IAdhocTicket> listIAdhoc = new ArrayList<IAdhocTicket>();
                iAdhocTicket.getTicketNo();
                listIAdhoc.add(iAdhocTicket);
		return listIAdhoc;
	}

	
	
}
