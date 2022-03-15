// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.awsnative.databrew.outputs.RulesetRule;
import io.pulumi.awsnative.databrew.outputs.RulesetTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetRulesetResult {
    /**
     * Description of the Ruleset
     * 
     */
    private final @Nullable String description;
    /**
     * List of the data quality rules in the ruleset
     * 
     */
    private final @Nullable List<RulesetRule> rules;
    private final @Nullable List<RulesetTag> tags;

    @CustomType.Constructor
    private GetRulesetResult(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("rules") @Nullable List<RulesetRule> rules,
        @CustomType.Parameter("tags") @Nullable List<RulesetTag> tags) {
        this.description = description;
        this.rules = rules;
        this.tags = tags;
    }

    /**
     * Description of the Ruleset
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * List of the data quality rules in the ruleset
     * 
    */
    public List<RulesetRule> getRules() {
        return this.rules == null ? List.of() : this.rules;
    }
    public List<RulesetTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRulesetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<RulesetRule> rules;
        private @Nullable List<RulesetTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRulesetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.rules = defaults.rules;
    	      this.tags = defaults.tags;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder rules(@Nullable List<RulesetRule> rules) {
            this.rules = rules;
            return this;
        }

        public Builder tags(@Nullable List<RulesetTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetRulesetResult build() {
            return new GetRulesetResult(description, rules, tags);
        }
    }
}
