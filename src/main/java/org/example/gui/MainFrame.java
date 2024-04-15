package org.example.gui;

import org.example.actions.fileActions.*;
import org.example.actions.formatActions.AerialFontAction;
import org.example.actions.formatActions.CSMSFontAction;
import org.example.actions.formatActions.TNRFontAction;
import org.example.actions.formatActions.WordWrapAction;
import org.example.actions.helpActions.HelpAction;

import javax.swing.*;
import java.awt.*;

public class MainFrame {

  private JFrame window;

  // Text area components
  private JTextArea textArea;
  private JScrollPane scrollPane;
  private JMenuBar menuBar;
  private JMenu fileMenu, editMenu, formatMenu, colorMenu, helpMenu;

  // File menu components
  private JMenuItem newFile, openFile, saveFile, saveAsFile, exitFile;

  // Edit menu components

  // Format menu components
  private JMenuItem wordWrap, fontAerial, fontCSMS, fontTNR, fontSize8, fontSize12, fontSize16, fontSize20, fontSize24,
      fontSize28;
  private JMenu fontMenu, fontSizeMenu;

  // Color menu components
  private JMenuItem darkMode;

  // Help menu components
  private JMenuItem help;

  private String fileName, filePath;
  private Integer fontSize;

  public MainFrame() {
    this.fontSize = 12;
    this.fileName = null;
    this.filePath = null;
    init();
    textAreaInit();
    menuBarInit();
    fileMenuInit();
    editMenuInit();
    formatMenuInit();
    colorMenuInit();
    helpMenuInit();
    this.window.setVisible(true);
  }

  private void init() {
    window = new JFrame("Untitled - Editor");
    window.setSize(800, 600);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  }

  private void textAreaInit() {
    textArea = new JTextArea();
    textArea.setLineWrap(false);
    textArea.setWrapStyleWord(false);

    scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    scrollPane.setBorder(BorderFactory.createEmptyBorder());
    window.add(scrollPane);
  }

  private void menuBarInit() {
    menuBar = new JMenuBar();
    window.setJMenuBar(menuBar);
    fileMenu = new JMenu("File");
    editMenu = new JMenu("Edit");
    formatMenu = new JMenu("Format");
    colorMenu = new JMenu("Color");
    helpMenu = new JMenu("Help");
    menuBar.add(fileMenu);
    menuBar.add(editMenu);
    menuBar.add(formatMenu);
    menuBar.add(colorMenu);
    menuBar.add(helpMenu);
  }

  private void fileMenuInit() {
    newFile = new JMenuItem(new NewFileAction(this));
    openFile = new JMenuItem(new OpenFileAction(this));
    saveFile = new JMenuItem(new SaveFileAction(this));
    saveAsFile = new JMenuItem(new SaveFileAsAction(this));
    exitFile = new JMenuItem(new ExitAction());
    fileMenu.add(newFile);
    fileMenu.add(openFile);
    fileMenu.add(saveFile);
    fileMenu.add(saveAsFile);
    fileMenu.add(exitFile);
  }

  private void editMenuInit() {
    // TODO
  }

  private void formatMenuInit() {
    wordWrap = new JMenuItem(new WordWrapAction(this));
    formatMenu.add(wordWrap);
    fontMenu = new JMenu("Font");
    fontSizeMenu = new JMenu("Font Size");
    formatMenu.add(fontMenu);
    formatMenu.add(fontSizeMenu);

    fontAerial = new JMenuItem(new AerialFontAction(this));
    fontCSMS = new JMenuItem(new CSMSFontAction(this));
    fontTNR = new JMenuItem(new TNRFontAction(this));
    fontMenu.add(fontAerial);
    fontMenu.add(fontCSMS);
    fontMenu.add(fontTNR);

    fontSize8 = new JMenuItem("8");
    fontSize8.addActionListener(e -> {
      textArea.setFont(textArea.getFont().deriveFont(8f));
      fontSize = 8;
    });
    fontSize12 = new JMenuItem("12");
    fontSize12.addActionListener(e -> {
      textArea.setFont(textArea.getFont().deriveFont(12f));
      fontSize = 12;
    });
    fontSize16 = new JMenuItem("16");
    fontSize16.addActionListener(e -> {
      textArea.setFont(textArea.getFont().deriveFont(16f));
      fontSize = 16;
    });
    fontSize20 = new JMenuItem("20");
    fontSize20.addActionListener(e -> {
      textArea.setFont(textArea.getFont().deriveFont(20f));
      fontSize = 20;
    });
    fontSize24 = new JMenuItem("24");
    fontSize24.addActionListener(e -> {
      textArea.setFont(textArea.getFont().deriveFont(24f));
      fontSize = 24;
    });
    fontSize28 = new JMenuItem("28");
    fontSize28.addActionListener(e -> {
      textArea.setFont(textArea.getFont().deriveFont(28f));
      fontSize = 28;
    });
    fontSizeMenu.add(fontSize8);
    fontSizeMenu.add(fontSize12);
    fontSizeMenu.add(fontSize16);
    fontSizeMenu.add(fontSize20);
    fontSizeMenu.add(fontSize24);
    fontSizeMenu.add(fontSize28);
  }

  private void colorMenuInit() {
    darkMode = new JMenuItem("Dark Mode: OFF");
    darkMode.addActionListener(e -> {
      if (darkMode.getText().equals("Dark Mode: OFF")) {
        textArea.setBackground(Color.decode("#191a19"));
        textArea.setForeground(Color.WHITE);
        darkMode.setText("Dark Mode: ON");
        return;
      }
      textArea.setBackground(Color.WHITE);
      textArea.setForeground(Color.BLACK);
      darkMode.setText("Dark Mode: OFF");
    });
    colorMenu.add(darkMode);
  }

  private void helpMenuInit() {
    help = new JMenuItem(new HelpAction());
    helpMenu.add(help);
  }

  public JFrame getWindow() {
    return window;
  }

  public JTextArea getTextArea() {
    return textArea;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public String getFileName() {
    return fileName;
  }

  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }

  public String getFilePath() {
    return filePath;
  }

  public JMenuItem getWordWrap() {
    return wordWrap;
  }

  public Integer getFontSize() {
    return fontSize;
  }
}
