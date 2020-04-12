package rs.ac.ni.pmf.web.model.mapper;

import org.springframework.stereotype.Component;

import rs.ac.ni.pmf.web.model.api.ProducerDTO;
import rs.ac.ni.pmf.web.model.entity.ProducerEntity;

@Component
public class ProducerMapper {

	public ProducerDTO toDto(final ProducerEntity producerEntity) {
		return ProducerDTO.builder()
				.id(producerEntity.getId())
				.name(producerEntity.getName())
				.build();
	}

	public ProducerEntity toEntity(final ProducerDTO producerDTO) {
		return ProducerEntity.builder()
				.id(producerDTO.getId())
				.name(producerDTO.getName())
				.build();
	}
}
