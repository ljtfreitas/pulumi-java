// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class StatusResponse {
    /**
     * The status code, which should be an enum value of google.rpc.Code.
     * 
     */
    private final Integer code;
    /**
     * A list of messages that carry the error details. There is a common set of message types for APIs to use.
     * 
     */
    private final List<Map<String,String>> details;
    /**
     * A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
     * 
     */
    private final String message;

    @OutputCustomType.Constructor({"code","details","message"})
    private StatusResponse(
        Integer code,
        List<Map<String,String>> details,
        String message) {
        this.code = Objects.requireNonNull(code);
        this.details = Objects.requireNonNull(details);
        this.message = Objects.requireNonNull(message);
    }

    /**
     * The status code, which should be an enum value of google.rpc.Code.
     * 
     */
    public Integer getCode() {
        return this.code;
    }
    /**
     * A list of messages that carry the error details. There is a common set of message types for APIs to use.
     * 
     */
    public List<Map<String,String>> getDetails() {
        return this.details;
    }
    /**
     * A developer-facing error message, which should be in English. Any user-facing error message should be localized and sent in the google.rpc.Status.details field, or localized by the client.
     * 
     */
    public String getMessage() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer code;
        private List<Map<String,String>> details;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(StatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
        }

        public Builder setCode(Integer code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setDetails(List<Map<String,String>> details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public StatusResponse build() {
            return new StatusResponse(code, details, message);
        }
    }
}
