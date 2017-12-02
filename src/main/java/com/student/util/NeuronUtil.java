package com.student.util;

import org.springframework.stereotype.Service;

import com.student.constant.MathUtilException;

@Service("NeuronUtil")
public class NeuronUtil {

	/*
	 * return sum of impulses w = weight, x = impulses, t =, tao = time delay,
	 * thr = threshold
	 */
	public double sumImpuls(double[] w, double[] x, double tao[], double t, double thr[]) throws MathUtilException {
		return MathSimpleUtil.sum(MathSimpleUtil.calc(MathSimpleUtil.calc(MathSimpleUtil.calc(w, "*", x), "*", MathSimpleUtil.calc(t, "-", tao)), "-", thr));
	}
}