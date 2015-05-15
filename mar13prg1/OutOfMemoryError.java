package homework;

public class OutOfMemoryError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long maxMemory = Runtime.getRuntime().maxMemory();
		System.out.println(maxMemory);

		int[] matrix = new int[(int) (maxMemory + 1)];
			for (int i = 0; i < matrix.length; ++i)
			matrix[i] = i + 1;
	}

}
