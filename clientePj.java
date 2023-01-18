package aulaPOO;

public class clientePj extends clientes{
	
	private String cnpj;
		
	public clientePj(String nomeCliente, String idadeCliente, String cidadeUfCliente, String estCivil, String tamanho,
			 String cnpj) {
		
		super(nomeCliente, idadeCliente, cidadeUfCliente, estCivil, tamanho);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public void imprimirInfo() {
		System.out.println("\nNome do cliente: "+getNomeCliente()+"\nIdade: "+getIdadeCliente()+"\nCNPJ: "+cnpj+"\nCidade/Estado: "+getCidadeUfCliente()+"\nEstado civil: "+getEstCivil()+"\nTamanho que o cliente veste: "+getTamanho());
	}
}


