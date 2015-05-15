package homework;

public class StopWatch {
	private long startTime;
	private long endtime;
	private long startSeconds;
	private long stopSeconds;
	public StopWatch() {
	startTime = System.currentTimeMillis();
	}

public void start() {

startTime = System.currentTimeMillis();
startSeconds = startTime / 1000;

}

public void stop() {
endtime = System.currentTimeMillis();
stopSeconds = endtime / 1000;
}

public long getElapsedTime() {
		return stopSeconds - startSeconds;
	}
		// TODO Auto-generated method stub
		public static void main(String[] args) {

			StopWatch stopWatch = new StopWatch();

			int size = 100000;

			double[] ls = new double[size];

			for (int i = 0; i < ls.length; i++) {

				ls[i] = Math.random() * ls.length;
			}

			stopWatch.start();

			selectionSort(ls);

			stopWatch.stop();

			// call elapsed time
			System.out.println("The sort time for this numbers is: "
					+ stopWatch.getElapsedTime() + " seconds.");
		}

		public static void selectionSort(double[] lst) {

			for (int i = 0; i < lst.length - 1; i++) {

				// find the minimum in the lst
				double currentMin = lst[i];

				int currentMinIndex = i;

				for (int j = i + 1; j < lst.length; j++) {
					if (currentMin > lst[j]) {
						currentMin = lst[j];
						currentMinIndex = j;
					}
				}

				if (currentMinIndex != i) {
					lst[currentMinIndex] = lst[i];
					lst[i] = currentMin;
				}		
			}
	
	}

}
