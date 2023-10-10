package org.routemaster.lib.exception.data;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TOEErrorResponse {
    private String code;
    private String description;
    private final Long timestamp = System.currentTimeMillis();
    private Map<String, Object> meta;

    public static class TOEErrorResponseBuilder {

        private String code;
        private String description;
        private final Long timestamp = System.currentTimeMillis();
        private Map<String, Object> meta;

        public TOEErrorResponseBuilder toe(TOE toe) {
            this.code = toe.getCode();
            this.description = toe.getMessage();
            this.meta = toe.getMeta();
            return this;
        }
    }
}
