// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class InstanceGroupManagerStandbyPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final InstanceGroupManagerStandbyPolicyResponse Empty = new InstanceGroupManagerStandbyPolicyResponse();

    @Import(name="initialDelaySec", required=true)
      private final Integer initialDelaySec;

    public Integer getInitialDelaySec() {
        return this.initialDelaySec;
    }

    public InstanceGroupManagerStandbyPolicyResponse(Integer initialDelaySec) {
        this.initialDelaySec = Objects.requireNonNull(initialDelaySec, "expected parameter 'initialDelaySec' to be non-null");
    }

    private InstanceGroupManagerStandbyPolicyResponse() {
        this.initialDelaySec = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerStandbyPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer initialDelaySec;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerStandbyPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.initialDelaySec = defaults.initialDelaySec;
        }

        public Builder initialDelaySec(Integer initialDelaySec) {
            this.initialDelaySec = Objects.requireNonNull(initialDelaySec);
            return this;
        }
        public InstanceGroupManagerStandbyPolicyResponse build() {
            return new InstanceGroupManagerStandbyPolicyResponse(initialDelaySec);
        }
    }
}
