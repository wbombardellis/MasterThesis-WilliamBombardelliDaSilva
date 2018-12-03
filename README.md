# Transformations with Triple Graph Grammars with Non-terminal Symbols
This repository holds a master thesis about model transformation with triple graph grammars

## General Information
 - **Author:**      William Bombardelli da Silva
 - **Advisor:**     Max Bureck
 - **Reviewer:**    Prof. Dr.-Ing. Ina Schieferdecker
 - **Reviewer:**    Prof. Dr. Dr. h.c. Sahin Albayrak
 - **University:**  Technische Universität Berlin
 - **Faculty:**     Fakultät IV Elektrotechnik Und Informatik
 - **Couse:**       Master of Science in Computer Science

## License
This work is licensed under the Creative Commons 
Attribution-NonCommercial-ShareAlike 3.0 Unported License.
To view a copy of this license, visit 
[http://creativecommons.org/licenses/by-nc-sa/3.0/](http://creativecommons.org/licenses/by-nc-sa/3.0/) or send a letter
to Creative Commons, PO Box 1866, Mountain View, CA 94042, USA.

## FILES
Below are the description of the most important folders of this thesis.
- `./transformer/*`
  - This folder holds the main applications of this thesis
- `./transformer/org.wbsilva.bence.graphgrammar`
  - This folder holds the code of the implemented BNCE triple graph grammar formalism
- `./transformer/org.wbsilva.bence.transformer`
  - This folder holds our implementation for the BNCE transformer, including a parser for BNCE graph gramamrs
- `./transformer/org.wbsilva.bence.evaluation`
  - This folder hold the application that evaluates the usability of the BNCE TGG formalism
- `./metamodels/*`
  - This folder holds the metamodels for the transformations
- `./bence/*`
  - This folder holds the transformations written in BNCE 
- `./tgg/*`
  - This folder holds the transformations written in eMoflon TGG 
- `./Thesis/*`
  - This folder holds the text of this thesis
- `./Submissions/*`
  - This folder holds the submitted papers that came out of this thesis
- `./Presentations/*`
  - This folder holds the presentations of this thesis
- `./DetailedProposal/*`
  - This folder holds a detailed proposal of this thesis
- `./Proposals/*`
  - This folder holds the proposals written for this thesis
- `./misc/*`
  - This folder holds miscelaneous files

## II. SETUP
Below are the steps necessary to setup the environment of the model transformer that accompains this thesis.

### Basic Setup
1. Install JDK 8
2. Install Eclipse Oxygen for Modelling https://www.eclipse.org
3. Import all the projects of the folder `./transformer` to the worskspace

### Run the transformer
1. Configure the Log4j preferences at `./transformer/org.wbsilva.bence.transformer/resources/log4j.xml`, if wished
2. Build all and run the `org.wbsilva.bence.transformer.Main` class with the following four arguments `GRAMMAR_FILE INPUT_METAMODEL_FILE INPUT_MODEL_FILE OUTPUT_GRAPH_FILE`, where `GRAMMAR_FILE` is the path to the triple graph grammar model containing the transformation rules, `INPUT_METAMODEL_FILE` is the path to the metamodel of the input model to be transformed, `INPUT_MODEL_FILE` is the path to the input model to be transformed, and `OUTPUT_GRAPH_FILE` is the path where it is desired to generate the output triple graph
    - Example: `../../bence/org.wbsilva.bence.bx.class2database/model/Class2database.xmi ../../metamodels/org.wbsilva.mm.class/model/Class.ecore ../../bence/org.wbsilva.bence.bx.class2database/instances/Model00.xmi ../../bence/org.wbsilva.bence.bx.class2database/instances/TripleGraph00.xmi`
3. Check the output in the output file and in the console

### Run the evaluation
1. Install `eMoflon` https://emoflon.org
    1. Help > Install New Software > Add
	    * eMoflonCore 1.2 - https://raw.githubusercontent.com/eMoflon/emoflon-core-updatesite/emoflon-core_1.2.0/stable/updatesite/
	    * eMoflon 3.2 - https://github.com/eMoflon/eMoflon.github.io/raw/emoflon-tool-updatesite_3.2.0/eclipse-plugin/beta/updatesite
	    * If necessary, follow the eMoflon handbook (see References)
	    * For more instructions, see `./misc/eMoflon.txt`
2. Import all the projects of the folder `./metamodels`, `./bence`, and `./tgg` to the worskspace
3. Configure the Log4j preferences at `./transformer/org.wbsilva.bence.evalutation/resources/log4j.xml`, if wished
4. Build all and run `org.wbsilva.bence.evaluation.Main` class without any argument and, especially, without the `-ea` JVM argument
5. Check the output in the console

### Adding a New Transformation
1. Create a new `Ecore Modeling Project` X for the input metamodel in the folder `./metamodels/X`
2. Create the metamodel by editing the file `./metamodels/X/model/X.ecore`
3. (Optional, only necessary to use with eMoflon) Generate the code for the metamodel by openning the file `./metamodels/X/model/X.genmodel`, right-clicking on the first element of it, and choosing `Generate Model Code`
4. Create a new `Project` X2Y for the BNCE TGG specification in the folder `./bence/X2Y`
5. Create two folders: `model` and `instances`
6. Open `./transformer/org.wbsilva.bence.graphgrammar/model/graphgrammar.ecore`, right-click on the element `Triple Grammar`, choose `Create Dynamic Instance`, and save this file at `./bence/X2Y/model/X2Y.xmi`
7. Open `./bence/X2Y/model/X2Y.xmi` and create, under the element `Triple Grammar` the desired BNCE TGG, with alphabet, triple rules, etc.
8. In the file `./metamodels/X/model/X.ecore`, right-click on the root element of the metamodel (if any) and choose `Create Dynamic Instance`, and save this file at `./bence/X2Y/instances/Model00.xmi`
9. Open `./bence/X2Y/instances/Model00.xmi` and create elements for testing
10. Run the transformer with the following arguments `../../bence/X2Y/model/X2Y.xmi ../../metamodels/X/model/X.ecore ../../bence/X2Y/instances/Model00.xmi ../../bence/X2Y/instances/TripleGraph00.xmi`

## References
* Eclipse website: https://www.eclipse.org
* eMoflon website: https://emoflon.org
* eMoflon-tool github: https://github.com/eMoflon/emoflon-tool/releases/tag/emoflon_3.2.0
* eMoflon-core github: https://github.com/eMoflon/emoflon-core/releases/tag/emoflon-core_1.2.0
* eMoflon Handbook: https://github.com/eMoflon/emoflon-docu/releases/download/emoflon_2.32.0/eMoflonHandbook_2.32.0.pdf


