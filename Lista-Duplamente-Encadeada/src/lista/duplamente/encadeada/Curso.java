package lista.duplamente.encadeada;

public class Curso {

	public Curso(int Id, String nome, int semestre, String area) {

		this.Id = Id;
		this.nome = nome;
		this.semestre = semestre;
		this.area = area;
	}

	private int Id;

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	@Override
	public String toString() {
		// TODO Auto-geneIdted method stub
		return getId() + " " + getNome() + " " + getSemestre();
	}

	private String nome;
	private String area;
	private int semestre;
}
