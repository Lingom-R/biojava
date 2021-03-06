/*
 *                    BioJava development code
 *
 * This code may be freely distributed and modified under the
 * terms of the GNU Lesser General Public Licence.  This should
 * be distributed with the code.  If you do not have a copy,
 * see:
 *
 *      http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright for this code is held jointly by the individual
 * authors.  These should be listed in @author doc comments.
 *
 * For more information on the BioJava project and its aims,
 * or to join the biojava-l mailing list, visit the home page
 * at:
 *
 *      http://www.biojava.org/
 *
 * Created on August 13, 2010
 * Author: Mark Chapman
 */

package org.biojava.nbio.alignment.io;

/**
 * Stores all the content parsed from the #=GC lines
 *
 * @since 3.0.5
 * @author Amr ALHOSSARY
 * @author Marko Vaz
 *
 */
class StockholmConsensusAnnotation {
	private String secondaryStructure;
	private String sequenceConsensus;
	private String surfaceAccessibility;
	private String transMembrane;
	private String posteriorProbability;
	private String ligandBinding;
	private String activeSite;
	private String asPFamPredicted;
	private String asSwissProt;
	private String intron; //TODO (?)
	private String referenceAnnotation;
	private String modelMask;

	public String getSecondaryStructure() {
		return secondaryStructure;
	}

	public void setSecondaryStructure(String secondaryStructure) {
		this.secondaryStructure = secondaryStructure;
	}

	public String getSequenceConsensus() {
		return sequenceConsensus;
	}

	public void setSequenceConsensus(String sequenceConsensus) {
		this.sequenceConsensus = sequenceConsensus;
	}

	public String getSurfaceAccessibility() {
		return surfaceAccessibility;
	}

	public void setSurfaceAccessibility(String surfaceAccessibility) {
		this.surfaceAccessibility = surfaceAccessibility;
	}

	public String getTransMembrane() {
		return transMembrane;
	}

	public void setTransMembrane(String transMembrane) {
		this.transMembrane = transMembrane;
	}

	public String getPosteriorProbability() {
		return posteriorProbability;
	}

	public void setPosteriorProbability(String posteriorProbability) {
		this.posteriorProbability = posteriorProbability;
	}

	public String getLigandBinding() {
		return ligandBinding;
	}

	public void setLigandBinding(String ligandBinding) {
		this.ligandBinding = ligandBinding;
	}

	public String getActiveSite() {
		return activeSite;
	}

	public void setActiveSite(String activeSite) {
		this.activeSite = activeSite;
	}

	public String getAsPFamPredicted() {
		return asPFamPredicted;
	}

	public void setAsPFamPredicted(String asPFamPredicted) {
		this.asPFamPredicted = asPFamPredicted;
	}

	public String getAsSwissProt() {
		return asSwissProt;
	}

	public void setAsSwissProt(String asSwissProt) {
		this.asSwissProt = asSwissProt;
	}

	public String getIntron() {
		return intron;
	}

	public void setIntron(String intron) {
		this.intron = intron;
	}

	public String getReferenceAnnotation() {
		return referenceAnnotation;
	}

	public void setReferenceAnnotation(String referenceAnnotation) {
		this.referenceAnnotation = referenceAnnotation;
	}

	public String getModelMask() {
		return modelMask;
	}

	public void setModelMask(String modelMask) {
		this.modelMask = modelMask;
	}

}
