//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vBeta 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2003.02.21 at 09:54:12 GMT 
//


package com.tapsterrock.mspdi.schema;


/**
 * The following schema fragment specifies the expected content contained within this java content object.
 * <p>
 * <pre>
 * &lt;complexType name="TimephasedDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" minOccurs="0">
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
 *             &lt;enumeration value="4"/>
 *             &lt;enumeration value="5"/>
 *             &lt;enumeration value="6"/>
 *             &lt;enumeration value="7"/>
 *             &lt;enumeration value="8"/>
 *             &lt;enumeration value="9"/>
 *             &lt;enumeration value="10"/>
 *             &lt;enumeration value="11"/>
 *             &lt;enumeration value="16"/>
 *             &lt;enumeration value="17"/>
 *             &lt;enumeration value="18"/>
 *             &lt;enumeration value="19"/>
 *             &lt;enumeration value="20"/>
 *             &lt;enumeration value="21"/>
 *             &lt;enumeration value="22"/>
 *             &lt;enumeration value="23"/>
 *             &lt;enumeration value="24"/>
 *             &lt;enumeration value="25"/>
 *             &lt;enumeration value="26"/>
 *             &lt;enumeration value="27"/>
 *             &lt;enumeration value="28"/>
 *             &lt;enumeration value="29"/>
 *             &lt;enumeration value="30"/>
 *             &lt;enumeration value="31"/>
 *             &lt;enumeration value="32"/>
 *             &lt;enumeration value="33"/>
 *             &lt;enumeration value="34"/>
 *             &lt;enumeration value="35"/>
 *             &lt;enumeration value="36"/>
 *             &lt;enumeration value="37"/>
 *             &lt;enumeration value="38"/>
 *             &lt;enumeration value="39"/>
 *             &lt;enumeration value="40"/>
 *             &lt;enumeration value="41"/>
 *             &lt;enumeration value="42"/>
 *             &lt;enumeration value="43"/>
 *             &lt;enumeration value="44"/>
 *             &lt;enumeration value="45"/>
 *             &lt;enumeration value="46"/>
 *             &lt;enumeration value="47"/>
 *             &lt;enumeration value="48"/>
 *             &lt;enumeration value="49"/>
 *             &lt;enumeration value="50"/>
 *             &lt;enumeration value="51"/>
 *             &lt;enumeration value="52"/>
 *             &lt;enumeration value="53"/>
 *             &lt;enumeration value="54"/>
 *             &lt;enumeration value="55"/>
 *             &lt;enumeration value="56"/>
 *             &lt;enumeration value="57"/>
 *             &lt;enumeration value="58"/>
 *             &lt;enumeration value="59"/>
 *             &lt;enumeration value="60"/>
 *             &lt;enumeration value="61"/>
 *             &lt;enumeration value="62"/>
 *             &lt;enumeration value="63"/>
 *             &lt;enumeration value="64"/>
 *             &lt;enumeration value="65"/>
 *             &lt;enumeration value="66"/>
 *             &lt;enumeration value="67"/>
 *             &lt;enumeration value="68"/>
 *             &lt;enumeration value="69"/>
 *             &lt;enumeration value="70"/>
 *             &lt;enumeration value="71"/>
 *             &lt;enumeration value="72"/>
 *             &lt;enumeration value="73"/>
 *             &lt;enumeration value="74"/>
 *             &lt;enumeration value="75"/>
 *             &lt;enumeration value="76"/>
 *           &lt;/restriction>
 *         &lt;/element>
 *         &lt;element name="UID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Start" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Finish" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Unit" minOccurs="0">
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;enumeration value="0"/>
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
 *             &lt;enumeration value="5"/>
 *             &lt;enumeration value="8"/>
 *           &lt;/restriction>
 *         &lt;/element>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface TimephasedDataType {


    java.math.BigInteger getType();

    void setType(java.math.BigInteger value);

    String getValue();

    void setValue(String value);

    java.util.Calendar getStart();

    void setStart(java.util.Calendar value);

    java.math.BigInteger getUnit();

    void setUnit(java.math.BigInteger value);

    java.util.Calendar getFinish();

    void setFinish(java.util.Calendar value);

    java.math.BigInteger getUID();

    void setUID(java.math.BigInteger value);

}