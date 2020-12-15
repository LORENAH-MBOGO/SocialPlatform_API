package models;

import java.util.ArrayList;

public class Event {

    private int eventId;
    private String eventName;
    private int eventSize;
    private String description;
    private ArrayList<User>  eventMembers = new ArrayList<>();
    private static ArrayList<Event> instances = new ArrayList<>();

    public Event(String name, int size, String description ){
        eventName = name;
        eventSize = size;
        this.description = description;
        this.eventMembers = new ArrayList<>();
        instances.add(this);
        this.eventId = instances.size();
}
    public int getEventId(){return eventId;}
    public static Event findByEventId(int id) {return instances.get(id-1);}
    public String getEventName() {return eventName;}
    public int getSize() {return eventSize;}
    public String getDescription() {return this.description;}
    public static ArrayList<Event> getInstances(){return instances;}
    public ArrayList<User> getEventMembers(){
        return eventMembers;
    }
    public static void clearAllUsers(){ instances.clear(); }
    public void clearAllEventMembers(){ getEventMembers().clear(); }

    public static Event setUpNewEvent(){return new Event("Spelling Bee Competition",50,"Participate in a spelling competition and stand a chance to win 10,000KES! Location : Safaricom Stadium,Nairobi. Time : 9am to 5pm");}
    public static Event setUpNewEvent1(){return new Event("Twende Biking",25,"Join us as we bike deep into the calm Karura Forest. Let's mingle! Location : Karura Forest,Nairobi. Time : 11am to 3pm");}

}