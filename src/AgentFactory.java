import builders.AgentBuilder;
import builders.CashierBuilder;
import builders.DirectorBuilder;
import builders.SupervisorBuilder;

public class AgentFactory {
    public AgentBuilder getAgent(String agentType){
        if(agentType.equals("cashier")){
            return new CashierBuilder();
        } else if(agentType.equals("supervisor")){
            return new SupervisorBuilder();
        } else if(agentType.equals("director")){
            return new DirectorBuilder();
        }
        return null;
    }
}
