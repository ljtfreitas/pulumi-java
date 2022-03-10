// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.outputs;

import io.pulumi.awsnative.networkfirewall.outputs.FirewallPolicyActionDefinition;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class FirewallPolicyCustomAction {
    private final FirewallPolicyActionDefinition actionDefinition;
    private final String actionName;

    @OutputCustomType.Constructor
    private FirewallPolicyCustomAction(
        @OutputCustomType.Parameter("actionDefinition") FirewallPolicyActionDefinition actionDefinition,
        @OutputCustomType.Parameter("actionName") String actionName) {
        this.actionDefinition = actionDefinition;
        this.actionName = actionName;
    }

    public FirewallPolicyActionDefinition getActionDefinition() {
        return this.actionDefinition;
    }
    public String getActionName() {
        return this.actionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyCustomAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FirewallPolicyActionDefinition actionDefinition;
        private String actionName;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyCustomAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionDefinition = defaults.actionDefinition;
    	      this.actionName = defaults.actionName;
        }

        public Builder setActionDefinition(FirewallPolicyActionDefinition actionDefinition) {
            this.actionDefinition = Objects.requireNonNull(actionDefinition);
            return this;
        }

        public Builder setActionName(String actionName) {
            this.actionName = Objects.requireNonNull(actionName);
            return this;
        }
        public FirewallPolicyCustomAction build() {
            return new FirewallPolicyCustomAction(actionDefinition, actionName);
        }
    }
}
