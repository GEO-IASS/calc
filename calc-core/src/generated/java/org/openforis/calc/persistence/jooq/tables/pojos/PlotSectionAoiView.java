/**
 * This class is generated by jOOQ
 */
package org.openforis.calc.persistence.jooq.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.6.0"},
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings("all")
public class PlotSectionAoiView implements java.io.Serializable {

	private static final long serialVersionUID = 477947057;

	private java.lang.Integer plotSectionId;
	private java.lang.Integer aoiId;

	public java.lang.Integer getPlotSectionId() {
		return this.plotSectionId;
	}

	public void setPlotSectionId(java.lang.Integer plotSectionId) {
		this.plotSectionId = plotSectionId;
	}

	public java.lang.Integer getAoiId() {
		return this.aoiId;
	}

	public void setAoiId(java.lang.Integer aoiId) {
		this.aoiId = aoiId;
	}
}