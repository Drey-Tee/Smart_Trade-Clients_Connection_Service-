//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.24 at 02:18:59 PM GMT 
//


package com.Alcatraz.Client.Connectivity.WSDL;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ticker" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Price" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Balance" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="side" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "ticker",
    "price",
    "balance",
    "quantity",
    "side"
})
@XmlRootElement(name = "getOrderRequest")
public class GetOrderRequest {

    protected int id;
    @XmlElement(required = true)
    protected String ticker;
    @XmlElement(name = "Price")
    protected double price;
    @XmlElement(name = "Balance")
    protected double balance;
    @XmlElement(name = "Quantity")
    protected double quantity;
    @XmlElement(required = true)
    protected String side;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the ticker property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicker() {
        return ticker;
    }

    /**
     * Sets the value of the ticker property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicker(String value) {
        this.ticker = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     */
    public void setBalance(double value) {
        this.balance = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public double getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(double value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the side property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSide() {
        return side;
    }

    /**
     * Sets the value of the side property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSide(String value) {
        this.side = value;
    }

}
