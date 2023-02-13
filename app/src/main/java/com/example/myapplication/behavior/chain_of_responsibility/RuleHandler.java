package com.example.myapplication.behavior.chain_of_responsibility;

import android.content.Context;

/**
 * 责任链模式
 * 责任链通常需要先建立一个单向链表，然后调用方只需要调用头部节点就可以了，后面会自动流转下去。
 * 比如流程审批就是一个很好的例子，只要终端用户提交申请，根据申请的内容信息，自动建立一条责任链，
 * 然后就可以开始流转了。
 *
 * 有这么一个场景，用户参加一个活动可以领取奖品，但是活动需要进行很多的规则校验然后才能放行，
 * 比如首先需要校验用户是否是新用户、今日参与人数是否有限额、全场参与人数是否有限额等等。
 * 设定的规则都通过后，才能让用户领走奖品。
 *
 * 如果产品给你这个需求的话，我想大部分人一开始肯定想的就是，用一个 List 来存放所有的规则，
 * 然后 foreach 执行一下每个规则就好了。不过，读者也先别急，看看责任链模式和我们说的这个有什么不一样？
 *
 * 首先，我们要定义流程上节点的基类：
 */
public abstract class RuleHandler {
    //后继节点
    protected RuleHandler successor;

    public abstract void apply(Context context);

    public void setSuccessor(RuleHandler successor) {
        this.successor = successor;
    }

    public RuleHandler getSuccessor() {
        return successor;
    }
}
