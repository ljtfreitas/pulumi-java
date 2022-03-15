// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices.inputs;

import io.pulumi.azurenative.cognitiveservices.inputs.DeploymentModelResponse;
import io.pulumi.azurenative.cognitiveservices.inputs.DeploymentScaleSettingsResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of Cognitive Services account deployment.
 * 
 */
public final class DeploymentPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeploymentPropertiesResponse Empty = new DeploymentPropertiesResponse();

    /**
     * Properties of Cognitive Services account deployment model.
     * 
     */
    @Import(name="model")
      private final @Nullable DeploymentModelResponse model;

    public Optional<DeploymentModelResponse> getModel() {
        return this.model == null ? Optional.empty() : Optional.ofNullable(this.model);
    }

    /**
     * Gets the status of the resource at the time the operation was called.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Properties of Cognitive Services account deployment model.
     * 
     */
    @Import(name="scaleSettings")
      private final @Nullable DeploymentScaleSettingsResponse scaleSettings;

    public Optional<DeploymentScaleSettingsResponse> getScaleSettings() {
        return this.scaleSettings == null ? Optional.empty() : Optional.ofNullable(this.scaleSettings);
    }

    public DeploymentPropertiesResponse(
        @Nullable DeploymentModelResponse model,
        String provisioningState,
        @Nullable DeploymentScaleSettingsResponse scaleSettings) {
        this.model = model;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.scaleSettings = scaleSettings;
    }

    private DeploymentPropertiesResponse() {
        this.model = null;
        this.provisioningState = null;
        this.scaleSettings = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DeploymentModelResponse model;
        private String provisioningState;
        private @Nullable DeploymentScaleSettingsResponse scaleSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.model = defaults.model;
    	      this.provisioningState = defaults.provisioningState;
    	      this.scaleSettings = defaults.scaleSettings;
        }

        public Builder model(@Nullable DeploymentModelResponse model) {
            this.model = model;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder scaleSettings(@Nullable DeploymentScaleSettingsResponse scaleSettings) {
            this.scaleSettings = scaleSettings;
            return this;
        }
        public DeploymentPropertiesResponse build() {
            return new DeploymentPropertiesResponse(model, provisioningState, scaleSettings);
        }
    }
}
