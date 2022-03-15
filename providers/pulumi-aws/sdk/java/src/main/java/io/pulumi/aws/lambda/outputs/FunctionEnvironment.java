// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class FunctionEnvironment {
    /**
     * Map of environment variables that are accessible from the function code during execution.
     * 
     */
    private final @Nullable Map<String,String> variables;

    @CustomType.Constructor
    private FunctionEnvironment(@CustomType.Parameter("variables") @Nullable Map<String,String> variables) {
        this.variables = variables;
    }

    /**
     * Map of environment variables that are accessible from the function code during execution.
     * 
    */
    public Map<String,String> getVariables() {
        return this.variables == null ? Map.of() : this.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionEnvironment defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> variables;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionEnvironment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.variables = defaults.variables;
        }

        public Builder variables(@Nullable Map<String,String> variables) {
            this.variables = variables;
            return this;
        }
        public FunctionEnvironment build() {
            return new FunctionEnvironment(variables);
        }
    }
}
