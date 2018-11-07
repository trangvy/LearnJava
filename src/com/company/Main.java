package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*int a = 5;
        int b = 6;
        int c = a + b;

        System.out.println(a);
        System.out.println(b);
        System.out.println("gia tri cua " + a + " cong voi " + b + " la: " + c);

        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
        nums[2] = 10;
        int d = nums[8];

        System.out.println(nums[3]);

        for (int num : nums) {
            System.out.println(num);
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            System.out.println(num);
        }

        int[] numbers1 = new int[] {1, 2, 3, 4};
        int[] numbers2 = numbers1;

        numbers1[0] = 9;

        System.out.println("numbers2 at 0 " + numbers2[0]);

        numbers2[3] = 5;
        System.out.println("numbers2[3] " + numbers2[3]);
        System.out.printf("ssss " + numbers1[3]);*/


        /*Lesson 3*/

        /* exercise1 */

        int[] numbers = new int[] {4, 5, 9, 1, 8};
        int max1 = 0;

        for (int number : numbers) {
            if (max1 < number) {
                max1 = number;
            }
        }

        System.out.println("gia tri a lon nhat la : " + max1);

        /* exercise2 */
        int max2 = 0;

        for (int number : numbers) {
            if (max2 < number && number < max1) {
                max2 = number;
            }
        }

        System.out.println("2 gia tri lon nhat la : "+ max1 + " va " + max2);

        /*exercise3*/
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        System.out.println("tong cac phan tu la : " + total);

        /* Lesson 5 */

        ComplexNumber num1 = new ComplexNumber();
        num1.re = 1;
        num1.im = 2;

        ComplexNumber num2 = new ComplexNumber();
        num2.re = 3;
        num2.im = 4;

        ComplexNumber num3;
        ComplexNumber num4;


        num3 = ComplexNumber.plus(num1,num2);

        System.out.println("tong 2 so phuc num1 va num2 la : " + num3.re + " + " + num3.im + "j");

        num4 = ComplexNumber.brand(num1,num2);

        System.out.println("hieu 2 so phuc num1 va num2 la : " + num4.re + " + " + num4.im + "j");

        int module1 = ComplexNumber.dolon(num1);

        System.out.println("do lon cua so phuc num1 la : " + module1);



    }
}
