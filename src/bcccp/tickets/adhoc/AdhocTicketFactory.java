package bcccp.tickets.adhoc;

public class AdhocTicketFactory implements IAdhocTicketFactory {

        private IAdhocTicket iAdhocTicket;
	@Override
	public IAdhocTicket make(String carparkId, int ticketNo) {
		// TODO Auto-generated method stub
                iAdhocTicket.getCarparkId();
                iAdhocTicket.getTicketNo();
		return iAdhocTicket;
	}


}
