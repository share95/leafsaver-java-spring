package rs.ac.ni.pmf.web.model.api;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

@Value
@Builder
@NoArgsConstructor(force=true, access=AccessLevel.PRIVATE)
@AllArgsConstructor
public class ProducerDTO {

	private int id;
	private String name;
}
