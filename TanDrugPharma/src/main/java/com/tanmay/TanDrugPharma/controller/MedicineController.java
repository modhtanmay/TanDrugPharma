package com.tanmay.TanDrugPharma.controller;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tanmay.TanDrugPharma.model.Medicine;
import com.tanmay.TanDrugPharma.service.MedicineService;

@Controller
public class MedicineController {

	@Autowired
	MedicineService medicineService;
	
	@RequestMapping("/")
	public String welcome() {
		return "homepage";
	}
	
	// ADD Methods
	@RequestMapping("/load")
	public String load(Model model) {
		model.addAttribute("medicine", new Medicine());
		return "Load";
	}
	
	@PostMapping("/loadMed")
	public String loadMedicine(@ModelAttribute("medicine") @Valid Medicine medicine,BindingResult bindingResult,Model model) {
		if(bindingResult.hasErrors()) {
			return "Load";
		}
		else if(medicine.getMedManDate().after(medicine.getMedExpDate()))
		{
			model.addAttribute("errorMsg", "ExpiryDate cannot be before ManufactureDate");
			return "Load";
		}
		medicineService.addMedicine(medicine);
		return "redirect:/display";
	}
	
	
	// Edit Methods
	@RequestMapping("/editMed/{medId}")
	public String editMedicine(@PathVariable int medId,Model model) {
		Medicine medicine = medicineService.getMedicine(medId);
		model.addAttribute("medicine", medicine);
		return "edit";
	}
	
	@PostMapping("/editSave")
	public String editMedicineSave(@ModelAttribute("medicine") @Valid Medicine medicine,BindingResult bindingResult,Model model) {
		if(bindingResult.hasErrors())
			return "edit";
		else if(medicine.getMedManDate().after(medicine.getMedExpDate()))
		{
			model.addAttribute("errorMsg", "ExpiryDate cannot be before ManufactureDate");
			return "edit";
		}
		medicineService.updateMedicine(medicine);
		return "redirect:/display";
	}
	
	// Sort By Name
	@RequestMapping("/sortByName")
	public String sortByName(Model model) {
		List<Medicine> medicineList = medicineService.sortMedicines();
		model.addAttribute("medicineList", medicineList);
		return "details";
	}
	
	//Summary
	@RequestMapping("/summary")
	public String summary(Model model) {
		int sumStock = medicineService.sumStock();
		model.addAttribute("sumStock", sumStock);
		double sumPrice = medicineService.sumPrice();
		model.addAttribute("sumPrice",sumPrice);
		List<Map<String, Object>> medDet = medicineService.medDet();
		model.addAttribute("medDet",medDet);
		double totMan = medicineService.totManfac();
		model.addAttribute("amount",totMan);
		return "result";
	}
	
	
	// Two displays
	@RequestMapping("/display")
	public String display(Model model) {
		List<Medicine> medicineList = medicineService.getMedicines();
		model.addAttribute("medicineList", medicineList);
		return "details";
	}
	
	@RequestMapping("/expired")
	public String displayExpired(Model model) {
		List<Medicine> medicineExpired = medicineService.getExpired();
		model.addAttribute("medicineExpired",medicineExpired);
		
		return "expiredDisplay";
	}

	// Detele Methods
	@RequestMapping("/deleteExp/{medId}")
	public String deleteExpired(@PathVariable int medId) {
		medicineService.deleteMedicine(medId);
		return "redirect:/expired";
	}
	
	
	@RequestMapping("/delete/{medId}")
	public String deleteMedicine(@PathVariable int medId) {
		medicineService.deleteMedicine(medId);
		return "redirect:/display";
	}

}
