package ex;

public class Solustion {
	public String solution(String[] participant, String[] completion) {
    	String[] a = participant.clone();
    	
        for(int i=0; i < participant.length; i++) {
        	for(int j=0; j < completion.length; j++) {
        		if(participant[i].equals(completion[j])) {
        			a[i] = null;
        			break;
        		}
        	}
        }
        String answer = "";
        
        for(int i=0; i < participant.length; i++)
        	if(a[i] != null) answer = a[i];
        
        System.out.println(answer);
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solustion s = new Solustion();
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };
		
		s.solution(participant, completion);
	}

}