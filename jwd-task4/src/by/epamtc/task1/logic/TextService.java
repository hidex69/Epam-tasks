package by.epamtc.task1.logic;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TextService {
    public static String removeCharAt(String string, int k) {

        return Arrays.stream(string.split(" "))
                .map(str -> {
                    if (k >= str.length()) {
                        return str;
                    }

                    return str.substring(0, k) + str.substring(k + 1);
                })
                .collect(Collectors.joining(" "));
    }

    public static char[] removeCharAt(char[] string, int k) {
        char[] result = new char[string.length];
        int insertIndex = 0;

        for (int i = 0, j = 0; i < string.length; i++, j++) {
            if (string[i] == ' ') {
                j = -1;
            }

            if (j == k && string[i] != ' ') {
                i++;
            }

            result[insertIndex++] = string[i];
        }

        return result;
    }

    public static String swapCharAfterP(String string) {
        return Arrays.stream(string.split(" "))
                .map(str -> {
                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) == 'р' && str.length() != i + 1 && str.charAt(i + 1) == 'а') {
                            str = str.substring(0, i + 1) + 'о' + str.substring(i + 2);
                        }
                    }
                    return str;
                }).collect(Collectors.joining(" "));
    }

    public static char[] swapCharAfterP(char[] string) {
        char[] result = new char[string.length];

        for (int i = 0; i < string.length; i++) {
            if (string[i] == 'р' && string[i + 1] != ' ' && string[i + 1] == 'а') {
                result[i + 1] = 'о';
            }
            result[i] = string[i];
        }

        return result;
    }

    public static String swapSubstring(String string, String substring, int length) {
        return Arrays.stream(string.split(" ")).map(str -> {
            if (str.length() == length) {
                return substring;
            }
            return str;
            }).collect(Collectors.joining(" "));
    }

    public static char[] swapSubstring(char[] string, char[] substring, int lentgh) {
        char[] result = new char[string.length * 3];

        for (int i = 0, x = 0; i < string.length; i++, x++) {
            int size = 0;
            int pointer = i;

            while (string[i] != ' ' && i != string.length - 1) {
                size++;
                i++;
            }
            i = pointer;
            if (size == lentgh && string[i + substring.length] == ' ') {
                int j = 0;
                while (size > 0) {
                    result[i++] = substring[j++];
                    size--;
                }

            }
            result[i] = string[i];
        }

        return result;
    }

    public static String replaceSuperfluous(String string) {
        for (int i = 0; i < string.length(); i++) {
            int pointer = i - 1;
            if (!Character.isLetter(string.charAt(i)) && string.charAt(i) != ' ') {
                string = string.replaceAll(String.valueOf(string.charAt(i)), "");
                i = pointer;
            }
        }

        while (string.contains("  ")) {
            string = string.replace("  ", " ");
        }

        return string;
    }

    public static char[] replaceSuperfluous(char[] string) {
        char[] noSpaces = new char[string.length];
        //deleting spaces
        for (int i = 0; i < string.length; i++) {
            int spacesCounter = 0;
            int pointer = i;

            while (string[i] == ' ' && i != string.length - 1) {
                spacesCounter++;
                i++;
            }
            if (spacesCounter > 1) {
                noSpaces[++pointer] = string[i];
                noSpaces[pointer - 1] = ' ';
                continue;
            }
            noSpaces[i] = string[i];
        }

        char[] result = new char[noSpaces.length];

        int pointer = 0;
        for (int i = 0; i < noSpaces.length; i++) {
            while (!isLetterOrSpace(noSpaces[i]) && i != noSpaces.length - 1) {
                i++;
            }
            result[pointer++] = noSpaces[i];
        }

        return result;
    }

    private static boolean isLetterOrSpace(char ch) {
        boolean result = false;

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || ch == ' ') {
            result = true;
        }
        return result;
    }

    public static String removeСonsonantWords(String string, int length) {
        return Arrays.stream(string.split(" "))
                .filter(str -> str.length() != length || !isConsonantLetter(str.charAt(0)))
                .collect(Collectors.joining(" "));
    }

    private static boolean isConsonantLetter(char ch) {
        String consonantLetters = "aoeyi";
        boolean result = false;


        if (consonantLetters.contains(Character.toString(ch))) {
            result = true;
        }
        return result;
    }

    public static char[] removeСonsonantWords(char[] string, int length) {
        char[] result = new char[string.length];
        int pointer = 0;

        for (int i = 0; i < string.length; i++) {
            if ((isConsonantLetter(string[i]) && i == 0) || (isConsonantLetter(string[i]) && string[i - 1] == ' ')) {
                int size = 0;
                while (string[i] != ' ' && i != string.length - 1) {
                    i++;
                    size++;
                }
                if (i == string.length - 1) {
                    if (size + 1 == length) {
                        break;
                    } else {
                        i -= size;
                        result[pointer++] = string[i];
                        continue;
                    }
                }
                i++;
                if (size != length) {
                    i -= (size + 1);
                }
            }
            result[pointer++] = string[i];
        }

        return result;
    }

}
