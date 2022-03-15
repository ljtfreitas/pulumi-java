// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Deployment on error behavior with additional details.
 * 
 */
public final class OnErrorDeploymentExtendedResponse extends io.pulumi.resources.InvokeArgs {

    public static final OnErrorDeploymentExtendedResponse Empty = new OnErrorDeploymentExtendedResponse();

    /**
     * The deployment to be used on error case.
     * 
     */
    @Import(name="deploymentName")
      private final @Nullable String deploymentName;

    public Optional<String> getDeploymentName() {
        return this.deploymentName == null ? Optional.empty() : Optional.ofNullable(this.deploymentName);
    }

    /**
     * The state of the provisioning for the on error deployment.
     * 
     */
    @Import(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * The deployment on error behavior type. Possible values are LastSuccessful and SpecificDeployment.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public OnErrorDeploymentExtendedResponse(
        @Nullable String deploymentName,
        String provisioningState,
        @Nullable String type) {
        this.deploymentName = deploymentName;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.type = type;
    }

    private OnErrorDeploymentExtendedResponse() {
        this.deploymentName = null;
        this.provisioningState = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OnErrorDeploymentExtendedResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String deploymentName;
        private String provisioningState;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(OnErrorDeploymentExtendedResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deploymentName = defaults.deploymentName;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder deploymentName(@Nullable String deploymentName) {
            this.deploymentName = deploymentName;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public OnErrorDeploymentExtendedResponse build() {
            return new OnErrorDeploymentExtendedResponse(deploymentName, provisioningState, type);
        }
    }
}
