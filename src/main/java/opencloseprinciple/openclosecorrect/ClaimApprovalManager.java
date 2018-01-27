package opencloseprinciple.openclosecorrect;

/**
 *  https://springframework.guru/principles-of-object-oriented-design/open-closed-principle/
 *
 *  In this way, any further addition of InsuranceSurveyor implementations will not affect the ClaimApprovalManager
 *  class. Our insurance system is now open to support more types of insurance claims,
 *  and closed for any modifications whenever a new claim type is added.
 */
public class ClaimApprovalManager {

    public void processClaim(InsuranceSurveyor surveyor) {
        if (surveyor.isValidClaim()) {
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
}
