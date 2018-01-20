package com.zeeveener.crypto.exchange.api.constants;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Based on the following <a href="http://www.restapitutorial.com/httpstatuscodes.html">Reference</a>
 * <br/><br/>
 * Not all HTTP Response codes are guaranteed to be defined here as they may not yet be required.
 *
 * @author Zac Beemer
 */
public enum HttpResponseCode {
    // When adding new codes, please ensure that they are sorted by their code value.
    SUCCESS_OK(200),
    SUCCESS_CREATED(201),
    SUCCESS_NO_CONTENT(204),
    REDIRECT_MOVED_PERMANENTLY(301),
    REDIRECT_FOUND(302),
    REDIRECT_NOT_MODIFIED(304),
    CLIENT_ERROR_BAD_REQUEST(400),
    CLIENT_ERROR_UNAUTHORIZED(401),
    CLIENT_ERROR_FORBIDDEN(403),
    CLIENT_ERROR_NOT_FOUND(404),
    CLIENT_ERROR_CONFLICT(409),
    SERVER_ERROR_INTERNAL_SERVER_ERROR(500),
    SERVER_ERROR_BAD_GATEWAY(502),
    SERVER_ERROR_SERVICE_UNAVAILABLE(503);

    private final int code;

    HttpResponseCode(final int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

    public static List<HttpResponseCode> getInformationalCodes() {
        return Collections.emptyList();
    }

    public static List<HttpResponseCode> getSuccessCodes() {
        return Arrays.asList(SUCCESS_OK, SUCCESS_CREATED, SUCCESS_NO_CONTENT);
    }

    public static List<HttpResponseCode> getRedirectionCodes() {
        return Arrays.asList(REDIRECT_MOVED_PERMANENTLY, REDIRECT_FOUND, REDIRECT_NOT_MODIFIED);
    }

    public static List<HttpResponseCode> getClientErrorCodes() {
        return Arrays.asList(CLIENT_ERROR_BAD_REQUEST, CLIENT_ERROR_UNAUTHORIZED, CLIENT_ERROR_FORBIDDEN,
                CLIENT_ERROR_NOT_FOUND, CLIENT_ERROR_CONFLICT);
    }

    public static List<HttpResponseCode> getServerErrorCodes() {
        return Arrays.asList(SERVER_ERROR_INTERNAL_SERVER_ERROR, SERVER_ERROR_BAD_GATEWAY, SERVER_ERROR_SERVICE_UNAVAILABLE);
    }
}
