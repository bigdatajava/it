package com.chao.feignclient.domain.cov;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Machine {

    @JacksonXmlProperty(localName = "BOMRequired",isAttribute = true)
    private String bom_required;
    @JacksonXmlProperty(localName = "COVRequired",isAttribute = true)
    private String cov_required;
    @JacksonXmlProperty(localName = "Pmode",isAttribute = true)
    private String pmode;
    @JacksonXmlProperty(localName = "Z3DCountry",isAttribute = true)
    private String z3dCountry;
    @JacksonXmlProperty(localName = "ountry",isAttribute = true)
    private String country;
    @JacksonXmlProperty(localName = "machineNumber",isAttribute = true)
    private String machine_number;
    @JacksonXmlProperty(localName = "machineType",isAttribute = true)
    private String machine_type;
    @JacksonXmlProperty(localName = "model",isAttribute = true)
    private String model;
    @JacksonXmlProperty(localName = "quantity",isAttribute = true)
    private String quantity;
    @JacksonXmlProperty(localName = "topologyRequired",isAttribute = true)
    private String topology_required;

    @JacksonXmlProperty(localName = "SubItem")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<SubItem> sub_item;



}

/*
<BuildEntity BuildEntityNumber="4970122970000060" plantOfManufacture="L070" scheduledShipDate="2019-09-23" xmlns:ns2="http://www.lenovo.com/lmc/buildentity">
    <System systemNumber="SYS0009" systemType="8721">
        <Machine BOMRequired="Yes" COVRequired="Yes" Pmode="N" Z3DCountry="   " country="CN" machineNumber="4970122970000060" machineType="8721" model="HC2" quantity="1" topologyRequired="Yes">
            <SubItem device="ASV4" quantity="1" type="FC"></SubItem>
            <SubItem device="ASVB" quantity="1" type="FC"></SubItem>
            <SubItem device="ASUW" quantity="1" type="FC"></SubItem>
            <SubItem device="ASUS" quantity="1" type="FC"></SubItem>
            <SubItem device="ASPT" quantity="1" type="FC"></SubItem>
            <SubItem device="A1EK" quantity="1" type="FC"></SubItem>
            <SubItem device="A0TN" quantity="1" type="FC"></SubItem>
            <SubItem device="6252" quantity="6" type="FC"></SubItem>
            <SubItem device="A1NF" quantity="1" type="FC"></SubItem>
            <SubItem device="A10X" quantity="1" type="FC"></SubItem>
            <SubItem device="A0UD" quantity="4" type="FC"></SubItem>
            <SubItem device="A0UC" quantity="2" type="FC"></SubItem>
            <SubItem device="A0UA" quantity="4" type="FC"></SubItem>
            <SubItem device="A0TQ" quantity="3" type="FC"></SubItem>
            <SubItem device="A0TP" quantity="13" type="FC"></SubItem>
        </Machine>
    </System>
</BuildEntity>
 */

