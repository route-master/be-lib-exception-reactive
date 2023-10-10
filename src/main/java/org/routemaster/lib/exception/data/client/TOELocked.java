package org.routemaster.lib.exception.data.client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.routemaster.lib.exception.data.TOE;

import java.util.Map;

@AllArgsConstructor
@Getter
public class TOELocked extends TOE {

    private String code;
    private String message;
    private Map<String, Object> meta;

}
