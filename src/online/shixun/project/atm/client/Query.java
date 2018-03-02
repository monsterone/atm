/********************************************
 * Copyright (c) 2017, www.qingshixun.com
 *
 * All rights reserved
 *
*********************************************/
package online.shixun.project.atm.client;

import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * ATM 查询功能界面
 */
public class Query extends BaseFrame implements ActionListener {

    JLabel labBalance = new JLabel();

    public Query() {
        super("查询余额");

        JPanel panel = new JPanel();
        panel.setLayout(null);

        labBalance.setBounds(180, 140, 150, 30);
        labBalance.setFont(labelFont);
        labBalance.setForeground(labelColor);

        //设置账户余额
        //labBalance.setText("当前余额：" + getAccountBalance());

        panel.add(labBalance);

        panel.add(super.renderReturnButton());

        setContentPane(panel);
        setLayout(this);
    }

    public static void main(String[] args) {
        Query panel = new Query();
        panel.setLayout(panel);
    }
}
