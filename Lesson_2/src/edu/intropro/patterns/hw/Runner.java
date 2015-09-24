package edu.intropro.patterns.hw;

import edu.intropro.patterns.hw.flowchart.*;

public class Runner {

	public static void main(String[] args) {
	
		FlowchartShape chart = new CompositeShape();
		
		FlowchartShape start = new TerminalShape("Start");
		start = new BorderDecorator(start);
//		start.draw();
		chart.add(start);
		
		FlowchartShape process = new ProcessShape("doWork()");
//		process.draw();
		chart.add(process);
		
		FlowchartShape condition = new DecisionShape("isWorkDone()");
//		condition.draw();
		chart.add(condition);
		
		FlowchartShape end = new TerminalShape("End");
		end = new BorderDecorator(end);
//		end.draw();
		chart.add(end);
		
		chart.remove(process);
		
		chart = new BorderDecorator(chart);
		chart.draw();
	}
}
