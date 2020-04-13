package rs.ac.ni.pmf.web.service;

import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import rs.ac.ni.pmf.web.model.api.DrugDTO;
import rs.ac.ni.pmf.web.model.entity.DrugEntity;
import rs.ac.ni.pmf.web.model.mapper.DrugMapper;
import rs.ac.ni.pmf.web.provider.DataProvider;

@Service
@RequiredArgsConstructor
public class DrugService {

	private final DataProvider drugProvider;
	private final DrugMapper drugMapper;

	public ArrayList<DrugDTO> getAllDrugs() {
		return (ArrayList<DrugDTO>)  drugProvider.getAllDrugs().stream().map(drugMapper::toDto).collect(Collectors.toList());
	}

	public DrugDTO getDrug(int id) {
		return drugMapper.toDto(drugProvider.getDrug(id));
	}

	public DrugDTO createDrug(DrugDTO drug) {
		DrugEntity entity = drugProvider.createDrug(drug);
		return drugMapper.toDto(entity);
	}

	public DrugDTO updateDrug(int id, DrugDTO ticket) {
		return null;
	}

	public void deleteDrug(int id) {

	}

}
