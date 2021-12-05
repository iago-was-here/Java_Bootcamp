package Pilhas;


public class no {
	
	public no(int dado) {
		super();
		this.dado = dado;
	}
	public no(){
		
	}
	
	private int dado;
	private no refNo = null;
	
	public int getDado() {
		return dado;
	}
	public void setDado(int dado) {
		this.dado = dado;
	}
	public no getRefNo() {
		return refNo;
	}
	public void setRefNo(no refNo) {
		this.refNo = refNo;
	}
	@Override
	public String toString() {
		return "no [dado=" + dado + "]";
	}
	
	
}
