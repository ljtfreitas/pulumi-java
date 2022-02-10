// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.MatchConditionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebApplicationFirewallCustomRuleResponse {
    private final String action;
    private final String etag;
    private final List<MatchConditionResponse> matchConditions;
    private final @Nullable String name;
    private final Integer priority;
    private final String ruleType;

    @OutputCustomType.Constructor({"action","etag","matchConditions","name","priority","ruleType"})
    private WebApplicationFirewallCustomRuleResponse(
        String action,
        String etag,
        List<MatchConditionResponse> matchConditions,
        @Nullable String name,
        Integer priority,
        String ruleType) {
        this.action = Objects.requireNonNull(action);
        this.etag = Objects.requireNonNull(etag);
        this.matchConditions = Objects.requireNonNull(matchConditions);
        this.name = name;
        this.priority = Objects.requireNonNull(priority);
        this.ruleType = Objects.requireNonNull(ruleType);
    }

    public String getAction() {
        return this.action;
    }
    public String getEtag() {
        return this.etag;
    }
    public List<MatchConditionResponse> getMatchConditions() {
        return this.matchConditions;
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Integer getPriority() {
        return this.priority;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebApplicationFirewallCustomRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String action;
        private String etag;
        private List<MatchConditionResponse> matchConditions;
        private @Nullable String name;
        private Integer priority;
        private String ruleType;

        public Builder() {
    	      // Empty
        }

        public Builder(WebApplicationFirewallCustomRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.etag = defaults.etag;
    	      this.matchConditions = defaults.matchConditions;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.ruleType = defaults.ruleType;
        }

        public Builder setAction(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setMatchConditions(List<MatchConditionResponse> matchConditions) {
            this.matchConditions = Objects.requireNonNull(matchConditions);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setRuleType(String ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }

        public WebApplicationFirewallCustomRuleResponse build() {
            return new WebApplicationFirewallCustomRuleResponse(action, etag, matchConditions, name, priority, ruleType);
        }
    }
}