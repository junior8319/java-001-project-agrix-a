package com.betrybe.agrix.service.exception;

public class FarmNotFoundException extends NotFoundException {

  public FarmNotFoundException() {
    super("Fazenda não encontrada.");
  }
}
