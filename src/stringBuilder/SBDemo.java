package stringBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SBDemo
{
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("test");
        StringBuilder bs = new StringBuilder("T");
        char[] chars = {'s','z'};
        sb.insert(0,chars);
        System.out.println(sb);
        sb.insert(0,"Test data ");
        sb.deleteCharAt(0);
        System.out.println(sb);
        //System.out.println(sb.compareTo(bs));
        System.out.println(sb.capacity());

    }
}
