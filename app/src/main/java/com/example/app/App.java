package com.example.app;

import com.ui.component.MainFrame;
import static com.ui.component.MainFrame.createFrame;

import javax.swing.*;

public class App {
    private final String appTitle = "Sugoroku";

    public static void main(String[] args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Nimbus look and feel not found, using default look and feel instead.");
        }

        MainFrame mainFrame = createFrame(new App().appTitle);
        mainFrame.init();
    }
}
