package edu.intropro.patterns.hw.flowchart;

public class TerminalShape implements FlowchartShape {

	private String innerText = "";
	
	public TerminalShape(String text) {
		innerText = text;
	}
	
	@Override
	public void draw() { 
		System.out.println("( " + innerText + " )");
	}

	@Override
	public void add(FlowchartShape start) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(FlowchartShape start) {
		// TODO Auto-generated method stub
		
	}

}
