package com.srm.day17.java;

import javax.swing.*;
import javax.swing.tree.*;

class JTreeDemo extends JFrame {
    JTree t;
    DefaultMutableTreeNode root, parent1, parent2, child,child1, child2;

    JTreeDemo() {
        super("JTree Demo");

        root = new DefaultMutableTreeNode("Progarmmer");
        parent1 = new DefaultMutableTreeNode("Senior");
        child = new DefaultMutableTreeNode("Developer");
        child1 = new DefaultMutableTreeNode("Tester");
        parent2 = new DefaultMutableTreeNode("Junior");
        child2 = new DefaultMutableTreeNode("Trainee");

        parent1.add(child);
        parent1.add(child1);
        parent2.add(child2);
        
        root.add(parent1);
        root.add(parent2);

        t = new JTree(root);

        getContentPane().add(new JScrollPane(t));
        setSize(300, 300);
        setVisible(true);
    }
}

class JTreeExample {
    public static void main(String args[]) throws Exception {
        UIManager
                .setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        new JTreeDemo();
        
    }
}
