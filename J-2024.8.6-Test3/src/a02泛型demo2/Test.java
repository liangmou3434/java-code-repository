package a02泛型demo2;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        ListUtil.addAll(list,"aaa","bbb","ccc");
        System.out.println(list);//[aaa, bbb, ccc]

    }
}
