package at.technikum.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Unterschied zwischen Controller und RestController --> REST nur Datenweitergabe Controller versucht immer html zu schicken
@RestController //json
//@Controller //html
public class CalculatorController {

    @RequestMapping("/sum")
    public int sum (int a, int b){
        return a+b;
    }


    //@GetMapping("/")
    //public String index(){
    //    return "hello"; //würde bei @Controller nicht funktionieren, weil er nach hello.html suchen würde.
    //}
}
