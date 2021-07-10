package com.srm.day17.java;

import javax.swing.*;    
import java.awt.event.*;  

public class MenuDrivenEx implements ActionListener{ 
	
JFrame f;    
JMenuBar mb;    
JMenu file,edit,help;  

JMenuItem New,Open,Save,Properties,Exit,Cut,Copy,Paste,Delete,SelectAll,HelpContents,Search,TipoftheDay,CheckforUpdates,ShowContextualHelp  ;    
JTextArea ta; 

MenuDrivenEx (){    
f=new JFrame(); 

New=new JMenuItem("New");
Open=new JMenuItem("Open");
Save=new JMenuItem("Save");
Properties=new JMenuItem("Properties");
Exit=new JMenuItem("Exit");

Cut=new JMenuItem("Cut");    
Copy=new JMenuItem("Copy");    
Paste=new JMenuItem("Paste");
Delete=new JMenuItem("Delete");
SelectAll=new JMenuItem("Select All");    

HelpContents=new JMenuItem("Help Contents");
Search=new JMenuItem("Search");
TipoftheDay=new JMenuItem("Tip of the Day");
CheckforUpdates=new JMenuItem("CheckforUpdates");
ShowContextualHelp=new JMenuItem("Show Contextual Help");

New.addActionListener(this); 
Open.addActionListener(this); 
Save.addActionListener(this); 
Properties.addActionListener(this); 
Exit.addActionListener(this); 

Cut.addActionListener(this);    
Copy.addActionListener(this);    
Paste.addActionListener(this);    
SelectAll.addActionListener(this); 

HelpContents.addActionListener(this); 
Search.addActionListener(this); 
TipoftheDay.addActionListener(this); 
CheckforUpdates.addActionListener(this); 
ShowContextualHelp.addActionListener(this); 

mb=new JMenuBar();    
file=new JMenu("File");    
edit=new JMenu("Edit");    
help=new JMenu("Help");     

file.add(New);file.add(Open);file.add(Save);file.add(Properties);file.add(Exit);
edit.add(Cut);edit.add(Copy);edit.add(Paste);edit.add(Delete);edit.add(SelectAll);
help.add(HelpContents);help.add(Search);help.add(TipoftheDay);help.add(CheckforUpdates);help.add(ShowContextualHelp);

mb.add(file);mb.add(edit);mb.add(help); 

ta=new JTextArea();    
ta.setBounds(5,5,360,320); 

f.add(mb);f.add(ta);    
f.setJMenuBar(mb);  

f.setLayout(null);    
f.setSize(400,400);    
f.setVisible(true);    
}     

public void actionPerformed(ActionEvent e) {  
	 
if(e.getSource()==Cut)    
ta.cut();    
if(e.getSource()==Paste)    
ta.paste();    
if(e.getSource()==Copy)    
ta.copy();    
if(e.getSource()==SelectAll)    
ta.selectAll();    

}     

public static void main(String[] args) {    
    new MenuDrivenEx ();  
    
}    
}    
