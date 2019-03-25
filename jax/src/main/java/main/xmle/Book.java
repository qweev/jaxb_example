package main.xmle;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.*;
import java.util.List;


@Setter
@XmlRootElement
public class Book {


    @XmlElement
    private String name;

    @XmlAttribute
    private String id;

    @XmlElements(@XmlElement)
    private List<Item> iltemList;

}
