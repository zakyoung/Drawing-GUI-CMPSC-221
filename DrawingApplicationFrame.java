/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
/**
 *
 * @author acv
 */
public class DrawingApplicationFrame extends JFrame
{
  private JPanel outerHeaderPanel;
  private JPanel upperInnerPanel;
  private JPanel lowerInnerPanel;
  private JComboBox<String> shapePickingBox;
  private JButton colorPicker1;
  private JButton colorPicker2;
  private JButton undo;
  private JButton clear;
  private JCheckBox filled;
  private JCheckBox useGradient;
  private JCheckBox dashed;
  private JSpinner strokeWidth;
  private JSpinner strokeDashLength;
  private JLabel status;
  private static final String[] shapes = {"Rectangle","Line","Oval"};

    // Create the panels for the top of the application. One panel for each
    // line and one to contain both of those panels.

    // create the widgets for the firstLine Panel.

    //create the widgets for the secondLine Panel.

    // Variables for drawPanel.

    // add status label
  
    // Constructor for DrawingApplicationFrame
    public DrawingApplicationFrame()
    {
        super("Java 2D Drawings");
        outerHeaderPanel = new JPanel();
        outerHeaderPanel.setBackground(Color.blue);
        upperInnerPanel = new JPanel();
        upperInnerPanel.setLayout(new FlowLayout());
        
    
        lowerInnerPanel = new JPanel();
        lowerInnerPanel.setLayout(new FlowLayout());

        // add widgets to panels
        
        // firstLine widgets
        shapePickingBox = new JComboBox<String>(shapes);
        shapePickingBox.setMaximumRowCount(3);
        colorPicker1 = new JButton("1st Color");
        colorPicker2 = new JButton("2nd Color");
        undo = new JButton("Undo");
        clear = new JButton("Clear");
        upperInnerPanel.add(shapePickingBox);
        upperInnerPanel.add(colorPicker1);
        upperInnerPanel.add(colorPicker2);
        upperInnerPanel.add(undo);
        upperInnerPanel.add(clear);
        
        // secondLine widgets
        filled = new JCheckBox("Filled");
        useGradient = new JCheckBox("Use Gradient");
        dashed = new JCheckBox("Dashed");
        strokeWidth = new JSpinner();
        strokeDashLength = new JSpinner();
        lowerInnerPanel.add(filled);
        lowerInnerPanel.add(useGradient);
        lowerInnerPanel.add(dashed);
        lowerInnerPanel.add(strokeWidth);
        lowerInnerPanel.add(strokeDashLength);

        // add top panel of two panels  
        outerHeaderPanel.add(upperInnerPanel);
        outerHeaderPanel.add(lowerInnerPanel);
        super.add(outerHeaderPanel);

        // add topPanel to North, drawPanel to Center, and statusLabel to South
        
        //add listeners and event handlers
    }

    // Create event handlers, if needed

    // Create a private inner class for the DrawPanel.
    private class DrawPanel extends JPanel
    {

        public DrawPanel()
        {
        }

        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;

            //loop through and draw each shape in the shapes arraylist

        }


        private class MouseHandler extends MouseAdapter implements MouseMotionListener
        {

            public void mousePressed(MouseEvent event)
            {
            }

            public void mouseReleased(MouseEvent event)
            {
            }

            @Override
            public void mouseDragged(MouseEvent event)
            {
            }

            @Override
            public void mouseMoved(MouseEvent event)
            {
            }
        }

    }
  public static void main(String[] args){
    DrawingApplicationFrame mygui = new DrawingApplicationFrame();
    mygui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mygui.setSize(500,300);    
    mygui.setVisible(true);  
  }
}
