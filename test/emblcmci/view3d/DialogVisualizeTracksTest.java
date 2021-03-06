package emblcmci.view3d;


import ij3d.Image3DUniverse;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import emblcmci.view3d.DialogVisualizeTracks.DoPlot;

public class DialogVisualizeTracksTest {

	private Image3DUniverse univ;
	private int timestart;
	private int timeend;
	private int rx;
	private int ry;
	private int rz;
	private Plot4d p4d;
	private ArrayList<TrajectoryObj> trajlist;
	private String datapath;

	@Before
	public void setUp() throws Exception {
		datapath = "/Users/miura/Dropbox/Mette/Tracks.csv";
	}
	
	//@Test
	public void dialog(){
		DialogVisualizeTracks dg = new DialogVisualizeTracks();
		dg.showDialog();
	}

	//@Test
	public void doPlotting(){
		DialogVisualizeTracks dg = new DialogVisualizeTracks();
		dg.datapath = "/Users/miura/Dropbox/Mette/Tracks.csv";
		//dg.flagDynamicColorCodedTracks = true;
		dg.flagNetDisplacement = true;
		dg.framestart = 0;
		dg.frameend = 23;
		DoPlot dp =  dg.new DoPlot(this.univ);
		dp.execute();
	}
	@Test
	public void testminmaxframe(){
		DialogVisualizeTracks dg = new DialogVisualizeTracks();
		dg.getMinMaxFrame(datapath);
	}
}
