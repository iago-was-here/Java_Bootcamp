package Stack;

import java.util.Stack;

import equals_hashCode.carro;

public class teste_Stack {
	
	public static void main(String[] args) {
		
		Stack<carro> stackCarros = new Stack<>();
		
		stackCarros.push(new carro("Ford"));
		stackCarros.push(new carro("Chevrolet"));
		stackCarros.push(new carro("Fiat"));
		
		System.out.println(stackCarros);
		
		stackCarros.pop();
		System.out.println(stackCarros);
		//testamos o metódo pop
		
		System.out.println(stackCarros.peek());
		System.out.println(stackCarros);
		//testamos o metódo peek
		
		System.out.println(stackCarros.empty());
	}
}
