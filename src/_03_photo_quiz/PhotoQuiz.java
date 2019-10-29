package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)
		String s="https://www.epicpeople.org/wp-content/uploads/2019/01/rita-denny.png";
		// 2. create a variable of type "Component" that will hold your image
		Component y;
		// 3. use the "createImage()" method below to initialize your Component
		y=createImage(s);
		// 4. add the image to the quiz window
		quizWindow.add(y);
		// 5. call the pack() method on the quiz window
		quizWindow.pack();
		// 6. ask a question that relates to the image
		String a=JOptionPane.showInputDialog("DO YOU LIKE  THIS IMAGE????   yes or no.");
		// 7. print "CORRECT" if the user gave the right answer
		if (a.contentEquals("yes")) {
			JOptionPane.showMessageDialog(null, "Correct!");
		}
		// 8. print "INCORRECT" if the answer is wrong
		if (a.contentEquals("no")) {
			JOptionPane.showMessageDialog(null, "INCORRECT!");
		}
		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(y);
		// 10. find another image and create it (might take more than one line
		// of code)
		String z="https://img.izismile.com/img/img8/20150721/640/kids_are_really_just_little_crazy_people_640_26.jpg";
		Component yee;
		yee=createImage(z);
		// 11. add the second image to the quiz window
		quizWindow.add(yee);
		// 12. pack the quiz window
		quizWindow.pack();
		// 13. ask another question
		String x=JOptionPane.showInputDialog("On a scale from 1 to 10... how much do you suck?");
		// 14+ check answer, say if correct or incorrect, etc.
		
			JOptionPane.showMessageDialog(null, "YEET... now add 100 to that score!");
		}
	

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
