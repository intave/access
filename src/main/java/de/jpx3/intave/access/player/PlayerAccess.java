package de.jpx3.intave.access.player;

import de.jpx3.intave.access.check.Check;
import de.jpx3.intave.access.player.trust.TrustFactor;

public interface PlayerAccess {
  int protocolVersion();

  default double violationLevel(Check check) {
    return violationLevel(check, "thresholds");
  }
  default double violationLevel(String check) {
    return violationLevel(check, "thresholds");
  }
  default double violationLevel(Check check, String threshold) {
    return violationLevel(check.typeName(), threshold);
  }
  double violationLevel(String check, String threshold);

  default void addViolationPoints(Check check, double amount) {
    addViolationPoints(check, "thresholds", amount);
  }
  default void addViolationPoints(String check, double amount) {
    addViolationPoints(check, "thresholds", amount);
  }
  default void addViolationPoints(Check check, String threshold, double amount) {
    addViolationPoints(check.typeName(), threshold, amount);
  }
  void addViolationPoints(String check, String threshold, double amount);

  default void resetViolationLevel(Check check) {
    resetViolationLevel(check, "thresholds");
  }
  default void resetViolationLevel(String check) {
    resetViolationLevel(check, "thresholds");
  }
  default void resetViolationLevel(Check check, String threshold) {
    resetViolationLevel(check.typeName(), threshold);
  }
  void resetViolationLevel(String check, String threshold);

  TrustFactor trustFactor();
  @Deprecated
  void setTrustFactor(TrustFactor factor);

  PlayerClicks clicks();
  PlayerConnection connection();
}
