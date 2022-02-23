// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.outputs;

import io.pulumi.aws.networkfirewall.outputs.FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FirewallPolicyFirewallPolicyStatelessCustomAction {
    /**
     * A configuration block describing the custom action associated with the `action_name`. See Action Definition below for details.
     * 
     */
    private final FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition actionDefinition;
    /**
     * A friendly name of the custom action.
     * 
     */
    private final String actionName;

    @OutputCustomType.Constructor({"actionDefinition","actionName"})
    private FirewallPolicyFirewallPolicyStatelessCustomAction(
        FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition actionDefinition,
        String actionName) {
        this.actionDefinition = Objects.requireNonNull(actionDefinition);
        this.actionName = Objects.requireNonNull(actionName);
    }

    /**
     * A configuration block describing the custom action associated with the `action_name`. See Action Definition below for details.
     * 
     */
    public FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition getActionDefinition() {
        return this.actionDefinition;
    }
    /**
     * A friendly name of the custom action.
     * 
     */
    public String getActionName() {
        return this.actionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyFirewallPolicyStatelessCustomAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition actionDefinition;
        private String actionName;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyFirewallPolicyStatelessCustomAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionDefinition = defaults.actionDefinition;
    	      this.actionName = defaults.actionName;
        }

        public Builder setActionDefinition(FirewallPolicyFirewallPolicyStatelessCustomActionActionDefinition actionDefinition) {
            this.actionDefinition = Objects.requireNonNull(actionDefinition);
            return this;
        }

        public Builder setActionName(String actionName) {
            this.actionName = Objects.requireNonNull(actionName);
            return this;
        }
        public FirewallPolicyFirewallPolicyStatelessCustomAction build() {
            return new FirewallPolicyFirewallPolicyStatelessCustomAction(actionDefinition, actionName);
        }
    }
}
