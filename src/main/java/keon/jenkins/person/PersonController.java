package keon.jenkins.person; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.bind.annotation.RestController; 
 
@RestController 
class PersonController { 
     @Autowired 
     private Person person; 
     
     @RequestMapping("/register") 
     String register(@RequestParam("a") String a) { 
          return String.valueOf(person.register(a)); 
     } 

     @RequestMapping("/delete") 
     String delete(@RequestParam("a") String a) { 
          return String.valueOf(person.delete(a)); 
     } 

     @RequestMapping("/update") 
     String update(@RequestParam("a") String a, @RequestParam("b") String b) { 
          return String.valueOf(person.update(a, b)); 
     } 



} 
