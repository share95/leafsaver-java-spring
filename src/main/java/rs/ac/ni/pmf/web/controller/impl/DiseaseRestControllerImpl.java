package rs.ac.ni.pmf.web.controller.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import rs.ac.ni.pmf.web.controller.DiseaseRestController;
import rs.ac.ni.pmf.web.model.api.DiseaseDTO;


@RestController
@RequiredArgsConstructor
public class DiseaseRestControllerImpl implements DiseaseRestController {
	
	@Autowired
	private final DiseaseService diseaseService= new DiseaseService();
	
@Override
public DiseaseDTO createDisease(DiseaseDTO dto) {
	
	return diseaseService.createDisease(dto);
}



@Override
public ArrayList<DiseaseDTO> getDiseases() {
	
	return diseaseService.getAllDiseases();
}

@Override
public DiseaseDTO getDiseaseById(int diseaseId) {
	
	return diseaseService.getDiseaseById(diseaseId);
}

@Override
public void deleteDisease(int id) {
	
	diseaseService.deleteDisease(id);
	
}

@Override
public DiseaseDTO updateDisease(int id, DiseaseDTO dto) {
	
	return diseaseService.updateDisease(id, dto);
}
}
