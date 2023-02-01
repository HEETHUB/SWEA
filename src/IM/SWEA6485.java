package IM;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA6485 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 1; t <= T; t++) {
			int N = sc.nextInt();
			int[] A = new int[N];
			int[] B = new int[N];
			
			for (int n = 0; n < N; n++) {
				A[n] = sc.nextInt();
				B[n] = sc.nextInt();
			}
			
			int P = sc.nextInt();
			int[] C = new int[P];
			for (int p = 0; p < P; p++) {
				C[p] = sc.nextInt();
			}
			
			int[] res = new int[P];
			for (int i = 0; i < P; i++) {
				for (int j = 0; j < N; j++) {
					if (C[i] >= A[j] && C[i] <= B[j]) {
						res[i]++;
					}
				}
			}
			System.out.print("#"+t+" ");
			for (int i : res) System.out.print(i+" ");
			System.out.println();
		}
	}
}
