package org.UiSprint.WebServices;

import org.UiSprint.model.NewEdicaoUCDTO;
import org.UiSprint.model.NewPropostaDTO;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;
import reactor.netty.resources.ConnectionProvider;

import java.util.Collections;
import java.util.Optional;

public class EdicaoUCWS {

        public boolean addEdicaoUC(NewEdicaoUCDTO edicaoUCDTO) {

            WebClient webClient = WebClient.builder()
                    .baseUrl("http://localhost:8070")
                    .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                    .defaultUriVariables(Collections.singletonMap("url", "http://localhost:7"))
                    .clientConnector( new ReactorClientHttpConnector( HttpClient.create(ConnectionProvider.newConnection())) )
                    .build();


            ResponseEntity<String> result = null;
            try {
                result=webClient.post().uri("/edicaoUC")

                        .body(BodyInserters.fromValue(edicaoUCDTO.toJson())).exchange().flatMap(response -> response.toEntity(String.class))

                        //tratamento de rros

//           .onStatus(HttpStatus::is4xxClientError, error -> { return Mono.empty(); })
//
//                       .bodyToMono(NewTipoAlojamentoInfoDTO.class)

                        .onErrorReturn(ResponseEntity.of(Optional.of(edicaoUCDTO.toJson())))

                        .doOnError(throwable -> { System.out.println( throwable.getMessage() );} )
                        .block();
                System.out.println(result);
            }
            catch( Exception e) {

                System.out.println(e.getMessage());
            }

            if( result != null )
                return true;
            else
                return false;
        }
    }

