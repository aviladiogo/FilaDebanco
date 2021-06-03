package com.company;
import br.unicap.edi.TAD.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner New = new Scanner(System.in);
        Queue<Integer> fila = new Queue<>();
        int op, Posição=1;
        do {
            Menu();
            op=New.nextInt();
            switch (op){
                case 0:
                    System.out.println("Bye");
                    break;
                case 1:
                    PegarSenha(Posição, fila);
                    Posição++;
                    break;
                case 2:
                    ChamarSenha(Posição,fila);
                    Posição--;
                    break;
            }
        }while (op!=0);

    }
    public static  void ChamarSenha(int Posição, Queue<Integer> fila){
        if(fila.isEmpty()) {
            System.out.println("o Banco esta vazio");
        }else {
            System.out.println("chamando senha numero: " + fila.head());
            fila.dequeue();
            if(fila.isEmpty()){ //verifica se a fila estara vazia antes de pegar o proximo
                System.out.println("Agora o banco esta vazio");
                return ;
            }
            System.out.println("o proximo sera a senha numero: " + fila.head());
        }

    }

    public static void PegarSenha(int Posição, Queue<Integer> fila){
        if(fila.isFull()) { //Banco Lotado.
            System.out.println("Banco Lotado, volte novamente mais tarde.");
        }else{
            fila.enqueue(Posição);
            System.out.println("Sua senha é: " + Posição);

        }
    }

    public static void Menu(){
        System.out.println("o que deseja ?");
        System.out.println("1- Pedir uma senha");
        System.out.println("2- Chamar uma senha");
        System.out.println("0- Nada");

    }
}
