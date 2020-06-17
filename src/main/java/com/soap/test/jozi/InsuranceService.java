package com.soap.test.jozi;

import com.jozi.spring_ws_insurance.InsuranceRequest;
import com.jozi.spring_ws_insurance.InsuranceResponse;

public interface InsuranceService {

    void writeInsuranceApplication(InsuranceRequest insuranceRequest);

    InsuranceResponse processInsuranceApplication(InsuranceRequest insuranceRequest);
}
