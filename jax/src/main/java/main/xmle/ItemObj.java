package main.xmle;

import lombok.Setter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
@Setter
public class ItemObj {

    @XmlValue
    private String itemObjectVal;

    @XmlAttribute
    private int itemObjectAttr;

}
