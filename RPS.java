import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class RPS extends Applet implements ActionListener
{
    JLabel winner;
    JLabel question1;
    JLabel question;
    public void init ()
    {
	resize (300, 400);
	JLabel title = new JLabel ("Rock Paper Scissors");
	Font myFont = new Font ("Serif", Font.BOLD, 24);
	title.setFont (myFont);
	add (title);

	JLabel subtitle = new JLabel ("First, choose your weapon. ");
	subtitle.setForeground (new Color (243, 140, 116));
	add (subtitle);

	JLabel subtitle1 = new JLabel ("Click \"computer\" to see the computer's choice.");
	subtitle1.setForeground (new Color (243, 140, 116));
	add (subtitle1);
	
	JLabel subtitle2 = new JLabel ("Select \"Winner\" to see the winner.");
	subtitle2.setForeground (new Color (243, 140, 116));
	add (subtitle2);

	JLabel blank = new JLabel ("");
	add (blank);

	JLabel option = new JLabel ("Your Choice:       Computer Choice:");
	add (option);

	question = new JLabel (createImageIcon ("Untitled.jpg"));
	question1 = new JLabel (createImageIcon ("Untitled.jpg"));
	add (question);
	add (question1);

	JButton rock = new JButton ("Rock");
	rock.setBackground (new Color (26, 188, 156));
	rock.setForeground (new Color (255, 255, 255));
	rock.setPreferredSize (new Dimension (100, 30));
	rock.setActionCommand ("1");
	rock.addActionListener (this);
	add (rock);

	JButton comp = new JButton ("Computer");
	comp.setBackground (new Color (26, 188, 156));
	comp.setForeground (new Color (255, 255, 255));
	comp.setPreferredSize (new Dimension (100, 30));
	comp.setActionCommand ("2");
	comp.addActionListener (this);
	add (comp);

	JButton paper = new JButton ("Paper");
	paper.setBackground (new Color (26, 188, 156));
	paper.setForeground (new Color (255, 255, 255));
	paper.setPreferredSize (new Dimension (100, 30));
	paper.setActionCommand ("3");
	paper.addActionListener (this);
	add (paper);

	JButton win = new JButton ("Winner");
	win.setBackground (new Color (236, 66, 26));
	win.setForeground (new Color (255, 255, 255));
	win.setPreferredSize (new Dimension (100, 30));
	win.setActionCommand ("4");
	win.addActionListener (this);
	add (win);

	JButton scissors = new JButton ("Scissors");
	scissors.setBackground (new Color (26, 188, 156));
	scissors.setForeground (new Color (255, 255, 255));
	scissors.setPreferredSize (new Dimension (100, 30));
	scissors.setActionCommand ("5");
	scissors.addActionListener (this);
	add (scissors);

	winner = new JLabel ("  The winner is .....");
	add (winner);


    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("1"))
	{
	    question.setIcon (createImageIcon ("rock.jpg"));

	}
	else if (e.getActionCommand ().equals ("3"))
	{
	    question.setIcon (createImageIcon ("paper.jpg"));
	}
	else if (e.getActionCommand ().equals ("5"))
	{
	    question.setIcon (createImageIcon ("scissors.jpg"));
	}
	else if (e.getActionCommand ().equals ("2"))
	{
	    int n2 = (int) (Math.random () * 4);
	    if (n2 == 1)
		question1.setIcon (createImageIcon ("rock.jpg"));
	    else if (n2 == 2)
		question1.setIcon (createImageIcon ("paper.jpg"));
	    else
		question1.setIcon (createImageIcon ("scissors.jpg"));
	}

    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = RPS.class.getResource (path);
	if (imgURL != null)
	    return new ImageIcon (imgURL);
	else
	    return null;
    }
}


