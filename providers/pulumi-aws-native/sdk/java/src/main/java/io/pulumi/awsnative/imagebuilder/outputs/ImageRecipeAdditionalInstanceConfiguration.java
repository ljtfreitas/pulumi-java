// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.awsnative.imagebuilder.outputs.ImageRecipeSystemsManagerAgent;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImageRecipeAdditionalInstanceConfiguration {
    /**
     * Contains settings for the SSM agent on your build instance.
     * 
     */
    private final @Nullable ImageRecipeSystemsManagerAgent systemsManagerAgent;
    /**
     * Use this property to provide commands or a command script to run when you launch your build instance.
     * 
     */
    private final @Nullable String userDataOverride;

    @OutputCustomType.Constructor
    private ImageRecipeAdditionalInstanceConfiguration(
        @OutputCustomType.Parameter("systemsManagerAgent") @Nullable ImageRecipeSystemsManagerAgent systemsManagerAgent,
        @OutputCustomType.Parameter("userDataOverride") @Nullable String userDataOverride) {
        this.systemsManagerAgent = systemsManagerAgent;
        this.userDataOverride = userDataOverride;
    }

    /**
     * Contains settings for the SSM agent on your build instance.
     * 
    */
    public Optional<ImageRecipeSystemsManagerAgent> getSystemsManagerAgent() {
        return Optional.ofNullable(this.systemsManagerAgent);
    }
    /**
     * Use this property to provide commands or a command script to run when you launch your build instance.
     * 
    */
    public Optional<String> getUserDataOverride() {
        return Optional.ofNullable(this.userDataOverride);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageRecipeAdditionalInstanceConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ImageRecipeSystemsManagerAgent systemsManagerAgent;
        private @Nullable String userDataOverride;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageRecipeAdditionalInstanceConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.systemsManagerAgent = defaults.systemsManagerAgent;
    	      this.userDataOverride = defaults.userDataOverride;
        }

        public Builder setSystemsManagerAgent(@Nullable ImageRecipeSystemsManagerAgent systemsManagerAgent) {
            this.systemsManagerAgent = systemsManagerAgent;
            return this;
        }

        public Builder setUserDataOverride(@Nullable String userDataOverride) {
            this.userDataOverride = userDataOverride;
            return this;
        }
        public ImageRecipeAdditionalInstanceConfiguration build() {
            return new ImageRecipeAdditionalInstanceConfiguration(systemsManagerAgent, userDataOverride);
        }
    }
}
