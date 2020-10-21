package lista.duplamente.encadeada;

public class LinkedList<T> {

	private Node<T> primeira = null;
	private Node<T> ultimo = null;
	private int size;

	public void adicionaNocomeco(T obj) {

		if (this.size == 0) {
			Node nova = new Node(obj);
			this.primeira = nova;
			this.ultimo = nova;
		} else {
			Node nova = new Node(obj, this.primeira);
			this.primeira.setAnterior(nova);
			this.primeira = nova;
		}
		this.size++;
	}

	public void adiciona(T obj) {

		if (this.size == 0) {
			adicionaNocomeco(obj);
			return;
		}
		Node cel = new Node(obj);
		this.ultimo.setProximo(cel);
		cel.setAnterior(ultimo);
		this.ultimo = cel;

		this.size++;
	}

	public void adiciona(int posicao, T elementes) {

		int posiAtual = 1;
		Node atual = primeira;
		Node ant = atual;

		if (posicao == 1) {
			adicionaNocomeco(elementes);
			return;
		}

		while (posiAtual < posicao - 1) {
			ant = atual;
			atual = atual.getProximo();
			posiAtual++;
		}

		Node ant1 = ant.getProximo();
		Node cel = new Node(elementes, ant1);
		cel.setAnterior(ant);
		;
		ant.setProximo(cel);
		ant1.setAnterior(cel);
		this.size++;
	}

	public T pega(int posicao) {
		return this.pegaCelula(posicao).getElemento();
	}

	private Node<T> pegaCelula(int posicao) {
		// TODO Auto-generated method stub
		Node<T> atual = this.primeira;
		for (int i = 1; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
	}

	public void removePosition(int posicao) {
		int posiAtual = 1;
		Node atual = this.primeira;
		Node ant = null;
		if (posicao == 1) {
			removeDoComeco();
			return;
		}
		while (posiAtual < posicao) {
			ant = atual;
			atual = atual.getProximo();
			posiAtual++;
		}

		Node next = ant.getProximo().getProximo();
		ant.setProximo(next);
		next.setAnterior(ant);
		size--;
	}

	public Node<T> removeDoComeco() {

		if (this.size == 0) {
			throw new IllegalArgumentException("Erro ao remover lista vazia");

		}
        Node<T> fistNode = this.primeira;
		this.primeira = this.primeira.getProximo();

		size--;

		if (this.size == 0) {
			this.ultimo = null;
		}
		
		return fistNode;
	}

	public Node<T> removeDoFim() {

		if (this.size == 1) {
			return this.removeDoComeco();
			
		}else if(this.size ==0) {
			 throw new IllegalArgumentException("Erro ao remover lista vazia");
		}

		Node<T> ultimo = this.ultimo;
		Node<T> penultima = this.ultimo.getAnterior();
		penultima.setProximo(null);
		this.ultimo = penultima;
		this.size--;
		return ultimo;
	}

	public void remove(int posicao) {

		if (this.size == 1) {
			removeDoComeco();
		} else if (this.size == posicao) {
			removeDoFim();
		} else {
			int posiAtual = 1;
			Node<T> atual = this.primeira;
			Node<T> ant = null;

			while (posiAtual < posicao) {
				ant = atual;
				atual = atual.getProximo();
				posiAtual++;
			}

			Node next = ant.getProximo().getProximo();
			ant.setProximo(next);
			next.setAnterior(ant);
			size--;
		}
	}

	public int tamanho() {
		return 0;
	}

	public boolean content(Object obj) {

		Node atual = this.primeira;

		while (atual != null) {
			if (atual.getElemento().equals(obj))
				return true;
			atual = atual.getProximo();
		}
		return false;
	}
	
	
	public boolean isEmpty() {
		return this.size == 0;
	}
	

	public String toString() {

		if (this.size == 0) {
			return "[]";
		}

		Node atual = primeira;
		StringBuilder builder = new StringBuilder("[");

		for (int i = 0; i < this.size; i++) {
			builder.append(atual.getElemento());
			builder.append(",");

			atual = atual.getProximo();
		}

		builder.append("]");

		return builder.toString();
	}

	

	public boolean buscaAluno(String string) {
		// TODO Auto-generated method stub
		Node atual = primeira;
		for (int i = 0; i < this.size; i++) {
			
			if(atual.getElemento()
					.toString()
					.toLowerCase()
					.contains(string.toLowerCase())) return true;
			
			atual =atual.getProximo();
			
		}
		 return false;
		
	}

	public void ordenarList() {
		// TODO Auto-generated method stub
		//Node
		
		T[] entity;
		entity = (T[]) new Object[this.size];
		
		Node primeiro = this.primeira;
		for(int i =0; i<this.size;i++) {
			entity[i] = (T) primeiro.getElemento();
			primeiro = primeiro.getProximo();
		}
		
		
		for(int i =0; i <this.size-1;i++) {
			
			for(int j=i+1; j<this.size;j++) {
				int value = entity[i].toString().toLowerCase()
						.compareTo(entity[j].toString().toLowerCase());
				if(entity[i].toString().toLowerCase()
						.compareTo(entity[j].toString().toLowerCase())>0) {
					T aux =entity[j];
					entity[j] = entity[i];
					entity[i] = aux;
				}
			}			
		}
		
		for(int l =0; l<this.size;l++) {
			System.out.println(entity[l].toString());;
		}
		
	}

}
