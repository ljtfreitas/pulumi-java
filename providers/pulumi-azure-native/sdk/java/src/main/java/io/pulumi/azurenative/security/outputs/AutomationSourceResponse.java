// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.azurenative.security.outputs.AutomationRuleSetResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AutomationSourceResponse {
    /**
     * A valid event source type.
     * 
     */
    private final @Nullable String eventSource;
    /**
     * A set of rules which evaluate upon event interception. A logical disjunction is applied between defined rule sets (logical 'or').
     * 
     */
    private final @Nullable List<AutomationRuleSetResponse> ruleSets;

    @OutputCustomType.Constructor({"eventSource","ruleSets"})
    private AutomationSourceResponse(
        @Nullable String eventSource,
        @Nullable List<AutomationRuleSetResponse> ruleSets) {
        this.eventSource = eventSource;
        this.ruleSets = ruleSets;
    }

    /**
     * A valid event source type.
     * 
     */
    public Optional<String> getEventSource() {
        return Optional.ofNullable(this.eventSource);
    }
    /**
     * A set of rules which evaluate upon event interception. A logical disjunction is applied between defined rule sets (logical 'or').
     * 
     */
    public List<AutomationRuleSetResponse> getRuleSets() {
        return this.ruleSets == null ? List.of() : this.ruleSets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutomationSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eventSource;
        private @Nullable List<AutomationRuleSetResponse> ruleSets;

        public Builder() {
    	      // Empty
        }

        public Builder(AutomationSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventSource = defaults.eventSource;
    	      this.ruleSets = defaults.ruleSets;
        }

        public Builder setEventSource(@Nullable String eventSource) {
            this.eventSource = eventSource;
            return this;
        }

        public Builder setRuleSets(@Nullable List<AutomationRuleSetResponse> ruleSets) {
            this.ruleSets = ruleSets;
            return this;
        }
        public AutomationSourceResponse build() {
            return new AutomationSourceResponse(eventSource, ruleSets);
        }
    }
}
