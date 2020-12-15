package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class EventTest{
    @Test
    public void newEvent_instantiatesCorrectly_true() {
        Event newEvent = Event.setUpNewEvent();
        assertTrue(true);
    }
    @Test
    public void newEvent_getName_String() {
        Event newEvent = Event.setUpNewEvent();
        assertEquals("Spelling Bee Competition",newEvent.getEventName());
    }
    @Test
    public void newEvent_getSize_Int() {
        Event newEvent = Event.setUpNewEvent();
        assertEquals(50,newEvent.getSize());
    }
    @Test
    public void newEvent_getDescription_String() {
        Event newEvent = Event.setUpNewEvent();
        assertEquals("Participate in a spelling competition and stand a chance to win 10,000KES! Location : Safaricom Stadium,Nairobi. Time : 9am to 5pm",newEvent.getDescription());
    }
    @Test
    public void newEvent_getInstances_true() {
        Event newEvent = Event.setUpNewEvent();
        Event another = Event.setUpNewEvent();
        assertTrue(Event.getInstances().contains(newEvent));
        assertTrue(Event.getInstances().contains(another));
    }
//    @Test
//    public void newEvent_getEventMembers_Array() {
//        Event newEvent = Event.setUpNewEvent();
//        User newUser = Event.setUpNewUser();
//        User newUser1 = User.setUpNewUser1();
//        newEvent.setEventMembers(newUser);
//        assertEquals("Skylar",newEvent.getEventMembers().get(0).getName());
//    }

    @Test
    public void newEvent_allTestEventMembers_Array() {
        User newUser = User.setUpNewUser();
        Event newEvent = Event.setUpNewEvent();
        newEvent.clearAllEventMembers();
        newEvent.getEventMembers().add(newUser);
        assertEquals("Skylar",newEvent.getEventMembers().get(0).getName());
    }
//    @Test
//    public void addMember_addsMemberToEvent_user(){
//        User newUser = User.setUpNewUser();
//        Event testEvent = Event.setUpNewEvent();
//        Event newEvent = Event.findByEventId(1);
//        newEvent_allTestEventMembers_Array().clearAllEventMembers();
//        newEvent.getEventMembers().add(newUser);
//        newEvent.getEventMembers().add(newUser);
//        assertEquals(2,newEvent.getEventMembers().size());
//    }
//
//    @Test
//    public void setNewMember_user(){
//        User.clearAllUsers();
//        User newUser = User.setUpNewUser();
//        Event testEvent = Event.setUpNewEvent();
//        testEvent.setEventMembers(newUser);
//
//        assertEquals(1,testEvent.getEventMembers().get(0).getId());
    }


//    @Test
//    public void newEvent_findById_id() {
//        Event newEvent = Event.setUpNewEvent();
//        Event another = Event.setUpNewEvent();
//        assertEquals(2,Event.findById(another.getId()).getId());
//    }
//}