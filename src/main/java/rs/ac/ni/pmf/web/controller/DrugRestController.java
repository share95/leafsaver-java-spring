package rs.ac.ni.pmf.web.controller;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import rs.ac.ni.pmf.web.model.api.DrugDTO;

@RequestMapping(path = "/drugs")
public interface DrugRestController {

	/* GET /services/rest/drugs */
	@RequestMapping(method = RequestMethod.GET, path = "", produces = MediaType.APPLICATION_JSON_VALUE)
	ArrayList<DrugDTO> getAllDrugs();

	/* GET /services/rest/drugs/{id} */
	@RequestMapping(method = RequestMethod.GET, path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	DrugDTO getDrug(@PathVariable(name = "id") int id);

	/* POST /services/rest/drugs */
	@RequestMapping(method = RequestMethod.POST, path = "", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	DrugDTO createDrug(@RequestBody DrugDTO drug);

	/* PUT /services/rest/drugs */
	@RequestMapping(method = RequestMethod.PUT, path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	DrugDTO updateDrug(@PathVariable(name = "id") int id, @RequestBody DrugDTO drug);

	/* DELETE /services/rest/drugs/{id} */
	@RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
	void deleteTicket(@PathVariable(name = "id") int id);
}
