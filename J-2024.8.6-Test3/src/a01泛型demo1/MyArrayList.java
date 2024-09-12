package a01泛型demo1;

import java.util.Arrays;

public class MyArrayList<E> {//E为任意类型
    //泛型类
    Object[] obj = new Object[10];
    int size;//元素的索引,初始值为0

    //E表示是不确定的类型,该类型在类名后已经定义过了
    //e:形参的名字,变量名
    public boolean add(E e){
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index){
        return (E)obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);//把数组转换成字符串
    }
}
