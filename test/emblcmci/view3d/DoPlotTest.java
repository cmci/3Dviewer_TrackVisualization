package emblcmci.view3d;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DoPlotTest {

	//@Before
	public void setUp() throws Exception {
	
	}

	//@Test
	public void testDone() {
		fail("Not yet implemented");
	}

	@Test
	public void testDoPlot() {
		VisTrack vt = new VisTrack();
		String path = "/Users/miura/Dropbox/ToDo/Pavel/dataconverted.csv";		
		DoPlot dp = new DoPlot(vt, path);
		dp.execute();
	}

	//@Test
	public void testDoInBackground() {
		fail("Not yet implemented");
	}

}
