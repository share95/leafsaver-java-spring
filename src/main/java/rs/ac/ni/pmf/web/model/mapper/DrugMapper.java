package rs.ac.ni.pmf.web.model.mapper;

import org.springframework.stereotype.Component;

import rs.ac.ni.pmf.web.model.api.DrugDTO;
import rs.ac.ni.pmf.web.model.entity.DrugEntity;

@Component
public class DrugMapper {

	public DrugDTO toDto(final DrugEntity drugEntity) {
		return DrugDTO.builder()
				.id(drugEntity.getId())
				.name(drugEntity.getName())
				.producerId(drugEntity.getProducer().getId())
				.description(drugEntity.getDescription())
				.build();
	}

	public DrugEntity toEntity(final DrugDTO drugDTO) {
		return DrugEntity.builder()
				.id(drugDTO.getId())
				.name(drugDTO.getName())
				// .producer() napraviti kad Marko okaci poslednju verziju
				.description(drugDTO.getDescription())
				.build();
	}
}
