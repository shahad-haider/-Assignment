package Assignment_1;

public class ArrayOperations {
    // سؤال 1: نسخ مصفوفة
    public static int[] cloneArray(int[] original) {
        return original.clone();
    }

    // سؤال 3: حذف عنصر محدد
    public static int[] removeSpecific(int[] arr, int target) {
        int count = 0;
        for (int i : arr) if (i == target) count++;
        if (count == 0) return arr;

        int[] result = new int[arr.length - count];
        int index = 0;
        for (int i : arr) {
            if (i != target) result[index++] = i;
        }
        return result;
    }
}
