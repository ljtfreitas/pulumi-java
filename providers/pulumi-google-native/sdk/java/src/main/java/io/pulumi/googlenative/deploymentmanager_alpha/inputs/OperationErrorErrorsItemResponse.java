// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class OperationErrorErrorsItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final OperationErrorErrorsItemResponse Empty = new OperationErrorErrorsItemResponse();

    /**
     * The error type identifier for this error.
     * 
     */
    @Import(name="code", required=true)
      private final String code;

    public String getCode() {
        return this.code;
    }

    /**
     * Indicates the field in the request that caused the error. This property is optional.
     * 
     */
    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    /**
     * An optional, human-readable error message.
     * 
     */
    @Import(name="message", required=true)
      private final String message;

    public String getMessage() {
        return this.message;
    }

    public OperationErrorErrorsItemResponse(
        String code,
        String location,
        String message) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
    }

    private OperationErrorErrorsItemResponse() {
        this.code = null;
        this.location = null;
        this.message = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OperationErrorErrorsItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String location;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(OperationErrorErrorsItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.location = defaults.location;
    	      this.message = defaults.message;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public OperationErrorErrorsItemResponse build() {
            return new OperationErrorErrorsItemResponse(code, location, message);
        }
    }
}
