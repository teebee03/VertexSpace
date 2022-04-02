package model;
//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.03.31 alle 10:33:40 PM CEST 
//




import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="meanRadius" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="bodyType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="englishName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="semimajorAxis" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mass">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="massExponent" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="massValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="argPeriapsis" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="discoveredBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="isPlanet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="perihelion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mainAnomaly" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="aphelion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sideralRotation" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="vol">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="volValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="volExponent" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="axialTilt" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aroundPlanet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="alternativeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="escape" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="dimension" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inclination" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="polarRadius" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="sideralOrbit" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="density" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="flattening" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="moons" maxOccurs="unbounded" minOccurs="0">
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
 *         &lt;element name="eccentricity" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="longAscNode" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="equaRadius" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="avgTemp" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="discoveryDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gravity" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "meanRadius",
    "bodyType",
    "englishName",
    "semimajorAxis",
    "mass",
    "argPeriapsis",
    "discoveredBy",
    "isPlanet",
    "perihelion",
    "mainAnomaly",
    "aphelion",
    "sideralRotation",
    "vol",
    "axialTilt",
    "id",
    "aroundPlanet",
    "alternativeName",
    "escape",
    "dimension",
    "inclination",
    "polarRadius",
    "sideralOrbit",
    "density",
    "flattening",
    "moons",
    "eccentricity",
    "longAscNode",
    "equaRadius",
    "avgTemp",
    "discoveryDate",
    "gravity",
    "name"
})
@XmlRootElement(name = "body")
public class Body {

    protected float meanRadius;
    @XmlElement(required = true)
    protected String bodyType;
    @XmlElement(required = true)
    protected String englishName;
    protected int semimajorAxis;
    @XmlElement(required = true)
    protected Body.Mass mass;
    protected float argPeriapsis;
    @XmlElement(required = true)
    protected String discoveredBy;
    @XmlElement(required = true)
    protected String isPlanet;
    protected int perihelion;
    protected float mainAnomaly;
    protected int aphelion;
    protected float sideralRotation;
    @XmlElement(required = true)
    protected Body.Vol vol;
    protected float axialTilt;
    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String aroundPlanet;
    @XmlElement(required = true)
    protected String alternativeName;
    protected float escape;
    @XmlElement(required = true)
    protected String dimension;
    protected float inclination;
    protected float polarRadius;
    protected float sideralOrbit;
    protected float density;
    protected float flattening;
    protected List<Body.Moons> moons;
    protected float eccentricity;
    protected float longAscNode;
    protected float equaRadius;
    protected short avgTemp;
    @XmlElement(required = true)
    protected String discoveryDate;
    protected float gravity;
    @XmlElement(required = true)
    protected String name;

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
     * Recupera il valore della proprietà semimajorAxis.
     * 
     */
    public int getSemimajorAxis() {
        return semimajorAxis;
    }

    /**
     * Imposta il valore della proprietà semimajorAxis.
     * 
     */
    public void setSemimajorAxis(int value) {
        this.semimajorAxis = value;
    }

    /**
     * Recupera il valore della proprietà mass.
     * 
     * @return
     *     possible object is
     *     {@link Body.Mass }
     *     
     */
    public Body.Mass getMass() {
        return mass;
    }

    /**
     * Imposta il valore della proprietà mass.
     * 
     * @param value
     *     allowed object is
     *     {@link Body.Mass }
     *     
     */
    public void setMass(Body.Mass value) {
        this.mass = value;
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
     * Recupera il valore della proprietà perihelion.
     * 
     */
    public int getPerihelion() {
        return perihelion;
    }

    /**
     * Imposta il valore della proprietà perihelion.
     * 
     */
    public void setPerihelion(int value) {
        this.perihelion = value;
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
     * Recupera il valore della proprietà aphelion.
     * 
     */
    public int getAphelion() {
        return aphelion;
    }

    /**
     * Imposta il valore della proprietà aphelion.
     * 
     */
    public void setAphelion(int value) {
        this.aphelion = value;
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
     *     {@link Body.Vol }
     *     
     */
    public Body.Vol getVol() {
        return vol;
    }

    /**
     * Imposta il valore della proprietà vol.
     * 
     * @param value
     *     allowed object is
     *     {@link Body.Vol }
     *     
     */
    public void setVol(Body.Vol value) {
        this.vol = value;
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
     * Recupera il valore della proprietà aroundPlanet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAroundPlanet() {
        return aroundPlanet;
    }

    /**
     * Imposta il valore della proprietà aroundPlanet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAroundPlanet(String value) {
        this.aroundPlanet = value;
    }

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
     * Gets the value of the moons property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moons property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMoons().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Body.Moons }
     * 
     * 
     */
    public List<Body.Moons> getMoons() {
        if (moons == null) {
            moons = new ArrayList<Body.Moons>();
        }
        return this.moons;
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
     * <p>Classe Java per anonymous complex type.
     * 
     * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="massExponent" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="massValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
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
        "massExponent",
        "massValue"
    })
    public static class Mass {

        protected byte massExponent;
        protected float massValue;

        /**
         * Recupera il valore della proprietà massExponent.
         * 
         */
        public byte getMassExponent() {
            return massExponent;
        }

        /**
         * Imposta il valore della proprietà massExponent.
         * 
         */
        public void setMassExponent(byte value) {
            this.massExponent = value;
        }

        /**
         * Recupera il valore della proprietà massValue.
         * 
         */
        public float getMassValue() {
            return massValue;
        }

        /**
         * Imposta il valore della proprietà massValue.
         * 
         */
        public void setMassValue(float value) {
            this.massValue = value;
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
    public static class Moons {

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
     *         &lt;element name="volValue" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="volExponent" type="{http://www.w3.org/2001/XMLSchema}byte"/>
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
        "volValue",
        "volExponent"
    })
    public static class Vol {

        protected float volValue;
        protected byte volExponent;

        /**
         * Recupera il valore della proprietà volValue.
         * 
         */
        public float getVolValue() {
            return volValue;
        }

        /**
         * Imposta il valore della proprietà volValue.
         * 
         */
        public void setVolValue(float value) {
            this.volValue = value;
        }

        /**
         * Recupera il valore della proprietà volExponent.
         * 
         */
        public byte getVolExponent() {
            return volExponent;
        }

        /**
         * Imposta il valore della proprietà volExponent.
         * 
         */
        public void setVolExponent(byte value) {
            this.volExponent = value;
        }

    }

}
