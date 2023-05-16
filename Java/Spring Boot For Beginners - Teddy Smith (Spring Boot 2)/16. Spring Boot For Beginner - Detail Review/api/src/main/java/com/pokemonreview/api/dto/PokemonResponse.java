package com.pokemonreview.api.dto;

import lombok.Data;

import java.util.List;

@Data
public class PokemonResponse {
    private List<PokemonDto> content;
    private int pageNo;
    private int pageSize;
    private long totalElements; // element might be larger than maximum integer value, therefore use long
    private int totalPages;
    private boolean last;
}
