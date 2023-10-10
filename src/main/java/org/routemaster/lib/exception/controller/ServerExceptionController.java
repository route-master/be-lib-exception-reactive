package org.routemaster.lib.exception.controller;

import lombok.extern.slf4j.Slf4j;
import org.routemaster.lib.exception.data.TOE;
import org.routemaster.lib.exception.data.TOEErrorResponse;
import org.routemaster.lib.exception.data.client.TOEBadRequest;
import org.routemaster.lib.exception.data.server.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import reactor.core.publisher.Mono;

@Slf4j
@ControllerAdvice
public class ServerExceptionController {

    @ExceptionHandler(TOEBadGateway.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEBadGateway e) {
        return createErrorResponseEntity(e, HttpStatus.BAD_GATEWAY);
    }

    @ExceptionHandler(TOEBandwidthLimitExceeded.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEBandwidthLimitExceeded e) {
        return createErrorResponseEntity(e, HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
    }

    @ExceptionHandler(TOEGatewayTimeout.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEGatewayTimeout e) {
        return createErrorResponseEntity(e, HttpStatus.GATEWAY_TIMEOUT);
    }

    @ExceptionHandler(TOEHttpVersionNotSupported.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEHttpVersionNotSupported e) {
        return createErrorResponseEntity(e, HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
    }

    @ExceptionHandler(TOEInsufficientStorage.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEInsufficientStorage e) {
        return createErrorResponseEntity(e, HttpStatus.INSUFFICIENT_STORAGE);
    }

    @ExceptionHandler(TOEInternalServerError.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEInternalServerError e) {
        return createErrorResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(TOELoopDetected.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOELoopDetected e) {
        return createErrorResponseEntity(e, HttpStatus.LOOP_DETECTED);
    }

    @ExceptionHandler(TOENetworkAuthenticationRequired.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOENetworkAuthenticationRequired e) {
        return createErrorResponseEntity(e, HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
    }

    @ExceptionHandler(TOENotExtended.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOENotExtended e) {
        return createErrorResponseEntity(e, HttpStatus.NOT_EXTENDED);
    }

    @ExceptionHandler(TOENotImplemented.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOENotImplemented e) {
        return createErrorResponseEntity(e, HttpStatus.NOT_IMPLEMENTED);
    }

    @ExceptionHandler(TOEServiceUnavailable.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEServiceUnavailable e) {
        return createErrorResponseEntity(e, HttpStatus.SERVICE_UNAVAILABLE);
    }

    @ExceptionHandler(TOEVariantAlsoNegotiates.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEVariantAlsoNegotiates e) {
        return createErrorResponseEntity(e, HttpStatus.VARIANT_ALSO_NEGOTIATES);
    }

    private ResponseEntity<Mono<TOEErrorResponse>> createErrorResponseEntity(TOE toe, HttpStatus status) {
        return new ResponseEntity<>(Mono.just(TOEErrorResponse.builder()
                .toe(toe)
                .build()), status);
    }

}
