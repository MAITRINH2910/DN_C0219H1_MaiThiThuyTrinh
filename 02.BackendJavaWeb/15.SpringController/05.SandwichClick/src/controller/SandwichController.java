package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class SandwichController {

    @PostMapping("/save")
    public String save(Model model, @RequestParam("condiment") String[] condiments){
        if  (condiments.length==0){
            model.addAttribute("condiment","Nothing isn't chosen");
        } else{
            model.addAttribute("condiment", Arrays.copyOfRange(condiments,1,condiments.length));
        }
       return "showCondiment";

    }

    @GetMapping("/home")
    public String Sandwich(){
        return "sandwich";
    }
}
