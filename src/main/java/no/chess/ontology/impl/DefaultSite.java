package no.chess.ontology.impl;

import no.chess.ontology.*;
import no.chess.ontology.Object;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultSite <br>
 * @version generated on Mon Jul 23 13:24:47 CEST 2018 by olj
 */
public class DefaultSite extends WrappedIndividualImpl implements Site {

    public DefaultSite(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.co-ode.org/ontologies/ont.owl#isPartOf
     */
     
    public Collection<? extends WrappedIndividual> getIsPartOf() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISPARTOF,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasIsPartOf() {
	   return !getIsPartOf().isEmpty();
    }

    public void addIsPartOf(WrappedIndividual newIsPartOf) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISPARTOF,
                                       newIsPartOf);
    }

    public void removeIsPartOf(WrappedIndividual oldIsPartOf) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISPARTOF,
                                          oldIsPartOf);
    }


    /* ***************************************************
     * Object Property http://www.co-ode.org/ontologies/ont.owl#opponents
     */
     
    public Collection<? extends WrappedIndividual> getOpponents() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_OPPONENTS,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasOpponents() {
	   return !getOpponents().isEmpty();
    }

    public void addOpponents(WrappedIndividual newOpponents) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_OPPONENTS,
                                       newOpponents);
    }

    public void removeOpponents(WrappedIndividual oldOpponents) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_OPPONENTS,
                                          oldOpponents);
    }


    /* ***************************************************
     * Data Property http://www.co-ode.org/ontologies/ont.owl#hasName
     */
     
    public Collection<? extends java.lang.Object> getHasName() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNAME, java.lang.Object.class);
    }

    public boolean hasHasName() {
		return !getHasName().isEmpty();
    }

    public void addHasName(java.lang.Object newHasName) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNAME, newHasName);
    }

    public void removeHasName(java.lang.Object oldHasName) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNAME, oldHasName);
    }


    /* ***************************************************
     * Data Property http://www.co-ode.org/ontologies/ont.owl#hasValue
     */
     
    public Collection<? extends Integer> getHasValue() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASVALUE, Integer.class);
    }

    public boolean hasHasValue() {
		return !getHasValue().isEmpty();
    }

    public void addHasValue(Integer newHasValue) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASVALUE, newHasValue);
    }

    public void removeHasValue(Integer oldHasValue) {
		getDelegate().removePropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASVALUE, oldHasValue);
    }


}
