// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.NamespacedGkeDeploymentTargetResponse;
import java.util.Objects;


/**
 * The GKE config for this cluster.
 * 
 */
public final class GkeClusterConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GkeClusterConfigResponse Empty = new GkeClusterConfigResponse();

    /**
     * Optional. A target for the deployment.
     * 
     */
    @Import(name="namespacedGkeDeploymentTarget", required=true)
      private final NamespacedGkeDeploymentTargetResponse namespacedGkeDeploymentTarget;

    public NamespacedGkeDeploymentTargetResponse getNamespacedGkeDeploymentTarget() {
        return this.namespacedGkeDeploymentTarget;
    }

    public GkeClusterConfigResponse(NamespacedGkeDeploymentTargetResponse namespacedGkeDeploymentTarget) {
        this.namespacedGkeDeploymentTarget = Objects.requireNonNull(namespacedGkeDeploymentTarget, "expected parameter 'namespacedGkeDeploymentTarget' to be non-null");
    }

    private GkeClusterConfigResponse() {
        this.namespacedGkeDeploymentTarget = null;
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
