package edu.intropro.patterns.hw.flowchart;

public class BorderDecorator extends AbsrtactDecorator {

	public BorderDecorator(FlowchartShape flowchart) {
		super(flowchart); 
	}
	
	protected void showPreElements() {
		System.out.println();
		System.out.println("/--------\\");
	}
	
	protected void showPostElements() {
		System.out.println("\\--------/");
		System.out.println();
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
