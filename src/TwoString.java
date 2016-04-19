package twoString;

import java.io.*;
import java.util.*;

public class TwoString {

    public static void main(String[] args) {
        //deklarasi variable inputan
        Scanner in = new Scanner(System.in);
        //inisialisasi jumlah inputan test case
        int t = 0;
        t = in.nextInt();
        //deklarasi string A dan B
        String[] s1 = new String[t];
        String[] s2 = new String[t];
        //inputan string A dan B untuk tiap test case
        for(int i = 0; i<t; i++){
            s1[i] = in.next().toLowerCase();
            s2[i] = in.next().toLowerCase();
        }
        
         //perulangan sebanyak test case
         for(int i = 0; i<t; i++){
        	 //pengecekan constraint
            if(t>=1 && t<=10 && s1[i].length()>=1 && s1[i].length()<=100000 && s2[i].length()<=100000 && s2[i].length()>=1){             
               //karakter tiap string dipecah
                char[] s1Char = s1[i].toCharArray();
                char[] s2Char = s2[i].toCharArray();
                //deklarasi variabel HasSet karakter
                Set<Character>s1CharSet = new HashSet<Character>();
                Set<Character>s2CharSet = new HashSet<Character>();
                //seluruh string karakter dimasukkan ke variable hashset
                for(char c:s1Char){
                    s1CharSet.add(c);
                }
                for(char c:s2Char){
                    s2CharSet.add(c);
                }
                //menyeleksi karakter yang sama
                s1CharSet.retainAll(s2CharSet);
                //pengecekan karakter yang sama ditemukan
                if(s1CharSet.size()==0){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }
            }
        }
       //menutup scanner input
         in.close();
    }
}