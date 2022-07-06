package com.tuhoc.cach2;

public class VeryComplexService {
	private ISortAlgorithm sortAlgorithm;

	public VeryComplexService() {
		sortAlgorithm = new BubbleSortAlgorithm();
	}

	public void complexBusiness(int array[]) {
		sortAlgorithm.sort(array);
		// TODO: more logic here
	}
}
