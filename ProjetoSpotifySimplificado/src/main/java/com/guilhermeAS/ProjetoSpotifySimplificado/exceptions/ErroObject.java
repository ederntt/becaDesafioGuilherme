package com.guilhermeAS.ProjetoSpotifySimplificado.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErroObject {
    private int statusCode;
    private String message;
    private long timestamp;
}
