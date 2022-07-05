// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute.v1.outputs.InstanceGroupManagerStatusStatefulResponse;
import com.pulumi.googlenative.compute.v1.outputs.InstanceGroupManagerStatusVersionTargetResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InstanceGroupManagerStatusResponse {
    /**
     * @return The URL of the Autoscaler that targets this instance group manager.
     * 
     */
    private final String autoscaler;
    /**
     * @return A bit indicating whether the managed instance group is in a stable state. A stable state means that: none of the instances in the managed instance group is currently undergoing any type of change (for example, creation, restart, or deletion); no future changes are scheduled for instances in the managed instance group; and the managed instance group itself is not being modified.
     * 
     */
    private final Boolean isStable;
    /**
     * @return Stateful status of the given Instance Group Manager.
     * 
     */
    private final InstanceGroupManagerStatusStatefulResponse stateful;
    /**
     * @return A status of consistency of Instances&#39; versions with their target version specified by version field on Instance Group Manager.
     * 
     */
    private final InstanceGroupManagerStatusVersionTargetResponse versionTarget;

    @CustomType.Constructor
    private InstanceGroupManagerStatusResponse(
        @CustomType.Parameter("autoscaler") String autoscaler,
        @CustomType.Parameter("isStable") Boolean isStable,
        @CustomType.Parameter("stateful") InstanceGroupManagerStatusStatefulResponse stateful,
        @CustomType.Parameter("versionTarget") InstanceGroupManagerStatusVersionTargetResponse versionTarget) {
        this.autoscaler = autoscaler;
        this.isStable = isStable;
        this.stateful = stateful;
        this.versionTarget = versionTarget;
    }

    /**
     * @return The URL of the Autoscaler that targets this instance group manager.
     * 
     */
    public String autoscaler() {
        return this.autoscaler;
    }
    /**
     * @return A bit indicating whether the managed instance group is in a stable state. A stable state means that: none of the instances in the managed instance group is currently undergoing any type of change (for example, creation, restart, or deletion); no future changes are scheduled for instances in the managed instance group; and the managed instance group itself is not being modified.
     * 
     */
    public Boolean isStable() {
        return this.isStable;
    }
    /**
     * @return Stateful status of the given Instance Group Manager.
     * 
     */
    public InstanceGroupManagerStatusStatefulResponse stateful() {
        return this.stateful;
    }
    /**
     * @return A status of consistency of Instances&#39; versions with their target version specified by version field on Instance Group Manager.
     * 
     */
    public InstanceGroupManagerStatusVersionTargetResponse versionTarget() {
        return this.versionTarget;
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
        }        public InstanceGroupManagerStatusResponse build() {
            return new InstanceGroupManagerStatusResponse(autoscaler, isStable, stateful, versionTarget);
        }
    }
}
