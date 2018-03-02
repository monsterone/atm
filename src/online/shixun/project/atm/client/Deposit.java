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
 * ATM 存款功能界面
 */
public class Deposit extends BaseFrame implements ActionListener {

    JTextField txtDepositAmount = new JTextField(25);

    JLabel labDepositAmount = new JLabel("请输入存款金额：");

    public Deposit() {
        super("存款");

        JPanel panel = new JPanel();
        panel.setLayout(null);

        labDepositAmount.setBounds(150, 140, 150, 30);
        labDepositAmount.setFont(labelFont);
        labDepositAmount.setForeground(labelColor);
        panel.add(labDepositAmount);

        txtDepositAmount.setBounds(270, 140, 120, 30);
        panel.add(txtDepositAmount);

        panel.add(super.renderReturnButton());
        panel.add(super.renderConfirmButton());

        setContentPane(panel);
        setLayout(this);
    }

    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);
        Object source = e.getSource();

        //确认存款
        if (source == btnConfirm) {
            //存款金额
            String depositAmount = txtDepositAmount.getText().trim();

            //TODO 编写存款业务代码
        }
    }

    public static void main(String[] args) {
        Deposit panel = new Deposit();
        panel.setLayout(panel);
    }
}
