package springbootmvc.domain;

import springbootmvc.constant.NeuronConstant;
import springbootmvc.util.NeuronUtil;

public class NeuronLink extends BaseDomainBean {

	private long inId;

	private long outId;

	private double intensity;

	private byte time;

	private byte threshold;

	public long getInId() {
		return inId;
	}

	public void setInId(long inId) {
		this.inId = inId;
	}

	public long getOutId() {
		return outId;
	}

	public void setOutId(long outId) {
		this.outId = outId;
	}

	public double getIntensity() {
		return intensity;
	}

	public void setIntensity(double intensity) {
		this.intensity = intensity;
	}

	public byte getTime() {
		return time;
	}

	public void setTime(byte time) {
		this.time = time;
	}

	public byte getThreshold() {
		return threshold;
	}

	public void setThreshold(byte threshold) {
		this.threshold = threshold;
	}

}