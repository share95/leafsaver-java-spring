package rs.ac.ni.pmf.web.controller.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import rs.ac.ni.pmf.web.controller.ProducerRestController;
import rs.ac.ni.pmf.web.model.api.ProducerDTO;
import rs.ac.ni.pmf.web.service.ProducerService;

@RestController
public class ProducerrestControllerImpl implements ProducerRestController {

	@Autowired
	private ProducerService producerService;

	@Override
	public ArrayList<ProducerDTO> getAllProducer() {
		return producerService.getAllDrugs();
	}

	@Override
	public ProducerDTO getDrug(int id) {
		return producerService.getDrug(id);
	}

	@Override
	public ProducerDTO createDrug(ProducerDTO producer) {
		return producerService.createDrug(producer);
	}

	@Override
	public ProducerDTO updateDrug(int id, ProducerDTO producer) {
		return producerService.updateDrug(id, producer);
	}

	@Override
	public void deleteTicket(int id) {
		producerService.deleteDrug(id);

	}

}
