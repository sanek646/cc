package cc.pro.cc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String frontPage(Model model){
        model.addAttribute("title","First Page");
        return "firstPage";
    }
}
