//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2022.04.02 alle 10:47:38 PM CEST 
//


package model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BodrootBodiesMassMassExponent_QNAME = new QName("", "massExponent");
    private final static QName _BodrootBodiesMassMassValue_QNAME = new QName("", "massValue");
    private final static QName _BodrootBodiesAroundPlanetPlanet_QNAME = new QName("", "planet");
    private final static QName _BodrootBodiesAroundPlanetRel_QNAME = new QName("", "rel");
    private final static QName _BodrootBodiesVolVolValue_QNAME = new QName("", "volValue");
    private final static QName _BodrootBodiesVolVolExponent_QNAME = new QName("", "volExponent");
    private final static QName _BodrootBodiesMoonsElement_QNAME = new QName("", "element");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Bodroot }
     * 
     */
    public Bodroot createBodroot() {
        return new Bodroot();
    }

    /**
     * Create an instance of {@link Bodroot.Bodies }
     * 
     */
    public Bodroot.Bodies createBodrootBodies() {
        return new Bodroot.Bodies();
    }

    /**
     * Create an instance of {@link Bodroot.Bodies.Moons }
     * 
     */
    public Bodroot.Bodies.Moons createBodrootBodiesMoons() {
        return new Bodroot.Bodies.Moons();
    }

    /**
     * Create an instance of {@link Bodroot.Bodies.AroundPlanet }
     * 
     */
    public Bodroot.Bodies.AroundPlanet createBodrootBodiesAroundPlanet() {
        return new Bodroot.Bodies.AroundPlanet();
    }

    /**
     * Create an instance of {@link Bodroot.Bodies.Mass }
     * 
     */
    public Bodroot.Bodies.Mass createBodrootBodiesMass() {
        return new Bodroot.Bodies.Mass();
    }

    /**
     * Create an instance of {@link Bodroot.Bodies.Vol }
     * 
     */
    public Bodroot.Bodies.Vol createBodrootBodiesVol() {
        return new Bodroot.Bodies.Vol();
    }

    /**
     * Create an instance of {@link Bodroot.Bodies.Moons.Element }
     * 
     */
    public Bodroot.Bodies.Moons.Element createBodrootBodiesMoonsElement() {
        return new Bodroot.Bodies.Moons.Element();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "massExponent", scope = Bodroot.Bodies.Mass.class)
    public JAXBElement<Byte> createBodrootBodiesMassMassExponent(Byte value) {
        return new JAXBElement<Byte>(_BodrootBodiesMassMassExponent_QNAME, Byte.class, Bodroot.Bodies.Mass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "massValue", scope = Bodroot.Bodies.Mass.class)
    public JAXBElement<Float> createBodrootBodiesMassMassValue(Float value) {
        return new JAXBElement<Float>(_BodrootBodiesMassMassValue_QNAME, Float.class, Bodroot.Bodies.Mass.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "planet", scope = Bodroot.Bodies.AroundPlanet.class)
    public JAXBElement<String> createBodrootBodiesAroundPlanetPlanet(String value) {
        return new JAXBElement<String>(_BodrootBodiesAroundPlanetPlanet_QNAME, String.class, Bodroot.Bodies.AroundPlanet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "rel", scope = Bodroot.Bodies.AroundPlanet.class)
    public JAXBElement<String> createBodrootBodiesAroundPlanetRel(String value) {
        return new JAXBElement<String>(_BodrootBodiesAroundPlanetRel_QNAME, String.class, Bodroot.Bodies.AroundPlanet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "volValue", scope = Bodroot.Bodies.Vol.class)
    public JAXBElement<Float> createBodrootBodiesVolVolValue(Float value) {
        return new JAXBElement<Float>(_BodrootBodiesVolVolValue_QNAME, Float.class, Bodroot.Bodies.Vol.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "volExponent", scope = Bodroot.Bodies.Vol.class)
    public JAXBElement<Byte> createBodrootBodiesVolVolExponent(Byte value) {
        return new JAXBElement<Byte>(_BodrootBodiesVolVolExponent_QNAME, Byte.class, Bodroot.Bodies.Vol.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bodroot.Bodies.Moons.Element }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "element", scope = Bodroot.Bodies.Moons.class)
    public JAXBElement<Bodroot.Bodies.Moons.Element> createBodrootBodiesMoonsElement(Bodroot.Bodies.Moons.Element value) {
        return new JAXBElement<Bodroot.Bodies.Moons.Element>(_BodrootBodiesMoonsElement_QNAME, Bodroot.Bodies.Moons.Element.class, Bodroot.Bodies.Moons.class, value);
    }

}
