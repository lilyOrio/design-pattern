package com.example.myapplication.behavior.chain_of_responsibility;

import android.content.Context;

/**
 * 接下来，我们需要定义具体的每个节点了。
 *
 * 校验用户是否是新用户：
 */
public class NewUserRuleHandler extends RuleHandler{
    @Override
    public void apply(Context context) {
        if (true/*context.isNewUser()*/ ) {
            // 如果有后继节点的话，传递下去
            if (this.getSuccessor() != null) {
                this.getSuccessor().apply(context);
            }
        } else {
            throw new RuntimeException("该活动仅限新用户参与");
        }
    }
}

//校验用户所在地区是否可以参与：
//
//public class LocationRuleHandler extends RuleHandler {
//    public void apply(Context context) {
//        boolean allowed = activityService.isSupportedLocation(context.getLocation);
//        if (allowed) {
//            if (this.getSuccessor() != null) {
//                this.getSuccessor().apply(context);
//            }
//        } else {
//            throw new RuntimeException("非常抱歉，您所在的地区无法参与本次活动");
//        }
//    }
//}

//校验奖品是否已领完：
//public class LimitRuleHandler extends RuleHandler {
//    public void apply(Context context) {
//        int remainedTimes = activityService.queryRemainedTimes(context); // 查询剩余奖品
//        if (remainedTimes > 0) {
//            if (this.getSuccessor() != null) {
//                this.getSuccessor().apply(userInfo);
//            }
//        } else {
//            throw new RuntimeException("您来得太晚了，奖品被领完了");
//        }
//    }
//}

//客户端：
//
//public static void main(String[] args) {
//    RuleHandler newUserHandler = new NewUserRuleHandler();
//    RuleHandler locationHandler = new LocationRuleHandler();
//    RuleHandler limitHandler = new LimitRuleHandler();
//
//    // 假设本次活动仅校验地区和奖品数量，不校验新老用户
//    locationHandler.setSuccessor(limitHandler);
//
//    locationHandler.apply(context);
//}
