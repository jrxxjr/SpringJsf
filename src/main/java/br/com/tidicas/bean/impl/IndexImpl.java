package br.com.tidicas.bean.impl;

import javax.inject.Named;

import br.com.tidicas.bean.Index;

/**
 * Classe que implementada a interface de geração de mensagens
 * @author Evaldo Junior
 *
 */
@Named
public class IndexImpl implements Index{
 
	public String getMensagem() {
		
		return "Spring JSF";
	
	}
 
}