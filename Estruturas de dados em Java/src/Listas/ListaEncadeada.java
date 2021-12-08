package Listas;

public class ListaEncadeada<T> {
	
	No<T> referenciaEntrada;
	
	public ListaEncadeada(){
		this.referenciaEntrada = null;
	}
	public void add(T conteudo) {
		No<T> novoNo = new No(conteudo);
		if(this.isEmpty()) {
			referenciaEntrada = novoNo;
			return;
		}
		
		No<T> noAux = referenciaEntrada;
		for(int i = 0; i < this.size()-1; i++) {
			noAux = noAux.getProximoNo();
		}
		
		noAux.setProximoNo(novoNo);
	}
	
	private No<T> getNo(int index){
		
		validaIndice(index);
		No<T> noAux = referenciaEntrada;
		No<T> noRet = null;
		
		for(int i = 0; i <= index; i++) {
			noRet = noAux;
			noAux = noAux.getProximoNo();
		}
		
		return noRet;
	}
	
	private void validaIndice(int index) {
		if(index >= size()) {
			int ultIndice = size() - 1;
			throw new IndexOutOfBoundsException("Não existe conteúdo no indiece" + index + "desta lista. Esta lista só vai ate o indice" + ultIndice + "." );
		}
	}
	
	public T get(int index){
		return getNo(index).getConteudo();
	}
	
	public T remover(int index){
		No<T> noAlvo = this.getNo(index);
		if(index == 0) {
			referenciaEntrada = noAlvo.getProximoNo();
			return noAlvo.getConteudo();
		}
		
		No<T> noAnterior = getNo(index - 1);
		noAnterior.setProximoNo(noAlvo.getProximoNo());
		return noAlvo.getConteudo();
	}
	public int size() {
		int tamLista = 0;
		
		No<T> refAux = referenciaEntrada;
		while(true) {
			if(refAux != null) {
				tamLista++;
				if(refAux.getProximoNo() != null) {
					refAux = refAux.getProximoNo();
				}else {
					break;
				}
			}else {
				break;
			}
		}
		return tamLista;
	}
	
	public boolean isEmpty() {
		if(this.referenciaEntrada == null) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		String Ret = "";
		No<T> noAux = referenciaEntrada;
		for(int i = 0; i < this.size();i++) {
			Ret += "[No {conteudo=" + noAux.getConteudo() + "}]--->";
			noAux = noAux.getProximoNo();
		}
		Ret += "null";
		return Ret;
	}
	
	
	
}
