public class Test {
    public static void main(String[] args) {
//        分块查找
//        核心思想：
//        块内无序，块间有序
//        实现步骤：
//        1.创建数组arr存放每一个块对象的信息
//        2.先查找arr确定要查找的数据属于哪一块
//        3.再单独遍历这一块数据即可
        int[] arr={16,5,9,12,21,18,//前一块的最大值必须比后一块的所有值都要小
                   32,23,37,26,45,34,
                   50,48,61,52,73,66};
//        System.out.println(arr.length);//arr的长度为18,至少将arr分成4块
        //创建块的对象
        Block b1 = new Block(21,0,5);
        Block b2 = new Block(45,6,11);
        Block b3 = new Block(73,12,17);
        //把三个对象放进数组里
        Block[] b = {b1,b2,b3};
        //定义一个变量来记录需要查找的元素
        int num = 45;
        System.out.println(getIndex(b,num,arr));
    }
   //先确定num在哪一块中
    public static int getIndexBlock(Block[] b,int num){
//        Block b1 = new Block(21,0,5);-----0
//        Block b2 = new Block(45,6,11);----1
//        Block b3 = new Block(73,12,17);---2
        //从0索引开始遍历b数组,如果num小于max,则表示num在这一块当中
        for (int i = 0; i < b.length; i++) {
            if(num <= b[i].getMax()){
                return i;//返回块的下标
            }
        }
        return -1;//查找的数据不在表中
    }

    //确定了num在哪一块中,再去那块中寻找num的索引
    public static int getIndex(Block[] b,int num,int[] arr){
        int indexBlock = getIndexBlock(b,num);//得到返回的块的下标
       if(indexBlock == -1){//返回-1则表示数据不在数组中
           return -1;
       }else{
        int startIndex = b[indexBlock].getStartIndex();//得到块的开始索引
        int endIndex = b[indexBlock].getEndIndex();//得到块的结束索引
           for (int i = startIndex; i <= endIndex; i++) {//从开始索引遍历到结束索引
               if(arr[i] == num){
                   return i;
               }
           }
           return -1;
       }
    }
}
