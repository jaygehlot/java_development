package opencloseprinciple.opencloseincorrect;

//this immediately violates the Open Closed principle, doesn't easily handle changes in requirements.
//everytime a change is made, need to modify, test and redeploy entire application.
public class ClaimApprovalManager {

    public void processHealthClaim(HealthInsuranceSurveyor surveyor) {
        if (surveyor.isValidClaim()) {
            System.out.println("\"ClaimApprovalManager: Valid claim. Currently processing claim for approval....\"");
        }
    }

    //modifying an existing class is WRONG ....!!! Violation of the OPEN-CLOSED principle
    public void processVehicleClaim (VehicleInsuranceSurveyor surveyor)
    {
        if(surveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
}
