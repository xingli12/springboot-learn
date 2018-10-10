package com.lx.springbootlearn.web;

/**
 * description
 * projectName  springboot-learn
 * package com.lx.springbootlearn.web
 *
 * @author xingli12
 * @version v1
 * //      ┏┛ ┻━━━━━┛ ┻┓
 * //      ┃　　　　　　 ┃
 * //      ┃　　　━　　　┃
 * //      ┃　┳┛　  ┗┳　┃
 * //      ┃　　　　　　 ┃
 * //      ┃　　　┻　　　┃
 * //      ┃　　　　　　 ┃
 * //      ┗━┓　　　┏━━━┛
 * //        ┃　　　┃   神兽保佑
 * //        ┃　　　┃   代码无BUG！
 * //        ┃　　　┗━━━━━━━━━┓
 * //        ┃　　　　　　　    ┣┓
 * //        ┃　　　　         ┏┛
 * //        ┗━┓ ┓ ┏━━━┳ ┓ ┏━┛
 * //          ┃ ┫ ┫   ┃ ┫ ┫
 * //          ┗━┻━┛   ┗━┻━┛
 * @date Created in 2018-10-10 21:25
 * modified By
 * updateDate
 */
public class DeleteEveryNum {

    public static void main(String[] args) {

        int lastIndex = getLastIndex(9, 3);
        System.out.println("最终删除的是:" + lastIndex);
    }

    public static int getLastIndex(int length,int step){

        //判断长度是否大于0
        if(length <=0 ){
            return -1;
        }

        int[] arr = new int[length];

        for(int i =0; i < length; i++){
            arr[i] = length;
        }

        final int deleteflag = 0;

        int newlength = length;

        int lastIndex = 0;

        int count = 0;

        int i = 0;

        while (newlength !=0 ){
            if(arr[i] != deleteflag){
                if(count++ == step){
                    arr[i] = deleteflag;
                    lastIndex = i;
                    count = 0;
                    newlength-- ;
                    System.out.println("已删除index:" + lastIndex);
                }
            }

            i = (i + 1) % length;
        }
        return lastIndex;
    }
}

