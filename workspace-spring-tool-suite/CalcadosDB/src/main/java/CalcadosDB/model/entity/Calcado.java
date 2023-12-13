package CalcadosDB.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="calcados")
public class Calcado {


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="tipo")
	private String tipo;
	
	@Column(name="marca")
	private String marca;

	@Column(name="tamanho")
	private String tamanho;
	
	@Column(name="material")
	private String material;
	
	@Column(name="cor")
	private String cor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Calcado(Long id, String tipo, String marca, String tamanho, String material, String cor) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.marca = marca;
		this.tamanho = tamanho;
		this.material = material;
		this.cor = cor;
	}

	public Calcado() {
		super();
	}

	@Override
	public String toString() {
		return "Calcado [id=" + id + ", tipo=" + tipo + ", marca=" + marca + ", tamanho=" + tamanho + ", material="
				+ material + ", cor=" + cor + "]";
	}
}