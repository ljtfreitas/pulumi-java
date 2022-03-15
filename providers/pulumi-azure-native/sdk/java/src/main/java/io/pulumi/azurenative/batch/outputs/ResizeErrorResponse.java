// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ResizeErrorResponse {
    /**
     * An identifier for the error. Codes are invariant and are intended to be consumed programmatically.
     * 
     */
    private final String code;
    private final @Nullable List<ResizeErrorResponse> details;
    /**
     * A message describing the error, intended to be suitable for display in a user interface.
     * 
     */
    private final String message;

    @CustomType.Constructor
    private ResizeErrorResponse(
        @CustomType.Parameter("code") String code,
        @CustomType.Parameter("details") @Nullable List<ResizeErrorResponse> details,
        @CustomType.Parameter("message") String message) {
        this.code = code;
        this.details = details;
        this.message = message;
    }

    /**
     * An identifier for the error. Codes are invariant and are intended to be consumed programmatically.
     * 
    */
    public String getCode() {
        return this.code;
    }
    public List<ResizeErrorResponse> getDetails() {
        return this.details == null ? List.of() : this.details;
    }
    /**
     * A message describing the error, intended to be suitable for display in a user interface.
     * 
    */
    public String getMessage() {
        return this.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResizeErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private @Nullable List<ResizeErrorResponse> details;
        private String message;

        public Builder() {
    	      // Empty
        }

        public Builder(ResizeErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
        }

        public Builder code(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder details(@Nullable List<ResizeErrorResponse> details) {
            this.details = details;
            return this;
        }

        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public ResizeErrorResponse build() {
            return new ResizeErrorResponse(code, details, message);
        }
    }
}
