//********************************************************************************************************
//CLASS: OnlineStudent (OnlineStudent.Java)
//
// DESCRIPTION
// This class extends Student to add specific instance methods and one instance variable for online students.
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Summer 2021
// Project Number: 02
//
// AUTHOR: Nathaniel Koerschner, nkoersch, nkoersch@asu.edu
//********************************************************************************************************

public class OnlineStudent extends Student {

    private boolean mTechFee;

    /**
     * Constructor method for OnlineStudent
     */
    OnlineStudent(String pId, String pFirstName, String pLastName) {
        super(pId, pFirstName, pLastName);
    }

    /**
     * Override for calcTuition() in the Student class
     */
    @Override
    public void calcTuition() {
        double t = getCredits() * TuitionConstants.ONLINE_CREDIT_RATE;
        if (getTechFee() == true) {
            t = t + TuitionConstants.ONLINE_TECH_FEE;
        }
        setTuition(t);
    }

    ;


    /**
     * Accessor method for the mTechFee boolean
     */
    public boolean getTechFee() {
        return mTechFee;
    }

    /**
     * Mutator method for mTechFee
     */
    public void setTechFee(boolean pTechFee) {
        mTechFee = pTechFee;
    }

}
