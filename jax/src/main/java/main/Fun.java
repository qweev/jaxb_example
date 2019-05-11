package main;

import main.xmle.Book;
import main.xmle.Item;
import main.xmle.ItemObj;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Fun {

    public static void main(String[] args) throws JAXBException {

        createXML();
        readXML();


    }

    private static void readXML() throws JAXBException {

        File file = new File("C:\\jaxb\\jaxb_example\\jax\\x.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Book.class);

        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        Book b = (Book) jaxbUnmarshaller.unmarshal(file);
        System.out.println(b);

        System.out.println("id2 == " + b.getIltemList().get(0).getId2());

    }


    private static void createXML() throws JAXBException {
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
        System.out.println(f.getAbsolutePath());
        m.marshal(b1, f);
        m.marshal(b1, System.out);
    }

}
