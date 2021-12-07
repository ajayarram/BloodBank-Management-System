package net.javaguides.bms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.bms.entity.Donor;
import net.javaguides.bms.service.DonorService;

@Controller
public class DonorController {
	
	private DonorService donorService;

	public DonorController(DonorService donorService) {
		super();
		this.donorService = donorService;
	}
	
	// handler method to handle list students and return mode and view
	@GetMapping("/donors")
	public String listDonors(Model model) {
		model.addAttribute("donors", donorService.getAllDonors());
		return "donors";
	}
	
	@GetMapping("/donors/new")
	public String createDonorForm(Model model) {
		
		// create student object to hold student form data
		Donor donor = new Donor();
		model.addAttribute("donor", donor);
		return "create_donor";
		
	}
	
	@PostMapping("/donors")
	public String saveStudent(@ModelAttribute("donor") Donor donor) {
		donorService.saveDonor(donor);
		return "redirect:/donors";
	}
	
	@GetMapping("/donors/edit/{id}")
	public String editDonorForm(@PathVariable Long id, Model model) {
		model.addAttribute("donor", donorService.getDonorById(id));
		return "edit_donor";
	}

	@PostMapping("/donors/{id}")
	public String updateDonor(@PathVariable Long id,
			@ModelAttribute("donor") Donor donor,
			Model model) {
		
		// get student from database by id
		Donor existingDonor = donorService.getDonorById(id);
		existingDonor.setId(id);
		existingDonor.setFirstName(donor.getFirstName());
		existingDonor.setLastName(donor.getLastName());
		existingDonor.setEmail(donor.getEmail());
		existingDonor.setBloodType(donor.getBloodType());
		existingDonor.setMobile(donor.getMobile());
		
		// save updated student object
		donorService.updateDonor(existingDonor);
		return "redirect:/donors";		
	}
	
	// handler method to handle delete student request
	
	@GetMapping("/donors/{id}")
	public String deleteDonor(@PathVariable Long id) {
		donorService.deleteDonorById(id);
		return "redirect:/donors";
	}
	
}
