package IM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SWEA6190 {
	
	static boolean monotonic(int number) {
		int cur = 10;
		while (number >= 1) {
			if (cur < number%10) 
				return false;
			cur = number%10;
			number /= 10;
		}
		return true;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			int N = Integer.parseInt(br.readLine());
			int[] nums = new int[N];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				nums[i] = Integer.parseInt(st.nextToken());
			}
			
			int ans = -1;
			for (int i = 0; i < N; i++) {
				for (int j = i+1; j < N; j++) {
					if (monotonic(nums[i]*nums[j])) {
						if (nums[i]*nums[j] > ans)
							ans = nums[i]*nums[j];
					}
				}
			}
			System.out.println("#"+t+" "+ans);
		}
	}
}
