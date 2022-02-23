// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.RecipeParameterMap;
import io.pulumi.awsnative.databrew.inputs.RecipeParameters;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RecipeAction extends io.pulumi.resources.InvokeArgs {

    public static final RecipeAction Empty = new RecipeAction();

    /**
     * Step action operation
     * 
     */
    @InputImport(name="operation", required=true)
        private final String operation;

    public String getOperation() {
        return this.operation;
    }

    @InputImport(name="parameters")
        private final @Nullable Either<RecipeParameters,RecipeParameterMap> parameters;

    public Either<RecipeParameters,RecipeParameterMap> getParameters() {
        return this.parameters == null ? null : this.parameters;
    }

    public RecipeAction(
        String operation,
        @Nullable Either<RecipeParameters,RecipeParameterMap> parameters) {
        this.operation = Objects.requireNonNull(operation, "expected parameter 'operation' to be non-null");
        this.parameters = parameters;
    }

    private RecipeAction() {
        this.operation = null;
        this.parameters = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecipeAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String operation;
        private @Nullable Either<RecipeParameters,RecipeParameterMap> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(RecipeAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operation = defaults.operation;
    	      this.parameters = defaults.parameters;
        }

        public Builder setOperation(String operation) {
            this.operation = Objects.requireNonNull(operation);
            return this;
        }

        public Builder setParameters(@Nullable Either<RecipeParameters,RecipeParameterMap> parameters) {
            this.parameters = parameters;
            return this;
        }
        public RecipeAction build() {
            return new RecipeAction(operation, parameters);
        }
    }
}
