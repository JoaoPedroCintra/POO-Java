package CalcadosDB.model.dto;


public class CalcadoDto {

		private Long id;
		private String tipo;
		private String marca;
		private String tamanho;
		private String material;
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

		public CalcadoDto(Long id, String tipo, String marca, String tamanho, String material, String cor) {
			super();
			this.id = id;
			this.tipo = tipo;
			this.marca = marca;
			this.tamanho = tamanho;
			this.material = material;
			this.cor = cor;
		}

		public CalcadoDto() {
			super();
		}

		@Override
		public String toString() {
			return "Calcado [id=" + id + ", tipo=" + tipo + ", marca=" + marca + ", tamanho=" + tamanho + ", material="
					+ material + ", cor=" + cor + "]";
		}
	
}
