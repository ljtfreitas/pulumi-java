// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ErrorResponseResponse {
    /**
     * Error code
     * 
     */
    private final @Nullable String code;
    /**
     * Error message indicating why the operation failed.
     * 
     */
    private final @Nullable String message;

    @OutputCustomType.Constructor({"code","message"})
    private ErrorResponseResponse(
        @Nullable String code,
        @Nullable String message) {
        this.code = code;
        this.message = message;
    }

    /**
     * Error code
     * 
     */
    public Optional<String> getCode() {
        return Optional.ofNullable(this.code);
    }
    /**
     * Error message indicating why the operation failed.
     * 
     */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ErrorResponseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable String message;

        public Builder() {
    	      // Empty
        }

        public Builder(ErrorResponseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
        }

        public Builder setCode(@Nullable String code) {
            this.code = code;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public ErrorResponseResponse build() {
            return new ErrorResponseResponse(code, message);
        }
    }
}
