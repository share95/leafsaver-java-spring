package rs.ac.ni.pmf.web.service;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import rs.ac.ni.pmf.web.model.api.DrugDTO;
import rs.ac.ni.pmf.web.model.mapper.DrugMapper;

@Service
@RequiredArgsConstructor
public class DrugService {

	private final DrugProvider drugProvider;
	private final DrugMapper drugMapper;

	public ArrayList<DrugDTO> getAllDrugs() {
		return drugProvider.getAllTickets().stream().map(drugMapper::toDto).collect(Collectors.toList());
	}

	public DrugDTO getDrug(int id) {
		return drugMapper.toDto(drugProvider.getDrug(id));
	}

	public DrugDTO createDrug(DrugDTO drug) {
		return null;
	}

	public DrugDTO updateDrug(int id, DrugDTO ticket) {
		return null;
	}

	public void deleteDrug(int id) {

	}

}
