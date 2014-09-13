package kz.epi.bit;

public class SwapBits {

	public static void main(String[] args) {
		long before = 73;
		int index1 = 2;
		int index2 = 6;
		long after = swapBits(before, index1, index2);
		System.out.println(String
				.format("Before: %s\nAfter: %s", before, after));
	}

	private static long swapBits(long value, int index1, int index2) {
		long mask1 = 1 << index1;
		long mask2 = 1 << index2;
		long distance = index2 - index1;
		long value1 = (mask1 & value) << distance;
		long value2 = (mask2 & value) >> distance;
		long result = ~mask1 & ~mask2 & value; // Обнуляем нужные биты
		result = value1 ^ value2 ^ result;
		return result;
	}
}
