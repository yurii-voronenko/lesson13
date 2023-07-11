package cc.robotdreams;

public class Utils
{
    static public String reverseString(char[] source) {
        return reverseString(source, 0);
    }

    static private String reverseString(char[] source, int pos) {
        if (pos < source.length / 2) {
            int lastPos = source.length - 1 - pos;
            char tmp = source[pos];
            source[pos] = source[lastPos];
            source[lastPos] = tmp;
            return reverseString(source, ++ pos);
        }
        return new String(source);
    }
}
