package dev.paie.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Entreprise")
public class Entreprise {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "SIRET", length = 20)
	private String siret;
	@Column(name = "DENOMINATION", length = 20)
	private String denomination;
	@Column(name = "ADRESSE", length = 50)
	private String adresse;
	@Column(name = "URSSAF", length = 20)
	private String urssaf;
	@Column(name = "CODENAF", length = 20)
	private String codeNaf;
	
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getSiret() {
		return siret;
	}
	public void setSiret(String siret) {
		this.siret = siret;
	}
	public String getUrssaf() {
		return urssaf;
	}
	public void setUrssaf(String urssaf) {
		this.urssaf = urssaf;
	}
	public String getCodeNaf() {
		return codeNaf;
	}
	public void setCodeNaf(String codeNaf) {
		this.codeNaf = codeNaf;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
