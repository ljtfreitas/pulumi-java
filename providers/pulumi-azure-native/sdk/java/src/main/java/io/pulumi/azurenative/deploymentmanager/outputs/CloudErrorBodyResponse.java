// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CloudErrorBodyResponse {
    /**
     * Error code string.
     * 
     */
    private final String code;
    /**
     * More detailed error information.
     * 
     */
    private final @Nullable List<CloudErrorBodyResponse> details;
    /**
     * Descriptive error information.
     * 
     */
    private final String message;
    /**
     * Error target
     * 
     */
    private final @Nullable String target;

    @OutputCustomType.Constructor({"code","details","message","target"})
    private CloudErrorBodyResponse(
        String code,
        @Nullable List<CloudErrorBodyResponse> details,
        String message,
        @Nullable String target) {
        this.code = Objects.requireNonNull(code);
        this.details = details;
        this.message = Objects.requireNonNull(message);
        this.target = target;
    }

    /**
     * Error code string.
     * 
     */
    public String getCode() {
        return this.code;
    }
    /**
     * More detailed error information.
     * 
     */
    public List<CloudErrorBodyResponse> getDetails() {
        return this.details == null ? List.of() : this.details;
    }
    /**
     * Descriptive error information.
     * 
     */
    public String getMessage() {
        return this.message;
    }
    /**
     * Error target
     * 
     */
    public Optional<String> getTarget() {
        return Optional.ofNullable(this.target);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudErrorBodyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private @Nullable List<CloudErrorBodyResponse> details;
        private String message;
        private @Nullable String target;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudErrorBodyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.details = defaults.details;
    	      this.message = defaults.message;
    	      this.target = defaults.target;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setDetails(@Nullable List<CloudErrorBodyResponse> details) {
            this.details = details;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setTarget(@Nullable String target) {
            this.target = target;
            return this;
        }
        public CloudErrorBodyResponse build() {
            return new CloudErrorBodyResponse(code, details, message, target);
        }
    }
}
