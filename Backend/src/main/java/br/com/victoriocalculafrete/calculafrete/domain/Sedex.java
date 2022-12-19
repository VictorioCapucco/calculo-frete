package br.com.victoriocalculafrete.calculafrete.domain;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import br.com.victoriocalculafrete.calculafrete.enumx.Empresas;
import br.com.victoriocalculafrete.calculafrete.enumx.Regiao;
import br.com.victoriocalculafrete.calculafrete.model.FreteModel;
import br.com.victoriocalculafrete.calculafrete.strategy.CalculaFreteStrategy;

@Component
public class Sedex implements CalculaFreteStrategy {

	@Override
	public FreteModel calculaFrete() {
		return new FreteModel(Empresas.SEDEX.toString(), new BigDecimal("13.70"));
	}

	@Override
	public Regiao getRegiao() {
		return Regiao.SUL;
	}

}
