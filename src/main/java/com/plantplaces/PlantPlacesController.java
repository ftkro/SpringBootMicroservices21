package com.plantplaces;

import com.plantplaces.dto.SpecimenDTO;
import com.plantplaces.service.ISpecimenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handle the /start endpoint
 */
@Controller
public class PlantPlacesController {
	@Autowired
	private ISpecimenService specimenServiceStub;

	@RequestMapping(value = "/start", method = RequestMethod.GET)
	public String read(Model model) {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchBy(43);
		model.addAttribute("specimenDTO", specimenDTO);
		return "start";
	}

	@RequestMapping(value = "/start", method = RequestMethod.GET, headers = {"content-type=text/json"})
	public String readJson() {
		return "start";
	}

	@RequestMapping(value = "/start", method = RequestMethod.GET, params = {"loyalty=blue"})
	public String readBlue() {
		return "start";
	}

	@RequestMapping(value = "/start", method = RequestMethod.GET, params = {"loyalty=silver"})
	public ModelAndView readSilver() {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchBy(43);
		specimenDTO.setSpecimenId(85);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("start");
		modelAndView.addObject("specimenDTO", specimenDTO);
		return modelAndView;
	}

	@PostMapping("/start")
	public String create() {
		return "start";
	}

	/**
	 * Handle the / endpoint
	 */
	@RequestMapping("/")
	public String index() {
		return "start";
	}
}
