package bcccp.tickets.adhoc;

import java.util.List;
import bcccp.tickets.adhoc.IAdhocTicket;//access iAdhocTicket Class methods
import bcccp.tickets.adhoc.AdhocTicket;//access AdhocTicket Class data
import bcccp.carpark.Carpark;
import bcccp.carpark.entry.EntryUI;
import bcccp.carpark.entry.IEntryController;
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
		// TODO Auto-generated method stub
                if(carPark.isFull())
                      entryUI.display("Full");
                else
                {
                    entryUI.pushButton();
                    iAdhocTicket.getBarcode();
                    iAdhocTicket.getTicketNo();
                    iAdhocTicket.getCarparkId();
		
                }
                return iAdhocTicket;
	}



	@Override
	public IAdhocTicket findTicketByBarcode(String barcode) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<IAdhocTicket> getCurrentTickets() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
