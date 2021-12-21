package skypro;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

            printRecommendApplicationVersion(3, 2010);
            int year = 2021;
            boolean isLeap = isYearLeap(year);
            if (isLeap) {
                System.out.println(year + " является високосным");
            } else {
                System.out.println(year + " не является високосным");
            }


            int[]arr = new int[]{3, 2, 1, 6, 5};
            reverseArray(arr);
            System.out.println(Arrays.toString(arr) );




        }
        public static void reverseArray(int[] arr){
            int head = 0;
            int tail = arr.length - 1;
            while (head<tail){
                int temp = arr[head];
                arr[head++]= arr[tail];
                arr[tail--]= temp;
            }
        }



        public static boolean isYearLeap(int year) {
            boolean isLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
            return isLeap;
        }


        public static void printRecommendApplicationVersion(int clientOS, int deviceYear) {
            boolean deviceIsOld = isDeviceOld(deviceYear);
            System.out.print("Установите ");
            if (deviceIsOld) {
                System.out.print("Lite ");
            }
            System.out.print("версию для ");
            if (clientOS == 0) {
                System.out.println("IOS");
            } else {
                System.out.println("Android");


                //


                System.out.println("Количество дней доставки: " + calculateDeliveryDays(70));


                findDuplicates( "aabccddefgghiijjkk");
            }
        }

        private static boolean isDeviceOld(int deviceYear) {
            int currentYear = LocalDate.now().getYear();
            return deviceYear <= currentYear;
        }


        public static int calculateDeliveryDays(int deliveryDistance) {
            int result = 1;
            if (deliveryDistance > 20) {
                result++;
            }
            if (deliveryDistance > 60) {
                result++;
            }
            return result;
        }
        public static void findDuplicates(String text){
            char[] letters = text.toCharArray();
            char prevChar = Character.MAX_VALUE;
            for(char letter : letters){
                if(letter==prevChar){
                    System.out.println("Найден дубль по символу " +letter);
                    return;
                }
                prevChar = letter;
            }
            System.out.println("Дублей нет");
        }



    }


