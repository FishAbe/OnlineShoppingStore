/**
 * 
 */
package mum.edu.cs544.OnlineShoppingStore;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Fish
 *
 */
public class DashboardController {
	
	@RequestMapping(value="/admin/DashBoard", method = RequestMethod.GET)
	public String adminDashBoard(Model model){
		
		return "dashBoard/adminDashBoard";
	}
	
	@RequestMapping(value="customer/dashBoard", method = RequestMethod.GET)
	public String customerDashBoard(Model model){
		return "dashBoard/customerDashBoard";
	}

}
