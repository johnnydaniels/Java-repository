
public class Pessoa {
	private String nome;
	private int idade;
	private double salario;
	
	//public static Pessoa pes(){
		//Pessoa pessoa = new Pessoa();
		//pessoa.setNome("Pedro");
		//pessoa.setIdade(22);
		//pessoa.setSalario(2000);
		
		//return pessoa;
		
	//}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public int getIdade(){
		return idade;
	}
	
	public void setSalario(double d){
		this.salario = d;
	}
	
	public double getSalario(){
		return salario;
	}
	
	/*public static mostraDados(){
		System.out.println(
				"Nome: "+pessoas[0].getSalario()+
				"\nIdade: "+pessoas[0].getIdade()+
				"\nSalário: R$ "+pessoas[0].getSalario()
				);
	}*/

}
