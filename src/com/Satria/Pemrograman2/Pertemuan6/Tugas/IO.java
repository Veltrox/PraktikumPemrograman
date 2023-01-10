package com.Satria.Pemrograman2.Pertemuan6.Tugas;

import java.io.IOException;
import java.io.RandomAccessFile;

public class IO {

    public static void main(String[] args) {
        String bookList[] = {"Satu", "Dua", "Tiga"};
        int yearList[] = {2001, 2002, 2003};
        try {
            RandomAccessFile books = new
                    RandomAccessFile("books.txt", "rw");
            for (int i = 0; i < 3; i++) {
                books.writeUTF(bookList[i]);
                books.writeInt(yearList[i]);
            }
            books.seek(0);
            System.out.println(books.readUTF() + " " +
                    books.readInt());
            System.out.println(books.readUTF() + " " +
                    books.readInt());
            books.close();
        } catch (IOException e) {
            System.out.println("Indeks melebihi batas");
        }
    }
}

