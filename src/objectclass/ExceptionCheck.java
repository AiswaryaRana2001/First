package objectclass;


//EXCEPTIONS

//1--find Age
 
 
class Age {
    String drink;
    String vote;
    String movie;
}
class IllegalAgeException extends Exception {
    public IllegalAgeException(String s) {
        super(s);
    }
}
public class ExceptionCheck {
    public String drinkingCheck(Age a, int age) {
        try {
            if (age < 21) {
                a.drink = "illegal";
                throw new IllegalAgeException("Illegal drinking age");
            } else  {
                a.drink = "legal";
            }
        } catch (IllegalAgeException e) {
            return e.getMessage();
        }
        return a.drink;
    }
    public String votingCheck(Age a, int age) {
        try {
            if (age < 18) {
a.vote = "illegal";
                throw new IllegalAgeException("Illegal voting age");
            } else {
a.vote = "legal";
            }
        } catch (IllegalAgeException e) {
            return e.getMessage();
        }
return a.vote;
    }
    public String movieCheck(Age a, int age) {
        try {
            if (age < 14) {
a.movie = "illegal";
                throw new IllegalAgeException("Illegal movie-watching age");
            } else {
a.movie = "legal";
            }
        } catch (IllegalAgeException e) {
            return e.getMessage();
        }
return a.movie;
    }
    public static void main(String[] args) {
        Age ageB = new Age();
        ExceptionCheck exceptionCheck = new ExceptionCheck();
        int age = 20; // Example age
        System.out.println("Drinking: " + exceptionCheck.drinkingCheck(ageB, age));
        System.out.println("Voting: " + exceptionCheck.votingCheck(ageB, age));
        System.out.println("Movie: " + exceptionCheck.movieCheck(ageB, age));
    }
}

 