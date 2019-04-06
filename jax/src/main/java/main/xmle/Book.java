package main.xmle;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.List;


@XmlRootElement
public class Book {



    private String name;


    private String id;


    private List<Item> iltemList;

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    @XmlAttribute
    public void setId(String id) {
        this.id = id;
    }

    public List<Item> getIltemList() {
        return iltemList;
    }

    @XmlElements(@XmlElement)
    public void setIltemList(List<Item> iltemList) {
        this.iltemList = iltemList;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", iltemList=" + iltemList +
                '}';
    }
}
