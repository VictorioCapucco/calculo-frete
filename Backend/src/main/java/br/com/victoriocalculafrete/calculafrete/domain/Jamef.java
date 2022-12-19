package br.com.victoriocalculafrete.calculafrete.domain;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import br.com.victoriocalculafrete.calculafrete.enumx.Empresas;
import br.com.victoriocalculafrete.calculafrete.enumx.Regiao;
import br.com.victoriocalculafrete.calculafrete.model.FreteModel;
import br.com.victoriocalculafrete.calculafrete.strategy.CalculaFreteStrategy;

@Component
public class Jamef implements CalculaFreteStrategy {

	@Override
	public FreteModel calculaFrete() {
		return new FreteModel(Empresas.JAMEF.toString(), new BigDecimal("12.50"));
	}

	@Override
	public Regiao getRegiao() {
		return Regiao.CENTRO_OESTE;
	}

}
