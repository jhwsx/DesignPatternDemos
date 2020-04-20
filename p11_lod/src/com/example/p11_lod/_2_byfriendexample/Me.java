package com.example.p11_lod._2_byfriendexample;


/**
 * @author wangzhichao
 * @date 2019/10/26
 */
public class Me {
    public void talkto(Friend friend) {
        System.out.println("我和" + friend.getName() + "说话");
    }

    public void talktoStrangerByFriend(Friend friend) {
        Stranger stranger = friend.getStranger();
        System.out.println("我通过" + friend.getName() + ",和" + stranger.getName() + "说话");
    }
}

/**
 * 总结：
 * 1，在这里，Me 和两个类的对象有耦合关系（即 Friend 和 Stranger），所以 Me 有两个朋友；
 * 在这两个朋友中，Friend 是直接朋友，因为直接朋友的判断依据是：它出现在成员变量，方法的输入输出参数中；
 * 那么 Stranger 不符合直接朋友的判断依据，但是 Me 也和 Stranger 产生了依赖关系，也就是说跟它说话，这
 * 违反了迪米特法则。
 */
