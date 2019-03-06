import models.Agent;

import java.util.Comparator;

public class AgentComparator implements Comparator<Agent> {
    @Override
    public int compare(Agent agent1, Agent agent2) {
        if(agent1.getPriority() < agent2.getPriority())
            return 1;
        else if(agent1.getPriority() > agent2.getPriority())
            return -1;
        return 0;
    }
}
