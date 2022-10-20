public class Grader {
    public char resultOfGrade (int numberGrade) {
        if(numberGrade<0){
            throw new IllegalArgumentException("Number grade can't be Output");
        }else if(numberGrade<60){
            return 'F';
        }else if(numberGrade<70){
            return 'D';
        }else if(numberGrade<81){
            return 'C';
        }else if(numberGrade<90){
            return 'B';
        }else{
            return 'A';
        }
    }
}
