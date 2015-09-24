package edu.intropro.patterns.hw.flowchart;

public interface FlowchartShape {
	
	public void draw();

	public void add(FlowchartShape shape);
	public void remove(FlowchartShape shape);
}
