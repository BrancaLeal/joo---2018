package example;

public class Funcionario implements Comparable<Funcionario >{
	private String nome;
	private Double salario;
	private CargoEnum cargo;
	public String getNome() {
		return nome;
	}
	public CargoEnum getCargo() {
		return cargo;
	}
	public Funcionario(String nome, Double salaraio, CargoEnum cargo) {
		super();
		this.nome = nome;
		this.salario = salaraio;
		this.cargo = cargo;
	}
	


	}

}
