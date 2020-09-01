package com.company;

import javafx.scene.Scene;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    static LinkedList<Wizytowka> wizytowki;
    static String zKonsoli;
    static PrintWriter zapis;
    static Scanner odczyt;
    static Wizytowka wizytowka;
    static LinkedList<String> data;
    public static void main(String[] args) throws IOException, FileNotFoundException {
        wizytowki = new LinkedList<Wizytowka>();

        do{
            System.out.println("Co chcesz zrobic?");
            System.out.println("1) Stworz nowa wizytowke\n2) Zapisz wizytowke\n3) Wczytaj wizytowke\n4) Wyswietl wizytowke");
            zKonsoli = new BufferedReader( new InputStreamReader(System.in)).readLine();
            switch(zKonsoli){
                case "1":
                    wizytowka = new Wizytowka();
                    System.out.println("Podaj imie: ");
                    wizytowka.setImie(new BufferedReader( new InputStreamReader(System.in)).readLine());
                    System.out.println("Podaj nazwisko: ");
                    wizytowka.setNazwisko(new BufferedReader( new InputStreamReader(System.in)).readLine());
                    System.out.println("Podaj nazwe firmy: ");
                    wizytowka.setNazwaFirmy(new BufferedReader( new InputStreamReader(System.in)).readLine());
                    System.out.println("Podaj email: ");
                    wizytowka.setEmail(new BufferedReader( new InputStreamReader(System.in)).readLine());
                    System.out.println("Podaj numer telefonu: ");
                    wizytowka.setNumerTelefonu(Integer.parseInt(new BufferedReader( new InputStreamReader(System.in)).readLine()));
                    wizytowki.add(wizytowka);
                    break;
                case "2":
                    zapis = new PrintWriter("wizytowki.txt");
                    for(Wizytowka w : wizytowki){
                        zapis.println(w.getImie() + ";" + w.getNazwisko() + ";" + w.getNazwaFirmy() + ";" + w.getEmail() + ";" + w.getNumerTelefonu());
                    }
                    zapis.close();
                    break;
                case "3":
                    odczyt = new Scanner(new BufferedReader(new FileReader("wizytowki.txt")));
                    while(odczyt.hasNext()) {
                        data = new LinkedList<String>();
                        for (String part : odczyt.next().split(";")) {
                            data.add(part.trim());
                        }
                        if(!data.isEmpty()) {
                            wizytowka = new Wizytowka();
                            wizytowka.setImie(data.get(0));
                            wizytowka.setNazwisko(data.get(1));
                            wizytowka.setNazwaFirmy(data.get(2));
                            wizytowka.setEmail(data.get(3));
                            wizytowka.setNumerTelefonu(Integer.parseInt(data.get(4)));
                            wizytowki.add(wizytowka);
                        }
                        else{
                            System.out.println("Niepoprawne dane");
                        }
                    }
                    odczyt.close();
                    break;
                case "4":
                    for(Wizytowka w : wizytowki){
                        w.Display();
                    }
                    break;
                default:
            }

        }while(!zKonsoli.equals("0"));
    }
}
