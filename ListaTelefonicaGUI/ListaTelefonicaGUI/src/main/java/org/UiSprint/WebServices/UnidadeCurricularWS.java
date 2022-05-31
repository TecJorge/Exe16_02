package org.UiSprint.WebServices;

import org.UiSprint.model.NewPropostaDTO;
import org.UiSprint.model.NewUnidadeCurricularDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import reactor.netty.http.client.HttpClient;
import reactor.netty.resources.ConnectionProvider;

import java.util.Collections;
import java.util.Optional;

public class UnidadeCurricularWS {
    public boolean addUnidadeCurricular(NewUnidadeCurricularDTO unidadeCurricularDTO) {

        WebClient webClient = WebClient.builder()
                .baseUrl("http://localhost:8080")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .defaultUriVariables(Collections.singletonMap("url", "http://localhost:8080"))
                .clientConnector(new ReactorClientHttpConnector(HttpClient.create(ConnectionProvider.newConnection())))
                .build();


        ResponseEntity<String> result = null;
        try {
            result = webClient.post().uri("/UnidadeCurricular")

                    .body(BodyInserters.fromValue(unidadeCurricularDTO.toJson())).exchange().flatMap(response -> response.toEntity(String.class))

                    //tratamento de rros

//           .onStatus(HttpStatus::is4xxClientError, error -> { return Mono.empty(); })
//
//                       .bodyToMono(NewTipoAlojamentoInfoDTO.class)

                    .onErrorReturn(ResponseEntity.of(Optional.of(unidadeCurricularDTO.toJson())))

                    .doOnError(throwable -> {
                        System.out.println(throwable.getMessage());
                    })
                    .block();
            System.out.println(result);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        if (result != null)
            return true;
        else
            return false;
    }

    public Optional<NewUnidadeCurricularDTO> getUCByID(int ucID) throws Exception {
        WebClient webClient = WebClient.builder()
                .baseUrl("http://localhost:8080")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .defaultUriVariables(Collections.singletonMap("url", "http://localhost:8080"))
                .clientConnector(new ReactorClientHttpConnector(HttpClient.create(ConnectionProvider.newConnection())))
                .build();

        NewUnidadeCurricularDTO newUnidadeCurricularDTO;
        try {
            newUnidadeCurricularDTO = webClient
                    .get()
                    .uri("/TBD" +ucID) // idem configuração
                    .retrieve()

                    //tratamento de rros

                    .onStatus(HttpStatus::is4xxClientError, error -> {
                        return Mono.empty();
                    })

                    .bodyToMono(NewUnidadeCurricularDTO.class)

                    .onErrorReturn(null)

                    .doOnError(throwable -> {
                        System.out.println(throwable.getMessage());
                    })
                    .block();
        } catch (Exception e) {

            newUnidadeCurricularDTO = null;
        }

        if (newUnidadeCurricularDTO != null)
            return Optional.of(newUnidadeCurricularDTO);
        else
            throw new Exception("Não foi possivel encontrar a Unidade Curricular");
    }


}


