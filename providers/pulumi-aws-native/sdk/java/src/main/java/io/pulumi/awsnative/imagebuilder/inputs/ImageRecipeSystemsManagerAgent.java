// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Contains settings for the SSM agent on your build instance.
 * 
 */
public final class ImageRecipeSystemsManagerAgent extends io.pulumi.resources.InvokeArgs {

    public static final ImageRecipeSystemsManagerAgent Empty = new ImageRecipeSystemsManagerAgent();

    /**
     * Controls whether the SSM agent is removed from your final build image, prior to creating the new AMI. If this is set to true, then the agent is removed from the final image. If it's set to false, then the agent is left in, so that it is included in the new AMI. The default value is false.
     * 
     */
    @InputImport(name="uninstallAfterBuild")
        private final @Nullable Boolean uninstallAfterBuild;

    public Optional<Boolean> getUninstallAfterBuild() {
        return this.uninstallAfterBuild == null ? Optional.empty() : Optional.ofNullable(this.uninstallAfterBuild);
    }

    public ImageRecipeSystemsManagerAgent(@Nullable Boolean uninstallAfterBuild) {
        this.uninstallAfterBuild = uninstallAfterBuild;
    }

    private ImageRecipeSystemsManagerAgent() {
        this.uninstallAfterBuild = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRecipeSystemsManagerAgent defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean uninstallAfterBuild;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRecipeSystemsManagerAgent defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uninstallAfterBuild = defaults.uninstallAfterBuild;
        }

        public Builder setUninstallAfterBuild(@Nullable Boolean uninstallAfterBuild) {
            this.uninstallAfterBuild = uninstallAfterBuild;
            return this;
        }
        public ImageRecipeSystemsManagerAgent build() {
            return new ImageRecipeSystemsManagerAgent(uninstallAfterBuild);
        }
    }
}
