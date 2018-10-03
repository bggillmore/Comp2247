
import java.time.LocalDate;

/*
* Author: Benjamin Gillmore
* Date: 09/19/2018
* Assignment: Assignment #3 CoustomerJob.java
* Description: Holds the data members for coustomer job and a method that 
*              returns the time it took to complete the job in days.
*/
public class CustomerJob {
    private int jobId;
    private Person coustomer;
    private Contractor contractor;
    private MyDate dateRequested, dateStarted, dateCompleted;

    //constructors
    public CustomerJob() {
    }

    public CustomerJob(int jobId, Person coustomer, Contractor contractor, 
            MyDate dateRequested, MyDate dateStarted, MyDate dateCompleted) {
        this.jobId = jobId;
        this.coustomer = coustomer;
        this.contractor = contractor;
        this.dateRequested = dateRequested;
        this.dateStarted = dateStarted;
        this.dateCompleted = dateCompleted;
    }

    //setters and getters
    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public Person getCoustomer() {
        return coustomer;
    }

    public void setCoustomer(Person coustomer) {
        this.coustomer = coustomer;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public void setContractor(Contractor contractor) {
        this.contractor = contractor;
    }

    public MyDate getDateRequested() {
        return dateRequested;
    }

    public void setDateRequested(MyDate dateRequested) {
        this.dateRequested = dateRequested;
    }

    public MyDate getDateStarted() {
        return dateStarted;
    }

    public void setDateStarted(MyDate dateStarted) {
        this.dateStarted = dateStarted;
    }
    
    public MyDate getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(MyDate dateCompleted) {
        this.dateCompleted = dateCompleted;
    }
    
    //toString
    @Override
    public String toString() {
        return String.format("ID: %d\nCustomer Info: %s\nContractor Info: %s\nContact Date: %s\n"
                + "Starting Date: %s\nCompletion Date: %s\nDays to complete the job: %s\n", 
                this.jobId, this.coustomer.toString(), this.contractor.toString(), 
                this.dateRequested.toString(), this.dateStarted.toString(), 
                this.dateCompleted.toString(), jobLength());
    }

    
    
    //returns the length of time the job took by creating local date objects
    //Im aware that this is kind of a hacky way to make this work 
    //but its just for the extra credit, so be it.
    private int jobLength(){
        LocalDate completedLocalDate = LocalDate.of(this.dateCompleted.getYear(), 
                this.dateCompleted.getMonth(), this.dateCompleted.getDay());
        
        LocalDate startedLocalDate = LocalDate.of(this.dateStarted.getYear(), 
                this.dateStarted.getMonth(), this.dateStarted.getDay());
        
        return startedLocalDate.until(completedLocalDate).getDays();
    }
}
