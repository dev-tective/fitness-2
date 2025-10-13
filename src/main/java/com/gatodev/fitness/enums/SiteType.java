package com.gatodev.fitness.enums;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum SiteType {
    @JsonProperty("Aire Libre")
    AIRE_LIBRE,
    @JsonProperty("Local")
    LOCAL
}
