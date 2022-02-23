// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mwaa.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentLastUpdatedErrorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentLastUpdatedErrorGetArgs Empty = new EnvironmentLastUpdatedErrorGetArgs();

    @InputImport(name="errorCode")
    private final @Nullable Input<String> errorCode;

    public Input<String> getErrorCode() {
        return this.errorCode == null ? Input.empty() : this.errorCode;
    }

    @InputImport(name="errorMessage")
    private final @Nullable Input<String> errorMessage;

    public Input<String> getErrorMessage() {
        return this.errorMessage == null ? Input.empty() : this.errorMessage;
    }

    public EnvironmentLastUpdatedErrorGetArgs(
        @Nullable Input<String> errorCode,
        @Nullable Input<String> errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    private EnvironmentLastUpdatedErrorGetArgs() {
        this.errorCode = Input.empty();
        this.errorMessage = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentLastUpdatedErrorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> errorCode;
        private @Nullable Input<String> errorMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentLastUpdatedErrorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorCode = defaults.errorCode;
    	      this.errorMessage = defaults.errorMessage;
        }

        public Builder setErrorCode(@Nullable Input<String> errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        public Builder setErrorCode(@Nullable String errorCode) {
            this.errorCode = Input.ofNullable(errorCode);
            return this;
        }

        public Builder setErrorMessage(@Nullable Input<String> errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public Builder setErrorMessage(@Nullable String errorMessage) {
            this.errorMessage = Input.ofNullable(errorMessage);
            return this;
        }
        public EnvironmentLastUpdatedErrorGetArgs build() {
            return new EnvironmentLastUpdatedErrorGetArgs(errorCode, errorMessage);
        }
    }
}
