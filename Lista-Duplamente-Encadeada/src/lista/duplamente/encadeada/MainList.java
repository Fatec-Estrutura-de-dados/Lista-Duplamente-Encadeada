package lista.duplamente.encadeada;

public class MainList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		testAluno();
		testCurso();

	}

	private static void testCurso() {
		// TODO Auto-generated method stub
LinkedList<Curso> listCurso = new LinkedList<>();
		
		
       listCurso.adiciona(new Curso(122,"ADS",1,"EXATAS"));
		
		  //CONFERE SE A LISTA ESTA VAZIA.
        if(listCurso.isEmpty()) {
        	System.out.println("Lista Vazia!!");
        }else {
        	System.out.println(" Não esta vazia ");
        }
        
        //adiciona inicio
        listCurso.adicionaNocomeco(new Curso(2,"LOGISTICA",1,"EXATAS"));
        
        //ADICIONA FINAL.
        listCurso.adiciona(new Curso(3,"ADMINISTRAÇÃO",1,"RECURSOS HUMANOS"));
      
        listCurso.adicionaNocomeco(new Curso(4,"MATEMATICA",1,"EXATAS"));
        
        listCurso.adiciona(new Curso(5,"ENGENHARIA PRODUÇÃO",1,"EXATAS"));
        
        listCurso.adicionaNocomeco(new Curso(6,"ENGENHARIA ELETRICA",1,"EXATAS"));
		
        
		System.out.println(listCurso.toString());
     
       
		//remove no inicio
		listCurso.removeDoComeco();
		
		listCurso.removeDoFim();
		listCurso.removeDoFim();
		
		
		//buscar aluno
		 boolean value = listCurso.buscaAluno("Carlos Andrad");
	
	
		 
		 //exibir lista
		 System.out.println(listCurso.toString());
		
	}

	private static void testAluno() {
		// TODO Auto-generated method stub
        LinkedList<Aluno> listAluno = new LinkedList<>();
		
		
		listAluno.adiciona(new Aluno(1234, "Jose almeida", "8 semestre"));
		
		  //CONFERE SE A LISTA ESTA VAZIA.
        if(listAluno.isEmpty()) {
        	System.out.println("Lista Vazia!!");
        }else {
        	System.out.println(" Não esta vazia ");
        }
        
        //adiciona inicio
        listAluno.adicionaNocomeco(new Aluno(125487, "Carlos Andrade","Semestre - 6"));
        
        //ADICIONA FINAL.
        listAluno.adiciona(new Aluno(125487, "Jose Da Silva","Semestre - 04"));
      
        listAluno.adicionaNocomeco(new Aluno(125487, "Wanderlei dos Campos","Semestre - 06"));
		
        
		System.out.println(listAluno.toString());
     
       
		 listAluno.ordenarList();
		//remove no inicio
		listAluno.removeDoComeco();
		
		listAluno.removeDoFim();
		listAluno.removeDoFim();
		
		
		//buscar aluno
		 boolean value = listAluno.buscaAluno("Carlos Andrad");
	
	
		 
		 //exibir lista
		 System.out.println(listAluno.toString());
		
	}

	
	

}
