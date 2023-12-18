package com.seu;

import java.awt.*;
import javax.swing.*;


public class BallGame extends JFrame{

    //  创建窗口
    void launchFrame(){
        setSize(856, 501);  //  左上角为定位点
        setLocation(100, 100);
        setVisible(true);;

    }

    public static void main(String[] args) {
        System.out.println("我的游戏开始了！");

        BallGame game = new BallGame();
        game.launchFrame();
    }
}
