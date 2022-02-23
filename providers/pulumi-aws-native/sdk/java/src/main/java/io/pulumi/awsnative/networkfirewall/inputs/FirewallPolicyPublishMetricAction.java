// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.inputs.FirewallPolicyDimension;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class FirewallPolicyPublishMetricAction extends io.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyPublishMetricAction Empty = new FirewallPolicyPublishMetricAction();

    @InputImport(name="dimensions", required=true)
        private final List<FirewallPolicyDimension> dimensions;

    public List<FirewallPolicyDimension> getDimensions() {
        return this.dimensions;
    }

    public FirewallPolicyPublishMetricAction(List<FirewallPolicyDimension> dimensions) {
        this.dimensions = Objects.requireNonNull(dimensions, "expected parameter 'dimensions' to be non-null");
    }

    private FirewallPolicyPublishMetricAction() {
        this.dimensions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyPublishMetricAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FirewallPolicyDimension> dimensions;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyPublishMetricAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
        }

        public Builder setDimensions(List<FirewallPolicyDimension> dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
            return this;
        }
        public FirewallPolicyPublishMetricAction build() {
            return new FirewallPolicyPublishMetricAction(dimensions);
        }
    }
}
