package mum.edu.cs544.OnlineShoppingStore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.cs544.models.Author;
import mum.edu.cs544.services.IAuthorService;


/**
 * Sample controller for going to the home page with a message
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);
	
	private IAuthorService _authorService;
	
	@Autowired
    public HomeController(IAuthorService authorSeervice) {

        _authorService = authorSeervice;
	}
	
    public HomeController(){}

	/**
	 * Selects the home page and populates the model with a message
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		logger.info("Welcome home!");
		model.addAttribute("controllerMessage",
				"This is the message from the controller!");
		
		Author author = new Author();
		author.setFirstName("fisseha");
		author.setLastName("chari");
		_authorService.addAuthor(author);
		return "home";
	}

}
