package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sistema de registro de libros Jasson BOOKS");
        System.out.println("Atención señor lector, Usted va ingresar una serie de libros, por favor siga las intrucciones");
        System.out.println("\n");
        Scanner lectura = new Scanner(System.in);
        Libro book[][] = new Libro[3][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Ingrese el titulo del libro \n");
                String titulo = lectura.nextLine();
                System.out.print("Ingrese el ISBN del libro \n");
                String isbn = lectura.nextLine();
                System.out.print("Ingrese el autor del libro \n");
                String autor = lectura.nextLine();
                System.out.print("Ingrese el Numero de paginas \n");
                String paginas = lectura.nextLine();
                Libro book1 = new Libro(titulo, isbn, autor, paginas);
                book[i][j] = book1;

            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Fila: " + i + " Columna: " + j);
                System.out.println("En esta estanteria esta el libro: ");
                System.out.println(" Titulo del libro: " + book[i][j].getTitulo());
                System.out.println(" ISBN del libro: " + book[i][j].getIsbn());
                System.out.println(" Autor del libro: " + book[i][j].getAutor());
                System.out.println(" Numero de paginas del libro: " + book[i][j].getPaginas());
                System.out.println("--------------------------------------------------------");
            }
        }
    }
}
