// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.inputs.FirewallPolicyPublishMetricAction;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FirewallPolicyActionDefinition extends io.pulumi.resources.InvokeArgs {

    public static final FirewallPolicyActionDefinition Empty = new FirewallPolicyActionDefinition();

    @InputImport(name="publishMetricAction")
        private final @Nullable FirewallPolicyPublishMetricAction publishMetricAction;

    public Optional<FirewallPolicyPublishMetricAction> getPublishMetricAction() {
        return this.publishMetricAction == null ? Optional.empty() : Optional.ofNullable(this.publishMetricAction);
    }

    public FirewallPolicyActionDefinition(@Nullable FirewallPolicyPublishMetricAction publishMetricAction) {
        this.publishMetricAction = publishMetricAction;
    }

    private FirewallPolicyActionDefinition() {
        this.publishMetricAction = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyActionDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable FirewallPolicyPublishMetricAction publishMetricAction;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyActionDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publishMetricAction = defaults.publishMetricAction;
        }

        public Builder setPublishMetricAction(@Nullable FirewallPolicyPublishMetricAction publishMetricAction) {
            this.publishMetricAction = publishMetricAction;
            return this;
        }
        public FirewallPolicyActionDefinition build() {
            return new FirewallPolicyActionDefinition(publishMetricAction);
        }
    }
}
