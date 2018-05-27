package com.lw.spring;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.xpath.XPath;

import java.util.HashMap;
import java.util.List;

public class ClassPathXmlApplicationContext implements BeanFactory {

    private HashMap<String,Object> container = new HashMap<>();

    public ClassPathXmlApplicationContext(String fileName) throws Exception {
        SAXBuilder sb = new SAXBuilder();
        Document doc = sb.build(this.getClass().getClassLoader()
                .getResourceAsStream(fileName));
        Element root = doc.getRootElement();
        List list = XPath.selectNodes(root, "/beans/bean");
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            Element bean = (Element) list.get(i);
            String id = bean.getAttributeValue("id");
            String clazz = bean.getAttributeValue("class");
            Object o = Class.forName(clazz).newInstance();
            container.put(id, o);
            System.out.println(id + " " + clazz);
        }
    }

    @Override
    public Object getBean(String id) {
        return container.get(id);
    }
}
