// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionGetArgs Empty = new FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionGetArgs();

    /**
     * A configuration block describing the stateless inspection criteria that publishes the specified metrics to Amazon CloudWatch for the matching packet. You can pair this custom action with any of the standard stateless rule actions. See Publish Metric Action below for details.
     * 
     */
    @InputImport(name="publishMetricAction", required=true)
    private final Input<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionGetArgs> publishMetricAction;

    public Input<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionGetArgs> getPublishMetricAction() {
        return this.publishMetricAction;
    }

    public FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionGetArgs(Input<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionGetArgs> publishMetricAction) {
        this.publishMetricAction = Objects.requireNonNull(publishMetricAction, "expected parameter 'publishMetricAction' to be non-null");
    }

    private FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionGetArgs() {
        this.publishMetricAction = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionGetArgs> publishMetricAction;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publishMetricAction = defaults.publishMetricAction;
        }

        public Builder setPublishMetricAction(Input<FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionGetArgs> publishMetricAction) {
            this.publishMetricAction = Objects.requireNonNull(publishMetricAction);
            return this;
        }

        public Builder setPublishMetricAction(FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionPublishMetricActionGetArgs publishMetricAction) {
            this.publishMetricAction = Input.of(Objects.requireNonNull(publishMetricAction));
            return this;
        }
        public FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionGetArgs build() {
            return new FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinitionGetArgs(publishMetricAction);
        }
    }
}