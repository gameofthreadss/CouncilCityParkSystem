package bcccp.tickets.season;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SeasonTicket implements ISeasonTicket {
	
	private List<IUsageRecord> usages;
	private IUsageRecord currentUsage = null;
	
	private String ticketId;
	private String carparkId;
	private long startValidPeriod;
	private long endValidPeriod;
	

        /*
        Oshan.s
        completed constructor method
        */
	public SeasonTicket (String ticketId, 
			             String carparkId, 
			             long startValidPeriod,
			             long endValidPeriod) {
		
            this.ticketId = ticketId;
            this.carparkId = carparkId;
            this.startValidPeriod = startValidPeriod;
            this.endValidPeriod = endValidPeriod;
            
	}

	@Override
	public String getId() {
            return this.ticketId;
	}

	@Override
	public String getCarparkId() {
            return this.carparkId;
	}

	@Override
	public long getStartValidPeriod() {
            
            return this.startValidPeriod;
	}

	@Override
        /*
        Oshan.s
        2017-08-25
        return end time
        */
	public long getEndValidPeriod() {
            return this.endValidPeriod;
	}

        /*
        Oshan.s
        will return a boolean value indiocating car park is currently using or not
        */
	@Override
	public boolean inUse() {
            boolean use = false;
            if(currentUsage == null)
            {
                use = false;
	}
            else
            {
                use = true;
            }
            return use;
	}

	@Override
        //not sure about this
        //may be use to log it
	public void recordUsage(IUsageRecord record) {
		
            long startTime = record.getStartTime();
            long endTime = record.getEndTime();
            long usage = endTime - startTime;
            System.out.print(usage);		
	}

	@Override
	public IUsageRecord getCurrentUsageRecord() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void endUsage(long dateTime) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IUsageRecord> getUsageRecords() {
		// TODO Auto-generated method stub
		return null;
	}


}
