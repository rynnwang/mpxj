//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.26 at 05:28:32 PM BST 
//


package net.sf.mpxj.ganttproject.schema;

import java.util.Date;
import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, Date>
{


    public Date unmarshal(String value) {
        return (net.sf.mpxj.ganttproject.DatatypeConverter.parseDate(value));
    }

    public String marshal(Date value) {
        return (net.sf.mpxj.ganttproject.DatatypeConverter.printDate(value));
    }

}
