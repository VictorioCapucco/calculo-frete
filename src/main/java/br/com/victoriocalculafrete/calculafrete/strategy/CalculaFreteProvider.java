package br.com.victoriocalculafrete.calculafrete.strategy;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.victoriocalculafrete.calculafrete.enumx.Regiao;

@Component
public class CalculaFreteProvider {

	HashMap<Regiao, CalculaFreteStrategy> map = new HashMap<>();

	public CalculaFreteStrategy getStrategy(Regiao regiao) {
		return map.get(regiao);
	}
	
	
	@Autowired
	public void setStrategies(List<CalculaFreteStrategy> list) {
		list.forEach(item -> {
			map.put(item.getRegiao(), item);
		});
	}
}
