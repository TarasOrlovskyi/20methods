package com.max.idea;


import java.util.Random;

class Methods {

    public void printCharArray(char[] charArray) {
        System.out.println(charArray);
    }

    public char[] intToChar(int[] intArray) {
        char[] charArray = new char[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            charArray[i] = (char) intArray[i];
        }
        return charArray;
    }

    public int getMax(int val1, int val2) {
        return val1 > val2 ? val1 : val2;
    }

    public int getMax(int val1, int val2, int val3) {
        return getMax(val1, getMax(val2, val3));
    }

    public int getMax(int val1, int val2, int val3, int val4, int val5) {
        return getMax(getMax(val1, val2), getMax(val3, val4, val5));
    }

    public String charToSting(char[] chars) {
        return new String(chars);
    }

    public int intComparisonUp(int[] intsArray2, int valueForComparison) {
        for (int i = 0; i < intsArray2.length; i++) {   //перебираємо масив з початку
            if (intsArray2[i] == valueForComparison) {
                return i;
            }
        }
        return -1;
    }

    public int intComparisonDown(int[] intsArray_2, int valueForComparison) {
        for (int i = intsArray_2.length - 1; i >= 0; i--) {     //перебираємо масив з кінця
            if (intsArray_2[i] == valueForComparison) {
                return i;
            }
        }
        return -1;
    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public boolean calendarLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else return false;
            } else return true;
        } else return false;
    }

    public int[] intMultipleArrayElement(int[] intArray, int element) {
        int count = 0;
        int[] tempArray = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % element == 0) {
                tempArray[count] = intArray[i];
                System.out.println("'" + intArray[i] + "'" + " - ділиться на " + element + " - >>" + intArray[i] / element + " - №" + i);
                count++;
            }
        }
        int[] resultArray = new int[count];
        for (int i = 0; i < count; i++) {
            resultArray[i] = tempArray[i];
        }
        return resultArray;
    }

    public int[] intArraySortUp(int[] intArrayForSort) {
        int temp;
        for (int i = 0; i < intArrayForSort.length; i++) {
            for (int j = 0; j < intArrayForSort.length - 1; j++) {
                if (intArrayForSort[j] > intArrayForSort[j + 1]) {
                    temp = intArrayForSort[j + 1];
                    intArrayForSort[j + 1] = intArrayForSort[j];
                    intArrayForSort[j] = temp;
                }
            }
        }
        for (int i = 0; i < intArrayForSort.length; i++) {
            System.out.println(intArrayForSort[i] + ", ");
        }
        return intArrayForSort;
    }

    public boolean checkForByteRepeat(byte[] byteArray) {
        for (int i = 0; i < byteArray.length - 1; i++) {
            for (int j = i + 1; j < byteArray.length; j++) {
                if (byteArray[i] == byteArray[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public int[] multiplyIntArray(int[] array1, int[] array2) {
        if (array1.length == array2.length) {
            int[] arrayResultMultiply = new int[array1.length];
            for (int i = 0; i < arrayResultMultiply.length; i++) {
                arrayResultMultiply[i] = array1[i] * array2[i];
            }
            return arrayResultMultiply;
        } else {
            System.out.println("the length of the arrays is different!!");
            return new int[]{-1};
        }
    }

    public int[] getDifferentElementsOfArrays(int[] array1, int[] array2) {
        int[] tempArray = new int[array1.length + array2.length];
        int[] tempResultArray = new int[tempArray.length];
        int count = -1;
        int tempCountOfIndexResultArray = 0;
        for (int i = 0; i < array1.length; i++) {
            tempArray[i] = array1[i];
            count++;
        }
        for (int i = 0; i < array2.length; i++) {
            tempArray[count + 1] = array2[i];
            count++;
        }
        for (int i = 0; i < tempArray.length; i++) {
            count = 0;
            for (int j = 0; j < tempArray.length; j++) {
                if (i != j) {
                    if (tempArray[i] != tempArray[j]) {
                        count++;
                    } else break;
                    if (count == tempArray.length - 1) {
                        tempResultArray[i] = tempArray[i];
                        tempCountOfIndexResultArray++;
                    }
                }
            }
        }
        int[] resultArray = new int[tempCountOfIndexResultArray];
        tempCountOfIndexResultArray = 0;
        for (int value : tempResultArray) {
            if (value != 0) {
                resultArray[tempCountOfIndexResultArray] = value;
                tempCountOfIndexResultArray++;
            }
        }
        return resultArray;
    }

    public int[] intReversArray(int[] intArray) {
        int[] arrayReversResult = new int[intArray.length];
        int count = intArray.length;
        for (int value : intArray) {
            count--;
            arrayReversResult[count] = value;
        }
        return arrayReversResult;
    }

    public int[] intArrayRandom(int arrayLength, int minLevel, int maxLevel) {
        int[] intArrayRandomResult = new int[arrayLength];
        int range = maxLevel - minLevel;
        Random random = new Random();
        for (int i = 0; i < intArrayRandomResult.length; i++) {
            int resultRandom = random.nextInt(range + 1);
            resultRandom += minLevel;
            intArrayRandomResult[i] = resultRandom;
        }
        return intArrayRandomResult;
    }

    public boolean charCheckArray(char[] charArray1, char[] charArray2) {
        int count = 0;
        for (char value : charArray1) {
            if (value == charArray2[count]) {
                count++;
            } else count = 0;
            if (count == charArray2.length) {
                return true;
            }
        }
        return false;
    }
}
