package bcccp.tickets.adhoc;

public class AdhocTicketFactory implements IAdhocTicketFactory {

        private IAdhocTicket iAdhocTicket;
	@Override
	public IAdhocTicket make(String carparkId, int ticketNo) {
		// This will retunr the IadhocTicket object to make ticket.
                iAdhocTicket.getCarparkId();
                iAdhocTicket.getTicketNo();
		return iAdhocTicket;
	}


}
