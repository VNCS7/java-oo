package aulaHeranca;

public class PessoaFisica extends Pessoa {
	private String cpf;
	private String rg;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public static void main(String args[]) {
		PessoaFisica pessoa1 = new PessoaFisica();
		
		pessoa1.setNome("Felipe");
		pessoa1.setEndereco("R. Sebasti�o Alvarenga, 333");
		pessoa1.setBairro("JD. S�o Sebasti�o");
		pessoa1.setRg("523.895.958-39");
		pessoa1.setCpf("738.998.336-19");
		
		System.out.println("PESSOA F�SICA 01\n");
		System.out.println("Nome: \t\t"+pessoa1.getNome());
		System.out.println("Endere�o: \t"+pessoa1.getEndereco());
		System.out.println("Bairro: \t"+pessoa1.getBairro());
		System.out.println("RG: \t\t"+pessoa1.getRg());
		System.out.println("CPF: \t\t"+pessoa1.getCpf());
		
		
	}
	
}
