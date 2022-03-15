// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_beta.inputs.InstanceGroupManagerStatusStatefulResponse;
import io.pulumi.googlenative.compute_beta.inputs.InstanceGroupManagerStatusVersionTargetResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class InstanceGroupManagerStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstanceGroupManagerStatusResponse Empty = new InstanceGroupManagerStatusResponse();

    /**
     * The URL of the Autoscaler that targets this instance group manager.
     * 
     */
    @Import(name="autoscaler", required=true)
      private final String autoscaler;

    public String getAutoscaler() {
        return this.autoscaler;
    }

    /**
     * A bit indicating whether the managed instance group is in a stable state. A stable state means that: none of the instances in the managed instance group is currently undergoing any type of change (for example, creation, restart, or deletion); no future changes are scheduled for instances in the managed instance group; and the managed instance group itself is not being modified.
     * 
     */
    @Import(name="isStable", required=true)
      private final Boolean isStable;

    public Boolean getIsStable() {
        return this.isStable;
    }

    /**
     * Stateful status of the given Instance Group Manager.
     * 
     */
    @Import(name="stateful", required=true)
      private final InstanceGroupManagerStatusStatefulResponse stateful;

    public InstanceGroupManagerStatusStatefulResponse getStateful() {
        return this.stateful;
    }

    /**
     * A status of consistency of Instances' versions with their target version specified by version field on Instance Group Manager.
     * 
     */
    @Import(name="versionTarget", required=true)
      private final InstanceGroupManagerStatusVersionTargetResponse versionTarget;

    public InstanceGroupManagerStatusVersionTargetResponse getVersionTarget() {
        return this.versionTarget;
    }

    public InstanceGroupManagerStatusResponse(
        String autoscaler,
        Boolean isStable,
        InstanceGroupManagerStatusStatefulResponse stateful,
        InstanceGroupManagerStatusVersionTargetResponse versionTarget) {
        this.autoscaler = Objects.requireNonNull(autoscaler, "expected parameter 'autoscaler' to be non-null");
        this.isStable = Objects.requireNonNull(isStable, "expected parameter 'isStable' to be non-null");
        this.stateful = Objects.requireNonNull(stateful, "expected parameter 'stateful' to be non-null");
        this.versionTarget = Objects.requireNonNull(versionTarget, "expected parameter 'versionTarget' to be non-null");
    }

    private InstanceGroupManagerStatusResponse() {
        this.autoscaler = null;
        this.isStable = null;
        this.stateful = null;
        this.versionTarget = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoscaler;
        private Boolean isStable;
        private InstanceGroupManagerStatusStatefulResponse stateful;
        private InstanceGroupManagerStatusVersionTargetResponse versionTarget;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaler = defaults.autoscaler;
    	      this.isStable = defaults.isStable;
    	      this.stateful = defaults.stateful;
    	      this.versionTarget = defaults.versionTarget;
        }

        public Builder autoscaler(String autoscaler) {
            this.autoscaler = Objects.requireNonNull(autoscaler);
            return this;
        }

        public Builder isStable(Boolean isStable) {
            this.isStable = Objects.requireNonNull(isStable);
            return this;
        }

        public Builder stateful(InstanceGroupManagerStatusStatefulResponse stateful) {
            this.stateful = Objects.requireNonNull(stateful);
            return this;
        }

        public Builder versionTarget(InstanceGroupManagerStatusVersionTargetResponse versionTarget) {
            this.versionTarget = Objects.requireNonNull(versionTarget);
            return this;
        }
        public InstanceGroupManagerStatusResponse build() {
            return new InstanceGroupManagerStatusResponse(autoscaler, isStable, stateful, versionTarget);
        }
    }
}
