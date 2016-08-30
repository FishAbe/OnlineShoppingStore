/**
 * 
 */
package mum.edu.cs544.OnlineShoppingStore;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
        return "user/login";
    }

}
