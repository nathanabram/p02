//********************************************************************************************************
//CLASS: OnCampusStudent (OnCampusStudent.Java)
//
// DESCRIPTION
// This class extends Student to add specific instance methods and instance variable for on-campus students.
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Summer 2021
// Project Number: 02
//
// AUTHOR: Nathaniel Koerschner, nkoersch, nkoersch@asu.edu
//********************************************************************************************************

public class OnCampusStudent extends Student {

    static int RESIDENT = 1; // no need to use the public keyword here since this is a public field.
    static int NON_RESIDENT = 2;

    private int mResident;
    private double mProgramFee;

    /**
     * Constructor Method for OnCampusStudent
     *
     */
    OnCampusStudent(String pId, String pFirstName, String pLastName) {
        super(pId, pFirstName, pLastName);
    }

    /**
     * Override method for calcTuition of the Student class
     */
    @Override
    public void calcTuition() {
        double t;
        if (getResidency() == 1) {
            t = TuitionConstants.ONCAMP_RES_BASE;
        } else {
            t = TuitionConstants.ONCAMP_NONRES_BASE;
        }

        t = t + getProgramFee();

        if (getCredits() > TuitionConstants.ONCAMP_MAX_CREDITS) {
            t = t + (getCredits() - TuitionConstants.ONCAMP_MAX_CREDITS) * TuitionConstants.ONCAMP_ADD_CREDITS;

        }
        setTuition(t);

    }

    /**
     * Accessor method for mProgramFee
     */
    public double getProgramFee() {
        return mProgramFee;
    }

    /**
     * Accessor method for the mResident
     */
    public int getResidency() {
        return mResident;
    }

    /**
     * Mutator method for mProgramFee
     */
    public void setProgramFee(double pProgramFee) {
        mProgramFee = pProgramFee;
    }

    /**
     * Mutator method for mResident
     */
    public void setResidency(int pResident) {
        mResident = pResident;
    }

}
