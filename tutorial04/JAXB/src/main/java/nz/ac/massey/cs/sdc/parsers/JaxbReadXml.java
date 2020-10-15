package nz.ac.massey.cs.sdc.parsers;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * @Description
 * @Author Dinglong Zhang
 * @Date 2020-10-05 20:30
 */
public class JaxbReadXml {

    public static void main(String[] args) throws JAXBException {

        File file = new File("tutorial04.xml");
        channel channelread = (channel) readxml(file,channel.class,item.class);
        for (item item1:channelread.getChannel()) {
            System.out.println(item1);
        }
    }

    public static Object readxml(File path, Class... clazz) throws JAXBException {
        JAXBContext jctx = JAXBContext.newInstance(clazz);
        Unmarshaller unmarshaller = jctx.createUnmarshaller();
        Object object = unmarshaller.unmarshal(path);
        return object;
    }

//    public static Object writexml(Object obj, File path, Class... clazz) throws JAXBException {
//        JAXBContext jctx = JAXBContext.newInstance(clazz);
//        Marshaller marshaller = jctx.createMarshaller();
//        // 格式化输出，设置换行和缩进，不设置则会显示在一行
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
//        marshaller.marshal(obj,path);
//        //设置控制台输出
//        marshaller.marshal(obj,System.out);
//    }

}
