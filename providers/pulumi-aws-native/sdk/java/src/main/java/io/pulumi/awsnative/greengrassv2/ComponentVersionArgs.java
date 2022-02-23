// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.greengrassv2;

import io.pulumi.awsnative.greengrassv2.inputs.ComponentVersionLambdaFunctionRecipeSourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ComponentVersionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ComponentVersionArgs Empty = new ComponentVersionArgs();

    @InputImport(name="inlineRecipe")
        private final @Nullable Input<String> inlineRecipe;

    public Input<String> getInlineRecipe() {
        return this.inlineRecipe == null ? Input.empty() : this.inlineRecipe;
    }

    @InputImport(name="lambdaFunction")
        private final @Nullable Input<ComponentVersionLambdaFunctionRecipeSourceArgs> lambdaFunction;

    public Input<ComponentVersionLambdaFunctionRecipeSourceArgs> getLambdaFunction() {
        return this.lambdaFunction == null ? Input.empty() : this.lambdaFunction;
    }

    @InputImport(name="tags")
        private final @Nullable Input<Object> tags;

    public Input<Object> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ComponentVersionArgs(
        @Nullable Input<String> inlineRecipe,
        @Nullable Input<ComponentVersionLambdaFunctionRecipeSourceArgs> lambdaFunction,
        @Nullable Input<Object> tags) {
        this.inlineRecipe = inlineRecipe;
        this.lambdaFunction = lambdaFunction;
        this.tags = tags;
    }

    private ComponentVersionArgs() {
        this.inlineRecipe = Input.empty();
        this.lambdaFunction = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> inlineRecipe;
        private @Nullable Input<ComponentVersionLambdaFunctionRecipeSourceArgs> lambdaFunction;
        private @Nullable Input<Object> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inlineRecipe = defaults.inlineRecipe;
    	      this.lambdaFunction = defaults.lambdaFunction;
    	      this.tags = defaults.tags;
        }

        public Builder setInlineRecipe(@Nullable Input<String> inlineRecipe) {
            this.inlineRecipe = inlineRecipe;
            return this;
        }

        public Builder setInlineRecipe(@Nullable String inlineRecipe) {
            this.inlineRecipe = Input.ofNullable(inlineRecipe);
            return this;
        }

        public Builder setLambdaFunction(@Nullable Input<ComponentVersionLambdaFunctionRecipeSourceArgs> lambdaFunction) {
            this.lambdaFunction = lambdaFunction;
            return this;
        }

        public Builder setLambdaFunction(@Nullable ComponentVersionLambdaFunctionRecipeSourceArgs lambdaFunction) {
            this.lambdaFunction = Input.ofNullable(lambdaFunction);
            return this;
        }

        public Builder setTags(@Nullable Input<Object> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Object tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ComponentVersionArgs build() {
            return new ComponentVersionArgs(inlineRecipe, lambdaFunction, tags);
        }
    }
}
