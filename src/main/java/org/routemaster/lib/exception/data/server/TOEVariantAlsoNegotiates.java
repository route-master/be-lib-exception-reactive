package org.routemaster.lib.exception.data.server;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.routemaster.lib.exception.data.TOE;

import java.util.Map;

@AllArgsConstructor
@Getter
public class TOEVariantAlsoNegotiates extends TOE {

    private String code;
    private String message;
    private Map<String, Object> meta;

}
