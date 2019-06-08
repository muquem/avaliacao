package br.com.etechoracio.avaliacao.business;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.etechoracio.avaliacao.dao.EstoqueDAO;
import br.com.etechoracio.avaliacao.model.Estoque;
import br.com.etechoracio.common.business.BaseSB;

@Service
public class EstoqueSB extends BaseSB {
	
	private EstoqueDAO estoqueDAO;
	
	
	@Override
	protected void postConstructImpl() {
		estoqueDAO = getDAO(EstoqueDAO.class);

}
	
	

	@Transactional(propagation = Propagation.NOT_SUPPORTED)
	public List<Estoque> findAll() {
		return estoqueDAO.findAll();
}
	
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void save(Estoque estoque) throws Exception {
		
			estoqueDAO.save(estoque);
		}
}
	
	


