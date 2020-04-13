package rs.ac.ni.pmf.web.model.api;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@RequiredArgsConstructor
@NoArgsConstructor(force = true, access = AccessLevel.PRIVATE)
@Builder
public class DiseaseDTO {

	Integer id;
	String name;
	String nice_name;
	
}
