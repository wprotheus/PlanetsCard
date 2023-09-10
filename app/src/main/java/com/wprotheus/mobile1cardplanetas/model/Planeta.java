package com.wprotheus.mobile1cardplanetas.model;

import java.io.Serializable;

public class Planeta implements Serializable {
    private int planetaId;
    private String nomePlaneta;
    private String descPlaneta;

    public Planeta() {
    }

    public Planeta(int planetaId, String nomePlaneta, String descPlaneta) {
        this.planetaId = planetaId;
        this.nomePlaneta = nomePlaneta;
        this.descPlaneta = descPlaneta;
    }

    public int getPlanetaId() {
        return planetaId;
    }

    public String getNomePlaneta() {
        return nomePlaneta;
    }

    public String getDescPlaneta() {
        return descPlaneta;
    }
}