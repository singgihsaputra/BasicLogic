package plusminus;


import java.util.*;
import java.text.*;

public class PlusMinus {

    public static void main(String[] args) {
    	//deklarasi variabel inputan
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //deklarasi array untuk menampung inputan
        int arr[] = new int[n];
        int positive = 0;
        int negative = 0;
        int zero = 0;
        //proses inputan dan pengecekan angka plus, minus, zero
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]==0) zero +=1;
            else if(arr[arr_i]<0) negative += 1;
            else positive += 1;
        }
        //deklarasi format string desimal
        DecimalFormat dec = new DecimalFormat("0.000000");
        //output
        System.out.println(dec.format((double)positive/n));
        System.out.println(dec.format((double)negative/n));
        System.out.println(dec.format((double)zero/n));
        //menutup scanner input
        in.close();
    }
}
