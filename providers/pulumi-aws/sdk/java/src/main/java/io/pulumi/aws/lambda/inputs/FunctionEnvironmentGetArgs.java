// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionEnvironmentGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionEnvironmentGetArgs Empty = new FunctionEnvironmentGetArgs();

    /**
     * Map of environment variables that are accessible from the function code during execution.
     * 
     */
    @InputImport(name="variables")
    private final @Nullable Input<Map<String,String>> variables;

    public Input<Map<String,String>> getVariables() {
        return this.variables == null ? Input.empty() : this.variables;
    }

    public FunctionEnvironmentGetArgs(@Nullable Input<Map<String,String>> variables) {
        this.variables = variables;
    }

    private FunctionEnvironmentGetArgs() {
        this.variables = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionEnvironmentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> variables;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionEnvironmentGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.variables = defaults.variables;
        }

        public Builder setVariables(@Nullable Input<Map<String,String>> variables) {
            this.variables = variables;
            return this;
        }

        public Builder setVariables(@Nullable Map<String,String> variables) {
            this.variables = Input.ofNullable(variables);
            return this;
        }
        public FunctionEnvironmentGetArgs build() {
            return new FunctionEnvironmentGetArgs(variables);
        }
    }
}
