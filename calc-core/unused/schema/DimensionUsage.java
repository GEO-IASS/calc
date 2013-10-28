//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.02.01 at 03:55:36 PM CET 
//


package org.openforis.calc.olap.schema;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.openforis.calc.model.VariableMetadata;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DimensionUsage", propOrder = {
    "annotations"
})
public class DimensionUsage {

    @XmlElement(name = "Annotations")
    protected List<Annotations> annotations;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute(required = true)
    protected String source;
    @XmlAttribute
    protected String level;
    @XmlAttribute
    protected String usagePrefix;
    @XmlAttribute
    protected String foreignKey;
    @XmlAttribute
    protected Boolean highCardinality;
    @XmlAttribute
    protected Boolean visible;
    
    
    public DimensionUsage() {
	}

	public DimensionUsage(VariableMetadata variableMetadata) {
    	String variableName = variableMetadata.getVariableName();
		String mdxName = Schema.getMdxName(variableName);
    	
    	setSource(mdxName);
    	setName(mdxName);
    	setVisible(true);
    	setForeignKey(variableName);
    	setHighCardinality(false);
	}

	/**
     * Gets the value of the annotations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Annotations }
     * 
     * 
     */
    public List<Annotations> getAnnotations() {
        if (annotations == null) {
            annotations = new ArrayList<Annotations>();
        }
        return this.annotations;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Gets the value of the usagePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsagePrefix() {
        return usagePrefix;
    }

    /**
     * Sets the value of the usagePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsagePrefix(String value) {
        this.usagePrefix = value;
    }

    /**
     * Gets the value of the foreignKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignKey() {
        return foreignKey;
    }

    /**
     * Sets the value of the foreignKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignKey(String value) {
        this.foreignKey = value;
    }

    /**
     * Gets the value of the highCardinality property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHighCardinality() {
        if (highCardinality == null) {
            return false;
        } else {
            return highCardinality;
        }
    }

    /**
     * Sets the value of the highCardinality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHighCardinality(Boolean value) {
        this.highCardinality = value;
    }

    public Boolean isVisible() {
		return visible;
	}
    
    public void setVisible(Boolean visible) {
		this.visible = visible;
	}
    
}
