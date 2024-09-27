// 12S24054 - Rahel Juri Elisabet Silaban
// 12S24010 - Artha Liebe Siregar

import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, formatBuku, kategori;
        int tahunTerbit, stok;
        double hargaPembelian, minimumMargin, rating;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunTerbit = Integer.parseInt(input.nextLine());
        penerbit = input.nextLine();
        formatBuku = input.nextLine();
        hargaPembelian = Double.parseDouble(input.nextLine());
        minimumMargin = Double.parseDouble(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        if (rating >= 4.7) {
            kategori = "Best Pick";
        } else {
            if (rating >= 4.5) {
                kategori = "Must Read";
            } else {
                if (rating >= 4.0) {
                    kategori = "Recommended";
                } else {
                    if (rating >= 3.0) {
                        kategori = "Average";
                    } else {
                        if (rating <= 3.0) {
                            kategori = "low";
                        }
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBuku + "|" + hargaPembelian + "|" + minimumMargin + "|" + stok + "|" + toFixed(rating,1) + "|" + kategori);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
