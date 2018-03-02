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
 * ATM 转账功能界面
 */
public class Transfer extends BaseFrame implements ActionListener {

    JTextField txtTargetAccountName = new JTextField(30);

    JTextField txtTransferAmount = new JTextField(30);

    JLabel labTargetAccountName = new JLabel("请输入转入账户名称：");

    JLabel labTransferAmount = new JLabel("请输入转账金额：");

    public Transfer() {
        super("ATM 转账");

        JPanel panel = new JPanel();
        panel.setLayout(null);

        panel.add(txtTargetAccountName);
        panel.add(txtTransferAmount);
        panel.add(labTargetAccountName);
        panel.add(labTransferAmount);

        labTargetAccountName.setBounds(110, 140, 160, 30);
        labTargetAccountName.setFont(labelFont);
        labTargetAccountName.setForeground(labelColor);

        txtTargetAccountName.setBounds(270, 140, 120, 30);

        labTransferAmount.setBounds(140, 180, 150, 30);
        labTransferAmount.setFont(labelFont);
        labTransferAmount.setForeground(labelColor);

        txtTransferAmount.setBounds(270, 180, 120, 30);

        panel.add(super.renderReturnButton());
        panel.add(super.renderConfirmButton());

        setContentPane(panel);
        setLayout(this);
    }

    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);

        Object source = e.getSource();
        //确认转账
        if (source == btnConfirm) {
            //转入账户名称
            String accountName = txtTargetAccountName.getText().trim();
            //转账金额
            String transferAmount = txtTransferAmount.getText().trim();

            //TODO 编写转账业务代码
        }

    }

    public static void main(String[] args) {
        Transfer panel = new Transfer();
        panel.setLayout(panel);

    }
}
