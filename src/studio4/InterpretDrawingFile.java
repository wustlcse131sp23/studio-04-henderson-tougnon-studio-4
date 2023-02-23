package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
	
		String shapeType = in.nextLine();
	
		String rectangle = null;
		String triangle = null;
		String ellipse = null;
		
		if (shapeType == rectangle)
		{
			int redComponent = in.nextInt();
			int greenComponent = in.nextInt();
			int blueComponent = in.nextInt();
			boolean isFilled = in.hasNext();
			double x = in.nextInt();
			double y = in.nextInt();
			double halfWidth = in.nextInt();
			double halfHeight = in.nextInt();
		}
		
		if (shapeType == triangle)
		{
			int redComponent = in.nextInt();
			int greenComponent = in.nextInt();
			int blueComponent = in.nextInt();
			boolean isFilled = in.hasNext();
			double x = in.nextInt();
			double y = in.nextInt();
			String type = in.next();
		}
		
		if (shapeType == ellipse)
		{
			int redComponent = in.nextInt();
			int greenComponent = in.nextInt();
			int blueComponent = in.nextInt();
			boolean isFilled = in.hasNext();
			double x = in.nextInt();
			double y = in.nextInt();
			double semiMinorAxis = in.nextInt();
			double semiMajorAxis = in.nextInt();
		}
		
		StdDraw.ellipse(.5, .5, .25, .5);
	
		
		
		
		
		
	}
	
}
