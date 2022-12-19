package br.com.victoriocalculafrete.calculafrete.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.victoriocalculafrete.calculafrete.enumx.Estados;
import br.com.victoriocalculafrete.calculafrete.model.FreteModel;
import br.com.victoriocalculafrete.calculafrete.strategy.CalculaFreteProvider;

@Service
public class FreteService {
	
	@Autowired
	private CalculaFreteProvider calculaFreteProvider;

	public FreteModel calcula(Estados estado) {
		return calculaFreteProvider.getStrategy(estado.getRegiao()).calculaFrete();
	}
	
}
