package main.xmle;

import lombok.Setter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Setter
@XmlRootElement
public class Item {

    @XmlElement
    private String itemVal;

    @XmlAttribute
    private int id;

    @XmlAttribute
    private int id2;


    @XmlElement
    private ItemObj itemObj;

}
