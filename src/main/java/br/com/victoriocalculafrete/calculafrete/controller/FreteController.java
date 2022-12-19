package br.com.victoriocalculafrete.calculafrete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.victoriocalculafrete.calculafrete.enumx.Estados;
import br.com.victoriocalculafrete.calculafrete.model.FreteModel;
import br.com.victoriocalculafrete.calculafrete.service.FreteService;

@Controller
public class FreteController {
	
	@Autowired
	private FreteService calculaFreteService;

	
	@RequestMapping(value = "/calcula-frete", method = RequestMethod.GET)
	@ResponseBody
	public FreteModel calculaFrete(@RequestParam(name = "estado", required = true) Estados estado) {
		return calculaFreteService.calcula(estado);
	}
	
	
}
