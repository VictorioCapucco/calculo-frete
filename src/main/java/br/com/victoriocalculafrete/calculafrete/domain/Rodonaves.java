package br.com.victoriocalculafrete.calculafrete.domain;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import br.com.victoriocalculafrete.calculafrete.enumx.Empresas;
import br.com.victoriocalculafrete.calculafrete.enumx.Regiao;
import br.com.victoriocalculafrete.calculafrete.model.FreteModel;
import br.com.victoriocalculafrete.calculafrete.strategy.CalculaFreteStrategy;

@Component
public class Rodonaves implements CalculaFreteStrategy {

	@Override
	public FreteModel calculaFrete() {
		return new FreteModel(Empresas.RODONAVES.toString(), new BigDecimal("17.50"));
	}

	@Override
	public Regiao getRegiao() {
		return Regiao.SUDESTE;
	}

}
