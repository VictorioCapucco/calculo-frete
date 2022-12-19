package br.com.victoriocalculafrete.calculafrete.model;

import java.math.BigDecimal;

public class FreteModel {
	
	private String empresa;
	
	private BigDecimal frete;
	
	public FreteModel(String empresa, BigDecimal frete) {
		this.empresa = empresa;
		this.frete = frete;
	}
	
	public String getEmpresa() {
		return this.empresa;
	}
	
	public BigDecimal getFrete() {
		return this.frete;
	}
 }
