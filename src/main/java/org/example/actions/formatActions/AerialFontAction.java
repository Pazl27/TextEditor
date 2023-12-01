package org.example.actions.formatActions;


import org.example.gui.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AerialFontAction extends AbstractAction {

    private final MainFrame mainFrame;

    public AerialFontAction(MainFrame mainFrame) {
        super("Aerial");
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mainFrame.getTextArea().setFont(new Font("Aerial", Font.PLAIN, mainFrame.getFontSize()));
    }
}
