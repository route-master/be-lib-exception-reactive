package org.routemaster.lib.exception.controller;

import lombok.extern.slf4j.Slf4j;
import org.routemaster.lib.exception.data.TOE;
import org.routemaster.lib.exception.data.TOEErrorResponse;
import org.routemaster.lib.exception.data.client.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import reactor.core.publisher.Mono;

@Slf4j
@ControllerAdvice
public class ClientExceptionController {

    @ExceptionHandler(TOEBadRequest.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEBadRequest e) {
        return createErrorResponseEntity(e, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(TOEConflict.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEConflict e) {
        return createErrorResponseEntity(e, HttpStatus.CONFLICT);
    }

    @ExceptionHandler(TOEExpectationFailed.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEExpectationFailed e) {
        return createErrorResponseEntity(e, HttpStatus.EXPECTATION_FAILED);
    }

    @ExceptionHandler(TOEFailedDependency.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEFailedDependency e) {
        return createErrorResponseEntity(e, HttpStatus.FAILED_DEPENDENCY);
    }

    @ExceptionHandler(TOEForbidden.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEForbidden e) {
        return createErrorResponseEntity(e, HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(TOEGone.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEGone e) {
        return createErrorResponseEntity(e, HttpStatus.GONE);
    }

    @ExceptionHandler(TOELengthRequired.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOELengthRequired e) {
        return createErrorResponseEntity(e, HttpStatus.LENGTH_REQUIRED);
    }

    @ExceptionHandler(TOELocked.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOELocked e) {
        return createErrorResponseEntity(e, HttpStatus.LOCKED);
    }

    @ExceptionHandler(TOEMethodNotAllowed.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEMethodNotAllowed e) {
        return createErrorResponseEntity(e, HttpStatus.METHOD_NOT_ALLOWED);
    }

    @ExceptionHandler(TOENotAcceptable.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOENotAcceptable e) {
        return createErrorResponseEntity(e, HttpStatus.NOT_ACCEPTABLE);
    }

    @ExceptionHandler(TOENotFound.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOENotFound e) {
        return createErrorResponseEntity(e, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(TOEPayloadTooLarge.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEPayloadTooLarge e) {
        return createErrorResponseEntity(e, HttpStatus.PAYLOAD_TOO_LARGE);
    }

    @ExceptionHandler(TOEPaymentRequired.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEPaymentRequired e) {
        return createErrorResponseEntity(e, HttpStatus.PAYMENT_REQUIRED);
    }

    @ExceptionHandler(TOEPreconditionFailed.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEPreconditionFailed e) {
        return createErrorResponseEntity(e, HttpStatus.PRECONDITION_FAILED);
    }

    @ExceptionHandler(TOEProxyAuthenticationRequired.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEProxyAuthenticationRequired e) {
        return createErrorResponseEntity(e, HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
    }

    @ExceptionHandler(TOERequestedRangeNotSatisfiable.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOERequestedRangeNotSatisfiable e) {
        return createErrorResponseEntity(e, HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
    }

    @ExceptionHandler(TOERequestHeaderFieldsTooLarge.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOERequestHeaderFieldsTooLarge e) {
        return createErrorResponseEntity(e, HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
    }

    @ExceptionHandler(TOERequestTimeout.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOERequestTimeout e) {
        return createErrorResponseEntity(e, HttpStatus.REQUEST_TIMEOUT);
    }

    @ExceptionHandler(TOETooEarly.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOETooEarly e) {
        return createErrorResponseEntity(e, HttpStatus.TOO_EARLY);
    }

    @ExceptionHandler(TOETooManyRequests.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOETooManyRequests e) {
        return createErrorResponseEntity(e, HttpStatus.TOO_MANY_REQUESTS);
    }

    @ExceptionHandler(TOEUnauthorized.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEUnauthorized e) {
        return createErrorResponseEntity(e, HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler(TOEUnavailableForLegalReasons.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEUnavailableForLegalReasons e) {
        return createErrorResponseEntity(e, HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
    }

    @ExceptionHandler(TOEUnprocessableEntity.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEUnprocessableEntity e) {
        return createErrorResponseEntity(e, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @ExceptionHandler(TOEUnsupportedMediaType.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEUnsupportedMediaType e) {
        return createErrorResponseEntity(e, HttpStatus.UNSUPPORTED_MEDIA_TYPE);
    }

    @ExceptionHandler(TOEUpgradeRequired.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEUpgradeRequired e) {
        return createErrorResponseEntity(e, HttpStatus.UPGRADE_REQUIRED);
    }

    @ExceptionHandler(TOEUriTooLong.class)
    protected ResponseEntity<Mono<TOEErrorResponse>> handler(TOEUriTooLong e) {
        return createErrorResponseEntity(e, HttpStatus.URI_TOO_LONG);
    }

    private ResponseEntity<Mono<TOEErrorResponse>> createErrorResponseEntity(TOE toe, HttpStatus status) {
        return new ResponseEntity<>(Mono.just(TOEErrorResponse.builder()
                .toe(toe)
                .build()), status);
    }

}
