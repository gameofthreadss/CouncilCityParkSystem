package bcccp.carpark.exit;

import bcccp.carpark.Carpark;
import bcccp.carpark.ICarSensor;
import bcccp.carpark.ICarSensorResponder;
import bcccp.carpark.ICarpark;
import bcccp.carpark.IGate;
import bcccp.tickets.adhoc.IAdhocTicket;
import java.util.Date;

public class ExitController 
		implements ICarSensorResponder,
		           IExitController {
	
	private IGate exitGate;
	private ICarSensor insideSensor;
	private ICarSensor outsideSensor; 
	private IExitUI ui;
	
	private ICarpark carpark;
	private IAdhocTicket  adhocTicket = null;
	private long exitTime;
	private String seasonTicketId = null;
	
	

	public ExitController(Carpark carpark, IGate exitGate, 
			ICarSensor is,
			ICarSensor os, 
			IExitUI ui) {
	
            //Constructor implementaion 
     this.carpark = carpark;

    this.exitGate = exitGate;

    insideSensor = is;

    outsideSensor = os;

    this.ui = ui;
                
	}



	@Override
	public void ticketInserted(String ticketStr) {
		
		
        exitTime = new Date().getTime();

    adhocTicket = carpark.getAdhocTicket(ticketStr);
	}



	@Override
	public void ticketTaken() {
	
               //Added raise mthod
                exitGate.raise();
                
		
	}



	@Override
	public void carEventDetected(String detectorId, boolean detected) {
		// TODO Auto-generated method stub
		
	}

	
	
}
