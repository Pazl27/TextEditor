package org.example.actions.fileActions;


import org.example.gui.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileWriter;

public class SaveFileAsAction extends AbstractAction {

    private final MainFrame mainFrame;

    public SaveFileAsAction(MainFrame mainFrame) {
        super("Save As");
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        FileDialog fileDialog = new FileDialog(mainFrame.getWindow(), "Save", FileDialog.SAVE);
        fileDialog.setVisible(true);

        if(fileDialog.getFile() != null){
            mainFrame.setFileName(fileDialog.getFile());
            mainFrame.setFilePath(fileDialog.getDirectory());
            mainFrame.getWindow().setTitle(mainFrame.getFileName() + " - Editor");
        }

        try{
            FileWriter fw = new FileWriter(mainFrame.getFilePath() + mainFrame.getFileName());
            fw.write(mainFrame.getTextArea().getText());
            fw.close();
        }
        catch (Exception ex){
            System.out.println("File not found");
        }
    }
}
