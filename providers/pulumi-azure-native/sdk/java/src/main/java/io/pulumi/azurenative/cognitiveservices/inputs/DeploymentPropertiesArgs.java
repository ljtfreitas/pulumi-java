// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.azurenative.cognitiveservices.inputs.DeploymentModelArgs;
import io.pulumi.azurenative.cognitiveservices.inputs.DeploymentScaleSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
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
    @InputImport(name="model")
    private final @Nullable Input<DeploymentModelArgs> model;

    public Input<DeploymentModelArgs> getModel() {
        return this.model == null ? Input.empty() : this.model;
    }

    /**
     * Properties of Cognitive Services account deployment model.
     * 
     */
    @InputImport(name="scaleSettings")
    private final @Nullable Input<DeploymentScaleSettingsArgs> scaleSettings;

    public Input<DeploymentScaleSettingsArgs> getScaleSettings() {
        return this.scaleSettings == null ? Input.empty() : this.scaleSettings;
    }

    public DeploymentPropertiesArgs(
        @Nullable Input<DeploymentModelArgs> model,
        @Nullable Input<DeploymentScaleSettingsArgs> scaleSettings) {
        this.model = model;
        this.scaleSettings = scaleSettings;
    }

    private DeploymentPropertiesArgs() {
        this.model = Input.empty();
        this.scaleSettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DeploymentModelArgs> model;
        private @Nullable Input<DeploymentScaleSettingsArgs> scaleSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.model = defaults.model;
    	      this.scaleSettings = defaults.scaleSettings;
        }

        public Builder setModel(@Nullable Input<DeploymentModelArgs> model) {
            this.model = model;
            return this;
        }

        public Builder setModel(@Nullable DeploymentModelArgs model) {
            this.model = Input.ofNullable(model);
            return this;
        }

        public Builder setScaleSettings(@Nullable Input<DeploymentScaleSettingsArgs> scaleSettings) {
            this.scaleSettings = scaleSettings;
            return this;
        }

        public Builder setScaleSettings(@Nullable DeploymentScaleSettingsArgs scaleSettings) {
            this.scaleSettings = Input.ofNullable(scaleSettings);
            return this;
        }

        public DeploymentPropertiesArgs build() {
            return new DeploymentPropertiesArgs(model, scaleSettings);
        }
    }
}
