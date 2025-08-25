package servis;

import java.lang.reflect.Array;

public class xndirner {
    public static void main(String[] args) {
        // Xndir 281
        int caunt = 0;
        int[] array = {15, 1, 7, -3, 9, 0, 3, 5, 4, -12, 8, 9, 25};
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                caunt++;
            }
        }

        int[] ar = new int[caunt];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                ar[j] = array[i];
                j++;

            }
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
        System.out.println("--------------XNDIR282-----------------");
        //Xndir282
        int caunt1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                caunt1++;
            }
        }

        int[] array1 = new int[caunt1];
        int j1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array1[j1] = array[i];
                j1++;
            }
        }
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("///////////////////XNDIR283/////////////////");
        //xndir283
        int caunt2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                caunt2++;
            }
        }
        int j2 = 0;
        int[] array2 = new int[caunt2];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array2[j2] = array[i];
                j2++;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        //Xndir 284
        System.out.println("//////////////XNDIR 284//////////////");
        int caunt3 = 0;
        int a = 3;
        int b = 12;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= a && array[i] <= b) {
                caunt3++;
            }
        }
        int j3 = 0;
        int[] array3 = new int[caunt3];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= a && array[i] <= b) {
                array3[j3] = array[i];
                j3++;
            }
        }
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
        // Xndir 285
        System.out.println("////////////XNDIR 285///////////");
        int p = 6;
        int caunt4 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && p % array[i] == 0) {
                caunt4++;
            }
        }
        int j4 = 0;
        int[] array4 = new int[caunt4];
        for (int i = 0; i < array.length; i++)
            if (array[i] != 0 && p % array[i] == 0) {
                array4[j4] = array[i];
                j4++;
            }
        for (int i = 0; i < array4.length; i++) {
            System.out.println(array4[i]);
        }
        //Xndir 286
        System.out.println("[[[[[[[[[[[[[[[[XNDIR 286 ]]]]]]]]]]]]]]]]]]]");
        int caunt5 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 2 == 0) {
                caunt5++;
            }
        }
        int j5 = 0;
        int[] array5 = new int[caunt5];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0 && array[i] % 2 == 0) {
                array5[j5] = array[i];
                j5++;
            }
        }
        for (int i = 0; i < array5.length; i++) {
            System.out.println(array5[i]);
        }
        // xndir287
        System.out.println("!!!!!!!!!!!!Xndir 287!!!!!!!!!!!!");
        int caunt6 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != array[i]) {
                caunt6++;
            }
        }
        int[] array6 = new int[caunt6];
        int j6 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != array[i]) {
                array6[j6] = array[i];
                j6++;
            }
        }
        for (int i = 0; i < array6.length; i++) {
            System.out.println(array6[i]);
        }
        // xndir288
        System.out.println("!!!!!!!!!!!!Xndir 288!!!!!!!!!!!!");
        int caunt7 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                caunt7++;
            }
        }
        int j7 = 0;
        int[] array7 = new int[caunt7];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array7[j7] = array[i];
                j7++;
            }
        }
        for (int i = 0; i < array7.length; i++) {
            System.out.println(array7[i]);
        }
        //xndir289 ??????????? eror ka chem haskanum patchary
        //System.out.println("////////////XNDIR 289 /////////////");
        //int c = -6, d = 15;
        //int caunt8 = 0;
        //for (int i = 0; i < array.length; i++) {
        //    if ( array[i]* array[i] >= c && array[i] * array[i] <= d ){
        //        caunt8++;
        //    }
        //}
        //int j8= 0;
        //int [] array8 = new  int[caunt8];
        //for (int i = 0; i < array.length; i++) {
        //    if ( array[i]* array[i] >= c && array[i] * array[i] <= d );{
        //    array8[j8] = array[i];
        //    j8++;
        //    }
        //}
        //for (int i = 0; i < array8.length; i++) {
        //    System.out.println(array8[i]);
        //}
        int caunt9 = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 6 == 1) {
                caunt9++;
            }
        }
        System.out.println("///////////////XNDIR290/////////////");
        int[] array9 = new int[caunt9];
        int j9= 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%6==1) {
                array9[j9] = array[i];
                j9++;
        }
    }
        for (int i = 0; i < array9.length; i++) {
            System.out.println(array9[i]);
        }
        System.out.println("**************XNDIR291***************");
        int caunt10 =0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 ){
                caunt10++;
            }
        }
        int j10=0;
        int[] array10 = new int[caunt10];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 ){
                array10[j10] =array[i];
                j10++;
            }
        }
        for (int i = 0; i < array10.length; i++) {
            System.out.println(array10[i]);
        }
        System.out.println(".............XNDIR292..............");
        int caunt11=0;
        for (int i = 0; i <array.length ; i++) {
            if (array[i]%7!=0);
            caunt11++;
        }
        int []array11 = new  int[caunt11];
        int j11 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%7!=0);
            array11[j11] = array[i];
            j11++;
        }
        for (int i = 0; i < array11.length; i++) {
            System.out.println(array11[i]);
        }
        System.out.println("===============XNDIR293================");
        int caunt12 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>= a && array[i]<=b){
                caunt12++;
            }
        }
        int j12=0;
        int [] array12 = new  int[caunt12];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>= a && array[i]<=b){
                array12[j12]=array[i];
                j12++;
            }
            }
        for (int i = 0; i < array12.length; i++) {
            System.out.println(array12[i]);
        }
        System.out.println("!!!!!!!!!!!!!XNDIR294!!!!!!!!!!!!");
       int caunt13=0;
        for (int i = 0; i < array.length; i++) {
            if (i%2!=0){
                caunt13++;
            }
        }
        int j13= 0;
        int [] array13 = new int[caunt13];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array13[j13] = array[i];
                j13++;
            }
        }
        for (int i = 0; i < array13.length; i++) {
            System.out.println(array13[i]);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~XNDIR295~~~~~~~~~~~~~~~~~~");
        int caunt14 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i%2==0){
                caunt14++;
            }
        }
        int []array14 = new int[caunt14];
        int j14 =0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array14[j14] = array[i];
                j14++;
            }
        }
        for (int i = 0; i < array14.length; i++) {
            System.out.println(array14[i]);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~XNDIR296~~~~~~~~~~~~~~~~~~");
        int k =5;
        int caunt15 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%k!=2){
                caunt15++;
            }
        }

        int j15 =0;
        int []array15 = new int[caunt15];
        for (int i = 0; i < array.length; i++) {
            if (array[i]%k!=2){
                array15[j15] = array[i];
                j15++;
            }
        }
        for (int i = 0; i < array15.length; i++) {
            System.out.println(array15[i]);
        }


            }
        }










