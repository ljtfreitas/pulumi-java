// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse Empty = new InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse();

    /**
     * A bit indicating if all of the group's per-instance configs (listed in the output of a listPerInstanceConfigs API call) have status EFFECTIVE or there are no per-instance-configs.
     * 
     */
    @InputImport(name="allEffective", required=true)
      private final Boolean allEffective;

    public Boolean getAllEffective() {
        return this.allEffective;
    }

    public InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse(Boolean allEffective) {
        this.allEffective = Objects.requireNonNull(allEffective, "expected parameter 'allEffective' to be non-null");
    }

    private InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse() {
        this.allEffective = null;
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

        public Builder setAllEffective(Boolean allEffective) {
            this.allEffective = Objects.requireNonNull(allEffective);
            return this;
        }
        public InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse build() {
            return new InstanceGroupManagerStatusStatefulPerInstanceConfigsResponse(allEffective);
        }
    }
}
