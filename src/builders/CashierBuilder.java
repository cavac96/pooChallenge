package builders;

import models.Agent;
import models.Cashier;

public class CashierBuilder extends AgentBuilder{
    public Agent build() {
        Agent cashier = new Cashier(name, cc);
        return cashier;
    }
}
