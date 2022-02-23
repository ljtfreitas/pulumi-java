// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mwaa.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EnvironmentLastUpdatedError {
    private final @Nullable String errorCode;
    private final @Nullable String errorMessage;

    @OutputCustomType.Constructor({"errorCode","errorMessage"})
    private EnvironmentLastUpdatedError(
        @Nullable String errorCode,
        @Nullable String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public Optional<String> getErrorCode() {
        return Optional.ofNullable(this.errorCode);
    }
    public Optional<String> getErrorMessage() {
        return Optional.ofNullable(this.errorMessage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentLastUpdatedError defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String errorCode;
        private @Nullable String errorMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentLastUpdatedError defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorCode = defaults.errorCode;
    	      this.errorMessage = defaults.errorMessage;
        }

        public Builder setErrorCode(@Nullable String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        public Builder setErrorMessage(@Nullable String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public EnvironmentLastUpdatedError build() {
            return new EnvironmentLastUpdatedError(errorCode, errorMessage);
        }
    }
}
