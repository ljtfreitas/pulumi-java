// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotebookPreparationErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final NotebookPreparationErrorResponse Empty = new NotebookPreparationErrorResponse();

    @Import(name="errorMessage")
      private final @Nullable String errorMessage;

    public Optional<String> getErrorMessage() {
        return this.errorMessage == null ? Optional.empty() : Optional.ofNullable(this.errorMessage);
    }

    @Import(name="statusCode")
      private final @Nullable Integer statusCode;

    public Optional<Integer> getStatusCode() {
        return this.statusCode == null ? Optional.empty() : Optional.ofNullable(this.statusCode);
    }

    public NotebookPreparationErrorResponse(
        @Nullable String errorMessage,
        @Nullable Integer statusCode) {
        this.errorMessage = errorMessage;
        this.statusCode = statusCode;
    }

    private NotebookPreparationErrorResponse() {
        this.errorMessage = null;
        this.statusCode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotebookPreparationErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String errorMessage;
        private @Nullable Integer statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(NotebookPreparationErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorMessage = defaults.errorMessage;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder errorMessage(@Nullable String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        public Builder statusCode(@Nullable Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public NotebookPreparationErrorResponse build() {
            return new NotebookPreparationErrorResponse(errorMessage, statusCode);
        }
    }
}
