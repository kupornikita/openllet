Extending MHS-Based Abduction in DLs through OWL API Integration
-----------------------------------------------
Kupor Mykyta

Master Thesis

<div>
    <img src="https://volby.fmph.uniba.sk/static/FMFI_logo.png" width="50%"/>
</div>


Important links:

[Master Thesis PDF](https://www.youtube.com/)

[CATS tool](https://github.com/Comenius-Abduction-Team/CATS-Abduction-Solver/tree/main/in)

--------------------------------
Integration of the OWLKnowledgeExplorerReasoner into Openllet

Abduction finds a hypothesis that, together with the knowledge base, entails an observation. While tableau DL reasoners utilize completion graphs, model-based abduction (the MHS algorithm) requires access to logical models. The main constraint is that current MHS solutions rely on accessing specific completion graph labels from the reasoner. This access is dependent on the implementation of particular OWL API components that expose these internal structures. This dependency restricts the abduction framework to only compatible reasoners. Our goal is to extend the applicability of MHS-based abduction by enabling the employment of powerful DL reasoners that currently do not implement this required OWL API functionality for exposing completion graph labels. We achieve this by implementing the necessary OWL API functionality directly into the reasoners to expose the required structural information. Simultaneously, we will perform necessary maintenance and functional upgrades to open-source reasoner codebases, thus significantly expanding the set of compatible and powerful DL engines.

-----------------------------------------------
2026 Summer Semester:
-----------------------------------------------
December: Basic framework, introduction to DL and tableau algorithm

January: Introduction to DL and MHS / literature study

February: Introduction to DL, MHS and OWL API

March: Review of DL and Abduction tools

April: Implementation of OWLKnowledgeExplorerReasoner interface in Openllet

May: Creation of the skeleton of the work, testing

-----------------------------------------------
2026 Winter Semester:
-----------------------------------------------
August: Implemented resoner testing: AAA vs Pellet, negation vs non-negation. CATS timeout bug fix.

September: Switches and readme updates in CATS. Complex evaluation of Pellet vs JFact, memory and speed graphs comparisons. Pellet memory issues investigations.

October:  Complex evaluation of Pellet vs JFact, memory and speed graphs comparisons, timeout vs depth limitation, memory leaks investigation, CATS logging bugs fixing, logging, switches and readme updates.

November: New type of logging update (peak for specific level), Complex evaluation of Pellet vs JFact, graphs creation and comparing. State of the art section writing.

--------------------------------
TODO:
-----------------------------------------------
1) Comparative evaluation.
2) Possible FaCT++ integration
3) Diploma Thesis writing.
