package com.angel.exercises.agenda.app;

import com.angel.exercises.agenda.Agenda;
import com.angel.exercises.agenda.AgendaCheiaException;
import com.angel.exercises.agenda.Contato;
import com.angel.exercises.agenda.ContatoNaoExisteException;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 3){
            opcao = obterOpcaoMenu(sc);

            if(opcao == 1){ // consultar contato

                consultarContato(sc, agenda);

            }else if(opcao == 2){ //adicionar contato

                addContato(sc, agenda);

            }else if(opcao == 3){ //Sair

                System.exit(0);

            }

        }




    }

    static void addContato(Scanner sc, Agenda agenda){

        try {

        System.out.println("Criando um contato, entre com as informações");
        String nome = lerInformacaoString(sc, "Entre com o nome do contato");
        String telefone = lerInformacaoString(sc, "Entre com o telefone do contato");
        String email = lerInformacaoString(sc, "Entre com o email do contato");

        Contato contato = new Contato();
        contato.setName(nome);
        contato.setTelephone(telefone);
        contato.setEmail(email);

        System.out.println("Contato a ser criado");
        System.out.println(contato);

        agenda.addContato(contato);
        }
        catch (AgendaCheiaException ex){
            System.out.println(ex.getMessage());

            System.out.println("Contatos da agenda: ");
            System.out.println(agenda);
        }
    }

    static void consultarContato(Scanner sc, Agenda agenda){

        String nomeContato = lerInformacaoString(sc, "Entre com o nome do contato a ser consultado: ");
        try{
            if (agenda.consultarContato(nomeContato) >= 0){
                System.out.println("Contato existe");
            }
        }
        catch (ContatoNaoExisteException ex){
            System.out.println(ex.getMessage());
        }
    }

    static String lerInformacaoString(Scanner sc, String msg){
        System.out.println(msg);
        String entr = sc.nextLine();
        return entr;

    }


    static int obterOpcaoMenu(Scanner sc){

        boolean entradaValida = false;
        int op = 3;

        while(!entradaValida){

            System.out.println("Digite a opção desejada: ");
            System.out.println("[ 1 ] - Consultar Contato");
            System.out.println("[ 2 ] - Adicionar Contato");
            System.out.println("[ 3 ] - Sair");

            try{
                String entr = sc.nextLine();
                op = Integer.parseInt(entr);

                if(op == 1 || op == 2 || op == 3){
                    entradaValida = true;
                }else{
                    throw new Exception("Opção inválida.");
                }
            }
            catch (Exception e){
                System.out.println("Opção inválida, digite novamente.\n");
            }
        }

        return op;
    }
}
