import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class TwoSumFile {
	public static int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0;i < nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				res[1] = i;
				res[0] = map.get(target - nums[i]);
				return res;
			}
			map.put(nums[i], i);
		}
		return res;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader("C:\\input.txt"));
		String text = reader.readLine();
		String[] temp = text.split(" ");
		int[] nums = new int[temp.length];
		for(int i = 0; i < temp.length; i++) {
			nums[i] = Integer.valueOf(temp[i]);
		}
		int target = Integer.valueOf(reader.readLine());
		int[] res = twoSum(nums, target);
		System.out.printf("%d, %d", res[0], res[1]);
	}
}
