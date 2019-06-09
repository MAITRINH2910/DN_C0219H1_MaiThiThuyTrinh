package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @PostMapping("/translate")
    public String dictionnary(@RequestParam String word, Model model){

        Map<String, String> englishWord = new HashMap<>();
        englishWord.put("excursion", "chuyến tham quan");
        englishWord.put("banter", "sự giễu cợt");
        englishWord.put ("opiate","thuốc phiện");
        englishWord.put("inherent","vốn có");
        englishWord.put("launderette","hiệt giặt tự động");

        if (englishWord.get(word)!= null) {
            model.addAttribute("vietWord", englishWord.get(word));
            model.addAttribute("engWord", word);
            return "translateWord";
        } return "error";
    }

    @GetMapping("")
    public String home(Model model){
        return "formDictionary";
    }
}
