package timetable4580236.vu.edu.au.mobiletimetabler.model;

public class Appointment {

    private static long id;
    //day value made of number between 1 to 5. 1 equal Monday, 5 means Friday.
    private static int day;
    private static String time;
    private static String duration;
    private static String description;

    public long getId(){
        return this.id;
    }
    public void setId(long id){
        this.id = id;
    }
    public int getDay(){
        return this.day;
    }
    public void setDay(int day){
        this.day = day;
    }
    public String getTime(){
        return this.time;
    }
    public void setTime(String time){
        this.time = time;
    }
    public String getDuration(){
        return this.duration;
    }
    public void setDuration(String duration){
        this.duration = duration;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void display(){
        //print out information on console (log) for debugging purpose.

    }



}
