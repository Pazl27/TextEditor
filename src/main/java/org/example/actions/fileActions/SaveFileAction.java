package org.example.actions.fileActions;

import org.example.gui.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.FileWriter;

public class SaveFileAction extends AbstractAction {

    private final MainFrame mainFrame;

    public SaveFileAction(MainFrame mainFrame) {
        super("Save");
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (mainFrame.getFilePath() == null) {
            SaveFileAsAction saveFileAsAction = new SaveFileAsAction(mainFrame);
            saveFileAsAction.actionPerformed(e);
            return;
        }
        try{
            FileWriter fw = new FileWriter(mainFrame.getFilePath() + mainFrame.getFileName());
            fw.write(mainFrame.getTextArea().getText());
            fw.close();
        }
        catch (Exception ex){
            System.out.println(ex);
        }

    }
}
