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
 * @date Created in 2018-10-10 20:57
 * modified By
 * updateDate
 * /**
 *  * 有一个数组a[N]，要求每隔两个数删掉一个数，到末尾则又循环到开头继续进行
 *  * 求最后一个被删掉的数的原始下标位置
 *  *
 *  *  例如，一个数组：{0, 1, 2, 3, 4, 5, 6, 7}
 *  *  0->1->2(第一遍，删除)->3->4->5(第一遍，删除)->6->7->
 *  *  0(第二遍，删除)->1->2(已删除)->3->4(第二遍，删除)->5(已删除)->6->7...
 *  *  循环直到数组中最后一个元素被删除
 *  *
 *  *  当然，这里并未真正删除元素，只是用标志位表示已经被删除
 *  *
 *  *
 *  *
 *
 */
public class DeleteEveryTwo {
    public static void main(String[] args) {
        int index = getLastDeletedIndex(8);
        System.out.println("The last index deleted is " + index);
    }

    /**
     *
     * @param len 数组长度
     * @return 最后被删除的数的原始下标
     */
    public static int getLastDeletedIndex(int len) {
        // 如果数组长度不满足要求则返回 -1
        if (len <= 0) {
            return -1;
        }

        int[] arr = new int[len];
        // 初始化每个元素的值为当前下标
        for (int i = 0; i < len; i++) {
            arr[i] = len;
        }

        // 删除标志位
        final int DELFLAG = len + 1;

        // 记录数组当前有效长度（即未被置为删除标志的元素个数），最后变为 0
        int currentSize = len;

        // 步长
        final int STEP = 2;

        // 步长计数
        int count = 0;

        // 记录最后被删除的元素的下标
        int lastDelIndex = 0;

        // 循环下标
        int i = 0;

        while (currentSize != 0) {

            // 判读当前元素是否等于删除标志
            if (arr[i] != DELFLAG) {
                // 当步长计数满足步长则
                if (count++ == STEP) {
                    // 将元素置为删除标志位
                    arr[i] = DELFLAG;
                    // 记录该处下标
                    lastDelIndex = i;
                    // 有效数组长度减 1
                    currentSize--;
                    // 步长计数归零
                    count = 0;
                    System.out.println("Deleted index is " + i % len);
                }
            }
            // 下标取余实现循环下标
            i = (i + 1) % len;
        }
        return lastDelIndex;
    }
}

