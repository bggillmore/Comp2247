/*
* Author: Benjamin Gillmore
* Date: Dec 5, 2018
* Assignment: Ticket
* Description: ticket object to insert into our queue.
*/
public class Ticket{
    //data members
    String name;
    int ticketNumber;

    //constructors
    public Ticket() {
    }

    public Ticket(String name, int ticketNumber) {
        this.name = name;
        this.ticketNumber = ticketNumber;
    }

    //setters getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    @Override
    public String toString() {
        return ticketNumber + ": " + name + " ";
    }
    
}
