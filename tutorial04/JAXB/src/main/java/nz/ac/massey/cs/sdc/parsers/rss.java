package nz.ac.massey.cs.sdc.parsers;

import javax.xml.bind.annotation.*;

/**
 * @Description
 * @Author Dinglong Zhang
 * @Date 2020-10-08 14:28
 */

@XmlRootElement(name = "rss")
@XmlAccessorType(XmlAccessType.FIELD)
public class rss {
    @XmlElement(name = "channel")
    private String rss;

    @XmlAttribute(name = "version")
    private String version;

    public rss() {
    }

    public rss(String rss) {
        this.rss = rss;
    }

    @XmlTransient
    public String getRss() {
        return rss;
    }


    public void setRss(String rss) {
        this.rss = rss;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getRss());
    }
}
