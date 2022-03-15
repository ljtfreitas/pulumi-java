// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse {
    /**
     * A bit indicating if all of the group's per-instance configs (listed in the output of a listPerInstanceConfigs API call) have status EFFECTIVE or there are no per-instance-configs.
     * 
     */
    private final Boolean allEffective;

    @CustomType.Constructor
    private InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse(@CustomType.Parameter("allEffective") Boolean allEffective) {
        this.allEffective = allEffective;
    }

    /**
     * A bit indicating if all of the group's per-instance configs (listed in the output of a listPerInstanceConfigs API call) have status EFFECTIVE or there are no per-instance-configs.
     * 
    */
    public Boolean getAllEffective() {
        return this.allEffective;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allEffective;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allEffective = defaults.allEffective;
        }

        public Builder allEffective(Boolean allEffective) {
            this.allEffective = Objects.requireNonNull(allEffective);
            return this;
        }
        public InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse build() {
            return new InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse(allEffective);
        }
    }
}
