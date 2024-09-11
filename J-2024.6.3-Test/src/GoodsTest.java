public class GoodsTest {
    public static void main(String[] args) {
     //创建一个数组储存3个商品
        Goods[] arr = new Goods[3];//Goods为引用数据类型 相当与c语言中的struct类型
        //创建三个商品对象
        Goods g1 = new Goods("001","华为p40",5999.0,100);//输入杠在括号内 ctrl+p显示数据的顺序
        Goods g2 = new Goods("002","iphone12",2989.0,300);//ctrl+D-下一行
        Goods g3 = new Goods("003","纯牛奶",39.9,250);
        //把商品放进数组中
       arr[0] = g1;
       arr[1] = g2;
       arr[2] = g3;
       //遍历数组
        for (int i = 0; i < arr.length; i++) {
            Goods good = arr[i];
            System.out.println(good.getId()+","+good.getName()+","+good.getPrize()+","+good.getCount());
        }
    }
}
