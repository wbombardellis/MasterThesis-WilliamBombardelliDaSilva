package org.wbsilva.bx.aktivity2csp.org.moflon.tie;

import java.io.IOException;
import org.apache.log4j.BasicConfigurator;
import org.moflon.tgg.algorithm.synchronization.SynchronizationHelper;


import org.wbsilva.bx.aktivity2csp.Aktivity2cspPackage;


public class Aktivity2cspConsistencyCheck extends SynchronizationHelper{

   public Aktivity2cspConsistencyCheck()
   {
      super(Aktivity2cspPackage.eINSTANCE, ".");
   }
	public static void main(String[] args) throws IOException {
		// Set up logging
        BasicConfigurator.configure();

        Aktivity2cspConsistencyCheck helper = new Aktivity2cspConsistencyCheck();
        helper.loadSrc("instances/src.xmi");
		helper.loadTrg("instances/trg.xmi");

		boolean prepareDeltas = true;
		helper.createCorrespondences(prepareDeltas);

		if(prepareDeltas){
			//src and trg models are modified when preparing deltas.
			//save all files in a separate location
			helper.saveSrc("instances/cc_result/src.xmi");
			helper.saveTrg("instances/cc_result/trg.xmi");
			helper.saveCorr("instances/cc_result/corr.xmi");
			helper.saveConsistencyCheckProtocol("instances/cc_result/protocol.xmi");
			helper.saveInconsistentSourceDelta();
			helper.saveInconsistentTargetDelta();
		}
		else{
			//src and trg models are not modified.
			//save correspondence model and protocol only
			helper.saveCorr("instances/corr.xmi");
			helper.saveConsistencyCheckProtocol("instances/protocol.xmi");
		}
	}
}