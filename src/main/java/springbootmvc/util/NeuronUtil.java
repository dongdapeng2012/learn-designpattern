package springbootmvc.util;

import org.springframework.stereotype.Service;

import springbootmvc.constant.MathUtilException;
import springbootmvc.constant.NeuronConstant;
import springbootmvc.domain.NeuronUnit;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Service("NeuronUtil")
public class NeuronUtil {

	/*
	 * return sum of impulses w = weight, x = impulses, t =, tao = time delay,
	 * thr = threshold
	 */
	public double sumImpuls(double[] w, double[] x, double tao[], double t, double thr[]) throws MathUtilException {
		return MathSimpleUtil.sum(MathSimpleUtil.calc(MathSimpleUtil.calc(MathSimpleUtil.calc(w, "*", x), "*", MathSimpleUtil.calc(t, "-", tao)), "-", thr));
	}
	
	public static long getRandomId(long maxNeuron) {
		return (long) (NeuronConstant.maxNeuron * (new Random().nextDouble()));
	}
	
	public static long getRandomIntensity(long maxNeuron) {
		return (long) (NeuronConstant.maxNeuron * (new Random().nextDouble()));
	}
	
	public Set<NeuronUnit> initNeuronMap(){
		return null;
		
	}
}