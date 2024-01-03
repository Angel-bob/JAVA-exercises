package com.angel.exercises.agenda;

public class Agenda {

    private Contato[] contatos;
    private int cont;

    public Agenda(){
        contatos = new Contato[5];
        cont = 0;
    }

    public Agenda(int capacidade){
        contatos = new Contato[capacidade];
        cont = 0;
    }

    public boolean addContato(Contato ct) throws AgendaCheiaException {

        if(cont < contatos.length){
            contatos[cont] = ct;
            cont++;
            return true;
        }
        throw new AgendaCheiaException();
    }

    public int consultarContato(String name) throws ContatoNaoExisteException {

//        for(Contato ct: contatos){
//            if(ct.getName().equalsIgnoreCase(name)){
//                return 1;
//            }
//        }

        for(int i = 0; i < cont; i++){

            if(contatos[i].getName().equalsIgnoreCase(name)){
                return i;
            }
        }

        throw new ContatoNaoExisteException(name);
    }



    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("Contatos: {" + "\n\n");

//        for(Contato ct: contatos){
//            s.append(ct + "\n");
//        }

        for(int i = 0; i < cont; i++){
            s.append(" " + contatos[i] + "\n");
        }

        s.append("\n}");
        return s.toString();
    }
}
