package org.wbsilva.bx.sourcecode2controlflow.org.moflon.tie;

import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;


import org.moflon.tgg.algorithm.modelgenerator.ModelGenerator;
import org.moflon.tgg.algorithm.modelgenerator.controller.*;

import org.wbsilva.bx.sourcecode2controlflow.Sourcecode2controlflowPackage;


public class Sourcecode2controlflowModelGen extends SynchronizationHelper{

   public Sourcecode2controlflowModelGen()
   {
      super(Sourcecode2controlflowPackage.eINSTANCE, ".");
   }

	public static void main(String[] args) throws IOException {
		// Set up logging
		BasicConfigurator.configure();

		AbstractModelGenerationController controller = new DefaultModelGenController();
		controller.addContinuationController(new MaxRulePerformCounterController(20));
      	controller.addContinuationController(new TimeoutController(5000));
      	controller.setRuleSelector(new LimitedRandomRuleSelector().addRuleLimit("<enter rule name>", 1));

		ModelGenerator gen = new ModelGenerator(Sourcecode2controlflowPackage.eINSTANCE, controller);
		gen.generate();
	}
}