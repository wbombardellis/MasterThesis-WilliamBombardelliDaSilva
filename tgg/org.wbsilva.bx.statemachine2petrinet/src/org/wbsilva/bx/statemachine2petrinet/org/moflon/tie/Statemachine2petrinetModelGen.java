package org.wbsilva.bx.statemachine2petrinet.org.moflon.tie;

import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;


import org.moflon.tgg.algorithm.modelgenerator.ModelGenerator;
import org.moflon.tgg.algorithm.modelgenerator.controller.*;

import org.wbsilva.bx.statemachine2petrinet.Statemachine2petrinetPackage;


public class Statemachine2petrinetModelGen extends SynchronizationHelper{

   public Statemachine2petrinetModelGen()
   {
      super(Statemachine2petrinetPackage.eINSTANCE, ".");
   }

	public static void main(String[] args) throws IOException {
		// Set up logging
		BasicConfigurator.configure();

		AbstractModelGenerationController controller = new DefaultModelGenController();
		controller.addContinuationController(new MaxRulePerformCounterController(20));
      	controller.addContinuationController(new TimeoutController(5000));
      	controller.setRuleSelector(new LimitedRandomRuleSelector().addRuleLimit("<enter rule name>", 1));

		ModelGenerator gen = new ModelGenerator(Statemachine2petrinetPackage.eINSTANCE, controller);
		gen.generate();
	}
}