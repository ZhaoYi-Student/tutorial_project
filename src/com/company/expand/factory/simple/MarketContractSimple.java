package com.company.expand.factory.simple;

import com.company.expand.entity.ContractEntity;
import com.company.expand.factory.BaseContractAbstract;

public class MarketContractSimple extends BaseContractAbstract {

    @Override
    public ContractEntity settle(ContractEntity contractSettle) {
        System.out.println("市场合同结清完成");
        return contractSettle;
    }
}
