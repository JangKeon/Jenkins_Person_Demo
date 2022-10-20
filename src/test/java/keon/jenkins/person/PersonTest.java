package keon.jenkins.person; 
import org.junit.Test;

import keon.jenkins.person.Person;

import static org.junit.Assert.assertEquals; 
 
public class PersonTest { 
     private Person person = new Person(); 

     @Test
     public void testRegister() {
          assertEquals("User Registered : Jang Keon", person.register("Jang Keon"));
     }

     @Test
     public void testDelete() {
          assertEquals("Error !", person.delete("Jang Keon"));
     }

     @Test
     public void testupdate() {
          assertEquals("Before : Jang Keon\nAfter : Jang Gun", person.update("Jang Keon", "Jang Gun"));
     }
} 
