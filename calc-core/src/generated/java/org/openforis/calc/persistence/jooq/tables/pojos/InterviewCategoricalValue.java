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
public class InterviewCategoricalValue implements java.io.Serializable {

	private static final long serialVersionUID = -247155187;

	private java.lang.Integer valueId;
	private java.lang.Integer interviewId;
	private java.lang.Integer categoryId;
	private java.lang.Boolean original;
	private java.lang.Boolean current;

	public java.lang.Integer getValueId() {
		return this.valueId;
	}

	public void setValueId(java.lang.Integer valueId) {
		this.valueId = valueId;
	}

	public java.lang.Integer getInterviewId() {
		return this.interviewId;
	}

	public void setInterviewId(java.lang.Integer interviewId) {
		this.interviewId = interviewId;
	}

	public java.lang.Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(java.lang.Integer categoryId) {
		this.categoryId = categoryId;
	}

	public java.lang.Boolean getOriginal() {
		return this.original;
	}

	public void setOriginal(java.lang.Boolean original) {
		this.original = original;
	}

	public java.lang.Boolean getCurrent() {
		return this.current;
	}

	public void setCurrent(java.lang.Boolean current) {
		this.current = current;
	}
}