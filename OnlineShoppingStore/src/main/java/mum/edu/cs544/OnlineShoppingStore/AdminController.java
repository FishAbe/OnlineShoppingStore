/**
 * 
 */
package mum.edu.cs544.OnlineShoppingStore;

import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mum.edu.cs544.models.Admin;
import mum.edu.cs544.models.Customer;
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
       
		Set<Admin> adminList = _adminService.getAllAdmins();
		model.addAttribute("adminList", adminList);

		return "Admin/adminlist";
	}
	
	@RequestMapping(value = "/admin/add", method = RequestMethod.GET)
	public String add(Model model) {
		
		model.addAttribute("admin", new Admin());
		return "Admin/addAdmin";
	}
	
	@RequestMapping(value = "/admin/add", method = RequestMethod.POST)
	public String add(@ModelAttribute("admin") @Valid Admin admin, BindingResult result) {
        
		List<ObjectError> errors = result.getAllErrors();
		for(ObjectError e: errors){
			System.out.println(e.getDefaultMessage());
		}
		
		
		if(result.hasErrors())
			return "Admin/addAdmin";
		//System.out.println(admin.getBilingAddress().getCountry());
		_adminService.addAdmin(admin);
		return "redirect:/spring/admin";
	}
	
	@RequestMapping(value="/admin/update/{id}",method = RequestMethod.GET)
	public String update(@PathVariable long id,Model model){
		Admin admin = _adminService.findById(id);
		model.addAttribute("admin",admin);
		return "Admin/updateAdmin";
		
	}
	@RequestMapping(value = "/admin/update/{id}", method = RequestMethod.POST)
	public String update(@ModelAttribute("adminForm") Admin admin,@PathVariable int id, BindingResult result){
		
		if(result.hasErrors())
			return "redirect:/admin/update/" + id;
		_adminService.updateAdmin(admin);
		
		return "redirect:/spring/admin";
	}
	
	@RequestMapping(value = "/admin/delete/{id}", method = RequestMethod.GET )
	public String delete(@PathVariable int id){
		
		_adminService.remove(id);
		return "redirect:/spring/admin";
	}

}
