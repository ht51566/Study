package stack_queue;

import java.util.Stack;

class Coin {
	private int value;

	public Coin(int vale) {
		this.value = vale;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Coin [value=" + value + "]";
	}
	
}

public class StackTest {
	// 후입선출(LIFO)
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		coinBox.push(new Coin(50));
		
		Coin c1 = coinBox.pop();
		System.out.println(c1);
		
		Coin c2 = coinBox.peek();
		System.out.println(c2);
		
		System.out.println(coinBox);
		
		while(!coinBox.empty()) {
			c1 = coinBox.pop();
			System.out.println(c1);
		}
		
	}
	
}
