/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logins;

/**
 *
 * @author tarun
 */
class User {
    private int event_id,seats,amount;
    private String event_name, event_date, organiser;
    
    public User(int event_id, String event_name, String event_date,int seats, String organiser,int amount)
    {
        this.event_id=event_id;
        this.event_name=event_name;
        this.event_date=event_date;
        this.seats=seats;
        this.organiser=organiser;
       this.amount=amount;
    }
    public int getevent_id(){
        return event_id;
    }
    public String getevent_name(){
        return event_name;
    }
    public String getevent_date(){
        return event_date;
    }
    public int getseats(){
        return seats;
    }
    public String getorganiser(){
        return organiser;
    }
    public int getamount(){
        return amount;
    }
}