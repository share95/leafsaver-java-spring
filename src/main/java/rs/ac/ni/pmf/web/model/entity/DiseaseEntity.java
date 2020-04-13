package rs.ac.ni.pmf.web.model.entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Table(name="disease")
@NoArgsConstructor
@AllArgsConstructor
public class DiseaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	
	
	String name;
	String nice_name;
	
}
