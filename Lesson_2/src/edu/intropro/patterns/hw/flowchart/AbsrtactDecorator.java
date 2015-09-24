package edu.intropro.patterns.hw.flowchart;

public abstract class AbsrtactDecorator implements FlowchartShape {
	
	protected FlowchartShape flowchart;
	
	public AbsrtactDecorator(FlowchartShape flowchart) {
		this.flowchart = flowchart;
	}
	
	@Override
	public void draw() {
		showPreElements();
		flowchart.draw();
		showPostElements();
	}

	protected void showPreElements() {};
	protected void showPostElements() {};
}
