package aulaPOO;

public class clientes {
	private String nomeCliente;
	private String idadeCliente;
	private String cidadeUfCliente;
	private String estCivil;
	private String tamanho;
	
			public clientes(String nomeCliente, String idadeCliente, String cidadeUfCliente, String estCivil,
				String tamanho) {
			super();
			this.nomeCliente = nomeCliente;
			this.idadeCliente = idadeCliente;
			this.cidadeUfCliente = cidadeUfCliente;
			this.estCivil = estCivil;
			this.tamanho = tamanho;
		}
	
	public String getNomeCliente() {
				return nomeCliente;
			}
			public void setNomeCliente(String nomeCliente) {
				this.nomeCliente = nomeCliente;
			}
			public String getIdadeCliente() {
				return idadeCliente;
			}
			public void setIdadeCliente(String idadeCliente) {
				this.idadeCliente = idadeCliente;
			}
			public String getCidadeUfCliente() {
				return cidadeUfCliente;
			}
			public void setCidadeUfCliente(String cidadeUfCliente) {
				this.cidadeUfCliente = cidadeUfCliente;
			}
			public String getEstCivil() {
				return estCivil;
			}
			public void setEstCivil(String estCivil) {
				this.estCivil = estCivil;
			}
			public String getTamanho() {
				return tamanho;
			}
			public void setTamanho(String tamanho) {
				this.tamanho = tamanho;	
	}

			public void imprimirInfo() {
				
	}
}
