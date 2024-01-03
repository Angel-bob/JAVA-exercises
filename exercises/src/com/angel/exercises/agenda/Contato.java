package com.angel.exercises.agenda;

public class Contato {

    private static int cont = 0;

    private int ID;
    private String name;
    private String telephone;
    private String email;

    public Contato(){
        cont++;
        ID = cont;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getCont() {
        return cont;
    }

    public int getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "[ ID: " + ID + " Name: " + name + " Telephone: " + telephone + " Email: " + email + " ]";
    }
}
