package com.lzhy.demomvc;/**
 * Created by shin on 2017/11/19.
 */

/**
 * @Title:
 * @Prject:
 * @Package:
 * @Description:
 * @author:
 * @date:
 * @version: V1.0
 */
public class Test {
    public static void main(String[] args){
        TestRedis tr = new TestRedis();
        tr.setup();
        tr.testString();
       // tr.testMap();
       // tr.testList();
        //tr.testSet();
        try {
           // tr.test();
        }catch (Exception e){
            e.printStackTrace();
        }
        //tr.testRedisPool();
    }
}
