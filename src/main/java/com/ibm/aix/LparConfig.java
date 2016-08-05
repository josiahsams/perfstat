package com.ibm.aix;

/**
 * Created by joe on 8/4/16.
 */
public class LparConfig {
    private String hostname;
    private String processorFamily;
    private String OSBuild;
    private long drives;
    private int lcpus;

    private native void getConfig();

    public static LparConfig getLparConfig() {
	LparConfig l = new LparConfig();
	try {
		l.getConfig();
	} catch (Exception e) { 
		System.err.println(e);
		// Return Empty Object
		return (new LparConfig());
	}
	return l;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getProcessorFamily() {
        return processorFamily;
    }

    public void setProcessorFamily(String processorFamily) {
        this.processorFamily = processorFamily;
    }

    public String getOSBuild() {
        return OSBuild;
    }

    public void setOSBuild(String OSBuild) {
        this.OSBuild = OSBuild;
    }

    public long getDrives() {
        return drives;
    }

    public void setDrives(long drives) {
        this.drives = drives;
    }

    public int getLcpus() {
        return lcpus;
    }

    public void setLcpus(int lcpus) {
        this.lcpus = lcpus;
    }


}

