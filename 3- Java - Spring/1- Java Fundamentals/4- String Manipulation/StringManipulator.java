public class StringManipulator {
    public String trimAndConcat(String string1, String string2) {
        String result = string1.trim() + string2.trim();
        return result;
    }

    public Integer getIndexOrNull(String string1, char char1) {
        if (string1.indexOf(char1) >= 0) {
            return string1.indexOf(char1);
        } 
        else {
            return null;
        }
    }

    public Integer getIndexOrNull(String string1, String string2) {
        if (string1.indexOf(string2) >= 0) {
            return string1.indexOf(string2);
        } 
        else {
            return null;
        }
    }

    public String concatSubstring(String string1, int num1, int num2, String string2) {
        return string1.substring(num1, num2).concat(string2);
    }
}
