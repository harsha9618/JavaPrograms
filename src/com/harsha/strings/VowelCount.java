package com.harsha.strings;

public class VowelCount {
	public void countVowel(String B) {
		int VowelCount = 0;
		int SpaceCount = 0;
		int ConsonentsCount = 0;
		char[] H = B.toCharArray();
		for (int i = 0; i < B.length(); i++) {
			if (H[i] == 'a' || H[i] == 'e' || H[i] == 'i' || H[i] == 'o' || H[i] == 'u') {
				VowelCount++;
			} else if (H[i] == ' ') {
				SpaceCount++;
			} else {
				ConsonentsCount++;
			}
		}
		System.out.println(VowelCount);

		System.out.println(SpaceCount);
		System.out.println(ConsonentsCount);

	}

	public static void main(String[] args) {
		String B = "aeiouzzz d";
		VowelCount vc = new VowelCount();
		vc.countVowel(B);
	}

}
