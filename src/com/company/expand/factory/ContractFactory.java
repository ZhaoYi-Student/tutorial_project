package com.company.expand.factory;

import com.company.expand.entity.ContractEntity;

public interface ContractFactory {

    void process(String method, ContractEntity contractEntity);

    ContractEntity make(ContractEntity contractMake) throws CloneNotSupportedException;

    ContractEntity settle(ContractEntity contractSettle);

    ContractEntity modify(ContractEntity contractModify);

}
