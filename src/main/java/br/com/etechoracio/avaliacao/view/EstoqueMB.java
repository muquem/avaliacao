package br.com.etechoracio.avaliacao.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.etechoracio.avaliacao.business.EstoqueSB;
import br.com.etechoracio.avaliacao.model.Estoque;
import br.com.etechoracio.common.view.BaseMB;
import lombok.Getter;
import lombok.Setter;



@Setter
@Getter
@Controller
//@Scope("view")
public class EstoqueMB extends BaseMB {

	
	
	@Autowired
	private EstoqueSB estoqueSB;

	private List<Estoque> registros;

	protected void postConstruct() {
		registros = estoqueSB.findAll();
	}

	private Estoque edit = new Estoque();



	public void onUpdate(Estoque estoque) {
		edit = estoque;
	}

	public void onSave() {
		try {
			estoqueSB.save(edit);
			showInsertMessage();

		} catch (Exception e) {
			showErrorMessage(e.getMessage());
		}

	}

}

