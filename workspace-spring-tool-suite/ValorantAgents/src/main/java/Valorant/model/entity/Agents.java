// Valter Gomes e João Pedro Cintra 	4ºADS_M
package Valorant.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="agents")
public class Agents {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	// de acordo com seu kit de habilidades os Agentes(personagens)
	// são divididos em categorias como:
	// Iniciador, Controlador, Duelista e Sentinela
	@Column(name="category")
	private String category;
	
	//cada Agente possue 4 habilidades únicas,
	//sendo definidas por padrão nas letras Q,E,C e X
	@Column(name="q")
	private String q;
	
	@Column(name="c")
	private String c;
	
	@Column(name="e")
	private String e;
	
	@Column(name="x")
	private String x;
	
	public Agents() {
		
	}

	public Agents(Long id, String name, String category, String q, String c, String e, String x) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.q = q;
		this.c = c;
		this.e = e;
		this.x = x;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getQ() {
		return q;
	}

	public void setQ(String q) {
		this.q = q;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public String getE() {
		return e;
	}

	public void setE(String e) {
		this.e = e;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Agents [id=" + id + ", name=" + name + ", category=" + category + ", q=" + q + ", c=" + c + ", e=" + e
				+ ", x=" + x + "]";
	}
	
}