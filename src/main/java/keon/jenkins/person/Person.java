package keon.jenkins.person; 
import org.springframework.stereotype.Service; 

 // Jenkins Automatic Build Commit.

@Service 
public class Person { 

     public String register(String name){
          return "User Registered : " + name;
     }

     public String delete(String name){
          return "Deleted!";
     }

     public String update (String before, String after){
          return "Before : " + before + "\nAfter : " + after;
     }

} 
