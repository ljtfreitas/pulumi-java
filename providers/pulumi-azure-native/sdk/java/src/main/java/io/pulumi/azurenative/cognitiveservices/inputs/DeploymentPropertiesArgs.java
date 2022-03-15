// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.azurenative.cognitiveservices.inputs.DeploymentModelArgs;
import io.pulumi.azurenative.cognitiveservices.inputs.DeploymentScaleSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of Cognitive Services account deployment.
 * 
 */
public final class DeploymentPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentPropertiesArgs Empty = new DeploymentPropertiesArgs();

    /**
     * Properties of Cognitive Services account deployment model.
     * 
     */
    @Import(name="model")
      private final @Nullable Output<DeploymentModelArgs> model;

    public Output<DeploymentModelArgs> getModel() {
        return this.model == null ? Output.empty() : this.model;
    }

    /**
     * Properties of Cognitive Services account deployment model.
     * 
     */
    @Import(name="scaleSettings")
      private final @Nullable Output<DeploymentScaleSettingsArgs> scaleSettings;

    public Output<DeploymentScaleSettingsArgs> getScaleSettings() {
        return this.scaleSettings == null ? Output.empty() : this.scaleSettings;
    }

    public DeploymentPropertiesArgs(
        @Nullable Output<DeploymentModelArgs> model,
        @Nullable Output<DeploymentScaleSettingsArgs> scaleSettings) {
        this.model = model;
        this.scaleSettings = scaleSettings;
    }

    private DeploymentPropertiesArgs() {
        this.model = Output.empty();
        this.scaleSettings = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DeploymentModelArgs> model;
        private @Nullable Output<DeploymentScaleSettingsArgs> scaleSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.model = defaults.model;
    	      this.scaleSettings = defaults.scaleSettings;
        }

        public Builder model(@Nullable Output<DeploymentModelArgs> model) {
            this.model = model;
            return this;
        }

        public Builder model(@Nullable DeploymentModelArgs model) {
            this.model = Output.ofNullable(model);
            return this;
        }

        public Builder scaleSettings(@Nullable Output<DeploymentScaleSettingsArgs> scaleSettings) {
            this.scaleSettings = scaleSettings;
            return this;
        }

        public Builder scaleSettings(@Nullable DeploymentScaleSettingsArgs scaleSettings) {
            this.scaleSettings = Output.ofNullable(scaleSettings);
            return this;
        }
        public DeploymentPropertiesArgs build() {
            return new DeploymentPropertiesArgs(model, scaleSettings);
        }
    }
}
