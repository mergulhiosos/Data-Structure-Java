package application;

import entities.CircleQueue;

public class Main {
	public static void main(String[] args) {
		CircleQueue CircularQueue = new CircleQueue(5);

		// Adicionando elementos à fila
		CircularQueue.enqueue(1);
		CircularQueue.enqueue(2);
		CircularQueue.enqueue(3);
		CircularQueue.enqueue(4);
		CircularQueue.enqueue(5);
		CircularQueue.printQueue(); // Deve imprimir: Fila: 1 2 3 4 5

		// Removendo elementos da fila
		CircularQueue.dequeue();
		CircularQueue.dequeue();
		CircularQueue.printQueue(); // Deve imprimir: Fila: 3 4 5

		// Adicionando mais elementos à fila
		CircularQueue.enqueue(6);
		CircularQueue.enqueue(7);
		CircularQueue.printQueue(); // Deve imprimir: Fila: 3 4 5 6 7

		// Removendo elementos da fila
		CircularQueue.dequeue();
		CircularQueue.dequeue();
		CircularQueue.printQueue(); // Deve imprimir: Fila: 5 6 7

	}
}
