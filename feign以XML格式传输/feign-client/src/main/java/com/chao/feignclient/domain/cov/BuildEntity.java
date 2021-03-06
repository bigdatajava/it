package com.chao.feignclient.domain.cov;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
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
public class BuildEntity {

    @JacksonXmlProperty(localName = "BuildEntityNumber", isAttribute = true)
    private String buildEntityNumber;
    @JacksonXmlProperty(localName = "plantOfManufacture", isAttribute = true)
    private String plantOfManufacture;
    @JacksonXmlProperty(localName = "scheduledShipDate", isAttribute = true)
    private String scheduledShipDate;
    @JacksonXmlProperty(localName = "xmlns:ns2",isAttribute = true)
    private String xmlnsNs2="http://www.lenovo.com/lmc/buildentity";

    @JacksonXmlProperty(localName = "System")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<SystemCov> system;


}

/*
<?xml version="1.0" encoding="utf-8"?>
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
