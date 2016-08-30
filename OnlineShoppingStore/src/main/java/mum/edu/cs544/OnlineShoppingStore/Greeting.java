/**
 * 
 */
package mum.edu.cs544.OnlineShoppingStore;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Tarekegn
 * @createdDate Aug 30, 2016
 */

@Controller
public class Greeting {
 @RequestMapping("/greating")
 public @ResponseBody String great(){
	 return "Hello Tare";
 }
}
