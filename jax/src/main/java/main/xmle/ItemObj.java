package main.xmle;

import lombok.Setter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
public class ItemObj {


    private String itemObjectVal;


    private int itemObjectAttr;

    @XmlValue
    public String getItemObjectVal() {
        return itemObjectVal;
    }


    public void setItemObjectVal(String itemObjectVal) {
        this.itemObjectVal = itemObjectVal;
    }

    public int getItemObjectAttr() {
        return itemObjectAttr;
    }

    @XmlAttribute
    public void setItemObjectAttr(int itemObjectAttr) {
        this.itemObjectAttr = itemObjectAttr;
    }

    @Override
    public String toString() {
        return "ItemObj{" +
                "itemObjectVal='" + itemObjectVal + '\'' +
                ", itemObjectAttr=" + itemObjectAttr +
                '}';
    }
}
