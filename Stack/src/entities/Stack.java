/*
 * IsFull (V)
1. se topo = |V|
2. retorna VERDADEIRO
3. senão
4. retorna FALSO

Push (x, V)
1. se ! IsFull (V)
2. V [topo] ← x
3. topo ← topo + 1
4. senão
5. erro overflow

IsEmpty ()
1. se topo = 0
2. retorna VERDADEIRO
3. senão
4. retorna FALSO

Pop (V)
1. se ! IsEmpty ()
2. x ← V [topo]
3. topo ← topo – 1
4. retorna x
5. senão
6. erro underflow
 */

package entities;

public class Stack {
	private int[] array;
	private int head;
	private int quantity;

	public Stack(int k) {
		quantity = k;
		array = new int[quantity];
		head = 0;
	}

	public boolean isFull() {
		return head == quantity;
	}

	public void push(int x) {
		if (!isFull()) {
			array[head] = x;
			head++;
		} else {
			System.out.println("Error Overflow");
		}
	}

	public boolean isEmpty() {
		return head == 0;
	}

	public int pop() {
		int x = 0;
		if (!isEmpty()) {
			head--;
			x = array[head];
		} else {
			System.out.println("Error Underflow");
		}
		return x;
	}
	
	public void printStack() {
		for (int i = 0; i < head; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
