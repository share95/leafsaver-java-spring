package rs.ac.ni.pmf.web.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import rs.ac.ni.pmf.web.model.mapper.DiseaseMapper;
import rs.ac.ni.pmf.web.provider.DataProvider;

@Service
@RequiredArgsConstructor
public class DiseaseService {
	
	private final DataProvider provider;
	private final DiseaseMapper mapper;
	
	
	

}
