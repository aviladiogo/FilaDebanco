package br.unicap.edi.TAD;

public class Queue <T>{

    private QueueNode<T> inicio;
    private QueueNode<T> fim;
    private int qtd;

    public boolean isEmpty() {
        if (inicio == null) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isFull () {
        if(qtd==10){
            return true;
        }else {
            return false;
        }
    }

    public T head () {
        return inicio.getInfo();
    }

    public void enqueue (T valor) { // enfileira - inserir no final
        QueueNode<T> novo = new QueueNode(valor);
        if (isEmpty() == true) {
            inicio = novo;
            fim = novo;
            qtd++;
        }
        else {
            fim.setProx(novo);
            fim = novo;
            qtd++;
        }

    }

    public T dequeue () { // desenfileirar - remover o primeiro
        QueueNode<T> aux = inicio;
        if (inicio == fim) {
            inicio = null;
            fim = null;
            qtd--;
        }
        else {
            inicio = inicio.getProx();
            qtd--;
        }

        return aux.getInfo();
    }
}
