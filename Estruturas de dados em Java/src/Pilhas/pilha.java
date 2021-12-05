package Pilhas;

public class pilha {
	private no refNoEntradaPilha;
	
	public pilha (){
		this.refNoEntradaPilha = null;
	}
	
	public no top() {
		return refNoEntradaPilha;
	}
	
	public void push(no novoNo){
		no refAuxiliar = refNoEntradaPilha;
		refNoEntradaPilha = novoNo;
		refNoEntradaPilha.setRefNo(refAuxiliar);
	}
	
	public no pop() {
		if(this.isEmpty() != true) {
			no noPoped = refNoEntradaPilha;
			refNoEntradaPilha = refNoEntradaPilha.getRefNo();
			return noPoped;
		}
		return refNoEntradaPilha;
	}
	public boolean isEmpty() {
		if(refNoEntradaPilha == null) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		String stringretorno = "------------- \n";
		stringretorno += "    Pilha\n";
		stringretorno += "------------- \n";
		
		no noAuxiliar = refNoEntradaPilha;
		
		while(true) {
			if(noAuxiliar != null) {
				stringretorno += "[No{Dado= "+ noAuxiliar.getDado() + "}]\n";
				noAuxiliar = noAuxiliar.getRefNo();
			}else {
				break;
			}
		}
		stringretorno += "=============\n";
		return stringretorno;
	}
}
