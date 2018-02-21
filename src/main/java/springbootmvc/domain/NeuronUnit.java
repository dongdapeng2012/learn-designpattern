package springbootmvc.domain;

import java.util.Random;

import springbootmvc.constant.NeuronConstant;

public class NeuronUnit extends BaseDomainBean {

	private byte threshold;

	public byte getThreshold() {
		return threshold;
	}

	public void setThreshold(byte threshold) {
		this.threshold = threshold;
	}
}