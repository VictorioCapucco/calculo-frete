package br.com.victoriocalculafrete.calculafrete.strategy;

import br.com.victoriocalculafrete.calculafrete.enumx.Regiao;
import br.com.victoriocalculafrete.calculafrete.model.FreteModel;

public interface CalculaFreteStrategy {
	
	Regiao getRegiao();
	
	FreteModel calculaFrete();
	
}
