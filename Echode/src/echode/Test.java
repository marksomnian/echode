package echode;

import java.io.PrintStream;
import java.io.PrintWriter;


public class Test implements Program {

	@Override
	
	public String help() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RespondsTo(command = "test")
	public void run(PrintStream o) {
		o.println("Hehlo!");

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

}
