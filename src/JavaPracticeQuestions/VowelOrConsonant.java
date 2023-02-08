package JavaPracticeQuestions;

public class VowelOrConsonant {
    public static void main(String[] args){
        vowel('i');
    }

    static void vowel(char character){
        if (character=='a' || character=='e' || character=='i' || character=='o' || character=='u'){
            System.out.println("vowel");
        }else {
            System.out.println("Consonant");
        }
    }
}
