package br.unb.sma.agents;

import br.unb.sma.agents.gui.AGPview;
import br.unb.sma.behaviors.ActivateAgent;
import br.unb.sma.behaviors.DeactivateAgent;
import br.unb.sma.behaviors.GetAgentsInfo;
import br.unb.sma.behaviors.ShutdownSMA;
import br.unb.sma.utils.AgentEntity;
import br.unb.sma.utils.Utils;
import jade.content.lang.sl.SLCodec;
import jade.core.behaviours.CyclicBehaviour;
import jade.domain.FIPANames;
import jade.domain.JADEAgentManagement.JADEManagementOntology;
import jade.lang.acl.ACLMessage;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AGP extends SMAgent {

    private JFrame gui;
    private AGP agent = this;
    private AGPview view;

    protected void setup() {
        getContentManager().registerLanguage(new SLCodec(), FIPANames.ContentLanguage.FIPA_SL);
        getContentManager().registerOntology(JADEManagementOntology.getInstance());
        addBehaviour(new GetAgentsInfo(agent));
        super.setup();
        removeBehaviour(receiveMessages);
    }

    public void activateAgent(AgentEntity agentEntity) {
        addBehaviour(new ActivateAgent(this, agentEntity));
    }

    public void deactivateAgent(AgentEntity agentEntity) {
        addBehaviour(new DeactivateAgent(this, agentEntity));
    }

    public void shutdownSMA() {
        addBehaviour(new ShutdownSMA());
    }

    public AGPview getView() {
        return view;
    }

    @Override
    protected void loadGUI() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    gui = new JFrame(getLocalName());
                    view = new AGPview(agent);
                    gui.setContentPane(view.getForm());
                    gui.pack();
                    gui.setVisible(true);
                    gui.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosing(WindowEvent e) {
                            super.windowClosing(e);
                        }
                    });
                } catch (Exception e) {
                    Utils.logError(getLocalName() + " - erro ao criar GUI");
                }
            }
        });
    }

    @Override
    public String getServiceType() {
        return null;
    }

    @Override
    public String[] getServices() {
        return new String[0];
    }

    @Override
    protected void processMessages(ACLMessage msg) {
        super.processMessages(msg);
        switch (msg.getContent()) {

        }
    }

    @Override
    protected JFrame getGUI() {
        return gui;
    }

    @Override
    public CyclicBehaviour receiveMessages() {
        return receiveMessages;
    }
}
