package ArraysAndStrings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class IsUnique {

    public boolean withHashTable(String value) {
        if (value == null || value.isBlank())
            return true;

        char[] arr = value.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (char item : arr) {
            if (set.contains(item))
                return false;
            set.add(item);
        }

        return true;
    }

    public boolean withNoAdditionalStructures(String value) {
        if (value == null || value.isBlank())
            return true;

        char[] arr = value.toCharArray();
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            char previous = arr[i - 1];
            char current = arr[i];

            if (previous == current)
                return false;
        }

        return true;
    }
}
