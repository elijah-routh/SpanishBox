package com.elijahrouth.campaignfinancedata.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record FecCandidate (
    
    @JsonProperty("candidate_id") //jackson is converting the JSON into Java
    String candidateId,

    String name,

    @JsonProperty("party_full")
    String party,

    @JsonProperty("office_full")
    String office,

    String state
) {}
