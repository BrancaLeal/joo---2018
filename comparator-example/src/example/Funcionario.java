package example;

public class Funcionario implements Comparable<Funcionario> {
	private String nome;
	private Double salario;
	private CargoEnum cargo;

	public Funcionario(String nome, Double salaraio, CargoEnum cargo) {
		super();
		this.nome = nome;
		this.salario = salaraio;
		this.cargo = cargo;
	}

	public int compareTo(Funcionario f) {
		if (f.getCargo().equals(this.cargo)) {
			return 0;
		} else if (f.getCargo().equals(CargoEnum.GERENTE) && this.getCargo().equals(CargoEnum.DESENVOLVEDOR)) {
			return 1;
		} else {
			return -1;
		}
	}

	public String getNome() {
		return nome;
	}

	public CargoEnum getCargo() {
		return cargo;
	}
}
