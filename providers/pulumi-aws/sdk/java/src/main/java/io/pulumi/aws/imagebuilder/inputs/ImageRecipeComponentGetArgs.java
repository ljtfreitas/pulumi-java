// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ImageRecipeComponentGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageRecipeComponentGetArgs Empty = new ImageRecipeComponentGetArgs();

    /**
     * Amazon Resource Name (ARN) of the Image Builder Component to associate.
     * 
     */
    @InputImport(name="componentArn", required=true)
    private final Input<String> componentArn;

    public Input<String> getComponentArn() {
        return this.componentArn;
    }

    public ImageRecipeComponentGetArgs(Input<String> componentArn) {
        this.componentArn = Objects.requireNonNull(componentArn, "expected parameter 'componentArn' to be non-null");
    }

    private ImageRecipeComponentGetArgs() {
        this.componentArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRecipeComponentGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> componentArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRecipeComponentGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentArn = defaults.componentArn;
        }

        public Builder setComponentArn(Input<String> componentArn) {
            this.componentArn = Objects.requireNonNull(componentArn);
            return this;
        }

        public Builder setComponentArn(String componentArn) {
            this.componentArn = Input.of(Objects.requireNonNull(componentArn));
            return this;
        }
        public ImageRecipeComponentGetArgs build() {
            return new ImageRecipeComponentGetArgs(componentArn);
        }
    }
}
