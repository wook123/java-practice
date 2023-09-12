package ex5_pen;

public class Work {
	public int solutiong(String[] babbling) {
		int answer = 0;
		String str[] = {"aya","ye","woo","ma"};
		for(int i = 0; i <babbling.length; i++) {
			for(int j = 0; j < str.length; j++) {
				babbling[i] = babbling[i].replace(str[j],"?");
				if(babbling[i].replace("?","").equals("")) {
					answer++;
					break;
				}
			}
		}
		return answer;
	}
}
