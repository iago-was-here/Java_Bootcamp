package Listas_Circulares;

import Pilhas.no;

public class ListaCircular<T> {
	private No<T> head;
	private No<T> tail;
	private int tamLista;
	
	
	public ListaCircular() {
		this.tail = null;
		this.head = null;
		this.tamLista = 0;
	}
	
	public void add(T conteudo) {
		No<T> novoNo = new No<>(conteudo);
		
		if(this.tamLista == 0) {
			this.head = novoNo;
			this.tail = this.head;
			this.head.setNoProximo(tail);
		}else {
			novoNo.setNoProximo(this.tail);
			this.head.setNoProximo(novoNo);
			this.tail = novoNo;
		}
		this.tamLista++;
	}
	
	public void remove(int index) {
		if(index >= this.tamLista)
			throw new IndexOutOfBoundsException("O indice é maior que o tamanho da lista");
		
		No<T> noAux = this.tail;
		if(index == 0) {
			this.tail = this.tail.getNoProximo();
			this.head.setNoProximo(this.tail);
		}else if(index == 1) {
			this.tail.setNoProximo(this.tail.getNoProximo().getNoProximo());
		}else {
			for(int i = 0; i < index - 1; i++) {
				noAux = noAux.getNoProximo();
			}
			
			noAux.setNoProximo(noAux.getNoProximo().getNoProximo());
		}
		this.tamLista--;
	}
	
	private No<T> getNo(int index){
		if(this.isEmpty())
			throw new IndexOutOfBoundsException("A lista esta vazia");
		
		if(index == 0) {
			return this.tail;
		}
		
		No<T> noAux = this.tail;
		for(int i = 0; i < index;i++) {
			noAux = noAux.getNoProximo();
		}
		
		return noAux;
	}
	
	
	public T get(int index) {
		return this.getNo(index).getConteudo();
	}
	
	public boolean isEmpty() {
		return this.tamLista == 0 ? true : false;
	}
	
	public int size () {
		return this.tamLista;
	}

	@Override
	public String toString() {
		String str = " ";
		No<T> noAux = this.tail;
		
		for(int i = 0; i < this.size(); i++) {
			str += "[No{conteudo = " + noAux.getConteudo() + "}]--->";
			noAux = noAux.getNoProximo();
		}
		str += this.size() != 0 ? "(Retorna ao inicio)" : "[ ]";
		
		
		return str;
	}
}
