package com.company;

public class Wizytowka {


    private String imie, nazwisko, nazwaFirmy, email;
    int numerTelefonu;

    public Wizytowka(String imie, String nazwisko, String nazwaFirmy, String email, int numerTelefonu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwaFirmy = nazwaFirmy;
        this.email = email;
        this.numerTelefonu = numerTelefonu;
    }
    public Wizytowka(){}

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNazwaFirmy() {
        return nazwaFirmy;
    }

    public void setNazwaFirmy(String nazwaFirmy) {
        this.nazwaFirmy = nazwaFirmy;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumerTelefonu() {
        return numerTelefonu;
    }

    public void setNumerTelefonu(int numerTelefonu) {
        this.numerTelefonu = numerTelefonu;
    }

    public void Display(){
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Nazwa Firmy: " + nazwaFirmy);
        System.out.println("Email: " + email);
        System.out.println("numer telefonu: " + numerTelefonu);
    }
}
