/********************************************
 * Copyright (c) 2017, www.qingshixun.com
 *
 * All rights reserved
 *
*********************************************/
package online.shixun.project.atm.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * ATM 取款功能界面
 */
public class Withdraw extends BaseFrame implements ActionListener {

    JTextField txtWithdrawAmount = new JTextField(25);

    JLabel labWithdrawAmount = new JLabel("请输入取款金额：");

    public Withdraw() {
        super("取款");

        JPanel panel = new JPanel();
        panel.setLayout(null);

        labWithdrawAmount.setBounds(150, 140, 150, 30);
        labWithdrawAmount.setFont(labelFont);
        labWithdrawAmount.setForeground(labelColor);
        panel.add(labWithdrawAmount);

        txtWithdrawAmount.setBounds(270, 140, 120, 30);
        panel.add(txtWithdrawAmount);

        panel.add(super.renderReturnButton());
        panel.add(super.renderConfirmButton());

        setContentPane(panel);
        setLayout(this);
    }

    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        Object source = e.getSource();

        //确认取款
        if (source == btnConfirm) {
            //取款金额
            String withdrawAmount = txtWithdrawAmount.getText().trim();

            //TODO 编写取款业务代码
        }
    }

    public static void main(String[] args) {
        Withdraw panel = new Withdraw();
        panel.setLayout(panel);
    }
}
