package application;

import entities.Queue;

public class Main {

	public static void main(String[] args) {
		Queue queue = new Queue(5);
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.printQueue(); // Imprime: 1 2 3 4 5
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.printQueue(); // Imprime: 4 5
		queue.enqueue(6); // Overflow Error
		queue.enqueue(7); // Overflow Error
		queue.enqueue(8); // Overflow Error
		queue.printQueue();
		// uma vez que a fila atinge sua capacidade,
		// você não pode mais adicionar elementos a ela,
		// mesmo que tenha desenfileirado alguns elementos.

	}
}
