package com.company.expand.factory;

import com.company.expand.entity.ContractEntity;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BaseContractAbstract implements ContractFactory {

    @Override
    public void process(String method, ContractEntity contractEntity) {
        Method m = null;
        try {
            m = BaseContractAbstract.class.getMethod(method, ContractEntity.class);
            m.invoke(new BaseContractAbstract(), contractEntity);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ContractEntity make(ContractEntity contractMake) {
        contractMake.setDef1("contract make");
        contractMake.setBusiness_line("contract");
        System.out.println("合同制作完成");
        return contractMake;
    }

    @Override
    public ContractEntity settle(ContractEntity contractSettle) {
        contractSettle.setDef1("contract settle");
        contractSettle.setBusiness_line("contract");
        System.out.println("合同结清完成");
        return contractSettle;
    }

    @Override
    public ContractEntity modify(ContractEntity contractModify) {
        contractModify.setDef1("contract modify");
        contractModify.setBusiness_line("contract");
        System.out.println("合同变更完成");
        return contractModify;
    }

    void calculateInoutPlan() {
        System.out.println("测算收支");
    }
}
