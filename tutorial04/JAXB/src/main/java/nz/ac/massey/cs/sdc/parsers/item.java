package nz.ac.massey.cs.sdc.parsers;

import javax.xml.bind.annotation.*;

/**
 * @Description
 * @Author Dinglong Zhang
 * @Date 2020-10-05 20:44
 */

@XmlType(propOrder = {"title","link","description"})
@XmlRootElement(name = "item")
@XmlAccessorType(XmlAccessType.FIELD)
public class item {
    @XmlElement(name = "title")
    private String title;
    @XmlElement(name = "link")
    private String link;
    @XmlElement(name = "description")
    private String description;

    public item() {

    }

    public item(String title, String link, String description) {
        this.title = title;
        this.link = link;
        this.description = description;
    }
    @XmlTransient
    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }
    @XmlTransient
    public String getLink() {
        return link;
    }


    public void setLink(String link) {
        this.link = link;
    }
    @XmlTransient
    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "title:" + this.getTitle() + "\n" +
                "link:" + this.getLink() + "\n" +
                "description:" + this.getDescription() + "\n" + "\n";
    }
}
