/**
 * 
 */
package mum.edu.cs544.OnlineShoppingStore;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.cs544.models.Admin;
import mum.edu.cs544.models.Book;
import mum.edu.cs544.models.Enum.Genre;

/**
 * @author Tarekegn
 * @createdDate Aug 29, 2016
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/login") //annotation is necesssary for default one too.
	public String login(Model model) {
        Admin user=new Admin();
        model.addAttribute("currentUser", user);
        return "login";
    }
	@RequestMapping(value="/loginfailed", method = RequestMethod.GET)
	public String loginerror(Model model) {
 
		model.addAttribute("error", "true");
		return "login";
 
	}
	
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(Model model) {
 		return "redirect:/spring/";
 	}

}
