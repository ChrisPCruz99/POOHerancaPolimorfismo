package aulaPOO;

public class ClientePf extends clientes{
	
	private String cpf;

	public ClientePf(String nomeCliente, String idadeCliente, String cidadeUfCliente, String estCivil, String tamanho,
			String cpf) {
		
		super(nomeCliente, idadeCliente, cidadeUfCliente, estCivil, tamanho);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void imprimirInfo() {
		System.out.println("\nNome do cliente: "+getNomeCliente()+"\nIdade: "+getIdadeCliente()+"\nCNPJ: "+cpf+"\nCidade/Estado: "+getCidadeUfCliente()+"\nEstado civil: "+getEstCivil()+"\nTamanho que o cliente veste: "+getTamanho());
	}
}
