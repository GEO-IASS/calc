package org.openforis.calc.persistence.jooq.rolap;

import org.openforis.calc.model.ObservationUnitMetadata;

/**
 * 
 * @author G. Miceli
 *
 */
public class InterviewCubeGenerator extends CubeGenerator {

	InterviewCubeGenerator(String dbSchema, ObservationUnitMetadata unit) {
		super(dbSchema, unit);
	}


}
