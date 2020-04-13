package rs.ac.ni.pmf.web.provider;

import java.util.ArrayList;


import rs.ac.ni.pmf.web.model.api.DiseaseDTO;
import rs.ac.ni.pmf.web.model.api.DrugDTO;
import rs.ac.ni.pmf.web.model.entity.DiseaseEntity;
import rs.ac.ni.pmf.web.model.entity.DrugEntity;

public interface DataProvider {
	
	ArrayList<DiseaseEntity> getAllDiseases();
	DiseaseEntity createDisease(DiseaseDTO dto);
	void deleteDisease(int id);
	DiseaseEntity getDiseaseById(int id);
	DiseaseEntity updateDisease(int id, DiseaseDTO dto);
	
	
	
	
	
	ArrayList<DrugEntity> getAllDrugs();
	DrugEntity getDrug(int id);
	DrugEntity createDrug(DrugDTO drug);

	
	
	
}
