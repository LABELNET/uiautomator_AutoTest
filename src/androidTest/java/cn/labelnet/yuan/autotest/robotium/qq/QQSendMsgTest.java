package cn.labelnet.yuan.autotest.robotium.qq;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;

/**
 * Created by yuan on 16-3-23.
 * Robotium 进行没有源码的测试
 */
public class QQSendMsgTest extends ActivityInstrumentationTestCase2<Activity>{

    private static final String QQ_TITLE="QQ";

    private Solo solo;
    public QQSendMsgTest() {
        super(Activity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        solo=new Solo(getInstrumentation(),getActivity());
    }


    /**
     * 基本流程
     *   主界面
     * 找有没有QQ 文字，没有，滑动 继续寻找
     * 找到打开，找不到，提示没找到
     * 打开QQ : 1.消息页面 item 第一个点击
     *        2.好友页面
     *
     *  1.消息页面 - 当前页面 （qq开头的，群助手，群通知，腾讯开头的，新朋友， 的不需要获取，但需要计数）
     *    打开 item ， 输入 hi , hi , hi  , 发送
     *    返回
     *    下一个 item ， 循环 进行 ;
     *
     *    消息页面 - 下一个页面
     *    向下滑动 上面 item数
     *    再次调用
     *
     *
     *  2.好友页面
     *    获得分组
     */


    public void testQQ(){


    }

    private void testOpenQQ(){
       solo.goBack();
       boolean isQQ=solo.isTextChecked(QQ_TITLE);
       if(isQQ){
           //打开QQ
       }else{
           //滑动
       }

    }


    /**
     * 测试消息页面
     */
    private void testNotifiy(){


    }

    /**
     * 测试联系人页面
     */
    private void testContants(){

    }

    /**
     * 测试发送消息
     */
    private void testSendMsg(){

    }


    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        solo.finishOpenedActivities();
    }
}
