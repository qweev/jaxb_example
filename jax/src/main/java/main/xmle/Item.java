package main.xmle;

import lombok.Setter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Item {


    private String itemVal;


    private int id;


    private int id2;



    private ItemObj itemObj;

    public String getItemVal() {
        return itemVal;
    }

    @XmlElement
    public void setItemVal(String itemVal) {
        this.itemVal = itemVal;
    }

    public int getId() {
        return id;
    }

    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }

    public int getId2() {
        return id2;
    }

    @XmlAttribute
    public void setId2(int id2) {
        this.id2 = id2;
    }

    public ItemObj getItemObj() {
        return itemObj;
    }

    @XmlElement
    public void setItemObj(ItemObj itemObj) {
        this.itemObj = itemObj;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemVal='" + itemVal + '\'' +
                ", id=" + id +
                ", id2=" + id2 +
                ", itemObj=" + itemObj +
                '}';
    }
}
