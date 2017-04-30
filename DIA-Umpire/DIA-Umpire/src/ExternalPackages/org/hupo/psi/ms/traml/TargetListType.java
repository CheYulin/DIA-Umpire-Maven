//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.30 at 01:53:29 PM CET 
//


package ExternalPackages.org.hupo.psi.ms.traml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of precursor m/z targets to include or exclude
 * <p>
 * <p>Java class for TargetListType complex type.
 * <p>
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;complexType name="TargetListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cvParam" type="{http://psi.hupo.org/ms/traml}cvParamType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="userParam" type="{http://psi.hupo.org/ms/traml}UserParamType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TargetIncludeList" type="{http://psi.hupo.org/ms/traml}TargetIncludeListType" minOccurs="0"/>
 *         &lt;element name="TargetExcludeList" type="{http://psi.hupo.org/ms/traml}TargetExcludeListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetListType", propOrder = {
        "cvParam",
        "userParam",
        "targetIncludeList",
        "targetExcludeList"
})
public class TargetListType {

    protected List<CvParamType> cvParam;
    protected List<UserParamType> userParam;
    @XmlElement(name = "TargetIncludeList")
    protected TargetIncludeListType targetIncludeList;
    @XmlElement(name = "TargetExcludeList")
    protected TargetExcludeListType targetExcludeList;

    /**
     * Gets the value of the cvParam property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cvParam property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCvParam().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CvParamType }
     */
    public List<CvParamType> getCvParam() {
        if (cvParam == null) {
            cvParam = new ArrayList<CvParamType>();
        }
        return this.cvParam;
    }

    /**
     * Gets the value of the userParam property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userParam property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserParam().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserParamType }
     */
    public List<UserParamType> getUserParam() {
        if (userParam == null) {
            userParam = new ArrayList<UserParamType>();
        }
        return this.userParam;
    }

    /**
     * Gets the value of the targetIncludeList property.
     *
     * @return possible object is
     * {@link TargetIncludeListType }
     */
    public TargetIncludeListType getTargetIncludeList() {
        return targetIncludeList;
    }

    /**
     * Sets the value of the targetIncludeList property.
     *
     * @param value allowed object is
     *              {@link TargetIncludeListType }
     */
    public void setTargetIncludeList(TargetIncludeListType value) {
        this.targetIncludeList = value;
    }

    /**
     * Gets the value of the targetExcludeList property.
     *
     * @return possible object is
     * {@link TargetExcludeListType }
     */
    public TargetExcludeListType getTargetExcludeList() {
        return targetExcludeList;
    }

    /**
     * Sets the value of the targetExcludeList property.
     *
     * @param value allowed object is
     *              {@link TargetExcludeListType }
     */
    public void setTargetExcludeList(TargetExcludeListType value) {
        this.targetExcludeList = value;
    }

}
