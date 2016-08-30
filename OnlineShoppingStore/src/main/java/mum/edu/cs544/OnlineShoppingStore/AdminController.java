/**
 * 
 */
package mum.edu.cs544.OnlineShoppingStore;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.cs544.models.Admin;
import mum.edu.cs544.services.IAdminService;



/**
 * @author Tarekegn
 * @createdDate Aug 29, 2016
 */
@Controller
public class AdminController {

	@Autowired
	private IAdminService _adminService;
	
	@RequestMapping(value = {"/admin", "/Admin"}, method = RequestMethod.GET)
	public String index(Model model) {
       
		Set<Admin> customerList = _adminService.getAllAdmins();
		model.addAttribute("customerList", customerList);

		return "Admin/adminlist";
	}
}
