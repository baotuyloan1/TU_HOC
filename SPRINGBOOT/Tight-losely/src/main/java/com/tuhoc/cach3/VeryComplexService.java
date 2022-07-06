package com.tuhoc.cach3;

public class VeryComplexService {
	private ISortAlgorithm sortAlgorithm;

	public VeryComplexService(ISortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

	public void complexBusiness(int array[]) {
		sortAlgorithm.sort(array);
		// TODO: more logic here
	}

	public static void main(String[] args) {
		ISortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		ISortAlgorithm quickSortAlgorithm = new QuicksortAlgorithm();
		VeryComplexService business1 = new VeryComplexService(bubbleSortAlgorithm);
		VeryComplexService business2 = new VeryComplexService(quickSortAlgorithm);
		
		business1.complexBusiness(null);
		business2.complexBusiness(null);
	}
}
