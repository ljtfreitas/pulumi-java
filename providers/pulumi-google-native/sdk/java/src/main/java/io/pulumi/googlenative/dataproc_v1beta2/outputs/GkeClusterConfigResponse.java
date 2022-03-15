// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dataproc_v1beta2.outputs.NamespacedGkeDeploymentTargetResponse;
import java.util.Objects;

@CustomType
public final class GkeClusterConfigResponse {
    /**
     * Optional. A target for the deployment.
     * 
     */
    private final NamespacedGkeDeploymentTargetResponse namespacedGkeDeploymentTarget;

    @CustomType.Constructor
    private GkeClusterConfigResponse(@CustomType.Parameter("namespacedGkeDeploymentTarget") NamespacedGkeDeploymentTargetResponse namespacedGkeDeploymentTarget) {
        this.namespacedGkeDeploymentTarget = namespacedGkeDeploymentTarget;
    }

    /**
     * Optional. A target for the deployment.
     * 
    */
    public NamespacedGkeDeploymentTargetResponse getNamespacedGkeDeploymentTarget() {
        return this.namespacedGkeDeploymentTarget;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GkeClusterConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespacedGkeDeploymentTargetResponse namespacedGkeDeploymentTarget;

        public Builder() {
    	      // Empty
        }

        public Builder(GkeClusterConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespacedGkeDeploymentTarget = defaults.namespacedGkeDeploymentTarget;
        }

        public Builder namespacedGkeDeploymentTarget(NamespacedGkeDeploymentTargetResponse namespacedGkeDeploymentTarget) {
            this.namespacedGkeDeploymentTarget = Objects.requireNonNull(namespacedGkeDeploymentTarget);
            return this;
        }
        public GkeClusterConfigResponse build() {
            return new GkeClusterConfigResponse(namespacedGkeDeploymentTarget);
        }
    }
}
