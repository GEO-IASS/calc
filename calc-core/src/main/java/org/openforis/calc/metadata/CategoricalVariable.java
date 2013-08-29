package org.openforis.calc.metadata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * A variable which may take on one or more distinct values of type {@link Category}.
 * 
 * @author G. Miceli
 * @author M. Togna
 */
@javax.persistence.Entity
@DiscriminatorValue("C")
public class CategoricalVariable extends Variable {
	@Column(name = "multiple_response")
	private Boolean multipleResponse;
	
	@Transient // TODO persist
	private boolean pivotCategories;
	
	@Transient // TODO persist
	private ArrayList<Hierarchy> hierarchies = new ArrayList<Hierarchy>();
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "default_category_id")
	@JsonIgnore
	private Category defaultValue;

	@Column(name = "input_category_id_column")
	private String inputCategoryIdColumn;

	@Column(name = "output_category_id_column")
	private String outputCategoryIdColumn;

	@Column(name = "disaggregate")
	private boolean disaggregate;

	// TODO remove term "dimension" from name (Calc model uses statistical terminology while "dimension" is OLAP term)
	@Column(name = "degenerate_dimension")
	private boolean degenerateDimension;

	public CategoricalVariable() {
	}
	
	protected CategoricalVariable(Scale scale) {
		super.setScale(scale);
	}

	public Category getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(Category defaultValue) {
		this.defaultValue = defaultValue;
	}
	
	/**
	 * Indicates if the order of the categories has meaning (ORDINAL, 
	 * e.g. severity, size) or if they are unordered categorizations 
	 * (NOMINAL, e.g. land use, ownership).
	 * 
	 * @return
	 */
	public boolean isOrdered() {
		return getScale() == Scale.ORDINAL;
	}
	
	public void setMultipleResponse(boolean multipleResponse) {
		this.multipleResponse = multipleResponse;
	}
	public boolean isMultipleResponse() {
		return multipleResponse == null || multipleResponse;
	}

	public void setPivotCategories(boolean pivotCategories) {
		this.pivotCategories = pivotCategories;
	}

	public boolean isPivotCategories() {
		return this.pivotCategories;
	}
	
	public List<Hierarchy> getHierarchies() {
		return Collections.unmodifiableList(hierarchies);
	}
	
	public String getInputCategoryIdColumn() {
		return inputCategoryIdColumn;
	}

	public void setInputCategoryIdColumn(String inputCcategoryIdColumn) {
		this.inputCategoryIdColumn = inputCcategoryIdColumn;
	}

	public String getOutputCategoryIdColumn() {
		return outputCategoryIdColumn;
	}

	public void setOutputCategoryIdColumn(String outputCategoryIdColumn) {
		this.outputCategoryIdColumn = outputCategoryIdColumn;
	}

	@Override
	public Type getType() {
		return Type.CATEGORICAL;
	}

	public boolean isDisaggregate() {
		return disaggregate;
	}

	public void setDisaggregate(boolean disaggregate) {
		this.disaggregate = disaggregate;
	}
	
	@Override
	public void setScale(Scale scale) {
		if ( scale != Scale.NOMINAL && scale != Scale.ORDINAL ) {
			throw new IllegalArgumentException("Illegal scale: " + scale);
		}
		super.setScale(scale);
	}

	public Boolean isDegenerateDimension() {
		return degenerateDimension;
	}

	public void setDegenerateDimension(boolean degenerateDimension) {
		this.degenerateDimension = degenerateDimension;
	}
	
	@Override
	public boolean isInput() {
		return super.isInput() || inputCategoryIdColumn != null;
	}
}
