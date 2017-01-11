package br.com.tidicas.controller;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import br.com.tidicas.bean.Index;

/**
 * Classe controller secundário
 * @author Evaldo Junior
 *
 */
@Named
@Scope("session")
public class Page1Bean {

	@Inject
	Index index;
	
	public void setIndex(Index index) {
		this.index = index;
	}

	public String printMensagem() {
		return index.getMensagem() + " Página 1";
	}

}