package main;

import main.xmle.Book;
import main.xmle.Item;
import main.xmle.ItemObj;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Fun {

    public static void main(String[] args) throws JAXBException {

        Book b1 = new Book();
        b1.setName("b11");
        b1.setId("aaa");

        Item i = new Item();
        i.setItemVal("iname1");
        i.setId(2);
        i.setId2(3);

        Item ii = new Item();
        ii.setItemVal("iname2");
        ii.setId(4);
        ii.setId2(5);

        ItemObj io = new ItemObj();
        io.setItemObjectAttr(5);
        io.setItemObjectVal("ioVal");

        i.setItemObj(io);

        List<Item> il = new ArrayList<Item>();
        il.add(i);
        il.add(ii);
        b1.setIltemList(il);


        File f = new File("x.xml");

        JAXBContext c = JAXBContext.newInstance(Book.class);

        Marshaller m = c.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.marshal(b1, f);

    }

}
