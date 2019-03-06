package builders;

import models.Agent;
import models.Director;

public class DirectorBuilder extends AgentBuilder{
    public Agent build() {
        Agent director = new Director(name, cc);
        return director;
    }
}
