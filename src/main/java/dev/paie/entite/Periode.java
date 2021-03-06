package dev.paie.entite;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Periode")
public class Periode {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="DATE_DEBUT")
	private LocalDate dateDebut;
	@Column(name="DATE_FIN")
	private LocalDate dateFin;
	@Column(name = "DEBUT_Fin")
	private String debutFin;

	public LocalDate getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}
	public LocalDate getDateFin() {
		return dateFin;
	}
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the debutFin
	 */
	public String getDebutFin() {
		return debutFin;
	}

	/**
	 * @param debutFin
	 *            the debutFin to set
	 */
	public void setDebutFin() {
		this.debutFin = "" + this.dateDebut + " - " + this.dateFin;
	}
	
	
	
	

}
