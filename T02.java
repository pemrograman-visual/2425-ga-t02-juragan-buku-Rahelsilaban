// 12S24054 - Rahel Juri Elisabet Silaban
// 12S24010 - Artha Liebe Siregar

import java.util.*;
import java.lang.Math;

public class T02{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, formatBuku, rating;
        int tahunTerbit, stok;
        double hargaPembelian, minimumMargin, r;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunTerbit = input.nextInt();
        penerbit = input.nextLine();
        formatBuku = input.nextLine();
        hargaPembelian = input.nextDouble();
        minimumMargin = input.nextDouble();
        stok = input.nextInt();
        r = input.nextDouble();
        if (r >= 4.7) {
            rating = "best pick";
        } else {
            if (r >= 4.5) {
                rating = "Must Read";
            } else {
                if (r >= 4.0) {
                    rating = "recommended";
                } else {
                    if (r >= 3.0) {
                        rating = "average";
                    } else {
                        if (r <= 3.0) {
                            rating = "low";
                        }
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBuku + "|" + hargaPembelian + "|" + minimumMargin + "|" + stok + "|" + rating);
    }
}
