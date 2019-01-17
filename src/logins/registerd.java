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

class registerd {
    private int event_id;
    private String student_name;
    
    public registerd(int event_id, String student_name)
    {
        this.event_id=event_id;
        this.student_name=student_name;
       
    }
    public int getevent_id(){
        return event_id;
    }
    public String getstudent_name(){
        return student_name;
    }    
}
