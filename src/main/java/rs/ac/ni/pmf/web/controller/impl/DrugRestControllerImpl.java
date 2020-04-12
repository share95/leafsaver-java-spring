package rs.ac.ni.pmf.web.controller.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import rs.ac.ni.pmf.web.controller.DrugRestController;
import rs.ac.ni.pmf.web.model.api.DrugDTO;
import rs.ac.ni.pmf.web.service.DrugService;

public class DrugRestControllerImpl implements DrugRestController {

	@Autowired
	private DrugService drugService;

	@Override
	public ArrayList<DrugDTO> getAllDrugs() {
		return drugService.getAllDrugs();
	}

	@Override
	public DrugDTO getDrug(int id) {
		return drugService.getDrug(id);
	}

	@Override
	public DrugDTO createDrug(DrugDTO drug) {
		return drugService.createDrug(drug);
	}

	@Override
	public DrugDTO updateDrug(int id, DrugDTO drug) {
		return drugService.updateDrug(id, drug);
	}

	@Override
	public void deleteTicket(int id) {
		drugService.deleteDrug(id);

	}

}
