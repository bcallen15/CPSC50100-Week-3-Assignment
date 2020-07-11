
public class GradeAvg {

	public static void main(String[] args) {
		double quizScore1 = 85, quizScore2 = 74, quizScore3 = 94; 
		
		double testScore1 = 66, testScore2 = 87;
		
		//calculates average scores
		double quizScoreAvg = ((quizScore1 + quizScore2 + quizScore3)/3);
		
		double testScoreAvg = ((testScore1 + testScore2)/2);
		//displays average scores
		System.out.println("Average Quiz Score: " + quizScoreAvg + "%");
		
		System.out.println("Average Test Score: " + testScoreAvg + "%");
		

	}

}
