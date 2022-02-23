// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.inputs.AutomationRuleSetResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The source event types which evaluate the security automation set of rules. For example - security alerts and security assessments. To learn more about the supported security events data models schemas - please visit https://aka.ms/ASCAutomationSchemas.
 * 
 */
public final class AutomationSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final AutomationSourceResponse Empty = new AutomationSourceResponse();

    /**
     * A valid event source type.
     * 
     */
    @InputImport(name="eventSource")
        private final @Nullable String eventSource;

    public Optional<String> getEventSource() {
        return this.eventSource == null ? Optional.empty() : Optional.ofNullable(this.eventSource);
    }

    /**
     * A set of rules which evaluate upon event interception. A logical disjunction is applied between defined rule sets (logical 'or').
     * 
     */
    @InputImport(name="ruleSets")
        private final @Nullable List<AutomationRuleSetResponse> ruleSets;

    public List<AutomationRuleSetResponse> getRuleSets() {
        return this.ruleSets == null ? List.of() : this.ruleSets;
    }

    public AutomationSourceResponse(
        @Nullable String eventSource,
        @Nullable List<AutomationRuleSetResponse> ruleSets) {
        this.eventSource = eventSource;
        this.ruleSets = ruleSets;
    }

    private AutomationSourceResponse() {
        this.eventSource = null;
        this.ruleSets = List.of();
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
