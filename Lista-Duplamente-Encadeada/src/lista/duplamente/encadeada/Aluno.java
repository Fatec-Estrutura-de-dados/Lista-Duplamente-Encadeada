package lista.duplamente.encadeada;

public class Aluno {

	public Aluno(int RA, String nome, String semestre) {

		this.RA = RA;
		this.nome = nome;
		this.semestre = semestre;
	}

	private int RA;

	public int getRA() {
		return RA;
	}

	public void setRA(int rA) {
		RA = rA;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getNome();
	}

	private String nome;
	private String semestre;

}
