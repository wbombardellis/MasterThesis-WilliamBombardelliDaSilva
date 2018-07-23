package org.wbsilva.bence.transformer.util;

/**
 * Utility methods for the user interface
 * 
 * @author wbombardellis
 *
 */
public class UIUtil {
	
	public static final String HELP_OPTION = "-h";
	public static final String FWD_OPTION = "-fwd";
	public static final String BWD_OPTION = "-bwd";
	
	public static void printSuccess() {
		System.out.println("Finished Successfully.");
	}

	public static boolean isOptionArgument(String arg) {
		return arg.contentEquals(HELP_OPTION) || arg.contentEquals(FWD_OPTION) || arg.contentEquals(BWD_OPTION);
	}

	public static void printStartReading() {
		System.out.println("Arguments accepted. Reading input models.");
	}

	public static void printFail() {
		System.out.println("Could not finish succcessfully. See error logs for more details.");
	}

	public static void printUsage() {
		System.out.println("java -jar JAR_FILE [OPTIONS] GRAMMAR_FILE INPUT_METAMODEL_FILE INPUT_MODEL_FILE OUTPUT_GRAPH_FILE");
		System.out.println();
		
		System.out.println("This program transforms a labelled graph into another according to a B-eNCE triple graph grammar");
		System.out.println("JAR_FILE is the name of this jar file being executed");
		System.out.println("GRAMMAR_FILE is the relative or absolute path to the XMI file containing the B-eNCE triple graph grammar");
		System.out.println("INPUT_METAMODEL_FILE is relative or absolute path to the XMI file containing the input model's metamodel");
		System.out.println("INPUT_MODEL_FILE is relative or absolute path to the XMI file containing the input model");
		System.out.println("OUTPUT_GRAPH_FILE is relative or absolute path to the XMI file to be saved with the transformed graph");
		System.out.println();
		
		System.out.println("OPTIONS are:");
		System.out.println(String.format("\t %s\t Prints this help", HELP_OPTION));
		System.out.println(String.format("\t %s\t Default. Uses input graph as source graph and generates the target graph", FWD_OPTION));
		System.out.println(String.format("\t %s\t Uses input graph as target graph and generates the source graph", BWD_OPTION));
		System.out.println("If conflicting options occur, then the last ones will be used.");
		System.out.println();
		
		System.out.println("Author: William Bombardelli da Silva, wbombardellis@win.tu-berlin.de");
		System.out.println("Creation Date: Apr 2018");
		System.out.println();
		System.out.println("    Copyright © 2018 William Bombardelli da Silva");
		System.out.println();
		System.out.println("    This program is free software: you can redistribute it and/or modify\n" + 
				"    it under the terms of the GNU General Public License as published by\n" + 
				"    the Free Software Foundation, either version 3 of the License, or\n" + 
				"    (at your option) any later version.\n" + 
				"\n" + 
				"    This program is distributed in the hope that it will be useful,\n" + 
				"    but WITHOUT ANY WARRANTY; without even the implied warranty of\n" + 
				"    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the\n" + 
				"    GNU General Public License for more details.\n" + 
				"\n" + 
				"    You should have received a copy of the GNU General Public License\n" + 
				"    along with this program.  If not, see <https://www.gnu.org/licenses/>.");
	}

	public static void printFinishSaving() {
		System.out.println("Transformation finished and data saved to output file successfully.");
	}

	public static void printTransformationFail() {
		System.out.println("Transformation finished without success. Nothing to save. See error logs for more details.");
	}
}
