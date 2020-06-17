//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.31 at 10:00:56 PM CET 
//


package com.jozi.spring_ws_insurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Applicant" type="{http://www.jozi.com/spring-ws-insurance}ApplicantType"/>
 *         &lt;element name="InsuranceInfo" type="{http://www.jozi.com/spring-ws-insurance}InsuranceInfoType"/>
 *         &lt;element name="WidgetInfo" type="{http://www.jozi.com/spring-ws-insurance}WidgetInfoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "applicant",
    "insuranceInfo",
    "widgetInfo"
})
@XmlRootElement(name = "InsuranceRequest")
public class InsuranceRequest {

    @XmlElement(name = "Applicant", required = true)
    protected ApplicantType applicant;
    @XmlElement(name = "InsuranceInfo", required = true)
    protected InsuranceInfoType insuranceInfo;
    @XmlElement(name = "WidgetInfo", required = true)
    protected WidgetInfoType widgetInfo;

    /**
     * Gets the value of the applicant property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicantType }
     *     
     */
    public ApplicantType getApplicant() {
        return applicant;
    }

    /**
     * Sets the value of the applicant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicantType }
     *     
     */
    public void setApplicant(ApplicantType value) {
        this.applicant = value;
    }

    /**
     * Gets the value of the insuranceInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceInfoType }
     *     
     */
    public InsuranceInfoType getInsuranceInfo() {
        return insuranceInfo;
    }

    /**
     * Sets the value of the insuranceInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceInfoType }
     *     
     */
    public void setInsuranceInfo(InsuranceInfoType value) {
        this.insuranceInfo = value;
    }

    /**
     * Gets the value of the widgetInfo property.
     * 
     * @return
     *     possible object is
     *     {@link WidgetInfoType }
     *     
     */
    public WidgetInfoType getWidgetInfo() {
        return widgetInfo;
    }

    /**
     * Sets the value of the widgetInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link WidgetInfoType }
     *     
     */
    public void setWidgetInfo(WidgetInfoType value) {
        this.widgetInfo = value;
    }

}
