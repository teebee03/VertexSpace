//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.04.02 alle 10:47:38 PM CEST 
//


package model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import javax.swing.table.DefaultTableModel;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import model.Bodroot.Bodies.AroundPlanet;
import model.Bodroot.Bodies.Mass;
import model.Bodroot.Bodies.Vol;




/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bodies" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="alternativeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="aphelion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="argPeriapsis" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="aroundPlanet">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="planet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="null" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="avgTemp" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="axialTilt" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="bodyType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="density" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="dimension" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="discoveredBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="discoveryDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="eccentricity" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="englishName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="equaRadius" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="escape" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="flattening" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="gravity" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="inclination" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="isPlanet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="longAscNode" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="mainAnomaly" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="mass">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="massExponent" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *                             &lt;element name="massValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="null" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="meanRadius" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="moons">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="element" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="moon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="rel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="null" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="perihelion" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="polarRadius" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="rel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="semimajorAxis" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="sideralOrbit" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="sideralRotation" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="vol">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="volExponent" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
 *                             &lt;element name="volValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="null" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bodies"
})
@XmlRootElement(name = "bodroot")
public class Bodroot 
{

    protected List<Bodroot.Bodies> bodies;

    /**
     * Gets the value of the bodies property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bodies property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBodies().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Bodroot.Bodies }
     * 
     * 
     */
    public List<Bodroot.Bodies> getBodies() {
        if (bodies == null) {
            bodies = new ArrayList<Bodroot.Bodies>();
        }
        return this.bodies;
    }


	/**
	 * Crea il Model di una tabella in cui il campo AroundPlanet e' vuoto, contenente tutti i dati relativi al Body
     * @return il Model della tabella con i dati inseriti
     */
    public DefaultTableModel printBodyTable()
	{
    	List<String >units = Arrays.asList(
    			new String[]
    			{
	    			"", "", " km", " km", " km", "",
	    			"°", " kg", " km\u00B3", " g/cm\u00B3", " m/s\u00B2"," m/s",
	    			" km", " km", " km", "", " km", " days",
	    			" h", "", "", "", "", "°",
	    			" K", "°", "°", "°", ""
    			});
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Data");
		model.addColumn("Value");
		
		Field[] fields = Bodroot.Bodies.class.getDeclaredFields();
		String firstCap="";
		String field="";
		String value="";
		
		for(int i=0;i<fields.length-4;i++)
		{
			try
			{
				value="";
				firstCap = fields[i].getName().substring(0, 1).toUpperCase()+fields[i].getName().substring(1);
				firstCap = firstCap.replaceAll("\\d+", "").replaceAll("(.)([A-Z])", "$1 $2");
				field = firstCap+":";
				if(fields[i].get(bodies.get(0)).getClass() != String.class
						&& !(fields[i].get(bodies.get(0)) instanceof Number)
				)
				{
					if(fields[i].get(bodies.get(0)).getClass() == AroundPlanet.class)
					{
						
						if(((AroundPlanet)fields[i].get(bodies.get(0))).getContent().size() != 1)
							value = ""+((JAXBElement)((AroundPlanet)fields[i].get(bodies.get(0))).getContent().get(0)).getValue();
						
					}
					else if(fields[i].get(bodies.get(0)).getClass() == Mass.class)
					{
						if(((Mass)fields[i].get(bodies.get(0))).getContent().size() != 1)
						{
							value = ""+((JAXBElement)((Mass)fields[i].get(bodies.get(0))).getContent().get(1)).getValue()
									+" x 10"
									+ exponentize(""+((JAXBElement)((Mass)fields[i].get(bodies.get(0))).getContent().get(0)).getValue());
						}
					}
					else if(fields[i].get(bodies.get(0)).getClass() == Vol.class)
					{
						if(((Vol)fields[i].get(bodies.get(0))).getContent().size() != 1)
						{
							value = ""+((JAXBElement)((Vol)fields[i].get(bodies.get(0))).getContent().get(0)).getValue()
									+" x 10"
									+ exponentize(""+((JAXBElement)((Vol)fields[i].get(bodies.get(0))).getContent().get(1)).getValue());
						}
					}
				}
				else
					value = ""+fields[i].get(bodies.get(0));
				
				if(value!="")
				{
					value += units.get(i);
					model.addRow(new String[]{field,value});
				}
			}
			catch (IllegalArgumentException | IllegalAccessException e)
			{
				e.printStackTrace();
			}
		}
		return model;
	}
    
    /**
	 * Crea il Model di una tabella, contenente tutti i dati relativi al Body
     * @return il Model della tabella con i dati inseriti
     */
    public DefaultTableModel printBodyTable(Bodroot engNames)
	{
    	List<String >units = Arrays.asList(
    			new String[]
    			{
	    			"", "", " km", " km", " km", "",
	    			"°", " kg", " km\u00B3", " g/cm\u00B3", " m/s\u00B2"," m/s",
	    			" km", " km", " km", "", " km", " days",
	    			" h", "", "", "", "", "°",
	    			" K", "°", "°", "°", ""
    			});
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Data");
		model.addColumn("Value");
		
		Field[] fields = Bodroot.Bodies.class.getDeclaredFields();
		String firstCap="";
		String field="";
		String value="";
		for(int i=0;i<fields.length-4;i++)
		{
			try
			{
				value="";
				firstCap = fields[i].getName().substring(0, 1).toUpperCase()+fields[i].getName().substring(1);
				firstCap = firstCap.replaceAll("\\d+", "").replaceAll("(.)([A-Z])", "$1 $2");
				field = firstCap+":";
				if(fields[i].get(bodies.get(0)).getClass() != String.class
						&& !(fields[i].get(bodies.get(0)) instanceof Number)
				)
				{
					if(fields[i].get(bodies.get(0)).getClass() == AroundPlanet.class)
					{
						
						if(((AroundPlanet)fields[i].get(bodies.get(0))).getContent().size() != 1)
							value = engNames.bodies.get(0).englishName;
						
					}
					else if(fields[i].get(bodies.get(0)).getClass() == Mass.class)
					{
						if(((Mass)fields[i].get(bodies.get(0))).getContent().size() != 1)
						{
							value = ""+((JAXBElement)((Mass)fields[i].get(bodies.get(0))).getContent().get(1)).getValue()
									+" x 10"
									+ exponentize(""+((JAXBElement)((Mass)fields[i].get(bodies.get(0))).getContent().get(0)).getValue());
						}
					}
					else if(fields[i].get(bodies.get(0)).getClass() == Vol.class)
					{
						if(((Vol)fields[i].get(bodies.get(0))).getContent().size() != 1)
						{
							value = ""+((JAXBElement)((Vol)fields[i].get(bodies.get(0))).getContent().get(0)).getValue()
									+" x 10"
									+ exponentize(""+((JAXBElement)((Vol)fields[i].get(bodies.get(0))).getContent().get(1)).getValue());
						}
					}
				}
				else
					value = ""+fields[i].get(bodies.get(0));
				
				if(value!="")
				{
					value += units.get(i);
					model.addRow(new String[]{field,value});
				}
			}
			catch (IllegalArgumentException | IllegalAccessException e)
			{
				e.printStackTrace();
			}
		}
		return model;
	}
    
    /**
     * Crea il Model di una tabella in cui il campo AroundPlanet e' vuoto, contenente il nome dei Body (solitamente di tipo Planet)
     * @return il Model della tabella con i dati inseriti
     */
    public DefaultTableModel printBodiesList()
   	{
   		DefaultTableModel model=new DefaultTableModel();
   		model.addColumn("Id");
   		model.addColumn("Name");
   		
   		for(int i=0;i<bodies.size();i++)
   		{
   			model.addRow(new String[]{bodies.get(i).getId(), bodies.get(i).getEnglishName()});
   			
   		}
   		return model;
   	}
    
    /**
     * Crea il Model di una tabella, contenente il nome dei Body di tipo Moon e attorno a quale Body ruotano
     * @param englishNames Nomi inglesi dei Body che possiedono Moons (solitamente di tipo Planet)
     * @return il Model della tabella con i dati inseriti
     */
    public DefaultTableModel printBodiesList(Bodroot englishNames)
	{
		DefaultTableModel model=new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("Name");
		model.addColumn("Around Planet");

		for(int i=0;i<bodies.size();i++)
		{
			int j=0;
			String engName="";
			Boolean flag=false;
			while(j<englishNames.bodies.size() && !flag)
			{
				if(((JAXBElement)bodies.get(i).getAroundPlanet().getContent().get(0)).getValue().equals(englishNames.bodies.get(j).getId()))
					flag=true;
				else
					j++;
			}
			if(flag)
				engName=englishNames.bodies.get(j).getEnglishName();
			model.addRow(new String[]{bodies.get(i).getId(), bodies.get(i).getEnglishName(), engName});
			
		}
		return model;
	}
    
    
    /**
     * Trasforma una stringa contenente un numero in una stringa contenente un esponente
     * @param num Stringa da trasformare
     * @return una Stringa contenente il corrispondente esponente
     */
    private String exponentize(String num)
    {
    	String exp="";
    	for(int i=0;i<num.length();i++)
    	{
    		if(num.charAt(i)=='1')
    			exp+="\u00B9";
    		else if(num.charAt(i)=='2')
    			exp+="\u00B2";
    		else if(num.charAt(i)=='3')
    			exp+="\u00B3";
    		else if(num.charAt(i)=='4')
    			exp+="\u2074";
    		else if(num.charAt(i)=='5')
    			exp+="\u2075";
    		else if(num.charAt(i)=='6')
    			exp+="\u2076";
    		else if(num.charAt(i)=='7')
    			exp+="\u2077";
    		else if(num.charAt(i)=='8')
    			exp+="\u2078";
    		else if(num.charAt(i)=='9')
    			exp+="\u2079";
    		else if(num.charAt(i)=='0')
    			exp+="\u2070";
    	}
    	return exp;
    }
    /**
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="alternativeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="aphelion" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="argPeriapsis" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="aroundPlanet">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="planet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="null" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="avgTemp" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="axialTilt" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="bodyType" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="density" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="dimension" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="discoveredBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="discoveryDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="eccentricity" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="englishName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="equaRadius" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="escape" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="flattening" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="gravity" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="inclination" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="isPlanet" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="longAscNode" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="mainAnomaly" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="mass">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="massExponent" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
     *                   &lt;element name="massValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="null" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="meanRadius" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="moons">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="element" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="moon" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="rel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="null" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="perihelion" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="polarRadius" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="rel" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="semimajorAxis" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="sideralOrbit" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="sideralRotation" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="vol">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="volExponent" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
     *                   &lt;element name="volValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="null" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "alternativeName",
        "aphelion",
        "argPeriapsis",
        "aroundPlanet",
        "avgTemp",
        "axialTilt",
        "bodyType",
        "density",
        "dimension",
        "discoveredBy",
        "discoveryDate",
        "eccentricity",
        "englishName",
        "equaRadius",
        "escape",
        "flattening",
        "gravity",
        "id",
        "inclination",
        "isPlanet",
        "longAscNode",
        "mainAnomaly",
        "mass",
        "meanRadius",
        "moons",
        "name",
        "perihelion",
        "polarRadius",
        "rel",
        "semimajorAxis",
        "sideralOrbit",
        "sideralRotation",
        "vol"
    })
    public static class Bodies {
    	@XmlElement(required = true)
        protected String englishName;
    	@XmlElement(required = true)
        protected Bodroot.Bodies.Moons moons;
    	protected long semimajorAxis;
    	protected long perihelion;
    	protected long aphelion;
    	protected float eccentricity;
    	protected float inclination;
    	@XmlElement(required = true)
        protected Bodroot.Bodies.Mass mass;
    	@XmlElement(required = true)
        protected Bodroot.Bodies.Vol vol;
        protected float density;
        protected float gravity;
        protected float escape;
        protected float meanRadius;
        protected float equaRadius;
        protected float polarRadius;
        protected float flattening; 
        @XmlElement(required = true)
        protected String dimension;
        protected float sideralOrbit;
        protected float sideralRotation;
        @XmlElement(required = true)
        protected Bodroot.Bodies.AroundPlanet aroundPlanet;
        @XmlElement(required = true)
        protected String discoveredBy;
        @XmlElement(required = true)
        protected String discoveryDate;
        @XmlElement(required = true)
        protected String alternativeName; 
        protected float axialTilt;
        protected short avgTemp;
        protected float mainAnomaly;
        protected float argPeriapsis;
        protected float longAscNode;
        @XmlElement(required = true)
        protected String bodyType;        

        @XmlElement(required = true)
        protected String id;
        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String isPlanet;
        @XmlElement(required = true)
        protected String rel;
        /**
         * Recupera il valore della proprietà alternativeName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlternativeName() {
            return alternativeName;
        }

        /**
         * Imposta il valore della proprietà alternativeName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlternativeName(String value) {
            this.alternativeName = value;
        }

        /**
         * Recupera il valore della proprietà aphelion.
         * 
         */
        public long getAphelion() {
            return aphelion;
        }

        /**
         * Imposta il valore della proprietà aphelion.
         * 
         */
        public void setAphelion(long value) {
            this.aphelion = value;
        }

        /**
         * Recupera il valore della proprietà argPeriapsis.
         * 
         */
        public float getArgPeriapsis() {
            return argPeriapsis;
        }

        /**
         * Imposta il valore della proprietà argPeriapsis.
         * 
         */
        public void setArgPeriapsis(float value) {
            this.argPeriapsis = value;
        }

        /**
         * Recupera il valore della proprietà aroundPlanet.
         * 
         * @return
         *     possible object is
         *     {@link Bodroot.Bodies.AroundPlanet }
         *     
         */
        public Bodroot.Bodies.AroundPlanet getAroundPlanet() {
            return aroundPlanet;
        }

        /**
         * Imposta il valore della proprietà aroundPlanet.
         * 
         * @param value
         *     allowed object is
         *     {@link Bodroot.Bodies.AroundPlanet }
         *     
         */
        public void setAroundPlanet(Bodroot.Bodies.AroundPlanet value) {
            this.aroundPlanet = value;
        }

        /**
         * Recupera il valore della proprietà avgTemp.
         * 
         */
        public short getAvgTemp() {
            return avgTemp;
        }

        /**
         * Imposta il valore della proprietà avgTemp.
         * 
         */
        public void setAvgTemp(short value) {
            this.avgTemp = value;
        }

        /**
         * Recupera il valore della proprietà axialTilt.
         * 
         */
        public float getAxialTilt() {
            return axialTilt;
        }

        /**
         * Imposta il valore della proprietà axialTilt.
         * 
         */
        public void setAxialTilt(float value) {
            this.axialTilt = value;
        }

        /**
         * Recupera il valore della proprietà bodyType.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBodyType() {
            return bodyType;
        }

        /**
         * Imposta il valore della proprietà bodyType.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBodyType(String value) {
            this.bodyType = value;
        }

        /**
         * Recupera il valore della proprietà density.
         * 
         */
        public float getDensity() {
            return density;
        }

        /**
         * Imposta il valore della proprietà density.
         * 
         */
        public void setDensity(float value) {
            this.density = value;
        }

        /**
         * Recupera il valore della proprietà dimension.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDimension() {
            return dimension;
        }

        /**
         * Imposta il valore della proprietà dimension.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDimension(String value) {
            this.dimension = value;
        }

        /**
         * Recupera il valore della proprietà discoveredBy.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiscoveredBy() {
            return discoveredBy;
        }

        /**
         * Imposta il valore della proprietà discoveredBy.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiscoveredBy(String value) {
            this.discoveredBy = value;
        }

        /**
         * Recupera il valore della proprietà discoveryDate.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiscoveryDate() {
            return discoveryDate;
        }

        /**
         * Imposta il valore della proprietà discoveryDate.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiscoveryDate(String value) {
            this.discoveryDate = value;
        }

        /**
         * Recupera il valore della proprietà eccentricity.
         * 
         */
        public float getEccentricity() {
            return eccentricity;
        }

        /**
         * Imposta il valore della proprietà eccentricity.
         * 
         */
        public void setEccentricity(float value) {
            this.eccentricity = value;
        }

        /**
         * Recupera il valore della proprietà englishName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnglishName() {
            return englishName;
        }

        /**
         * Imposta il valore della proprietà englishName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnglishName(String value) {
            this.englishName = value;
        }

        /**
         * Recupera il valore della proprietà equaRadius.
         * 
         */
        public float getEquaRadius() {
            return equaRadius;
        }

        /**
         * Imposta il valore della proprietà equaRadius.
         * 
         */
        public void setEquaRadius(float value) {
            this.equaRadius = value;
        }

        /**
         * Recupera il valore della proprietà escape.
         * 
         */
        public float getEscape() {
            return escape;
        }

        /**
         * Imposta il valore della proprietà escape.
         * 
         */
        public void setEscape(float value) {
            this.escape = value;
        }

        /**
         * Recupera il valore della proprietà flattening.
         * 
         */
        public float getFlattening() {
            return flattening;
        }

        /**
         * Imposta il valore della proprietà flattening.
         * 
         */
        public void setFlattening(float value) {
            this.flattening = value;
        }

        /**
         * Recupera il valore della proprietà gravity.
         * 
         */
        public float getGravity() {
            return gravity;
        }

        /**
         * Imposta il valore della proprietà gravity.
         * 
         */
        public void setGravity(float value) {
            this.gravity = value;
        }

        /**
         * Recupera il valore della proprietà id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Imposta il valore della proprietà id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

        /**
         * Recupera il valore della proprietà inclination.
         * 
         */
        public float getInclination() {
            return inclination;
        }

        /**
         * Imposta il valore della proprietà inclination.
         * 
         */
        public void setInclination(float value) {
            this.inclination = value;
        }

        /**
         * Recupera il valore della proprietà isPlanet.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsPlanet() {
            return isPlanet;
        }

        /**
         * Imposta il valore della proprietà isPlanet.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsPlanet(String value) {
            this.isPlanet = value;
        }

        /**
         * Recupera il valore della proprietà longAscNode.
         * 
         */
        public float getLongAscNode() {
            return longAscNode;
        }

        /**
         * Imposta il valore della proprietà longAscNode.
         * 
         */
        public void setLongAscNode(float value) {
            this.longAscNode = value;
        }

        /**
         * Recupera il valore della proprietà mainAnomaly.
         * 
         */
        public float getMainAnomaly() {
            return mainAnomaly;
        }

        /**
         * Imposta il valore della proprietà mainAnomaly.
         * 
         */
        public void setMainAnomaly(float value) {
            this.mainAnomaly = value;
        }

        /**
         * Recupera il valore della proprietà mass.
         * 
         * @return
         *     possible object is
         *     {@link Bodroot.Bodies.Mass }
         *     
         */
        public Bodroot.Bodies.Mass getMass() {
            return mass;
        }

        /**
         * Imposta il valore della proprietà mass.
         * 
         * @param value
         *     allowed object is
         *     {@link Bodroot.Bodies.Mass }
         *     
         */
        public void setMass(Bodroot.Bodies.Mass value) {
            this.mass = value;
        }

        /**
         * Recupera il valore della proprietà meanRadius.
         * 
         */
        public float getMeanRadius() {
            return meanRadius;
        }

        /**
         * Imposta il valore della proprietà meanRadius.
         * 
         */
        public void setMeanRadius(float value) {
            this.meanRadius = value;
        }

        /**
         * Recupera il valore della proprietà moons.
         * 
         * @return
         *     possible object is
         *     {@link Bodroot.Bodies.Moons }
         *     
         */
        public Bodroot.Bodies.Moons getMoons() {
            return moons;
        }

        /**
         * Imposta il valore della proprietà moons.
         * 
         * @param value
         *     allowed object is
         *     {@link Bodroot.Bodies.Moons }
         *     
         */
        public void setMoons(Bodroot.Bodies.Moons value) {
            this.moons = value;
        }

        /**
         * Recupera il valore della proprietà name.
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
         * Imposta il valore della proprietà name.
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
         * Recupera il valore della proprietà perihelion.
         * 
         */
        public long getPerihelion() {
            return perihelion;
        }

        /**
         * Imposta il valore della proprietà perihelion.
         * 
         */
        public void setPerihelion(long value) {
            this.perihelion = value;
        }

        /**
         * Recupera il valore della proprietà polarRadius.
         * 
         */
        public float getPolarRadius() {
            return polarRadius;
        }

        /**
         * Imposta il valore della proprietà polarRadius.
         * 
         */
        public void setPolarRadius(float value) {
            this.polarRadius = value;
        }

        /**
         * Recupera il valore della proprietà rel.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRel() {
            return rel;
        }

        /**
         * Imposta il valore della proprietà rel.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRel(String value) {
            this.rel = value;
        }

        /**
         * Recupera il valore della proprietà semimajorAxis.
         * 
         */
        public long getSemimajorAxis() {
            return semimajorAxis;
        }

        /**
         * Imposta il valore della proprietà semimajorAxis.
         * 
         */
        public void setSemimajorAxis(long value) {
            this.semimajorAxis = value;
        }

        /**
         * Recupera il valore della proprietà sideralOrbit.
         * 
         */
        public float getSideralOrbit() {
            return sideralOrbit;
        }

        /**
         * Imposta il valore della proprietà sideralOrbit.
         * 
         */
        public void setSideralOrbit(float value) {
            this.sideralOrbit = value;
        }

        /**
         * Recupera il valore della proprietà sideralRotation.
         * 
         */
        public float getSideralRotation() {
            return sideralRotation;
        }

        /**
         * Imposta il valore della proprietà sideralRotation.
         * 
         */
        public void setSideralRotation(float value) {
            this.sideralRotation = value;
        }

        /**
         * Recupera il valore della proprietà vol.
         * 
         * @return
         *     possible object is
         *     {@link Bodroot.Bodies.Vol }
         *     
         */
        public Bodroot.Bodies.Vol getVol() {
            return vol;
        }

        /**
         * Imposta il valore della proprietà vol.
         * 
         * @param value
         *     allowed object is
         *     {@link Bodroot.Bodies.Vol }
         *     
         */
        public void setVol(Bodroot.Bodies.Vol value) {
            this.vol = value;
        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="planet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="null" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "content"
        })
        public static class AroundPlanet {

            @XmlElementRefs({
            	@XmlElementRef(name = "planet", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "rel", type = JAXBElement.class, required = false)
            })
            @XmlMixed
            protected List<Serializable> content;
            @XmlAttribute(name = "null")
            protected String _null;

            /**
             * Gets the value of the content property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the content property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * {@link JAXBElement }{@code <}{@link String }{@code >}
             * 
             * 
             */
            public List<Serializable> getContent() {
                if (content == null) {
                    content = new ArrayList<Serializable>();
                }
                return this.content;
            }

            /**
             * Recupera il valore della proprietà null.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNull() {
                return _null;
            }

            /**
             * Imposta il valore della proprietà null.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNull(String value) {
                this._null = value;
            }

        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="massExponent" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
         *         &lt;element name="massValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="null" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "content"
        })
        public static class Mass {

            @XmlElementRefs({
            	@XmlElementRef(name = "massExponent", type = JAXBElement.class, required = false),
            	@XmlElementRef(name = "massValue", type = JAXBElement.class, required = false)
                
            })
            @XmlMixed
            protected List<Serializable> content;
            @XmlAttribute(name = "null")
            protected String _null;

            /**
             * Gets the value of the content property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the content property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * {@link JAXBElement }{@code <}{@link Float }{@code >}
             * {@link JAXBElement }{@code <}{@link Byte }{@code >}
             * 
             * 
             */
            public List<Serializable> getContent() {
                if (content == null) {
                    content = new ArrayList<Serializable>();
                }
                return this.content;
            }

            /**
             * Recupera il valore della proprietà null.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNull() {
                return _null;
            }

            /**
             * Imposta il valore della proprietà null.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNull(String value) {
                this._null = value;
            }

        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="element" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="moon" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="rel" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="null" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "content"
        })
        public static class Moons {

            @XmlElementRef(name = "element", type = JAXBElement.class, required = false)
            @XmlMixed
            protected List<Serializable> content;
            @XmlAttribute(name = "null")
            protected String _null;

            /**
             * Gets the value of the content property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the content property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * {@link JAXBElement }{@code <}{@link Bodroot.Bodies.Moons.Element }{@code >}
             * 
             * 
             */
            public List<Serializable> getContent() {
                if (content == null) {
                    content = new ArrayList<Serializable>();
                }
                return this.content;
            }

            /**
             * Recupera il valore della proprietà null.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNull() {
                return _null;
            }

            /**
             * Imposta il valore della proprietà null.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNull(String value) {
                this._null = value;
            }


            /**
             * <p>Classe Java per anonymous complex type.
             * 
             * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="moon" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="rel" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "moon",
                "rel"
            })
            public static class Element {

                @XmlElement(required = true)
                protected String moon;
                @XmlElement(required = true)
                protected String rel;

                /**
                 * Recupera il valore della proprietà moon.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMoon() {
                    return moon;
                }

                /**
                 * Imposta il valore della proprietà moon.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMoon(String value) {
                    this.moon = value;
                }

                /**
                 * Recupera il valore della proprietà rel.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRel() {
                    return rel;
                }

                /**
                 * Imposta il valore della proprietà rel.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRel(String value) {
                    this.rel = value;
                }

            }

        }


        /**
         * <p>Classe Java per anonymous complex type.
         * 
         * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="volExponent" type="{http://www.w3.org/2001/XMLSchema}byte" minOccurs="0"/>
         *         &lt;element name="volValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="null" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "content"
        })
        public static class Vol {

            @XmlElementRefs({
                @XmlElementRef(name = "volValue", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "volExponent", type = JAXBElement.class, required = false)
            })
            @XmlMixed
            protected List<Serializable> content;
            @XmlAttribute(name = "null")
            protected String _null;

            /**
             * Gets the value of the content property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the content property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * {@link JAXBElement }{@code <}{@link Float }{@code >}
             * {@link JAXBElement }{@code <}{@link Byte }{@code >}
             * 
             * 
             */
            public List<Serializable> getContent() {
                if (content == null) {
                    content = new ArrayList<Serializable>();
                }
                return this.content;
            }

            /**
             * Recupera il valore della proprietà null.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNull() {
                return _null;
            }

            /**
             * Imposta il valore della proprietà null.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNull(String value) {
                this._null = value;
            }

        }

    }

}
