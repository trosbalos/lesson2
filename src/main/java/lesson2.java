

import java.util.Arrays;
import java.util.Random;

public class lesson2 {


    static boolean method1(int[] arr1) {

        int summleft = 0;
        int summright = 0;

        for (int i = 0; i < arr1.length; i++) {
            summright += arr1[i];

        }

        for (int i = 0; i < arr1.length; i++) {

            summleft += arr1[i];
            summright -= arr1[i];
          if (summleft == summright) {
                System.out.println("Задание 6 . Суммы равны: " + "сумма слева " + summleft + " сумма справа " + summright + " совпало на " + (i+1) + " шаге слева.");
               break;

          }



        }

        return summleft==summright;

    }


        public static void main (String[]args){
            //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
            // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
            // С помощью цикла и условия заменить 0 на 1, 1 на 0;
            int[] nums = {1, 0, 1, 0};
            System.out.println("Задание 1 до " + Arrays.toString(nums));
            for (int i = 0; i < nums.length; i++) {
                nums[i] = (nums[i] == 1) ? nums[i] = 0 : (nums[i] = 1);

            }
            System.out.println("Задание 1 после " + Arrays.toString(nums));

            //2. Задать пустой целочисленный массив размером 8.
            // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
            int[] nums1 = new int[8];
            for (int i = 0; i < nums1.length; i++) {
                nums1[i] = i * 3;
            }
            System.out.println("Задание 2 " + Arrays.toString(nums1));

            //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
            // и числа меньшие 6 умножить на 2;
            int[] nums2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            System.out.println("Задание 3  до " + Arrays.toString(nums2));
            for (int i = 0; i < nums2.length; i++) {
                if (nums2[i] < 6) {
                    nums2[i] = nums2[i] * 2;
                }
            }
            System.out.println("Задание 3 после " + Arrays.toString(nums2));

            //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
            // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
            System.out.println("Задание 4 ");
            int[][] square = new int[5][5];
            for (int i = 0, j = 4; i < square.length; i++, j--) {
                square[i][i] = 1;
                square[i][j] = 1;
            }
            //Можно было проще написать наглядный вывод в консоль?
            for (int i = 0; i < square.length; i++) {
                for (int j = 0; j < square.length; j++) {
                    System.out.print(square[i][j]);

                }
                System.out.println();
            }


            //5. ** Задать одномерный массив и найти в нем минимальный
            // и максимальный элементы (без помощи интернета);
            System.out.println("Задание 5 ");
            Random random = new Random();
            int size, range, minimal = 2147483647, maximal = -2147483648;
            size = 10;
            range = 100;

            // Генерацию случайного числа увидел недавно на интенсиве, захотелось попробовать.
            int[] nums3 = new int[size];
            for (int i = 0; i < nums3.length; i++) {
                nums3[i] = random.nextInt(range);
            }
            System.out.println("Массив заполнен" + Arrays.toString(nums3));
            for (int i = 0; i < nums3.length; i++) {
                if (minimal > nums3[i]) {
                    minimal = nums3[i];
                }
                if (maximal < nums3[i]) {
                    maximal = nums3[i];
                }

            }
            System.out.println("Минимальное число : " + minimal);
            System.out.println("Максимальное число : " + maximal);

            //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
            // метод должен вернуть true, если в массиве есть место, в котором сумма левой и
            // правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
            // checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив
            // не входят.

           int[] arr2 = {1,1,1,1,4};
           int[] arr3 = {1,1,1,1,6};
            System.out.println(method1(arr2));



        }

    }
