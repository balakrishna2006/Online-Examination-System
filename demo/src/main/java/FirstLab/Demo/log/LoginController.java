package FirstLab.Demo.log;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LoginController {
    
    @GetMapping("/showLogin")
    public String ShowLoginForm(Model model){
        model.addAttribute("user",new User());
        return "LoginForm";
    }

    @PostMapping("/showLogin")
    public String Process(@Validated User user,BindingResult bindingresult,Model model){
        if (bindingresult.hasErrors()) {
            return "LoginForm";
        }

        if("admin123".equals(user.getUsername()) && "123456".equals(user.getPassword())){
            model.addAttribute("profile",new Profile());
            return "LoginSuccess";
        }
        else{
            model.addAttribute("error","Invalid cridentails");
            return "LoginForm";
        }
    }

    @PostMapping("/register")
    public String processLogin(@Validated Profile profile,BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            return "LoginForm";
        }
        else{
            model.addAttribute("Successfull","Profile registered successfully");
            return "display";
        }
    }
}
