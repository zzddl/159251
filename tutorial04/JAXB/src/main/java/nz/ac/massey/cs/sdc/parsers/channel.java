package nz.ac.massey.cs.sdc.parsers;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author Dinglong Zhang
 * @Date 2020-10-05 20:59
 */


@XmlRootElement(name = "channel")
@XmlAccessorType(XmlAccessType.FIELD)
public class channel {
    @XmlElement(name = "item")
    private List<item> channel;

    @XmlTransient
    public List<item> getChannel() {
        return channel;
    }


    public void setChannel(List<item> channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getChannel());
    }
}
