package rs.ac.ni.pmf.web.model.entity;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ProducerEntity {

	private int id;
	private String name;
}
