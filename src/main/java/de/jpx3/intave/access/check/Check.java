package de.jpx3.intave.access.check;

/**
 * An alphabetically-sorted enumerator of all check-names in Intave
 */
public enum Check {
  ATTACK_RAYTRACE("AttackRaytrace"),
  BREAK_SPEED_LIMITER("BreakSpeedLimiter"),
  CLICK_PATTERNS("ClickPatterns"),
  CLICK_SPEED_LIMITER("ClickSpeedLimiter"),
  HEURISTICS("Heuristics"),
  INTERACTION_RAYTRACE("InteractionRaytrace"),
  INVENTORY_CLICK_ANALYSIS("InventoryClickAnalysis"),
  PHYSICS("Physics"),
  PLACEMENT_ANALYSIS("PlacementAnalysis"),
  PROTOCOL_SCANNER("ProtocolScanner"),
  TIMER("Timer"),

  ;

  private final String typeName;

  Check(String name) {
    this.typeName = name;
  }

  public static Check fromName(String name) {
    for (Check value : values()) {
      if (value.typeName.equalsIgnoreCase(name)) {
        return value;
      }
    }
    return null;
  }

  public String typeName() {
    return typeName;
  }
}
