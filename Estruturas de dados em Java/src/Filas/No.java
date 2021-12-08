package Filas;

public class No<T> {
	private T objeto;
	private No<T> refNo;
	
	public No (T objeto) {
		this.refNo = null;
		this.objeto = objeto;
	}
	
	public No () {
		
	}

	@Override
	public String toString() {
		return "No [objeto=" + objeto + "]";
	}

	public Object getObjeto() {
		return objeto;
	}

	public void setObjeto(T objeto) {
		this.objeto = objeto;
	}

	public No getRefNo() {
		return refNo;
	}

	public void setRefNo(No refNo) {
		this.refNo = refNo;
	}
}
