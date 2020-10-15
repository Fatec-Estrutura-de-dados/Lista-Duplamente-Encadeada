package lista.duplamente.encadeada;

public class MainList {

	public static void main(String[] args) {
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
        listAluno.adiconaNocomeco(new Aluno(125487, "Carlos Andrade","Semestre - 6"));
        
        //ADICIONA FINAL.
        listAluno.adiciona(new Aluno(125487, "Jose Da Silva","Semestre - 04"));
      
        listAluno.adiconaNocomeco(new Aluno(125487, "Wanderlei dos Campos","Semestre - 06"));
		
        
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
