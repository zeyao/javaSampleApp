package frmk.dataAcessPOJO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "PERSON")
public class Person {
	
	@Id
	@Column(name = "PID")
	private String pid;
	
	@Column(name = "name")
	private String name;
	
}
