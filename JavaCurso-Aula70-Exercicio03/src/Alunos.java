
public class Alunos {
	
	String nomeAluno;
	double primeiraNota;
	double segundaNota;
	double terceiraNota;
	double finalGrade;
	
	//construtor?
	public Alunos(String nomeAluno1,
				  double primeiraNota1,
				  double segundaNota1,
				  double terceiraNota1) {
		
		nomeAluno = nomeAluno1;
		primeiraNota = primeiraNota1;
		segundaNota = segundaNota1;
		terceiraNota = terceiraNota1;
	}
	
	//opera??o da m?dia
	public double finalGrade() {
		return primeiraNota + segundaNota + terceiraNota;
	}
	
	//passou de ano ou nao
	public void passOrNot() {
		double pontosFaltando = 60 - finalGrade();
		if (finalGrade() >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS ", pontosFaltando);
		};
	}
	
	//printa dados do aluno, podia ser um .toString()
	public void dadosAluno() {
		System.out.printf("FINAL GRADE = %.2f ", finalGrade());
		System.out.println();
		passOrNot();
	}

}

