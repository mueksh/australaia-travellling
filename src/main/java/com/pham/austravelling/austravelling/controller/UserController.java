package com.pham.austravelling.austravelling.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.pham.austravelling.austravelling.model.User;
import com.pham.austravelling.austravelling.repository.UserRepository;
import com.pham.austravelling.austravelling.service.SequenceGeneratorService;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private SequenceGeneratorService sequenceGeneratorService;
	
	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}
	@GetMapping("/place")
	public String viewPlacePage() {
		return "place";
	}
	@GetMapping("/sydney_tour")
	public String viewSydneyPage() {
		return "sydney_tour";
	}
	@GetMapping("/darwin_tour")
	public String viewDarwinPage() {
		return "darwin_tour";
	}
	@GetMapping("/melboure_tour")
	public String viewMelbourePage() {
		return "melboure_tour";
	}
	@GetMapping("/perth_tour")
	public String viewPerthPage() {
		return "perth_tour";
	}
	@GetMapping("/queensland_tour")
	public String viewQueenslandPage() {
		return "queensland_tour";
	}
	@GetMapping("/adelaide_tour")
	public String viewAdelaidePage() {
		return "adelaide_tour";
	}
	
	
	@GetMapping("/booking")
	public String addFoodData(Model model) {
		model.addAttribute("user",new User());
		return "booking";
	}
	@PostMapping("/process_register")
	public String processData(User user) {
		user.setId(sequenceGeneratorService.getSequenceNumber(User.SEQUENCE_NAME));
		userRepository.save(user);
		return "bookinglist";
	}
	@GetMapping("/bookinglist")
    public String viewHomePage(Model model) {
        model.addAttribute("userList", userRepository.findAll());
        return "bookinglist";
	}

}
