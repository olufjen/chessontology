package no.chess.ontology.impl;

import no.chess.ontology.*;


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
 * Source Class: DefaultOccupant <br>
 * @version generated on Tue Oct 09 13:17:05 CEST 2018 by olj
 */
public class DefaultOccupant extends WrappedIndividualImpl implements Occupant {

    public DefaultOccupant(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://oljontologies.org/games/chess#makeMove
     */
     
    public Collection<? extends WrappedIndividual> getMakeMove() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_MAKEMOVE,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasMakeMove() {
	   return !getMakeMove().isEmpty();
    }

    public void addMakeMove(WrappedIndividual newMakeMove) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_MAKEMOVE,
                                       newMakeMove);
    }

    public void removeMakeMove(WrappedIndividual oldMakeMove) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_MAKEMOVE,
                                          oldMakeMove);
    }


    /* ***************************************************
     * Object Property http://oljontologies.org/games/chess#participatesIn
     */
     
    public Collection<? extends Move> getParticipatesIn() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_PARTICIPATESIN,
                                               DefaultMove.class);
    }

    public boolean hasParticipatesIn() {
	   return !getParticipatesIn().isEmpty();
    }

    public void addParticipatesIn(Move newParticipatesIn) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_PARTICIPATESIN,
                                       newParticipatesIn);
    }

    public void removeParticipatesIn(Move oldParticipatesIn) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_PARTICIPATESIN,
                                          oldParticipatesIn);
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
     * Object Property http://www.co-ode.org/ontologies/ont.owl#occupies
     */
     
    public Collection<? extends Taken> getOccupies() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_OCCUPIES,
                                               DefaultTaken.class);
    }

    public boolean hasOccupies() {
	   return !getOccupies().isEmpty();
    }

    public void addOccupies(Taken newOccupies) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_OCCUPIES,
                                       newOccupies);
    }

    public void removeOccupies(Taken oldOccupies) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_OCCUPIES,
                                          oldOccupies);
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
     * Object Property http://www.co-ode.org/ontologies/ont.owl#plays
     */
     
    public Collection<? extends WrappedIndividual> getPlays() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_PLAYS,
                                               WrappedIndividualImpl.class);
    }

    public boolean hasPlays() {
	   return !getPlays().isEmpty();
    }

    public void addPlays(WrappedIndividual newPlays) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_PLAYS,
                                       newPlays);
    }

    public void removePlays(WrappedIndividual oldPlays) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_PLAYS,
                                          oldPlays);
    }


    /* ***************************************************
     * Data Property http://www.co-ode.org/ontologies/ont.owl#hasName
     */
     
    public Collection<? extends Object> getHasName() {
		return getDelegate().getPropertyValues(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNAME, Object.class);
    }

    public boolean hasHasName() {
		return !getHasName().isEmpty();
    }

    public void addHasName(Object newHasName) {
	    getDelegate().addPropertyValue(getOwlIndividual(), Vocabulary.DATA_PROPERTY_HASNAME, newHasName);
    }

    public void removeHasName(Object oldHasName) {
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
