package edu.intropro.patterns.hw.flowchart;

public class ProcessShape implements FlowchartShape {

	private String innerText = "";
	
	public ProcessShape(String text) {
		innerText = text;
	}
	
	@Override
	public void draw() { 
		System.out.println("[ " + innerText + " ]");
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
