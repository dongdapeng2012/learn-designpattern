package springbootmvc.util;

import org.springframework.stereotype.Service;

import springbootmvc.constant.MathUtilException;
import springbootmvc.constant.MathUtilExceptionEnum;

@Service("MathSimpleUtil")
public class MathSimpleUtil {
	/*
	 * x as double[]
	 */
	public static double sum(double[] x) throws MathUtilException {
		if (x == null || x.length == 0) {
			throw new MathUtilException(MathUtilExceptionEnum.IS_EMPTY);
		} else {
			double sum = 0;
			for (double xi : x) {
				sum += xi;
			}
			return sum;
		}
	}

	/*
	 * return x[] - y[]
	 */
	public static double[] calc(double[] x, String c, double[] y) throws MathUtilException {
		if (x == null || y == null || x.length == 0 || y.length == 0) {
			throw new MathUtilException(MathUtilExceptionEnum.IS_EMPTY);
		} else if (x.length != y.length) {
			throw new MathUtilException(MathUtilExceptionEnum.VECTOR_LENGTH_NOT_EQUAL);
		} else {
			int imax = x.length;
			double[] z = new double[imax];
			if (c.equals("+")) {
				for (int i = 0; i < imax; i++) {
					z[i] = x[i] + y[i];
				}
			} else if (c.equals("-")) {
				for (int i = 0; i < imax; i++) {
					z[i] = x[i] - y[i];
				}
			} else if (c.equals("*")) {
				for (int i = 0; i < imax; i++) {
					z[i] = x[i] * y[i];
				}
			}
			return z;
		}
	}

	/*
	 * return x - y[]
	 */
	public static double[] calc(double x, String c, double[] y) throws MathUtilException {
		int imax = y.length;
		double[] xArr = new double[imax];
		for (int i = 0; i < imax; i++) {
			xArr[i] = x;
		}
		return calc(xArr, c, y);
	}

	/*
	 * return x[] - y
	 */
	public static double[] calc(double[] x, String c, double y) throws MathUtilException {
		int imax = x.length;
		double[] yArr = new double[imax];
		for (int i = 0; i < imax; i++) {
			yArr[i] = y;
		}
		return calc(x, c, yArr);
	}
}