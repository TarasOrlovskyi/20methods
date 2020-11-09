package com.max.idea;

public class Main {

    public static void main(String[] args) {

        int setTask = 12;

        Methods myMethods = new Methods(); //створюємо екземпляр об"єкта, а параметр типу Task_1 вказує на місце в пам"яті

        char[] charArray1 = new char[4]; //створюємо масив чарів
        charArray1[0] = 't';
        charArray1[1] = 'a';
        charArray1[2] = 's';
        charArray1[3] = 'k';

        //завдання 1 п.1
        if (setTask == 1) {
            myMethods.printCharArray(charArray1); //викликаємо метод getOutChar() класа Task_1
        }

        int[] intArray = {50, 51, 52, 53};

        //завдання 1 п.2
        if (setTask == 2) {
            System.out.println(myMethods.intToChar(intArray));
        }

        //завдання 1 п.3
        if (setTask == 3) {
            System.out.println(myMethods.getMax(10, 7));
        }

        //завдання 1 п.4
        if (setTask == 4) {
            System.out.println(myMethods.getMax(100, 700, 50));
        }

        //завдання 1 п.5
        if (setTask == 5) {
            System.out.println(myMethods.getMax(100, 700, 9, 20, 8));
        }

        //завдання 1 п.6
        if (setTask == 6) {
            System.out.println(myMethods.charToSting(charArray1));
        }

        //завдання 1 п.8
        int[] intArray2 = new int[100];
        for (int i = 0; i < 100; i++) {
            intArray2[i] = i * 3;
        }
        if (setTask == 8) {
            System.out.println(myMethods.intComparisonUp(intArray2, 6));
        }

        //завдання 1 п.9
        if (setTask == 9) {
            System.out.println(myMethods.intComparisonDown(intArray2, 6));
        }

        //завдання 1 п.10
        if (setTask == 10) {
            System.out.println(myMethods.factorial(6));
        }

        //завдання 1 п.11
        if (setTask == 11) {
            System.out.println(myMethods.calendarLeapYear(2000));
        }

        //завдання 1 п.12
        if (setTask == 12) {
            myMethods.intMultipleArrayElement(intArray2, 10);
        }

        //завдання 1 п.13
        if (setTask == 13) {
            myMethods.intArraySortUp(intArray);
        }

        //завдання 1 п.14
        byte[] bytesArray = {1, 5, 16, 7, 127, 1};

        if (setTask == 14) {
            System.out.println(myMethods.checkForByteRepeat(bytesArray));
        }

        //завдання 1 п.15
        int[] array1 = {1, 0, 8, 4, 5};
        int[] array2 = {6, 0, 7, 4, 5};
        int[] arrayResult;

        if (setTask == 15) {
            arrayResult = myMethods.multiplyIntArray(array1, array2);
            for (int i = 0; i < arrayResult.length; i++) {
                System.out.println(arrayResult[i]);
            }
        }

        //завдання 1 п.16
        int[] arrayResult16;
        if (setTask == 16) {
            arrayResult16 = myMethods.getDifferentElementsOfArrays(array1, array2);
            for (int i = 0; i < arrayResult16.length; i++) {
                System.out.println(arrayResult16[i]);
            }
        }

        //завдання 1 п.17
        int[] arrayResult17;

        if (setTask == 17) {
            arrayResult17 = myMethods.intReversArray(array1);
            for (int i = 0; i < arrayResult17.length; i++) {
                System.out.println(arrayResult17[i]);
            }
        }

        //завдання 1 п.18
        if (setTask == 18) {
            int setArrayLength = 10;
            int setMinLevel = 30;
            int setMaxLevel = 150;
            int[] resultArray18;
            resultArray18 = myMethods.intArrayRandom(setArrayLength, setMinLevel, setMaxLevel);
            for (int i = 0; i < resultArray18.length; i++) {
                System.out.println(resultArray18[i]);
            }
        }

        //завдання 1 п.19
        if (setTask == 19) {
            char[] arrayCharForCompare1 = new char[] {'M', 'A', 'X', 'O', 'L', 'Y', 'A'}; //створюємо масив чарів
            char[] arrayCharForCompare2 = new char[] {'M', 'A', 'X', 'O'}; //створюємо масив чарів
            System.out.println(myMethods.charCheckArray(arrayCharForCompare1, arrayCharForCompare2));
        }

        if (setTask > 19 | setTask <= 0 | setTask == 7)
            System.out.println("i don't have task like that!");

    }
}
