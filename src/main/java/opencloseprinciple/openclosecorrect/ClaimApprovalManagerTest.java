package opencloseprinciple.openclosecorrect;

import org.junit.Test;

public class ClaimApprovalManagerTest {

    @Test
    public void testProcessClaim() throws Exception {

        ClaimApprovalManager claim = new ClaimApprovalManager();

        claim.processClaim(new HealthInsuranceSurveyor());

        claim.processClaim(new VehicleInsuranceSurveyor());
    }
}
