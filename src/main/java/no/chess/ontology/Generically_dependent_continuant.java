package no.chess.ontology;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;

import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLOntology;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Generically_dependent_continuant <br>
 * @version generated on Mon Jul 23 13:24:47 CEST 2018 by olj
 */

public interface Generically_dependent_continuant extends Dependent_continuant {

    /* ***************************************************
     * Property http://www.co-ode.org/ontologies/ont.owl#isPartOf
     */
     
    /**
     * Gets all property values for the isPartOf property.<p>
     * 
     * @returns a collection of values for the isPartOf property.
     */
    Collection<? extends WrappedIndividual> getIsPartOf();

    /**
     * Checks if the class has a isPartOf property value.<p>
     * 
     * @return true if there is a isPartOf property value.
     */
    boolean hasIsPartOf();

    /**
     * Adds a isPartOf property value.<p>
     * 
     * @param newIsPartOf the isPartOf property value to be added
     */
    void addIsPartOf(WrappedIndividual newIsPartOf);

    /**
     * Removes a isPartOf property value.<p>
     * 
     * @param oldIsPartOf the isPartOf property value to be removed.
     */
    void removeIsPartOf(WrappedIndividual oldIsPartOf);


    /* ***************************************************
     * Property http://www.co-ode.org/ontologies/ont.owl#opponents
     */
     
    /**
     * Gets all property values for the opponents property.<p>
     * 
     * @returns a collection of values for the opponents property.
     */
    Collection<? extends WrappedIndividual> getOpponents();

    /**
     * Checks if the class has a opponents property value.<p>
     * 
     * @return true if there is a opponents property value.
     */
    boolean hasOpponents();

    /**
     * Adds a opponents property value.<p>
     * 
     * @param newOpponents the opponents property value to be added
     */
    void addOpponents(WrappedIndividual newOpponents);

    /**
     * Removes a opponents property value.<p>
     * 
     * @param oldOpponents the opponents property value to be removed.
     */
    void removeOpponents(WrappedIndividual oldOpponents);


    /* ***************************************************
     * Property http://www.co-ode.org/ontologies/ont.owl#hasName
     */
     
    /**
     * Gets all property values for the hasName property.<p>
     * 
     * @returns a collection of values for the hasName property.
     */
    Collection<? extends Object> getHasName();

    /**
     * Checks if the class has a hasName property value.<p>
     * 
     * @return true if there is a hasName property value.
     */
    boolean hasHasName();

    /**
     * Adds a hasName property value.<p>
     * 
     * @param newHasName the hasName property value to be added
     */
    void addHasName(Object newHasName);

    /**
     * Removes a hasName property value.<p>
     * 
     * @param oldHasName the hasName property value to be removed.
     */
    void removeHasName(Object oldHasName);



    /* ***************************************************
     * Property http://www.co-ode.org/ontologies/ont.owl#hasValue
     */
     
    /**
     * Gets all property values for the hasValue property.<p>
     * 
     * @returns a collection of values for the hasValue property.
     */
    Collection<? extends Integer> getHasValue();

    /**
     * Checks if the class has a hasValue property value.<p>
     * 
     * @return true if there is a hasValue property value.
     */
    boolean hasHasValue();

    /**
     * Adds a hasValue property value.<p>
     * 
     * @param newHasValue the hasValue property value to be added
     */
    void addHasValue(Integer newHasValue);

    /**
     * Removes a hasValue property value.<p>
     * 
     * @param oldHasValue the hasValue property value to be removed.
     */
    void removeHasValue(Integer oldHasValue);



    /* ***************************************************
     * Common interfaces
     */

    OWLNamedIndividual getOwlIndividual();

    OWLOntology getOwlOntology();

    void delete();

}
