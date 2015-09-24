package edu.intropro.patterns.hw.flowchart;

import java.util.List;
import java.util.ArrayList;

public class CompositeShape implements FlowchartShape {

	private List<FlowchartShape> shapes = new ArrayList<FlowchartShape>();
	
	public void add(FlowchartShape shape) {
		shapes.add(shape);
	}
	
	public void remove(FlowchartShape shape) {
		shapes.remove(shape);
	}
	
	@Override
	public void draw() {	
		for (FlowchartShape shape : shapes) {
			shape.draw();
		}
	}

}
