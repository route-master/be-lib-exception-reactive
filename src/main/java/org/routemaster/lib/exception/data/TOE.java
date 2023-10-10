package org.routemaster.lib.exception.data;

import java.util.Map;

public abstract class TOE extends RuntimeException {

    public abstract String getCode();
    public abstract String getMessage();
    public abstract Map<String, Object> getMeta();


}
