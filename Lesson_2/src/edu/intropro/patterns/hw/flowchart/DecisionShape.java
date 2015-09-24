package edu.intropro.patterns.hw.flowchart;

public class DecisionShape implements FlowchartShape {
	
	private String innerText;
	
	public DecisionShape(String text) {
		innerText = text;
	}
	
	public void draw() {
		AdapterCoolFeatures adapter = new AdapterCoolFeatures();		
		adapter.doFine();
		System.out.println("< " + innerText + " >");
		adapter.doFine();
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
