package wangan;

import java.util.ArrayList;

public class Line {
	private ArrayList<Point> line = null;
	
	public void SetLine(ArrayList<Point> line){
		this.line = line;
	}
	
	public void AddPoint(Point point){
		line.add(point);
	}
	
	public ArrayList<Point> GetLine(){
		return line;
	}
}
