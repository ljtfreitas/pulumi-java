// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SubscriptionStateRuleResponse {
    private final @Nullable List<String> allowedActions;
    private final @Nullable String state;

    @OutputCustomType.Constructor({"allowedActions","state"})
    private SubscriptionStateRuleResponse(
        @Nullable List<String> allowedActions,
        @Nullable String state) {
        this.allowedActions = allowedActions;
        this.state = state;
    }

    public List<String> getAllowedActions() {
        return this.allowedActions == null ? List.of() : this.allowedActions;
    }
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionStateRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedActions;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionStateRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedActions = defaults.allowedActions;
    	      this.state = defaults.state;
        }

        public Builder setAllowedActions(@Nullable List<String> allowedActions) {
            this.allowedActions = allowedActions;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }
        public SubscriptionStateRuleResponse build() {
            return new SubscriptionStateRuleResponse(allowedActions, state);
        }
    }
}
