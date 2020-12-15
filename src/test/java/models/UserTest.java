package models;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void newUser_instantiatesCorrectly_true() {
        User newUser = User.setUpNewUser();
        assertTrue(newUser instanceof User);
    }
    @Test
    public void newUser_getName_String() {
        User newUser = User.setUpNewUser();
        assertEquals("Skylar",newUser.getName());
    }
    @Test
    public void newUser_getAge_Int() {
        User newUser = User.setUpNewUser();
        assertEquals(25,newUser.getAge());
    }
    @Test
    public void newUser_getProfession_String() {
        User newUser = User.setUpNewUser();
        assertEquals("Software Engineer",newUser.getProfession());
    }
    @Test
    public void newUser_getInterests_String() {
        User newUser = User.setUpNewUser();
        assertEquals("Music, Arts and IT",newUser.getInterests());
    }
    @Test
    public void newUser_getAllInstances_true() {
        User newUser = User.setUpNewUser();
        User another = User.setUpNewUser();
        assertTrue(User.getAllInstances().contains(newUser));
        assertTrue(User.getAllInstances().contains(another));
    }
    @Test
    public void newUser_getId_Int() {
        User.clearAllUsers();
        User newUser = User.setUpNewUser();
        User another = User.setUpNewUser();
        User another1 = User.setUpNewUser();
        assertEquals(3,another1.getId());
    }
    @Test
    public void newUser_findById_id() {
        User.clearAllUsers();
        User newUser = User.setUpNewUser();
        User another = User.setUpNewUser();
        assertEquals(2,User.findById(another.getId()).getId());
    }
}
