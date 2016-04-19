package encryption;

import java.io.*;
import java.util.*;
import java.math.*;

public class SquareEncryption {

    public static void main(String[] args) {
        //deklarasi variabel inputan
        Scanner in = new Scanner(System.in);
        String input = in.next();
        //inisialisasi panjang string
        int input_length = input.length();
        //memecah string ke karakter
        char[] input_char = input.toCharArray();
        //deklarasi variable stringbuffer untuk menyusun string
        StringBuffer out = new StringBuffer();
        //menentukan jumlah kolom enkripsi
        int col = (int)Math.ceil(Math.sqrt(input_length));
        //proses penyusunan enkripsi
        for(int i=0;i<col;i++){
            int j = i;
            while(j<input_length){
            out.append(input_char[j]);
            j=j+col;
            }
            out.append(" ");
        }
        System.out.print(out);
      //menutup scanner input
        in.close();
    }
}
