package com.soap.test.jozi;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jozi.spring_ws_insurance.ApplicantType;
import com.jozi.spring_ws_insurance.InsuranceInfoType;
import com.jozi.spring_ws_insurance.InsuranceRequest;
import com.jozi.spring_ws_insurance.InsuranceResponse;
import com.jozi.spring_ws_insurance.WidgetInfoType;
import com.soap.test.jozi.data.Insurance;
import com.soap.test.jozi.repositories.InsuranceRepository;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

@Service
public class InsuranceServiceImpl implements InsuranceService{
	
	@Autowired
	private InsuranceRepository repository;
	
    @Override
    public void writeInsuranceApplication(InsuranceRequest insuranceRequest) {
        System.out.println("Insurance Application : " + insuranceRequest);

        ApplicantType applicantType = insuranceRequest.getApplicant();
        System.out.println("Insurance Applicant: First Name " + applicantType.getFirstName() );
        System.out.println("Insurance Applicant: Last Name " + applicantType.getLastName() );
        System.out.println("Insurance Applicant: SSN " + applicantType.getSSN() );


        WidgetInfoType widgetInfo = insuranceRequest.getWidgetInfo();
        System.out.println("Widget Information: Contract Number " + widgetInfo.getWgtContractNumber());
        System.out.println("Widget Information: Amount " + widgetInfo.getWgtAmount());


        InsuranceInfoType insuranceInfo = insuranceRequest.getInsuranceInfo();
        System.out.println("Insurance Information: Coverage Option " + insuranceInfo.getCoverageOption());
        System.out.println("Insurance Information: Coverage Type " + insuranceInfo.getCoverageType());
        System.out.println("Insurance Information: Product " + insuranceInfo.getProduct());
    }

    @Override
    public InsuranceResponse processInsuranceApplication(InsuranceRequest insuranceRequest) {
        InsuranceResponse insuranceResponse = new InsuranceResponse();

        String formattedDate = vratVhodnyCas();
        Integer idp = Integer.parseInt(insuranceRequest.getWidgetInfo().getWgtContractNumber());
        List<Insurance> poistky = repository.findByIdp(idp);
      
        Insurance poistka = poistky.get(0);
        insuranceResponse.setConfirmationId(Integer.toString(poistka.getId()));
        insuranceResponse.setAmount(Double.toString(poistka.getAmount()));
        insuranceResponse.setOrderDate(formattedDate);
        insuranceResponse.setValue(Double.toString(poistka.getValue()));
        
        return insuranceResponse;
    }

	private String vratVhodnyCas() {
		Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(calendar.getTime());
        System.out.println(formattedDate);
		return formattedDate;
	}
}
