// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.awsnative.databrew.outputs.RecipeParameterMap;
import io.pulumi.awsnative.databrew.outputs.RecipeParameters;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RecipeAction {
    /**
     * Step action operation
     * 
     */
    private final String operation;
    private final @Nullable Either<RecipeParameters,RecipeParameterMap> parameters;

    @OutputCustomType.Constructor({"operation","parameters"})
    private RecipeAction(
        String operation,
        @Nullable Either<RecipeParameters,RecipeParameterMap> parameters) {
        this.operation = Objects.requireNonNull(operation);
        this.parameters = parameters;
    }

    /**
     * Step action operation
     * 
     */
    public String getOperation() {
        return this.operation;
    }
    public Optional<Either<RecipeParameters,RecipeParameterMap>> getParameters() {
        return Optional.ofNullable(this.parameters);
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
