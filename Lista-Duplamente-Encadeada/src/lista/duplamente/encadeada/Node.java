package lista.duplamente.encadeada;

public class Node<T> {

	private T elemento;
	private Node<T> proximo;
	private Node<T> anterior;

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public Node getProximo() {
		return proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}

	public Node getAnterior() {
		return anterior;
	}

	public void setAnterior(Node anterior) {
		this.anterior = anterior;
	}

	public Node(T elemento) {
		this(elemento, null);
	}

	public Node(T elemento, Node proximo) {
		this.proximo = proximo;
		this.elemento = elemento;
	}

}
