package org.example.actions.formatActions;

import org.example.gui.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class CSMSFontAction extends AbstractAction {

    private final MainFrame mainFrame;

    public CSMSFontAction(MainFrame mainFrame) {
        super("Comic Sans MS");
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mainFrame.getTextArea().setFont(new Font("Comic Sans MS ", Font.PLAIN, mainFrame.getFontSize()));
    }
}