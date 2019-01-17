package br.com.queue;

public class Queue {
	private char q [];			//esse array contem fila
	private int putloc, getloc;	// os indices put e get
	
	Queue (int size){
		q = new char [size + 1];	//aloca memoria para fila
		putloc = getloc = 0;
	}
	
	//insere um caractere na fila
	void put (char ch){
		if (putloc == q.length - 1){
			System.out.println(" - Queue is full.");
			return;
		}
		putloc++;
		q [putloc] = ch;
	}
	
	//obtem um caractere na fila
	char get(){
		if (getloc == putloc){
			System.out.println(" - Queue is empty.");
			return (char) 0;
		}
		getloc++;
		return q [getloc];
	}

}
