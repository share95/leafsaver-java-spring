package rs.ac.ni.pmf.web.controller;

import java.util.ArrayList;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import rs.ac.ni.pmf.web.model.api.ProducerDTO;

@RequestMapping(path = "/producer")
public interface ProducerRestController {

	/* GET /services/rest/producers */
	@RequestMapping(method = RequestMethod.GET, path = "", produces = MediaType.APPLICATION_JSON_VALUE)
	ArrayList<ProducerDTO> getAllProducer();

	/* GET /services/rest/producers/{id} */
	@RequestMapping(method = RequestMethod.GET, path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	ProducerDTO getDrug(@PathVariable(name = "id") int id);

	/* POST /services/rest/producers */
	@RequestMapping(method = RequestMethod.POST, path = "", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	ProducerDTO createDrug(@RequestBody ProducerDTO drug);

	/* PUT /services/rest/producers */
	@RequestMapping(method = RequestMethod.PUT, path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	ProducerDTO updateDrug(@PathVariable(name = "id") int id, @RequestBody ProducerDTO drug);

	/* DELETE /services/rest/producers/{id} */
	@RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
	void deleteTicket(@PathVariable(name = "id") int id);
}
