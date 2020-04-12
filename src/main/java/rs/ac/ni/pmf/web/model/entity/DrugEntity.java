package rs.ac.ni.pmf.web.model.entity;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class DrugEntity {

	private int id;
	private String name;
	private ProducerEntity producer;
	private String description;
}
