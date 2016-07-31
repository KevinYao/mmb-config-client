package controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mmb on 2016/7/30.
 */
@RestController
public class LuckyWordController {

    @Value("${lucky-word}")
    String luckyWord;

    @RequestMapping("/lucky-word")
    public String showLuckyWord() {
        return "The lucky word is: " + luckyWord;
    }
}