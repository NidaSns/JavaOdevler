package Kodlama.io.Devs.odev.entities.conctretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="technology")
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Technology {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	
	@ManyToOne(cascade = CascadeType.DETACH)
	@JoinColumn(name = "programming_language_id")
    private ProgrammingLanguage programmingLanguage;
	
}
