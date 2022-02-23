// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_alpha.outputs.ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse;
import java.util.Objects;

@OutputCustomType
public final class ResourcePolicyResourceStatusResponse {
    /**
     * Specifies a set of output values reffering to the instance_schedule_policy system status. This field should have the same name as corresponding policy field.
     * 
     */
    private final ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse instanceSchedulePolicy;

    @OutputCustomType.Constructor({"instanceSchedulePolicy"})
    private ResourcePolicyResourceStatusResponse(ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse instanceSchedulePolicy) {
        this.instanceSchedulePolicy = Objects.requireNonNull(instanceSchedulePolicy);
    }

    /**
     * Specifies a set of output values reffering to the instance_schedule_policy system status. This field should have the same name as corresponding policy field.
     * 
     */
    public ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse getInstanceSchedulePolicy() {
        return this.instanceSchedulePolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePolicyResourceStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse instanceSchedulePolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcePolicyResourceStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceSchedulePolicy = defaults.instanceSchedulePolicy;
        }

        public Builder setInstanceSchedulePolicy(ResourcePolicyResourceStatusInstanceSchedulePolicyStatusResponse instanceSchedulePolicy) {
            this.instanceSchedulePolicy = Objects.requireNonNull(instanceSchedulePolicy);
            return this;
        }
        public ResourcePolicyResourceStatusResponse build() {
            return new ResourcePolicyResourceStatusResponse(instanceSchedulePolicy);
        }
    }
}
