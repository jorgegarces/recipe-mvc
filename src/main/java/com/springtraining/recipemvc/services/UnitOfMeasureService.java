package com.springtraining.recipemvc.services;

import com.springtraining.recipemvc.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}
