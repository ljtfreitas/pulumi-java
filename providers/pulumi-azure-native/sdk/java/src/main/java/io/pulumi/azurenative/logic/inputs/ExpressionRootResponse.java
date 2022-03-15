// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.AzureResourceErrorInfoResponse;
import io.pulumi.azurenative.logic.inputs.ExpressionResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The expression root.
 * 
 */
public final class ExpressionRootResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExpressionRootResponse Empty = new ExpressionRootResponse();

    /**
     * The azure resource error info.
     * 
     */
    @Import(name="error")
      private final @Nullable AzureResourceErrorInfoResponse error;

    public Optional<AzureResourceErrorInfoResponse> getError() {
        return this.error == null ? Optional.empty() : Optional.ofNullable(this.error);
    }

    /**
     * The path.
     * 
     */
    @Import(name="path")
      private final @Nullable String path;

    public Optional<String> getPath() {
        return this.path == null ? Optional.empty() : Optional.ofNullable(this.path);
    }

    /**
     * The sub expressions.
     * 
     */
    @Import(name="subexpressions")
      private final @Nullable List<ExpressionResponse> subexpressions;

    public List<ExpressionResponse> getSubexpressions() {
        return this.subexpressions == null ? List.of() : this.subexpressions;
    }

    /**
     * The text.
     * 
     */
    @Import(name="text")
      private final @Nullable String text;

    public Optional<String> getText() {
        return this.text == null ? Optional.empty() : Optional.ofNullable(this.text);
    }

    @Import(name="value")
      private final @Nullable Object value;

    public Optional<Object> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public ExpressionRootResponse(
        @Nullable AzureResourceErrorInfoResponse error,
        @Nullable String path,
        @Nullable List<ExpressionResponse> subexpressions,
        @Nullable String text,
        @Nullable Object value) {
        this.error = error;
        this.path = path;
        this.subexpressions = subexpressions;
        this.text = text;
        this.value = value;
    }

    private ExpressionRootResponse() {
        this.error = null;
        this.path = null;
        this.subexpressions = List.of();
        this.text = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressionRootResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AzureResourceErrorInfoResponse error;
        private @Nullable String path;
        private @Nullable List<ExpressionResponse> subexpressions;
        private @Nullable String text;
        private @Nullable Object value;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressionRootResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.path = defaults.path;
    	      this.subexpressions = defaults.subexpressions;
    	      this.text = defaults.text;
    	      this.value = defaults.value;
        }

        public Builder error(@Nullable AzureResourceErrorInfoResponse error) {
            this.error = error;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder subexpressions(@Nullable List<ExpressionResponse> subexpressions) {
            this.subexpressions = subexpressions;
            return this;
        }

        public Builder text(@Nullable String text) {
            this.text = text;
            return this;
        }

        public Builder value(@Nullable Object value) {
            this.value = value;
            return this;
        }
        public ExpressionRootResponse build() {
            return new ExpressionRootResponse(error, path, subexpressions, text, value);
        }
    }
}
