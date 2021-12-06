package Filas;

public class No {
	private Object objeto;
	private No refNo;
	
	public No (Object objeto) {
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

	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}

	public No getRefNo() {
		return refNo;
	}

	public void setRefNo(No refNo) {
		this.refNo = refNo;
	}
}
