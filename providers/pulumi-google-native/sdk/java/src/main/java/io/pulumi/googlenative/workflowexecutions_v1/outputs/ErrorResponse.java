// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.workflowexecutions_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.workflowexecutions_v1.outputs.StackTraceResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ErrorResponse {
    /**
     * Human-readable stack trace string.
     * 
     */
    private final String context;
    /**
     * Error message and data returned represented as a JSON string.
     * 
     */
    private final String payload;
    /**
     * Stack trace with detailed information of where error was generated.
     * 
     */
    private final StackTraceResponse stackTrace;

    @CustomType.Constructor
    private ErrorResponse(
        @CustomType.Parameter("context") String context,
        @CustomType.Parameter("payload") String payload,
        @CustomType.Parameter("stackTrace") StackTraceResponse stackTrace) {
        this.context = context;
        this.payload = payload;
        this.stackTrace = stackTrace;
    }

    /**
     * Human-readable stack trace string.
     * 
    */
    public String getContext() {
        return this.context;
    }
    /**
     * Error message and data returned represented as a JSON string.
     * 
    */
    public String getPayload() {
        return this.payload;
    }
    /**
     * Stack trace with detailed information of where error was generated.
     * 
    */
    public StackTraceResponse getStackTrace() {
        return this.stackTrace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String context;
        private String payload;
        private StackTraceResponse stackTrace;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.context = defaults.context;
    	      this.payload = defaults.payload;
    	      this.stackTrace = defaults.stackTrace;
        }

        public Builder context(String context) {
            this.context = Objects.requireNonNull(context);
            return this;
        }

        public Builder payload(String payload) {
            this.payload = Objects.requireNonNull(payload);
            return this;
        }

        public Builder stackTrace(StackTraceResponse stackTrace) {
            this.stackTrace = Objects.requireNonNull(stackTrace);
            return this;
        }
        public ErrorResponse build() {
            return new ErrorResponse(context, payload, stackTrace);
        }
    }
}
