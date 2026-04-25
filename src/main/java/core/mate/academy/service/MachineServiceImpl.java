package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Truck> {

    @Override
    public List<Machine> getAll(Class type) {
        return List.of();
    }

    @Override
    public void startWorking(List list) {
    }

    @Override
    public void fill(List machines, Object value) {

    }
}
