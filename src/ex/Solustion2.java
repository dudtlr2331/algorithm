package ex;

public class Solustion2 {
	public String solution(String[] participant, String[] completion) {
        for(int i=0; i < participant.length; i++) {
        	for(int j=0; j < completion.length; j++) {
        		if(participant[i].equals(completion[j])) {
        			participant[i] = null;
        			completion[j] = null;        			
        			break;
        		}
        	}
        }
        String answer = "";
        
        for(int i=0; i < participant.length; i++)
        	if(participant[i] != null) answer = participant[i];
        		
        System.out.println(answer);
        
        return answer;
    }
	
	public static void main(String[] args) {
		Solustion2 s = new Solustion2();
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };
		
		s.solution(participant, completion);
	}

}