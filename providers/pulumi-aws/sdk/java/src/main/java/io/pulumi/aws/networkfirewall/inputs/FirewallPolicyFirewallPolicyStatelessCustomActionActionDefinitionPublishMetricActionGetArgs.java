// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimensionGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionGetArgs Empty = new FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionGetArgs();

    /**
     * Set of configuration blocks describing dimension settings to use for Amazon CloudWatch custom metrics. See Dimension below for more details.
     * 
     */
    @Import(name="dimensions", required=true)
      private final Output<List<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimensionGetArgs>> dimensions;

    public Output<List<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimensionGetArgs>> getDimensions() {
        return this.dimensions;
    }

    public FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionGetArgs(Output<List<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimensionGetArgs>> dimensions) {
        this.dimensions = Objects.requireNonNull(dimensions, "expected parameter 'dimensions' to be non-null");
    }

    private FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionGetArgs() {
        this.dimensions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimensionGetArgs>> dimensions;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dimensions = defaults.dimensions;
        }

        public Builder dimensions(Output<List<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimensionGetArgs>> dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
            return this;
        }

        public Builder dimensions(List<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionDimensionGetArgs> dimensions) {
            this.dimensions = Output.of(Objects.requireNonNull(dimensions));
            return this;
        }
        public FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionGetArgs build() {
            return new FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionGetArgs(dimensions);
        }
    }
}
