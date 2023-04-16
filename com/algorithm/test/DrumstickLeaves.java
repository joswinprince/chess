package com.algorithm.test;


public class DrumstickLeaves  {
	static final int stem=1;
	public int stembranch;
	
	public void DrumStickLeavesDetail ()
	{
	System.out.println(stem);
	System.out.println(stembranch);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrumstickLeaves dl = new DrumstickLeaves();
		dl.stembranch = 10;
		dl.DrumStickLeavesDetail();
		DrumStickBranchLeaves dbl = new DrumStickBranchLeaves();
		dbl.sideLeavesset =4;
		dbl.DrumStickBranchLeavesDetail();
		
			}

}
