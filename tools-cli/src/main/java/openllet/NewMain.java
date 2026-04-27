package openllet;

import openllet.owlapi.OpenlletReasoner;
import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.model.*;
import org.semanticweb.owlapi.reasoner.Node;
import org.semanticweb.owlapi.reasoner.knowledgeexploration.OWLKnowledgeExplorerReasoner;
import org.semanticweb.owlapi.reasoner.OWLReasonerFactory;
import openllet.owlapi.OpenlletReasonerFactory;

import java.io.File;
import java.util.ArrayList;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

public class NewMain {
    public static void main(String[] args) throws Exception {

        File ontologyFile = new File("D:/studium/diplom/CATS/CATS-Abduction-Solver/ont/testtest.rdf");
        OWLOntologyManager ontologyManager = OWLManager.createOWLOntologyManager();
        OWLOntology ontology = ontologyManager.loadOntologyFromOntologyDocument(ontologyFile);
        OpenlletReasonerFactory reasonerFactory = new OpenlletReasonerFactory();
        OpenlletReasoner reasoner = reasonerFactory.createReasoner(ontology);
        OWLKnowledgeExplorerReasoner keReasoner = (OWLKnowledgeExplorerReasoner) reasoner;


        Set<OWLNamedIndividual> individuals = ontology.getIndividualsInSignature();
        ArrayList<OWLNamedIndividual> individualArray = new ArrayList<>(individuals);
        for (OWLNamedIndividual ind: individualArray) {
            OWLObjectOneOf individual = ontologyManager.getOWLDataFactory().getOWLObjectOneOf(ind);


            OWLKnowledgeExplorerReasoner.RootNode rootNode = keReasoner.getRoot(individual);
            Node<? extends OWLClassExpression> labels = keReasoner.getObjectLabel(rootNode,false);

            Node<? extends OWLObjectPropertyExpression> roles = keReasoner.getObjectNeighbours(rootNode,false);

            System.out.println("");
        }

    }
}
