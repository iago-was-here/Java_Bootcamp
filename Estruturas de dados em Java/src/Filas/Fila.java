package Filas;

public class Fila<T> {
	
	private No<T> refEntradaFila;
	
	public Fila () {
		this.refEntradaFila = null;
	}
	
	public boolean isEmpty () {
		if(this.refEntradaFila == null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void enqueue (T obj) {
		No novoNo = new No (obj);
		novoNo.setRefNo(refEntradaFila);
		refEntradaFila = novoNo;
	}
	
	public T first () {
		if(this.isEmpty() != true) {
			No primeiroNo = refEntradaFila;
			while(true) {
				if (primeiroNo.getRefNo() != null) {
					primeiroNo = primeiroNo.getRefNo();
				}else {
					break;
				}
			}
			return (T) primeiroNo.getObjeto();
		}else {
			return null;
		}
	}
	
	public T dequeue () {
		if(this.isEmpty() != true) {
			No primeiroNo = refEntradaFila;
			No noAuxiliar = refEntradaFila;
			while(true) {
				if (primeiroNo.getRefNo() != null) {
					noAuxiliar = primeiroNo;
					primeiroNo = primeiroNo.getRefNo();
				}else {
					noAuxiliar.setRefNo(null);
					break;
				}
			}
			return (T) primeiroNo.getObjeto();
		}else {
			return null;
		}
	}

	@Override
	public String toString() {
		String retorno = "";
		No noAuxiliar = refEntradaFila;
		
		if(refEntradaFila != null) {
			while(true) {
				retorno += "[No{Objeto = "+ noAuxiliar.getObjeto() + "}]--->";
				if(noAuxiliar.getRefNo() != null) {
					noAuxiliar = noAuxiliar.getRefNo();
				}else {
					retorno += "null";
					break;
				}
			}
		}else {
			retorno = "null";
		}
		
		return retorno;
	}
}
