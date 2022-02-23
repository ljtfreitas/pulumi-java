// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A function's environment variable settings.
 * 
 */
public final class FunctionEnvironment extends io.pulumi.resources.InvokeArgs {

    public static final FunctionEnvironment Empty = new FunctionEnvironment();

    /**
     * Environment variable key-value pairs.
     * 
     */
    @InputImport(name="variables")
        private final @Nullable Object variables;

    public Optional<Object> getVariables() {
        return this.variables == null ? Optional.empty() : Optional.ofNullable(this.variables);
    }

    public FunctionEnvironment(@Nullable Object variables) {
        this.variables = variables;
    }

    private FunctionEnvironment() {
        this.variables = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionEnvironment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object variables;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionEnvironment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.variables = defaults.variables;
        }

        public Builder setVariables(@Nullable Object variables) {
            this.variables = variables;
            return this;
        }
        public FunctionEnvironment build() {
            return new FunctionEnvironment(variables);
        }
    }
}
