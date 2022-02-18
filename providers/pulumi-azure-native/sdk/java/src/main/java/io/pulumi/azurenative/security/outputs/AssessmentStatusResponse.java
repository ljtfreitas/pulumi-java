// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AssessmentStatusResponse {
    /**
     * Programmatic code for the cause of the assessment status
     * 
     */
    private final @Nullable String cause;
    /**
     * Programmatic code for the status of the assessment
     * 
     */
    private final String code;
    /**
     * Human readable description of the assessment status
     * 
     */
    private final @Nullable String description;

    @OutputCustomType.Constructor({"cause","code","description"})
    private AssessmentStatusResponse(
        @Nullable String cause,
        String code,
        @Nullable String description) {
        this.cause = cause;
        this.code = Objects.requireNonNull(code);
        this.description = description;
    }

    /**
     * Programmatic code for the cause of the assessment status
     * 
     */
    public Optional<String> getCause() {
        return Optional.ofNullable(this.cause);
    }
    /**
     * Programmatic code for the status of the assessment
     * 
     */
    public String getCode() {
        return this.code;
    }
    /**
     * Human readable description of the assessment status
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cause;
        private String code;
        private @Nullable String description;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cause = defaults.cause;
    	      this.code = defaults.code;
    	      this.description = defaults.description;
        }

        public Builder setCause(@Nullable String cause) {
            this.cause = cause;
            return this;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public AssessmentStatusResponse build() {
            return new AssessmentStatusResponse(cause, code, description);
        }
    }
}
