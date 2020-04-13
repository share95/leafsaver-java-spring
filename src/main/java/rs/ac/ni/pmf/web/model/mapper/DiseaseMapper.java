package rs.ac.ni.pmf.web.model.mapper;

import org.springframework.stereotype.Component;

import rs.ac.ni.pmf.web.model.api.DiseaseDTO;
import rs.ac.ni.pmf.web.model.entity.DiseaseEntity;

@Component
public class DiseaseMapper {
	
	public DiseaseDTO toDto(final DiseaseEntity entity) {
		return DiseaseDTO.builder()
				.id(entity.getId())
				.name(entity.getName())
				.nice_name(entity.getNice_name())
				.build();
	}
	
	public DiseaseEntity toEntity(final DiseaseDTO dto) {
		return DiseaseEntity.builder()
				.id(dto.getId())
				.name(dto.getName())
				.nice_name(dto.getNice_name())
				.build();
	}

}
