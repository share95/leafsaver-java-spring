package rs.ac.ni.pmf.web.controller;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import rs.ac.ni.pmf.web.model.api.DiseaseDTO;
									
	@RequestMapping(path="/diseases")
	public interface DiseaseRestController {
		
	@RequestMapping(method = RequestMethod.GET, path="",produces = MediaType.APPLICATION_JSON_VALUE)	
	ArrayList<DiseaseDTO> getDiseases();
	
	@RequestMapping(method= RequestMethod.GET,path = "/{disaseId}",produces = MediaType.APPLICATION_JSON_VALUE)
	DiseaseDTO getDiseaseById(@PathVariable(name = "diseaseId") int diseaseId);
	
	@RequestMapping(method= RequestMethod.DELETE, path="/{diseaseId}")
	void deleteDisease(@PathVariable(name = "diseaseId") int id);
	
	@RequestMapping(method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	DiseaseDTO createDisease( @RequestBody DiseaseDTO dto);
	
	@RequestMapping(method = RequestMethod.PUT, path = "/{diseaseId}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	DiseaseDTO updateDisease(@PathVariable(name = "diseaseId") int id, @RequestBody DiseaseDTO dto);

}
