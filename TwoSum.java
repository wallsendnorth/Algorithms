import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
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
	public static void  main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.printf("please input target\n");
		String s = in.nextLine();
		String[] temp = s.split(" ");
		int[] nums = new int[temp.length];
		for(int i = 0; i < temp.length; i++) {
			nums[i] = Integer.valueOf(temp[i]);
		}
		System.out.printf("input target\n");
		int target = in.nextInt();
		int[] res = twoSum(nums, target);
		System.out.printf("res is index1 %d, index2 &d", res[0], res[1]);
		in.close();
    }
}

