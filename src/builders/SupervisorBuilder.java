package builders;

import models.Agent;
import models.Supervisor;

public class SupervisorBuilder extends AgentBuilder {
    public Agent build() {
        Agent supervisor = new Supervisor(name, cc);
        return supervisor;
    }
}
