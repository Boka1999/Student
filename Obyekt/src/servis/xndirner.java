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
        int j9 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 6 == 1) {
                array9[j9] = array[i];
                j9++;
            }
        }
        for (int i = 0; i < array9.length; i++) {
            System.out.println(array9[i]);
        }
        System.out.println("**************XNDIR291***************");
        int caunt10 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                caunt10++;
            }
        }
        int j10 = 0;
        int[] array10 = new int[caunt10];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array10[j10] = array[i];
                j10++;
            }
        }
        for (int i = 0; i < array10.length; i++) {
            System.out.println(array10[i]);
        }
        System.out.println(".............XNDIR292..............");
        int caunt11 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 7 != 0) ;
            caunt11++;
        }
        int[] array11 = new int[caunt11];
        int j11 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 7 != 0) ;
            array11[j11] = array[i];
            j11++;
        }
        for (int i = 0; i < array11.length; i++) {
            System.out.println(array11[i]);
        }
        System.out.println("===============XNDIR293================");
        int caunt12 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= a && array[i] <= b) {
                caunt12++;
            }
        }
        int j12 = 0;
        int[] array12 = new int[caunt12];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= a && array[i] <= b) {
                array12[j12] = array[i];
                j12++;
            }
        }
        for (int i = 0; i < array12.length; i++) {
            System.out.println(array12[i]);
        }
        System.out.println("!!!!!!!!!!!!!XNDIR294!!!!!!!!!!!!");
        int caunt13 = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                caunt13++;
            }
        }
        int j13 = 0;
        int[] array13 = new int[caunt13];
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
            if (i % 2 == 0) {
                caunt14++;
            }
        }
        int[] array14 = new int[caunt14];
        int j14 = 0;
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
        int k = 5;
        int caunt15 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k != 2) {
                caunt15++;
            }
        }

        int j15 = 0;
        int[] array15 = new int[caunt15];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k != 2) {
                array15[j15] = array[i];
                j15++;
            }
        }
        for (int i = 0; i < array15.length; i++) {
            System.out.println(array15[i]);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~XNDIR298~~~~~~~~~~~~~~~~~~");
        int caunt16 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                caunt16++;
            }
        }

        int j16 = 0;
        int[] array16 = new int[caunt16];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array16[j16] = array[i];
                j16++;
            }
        }
        for (int i = 0; i < array16.length; i++) {
            System.out.println(array16[i]);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~XNDIR299~~~~~~~~~~~~~~~~~~");
        int caunt17 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                caunt17++;
            }
        }

        int j17 = 0;
        int[] array17 = new int[caunt17];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                array17[j17] = array[i];
                j17++;
            }
        }
        for (int i = 0; i < array17.length; i++) {
            System.out.println(array17[i]);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~XNDIR300~~~~~~~~~~~~~~~~~~");
        int caunt18 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] * array[i] > k) {
                caunt18++;
            }
        }

        int j18 = 0;
        int[] array18 = new int[caunt18];
        for (int i = 0; i < array.length; i++) {
            if (array[i] * array[i] > k) {
                array18[j18] = array[i];
                j18++;
            }
        }
        for (int i = 0; i < array18.length; i++) {
            System.out.println(array18[i]);
        }

        System.out.println("**************XNDIR301************");
        int eranish = 100;
        int caunt19 = 0;
        while (eranish <= 999) {

            if (eranish % k == 0) {
                caunt19++;
            }
            eranish++;
        }
        int[] array19 = new int[caunt19];
        for (int i = 100, j19 = 0; i < 999; i++) {
            if (i % k == 0) {
                array19[j19] = i;
                j19++;

            }
        }
        for (int resalt: array19) {
            System.out.println(resalt);

        }
        System.out.println("**************XNDIR302************");
        int eranish1 = 100;
        int caunt20 = 0;
        while (eranish1 <= 999) {

            if (eranish1 % 5 == 2) {
                caunt20++;
            }
            eranish1++;
        }
        int[] array20 = new int[caunt20];
        for (int i = 100, j20 = 0; i < 999; i++) {
            if (i % 5 == 2) {
                array20[j20] = i;
                j20++;
            }
        }
        for (int resalt: array20) {
            System.out.println(resalt);
        }
        System.out.println("**************XNDIR303************");
        int n = 8;
        int eranish2 = 100;
        int caunt21 = 0;
        while (eranish2 <= 999) {

            if (eranish2 % n == 0) {
                caunt21++;
            }
            eranish2++;
        }
        int[] array21 = new int[caunt21];
        for (int i = 100, j21 = 0; i < 999; i++) {
            if (i % n == 0) {
                array21[j21] = i;
                j21++;

            }
        }
        for (int resalt: array21) {
            System.out.println(resalt);
        }
        System.out.println("**************XNDIR304************");
        int eranish3 = 100;
        int caunt22 = 0;
        while (eranish3 <= 999) {

            if (eranish3 % n == 2) {
                caunt22++;
            }
            eranish3++;
        }
        int[] array22 = new int[caunt22];
        for (int i = 100, j22 = 0; i < 999; i++) {
            if (i % n == 2) {
                array22[j22] = i;
                j22++;

            }
        }
        for (int resalt: array22) {
            System.out.println(resalt);
        }
        System.out.println("**************XNDIR305************");
        int qaranish = 1000;
        int caunt23 = 0;
        while (qaranish <= 9999) {

            if (qaranish % 3 == 0 && qaranish % 5 == 0) {
                caunt23++;
            }
            qaranish++;
        }
        int[] array23 = new int[caunt23];
        for (int i = 1000, j23 = 0; i < 9999; i++) {
            if (i % 3 == 0 && i % 5 ==0) {
                array23[j23] = i;
                j23++;

            }
        }
        for (int resalt: array23) {
            System.out.println(resalt);
        }
    }
}










