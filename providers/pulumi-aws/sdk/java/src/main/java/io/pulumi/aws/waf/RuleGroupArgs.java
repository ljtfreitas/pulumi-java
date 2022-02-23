// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf;

import io.pulumi.aws.waf.inputs.RuleGroupActivatedRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupArgs Empty = new RuleGroupArgs();

    /**
     * A list of activated rules, see below
     * 
     */
    @InputImport(name="activatedRules")
    private final @Nullable Input<List<RuleGroupActivatedRuleArgs>> activatedRules;

    public Input<List<RuleGroupActivatedRuleArgs>> getActivatedRules() {
        return this.activatedRules == null ? Input.empty() : this.activatedRules;
    }

    /**
     * A friendly name for the metrics from the rule group
     * 
     */
    @InputImport(name="metricName", required=true)
    private final Input<String> metricName;

    public Input<String> getMetricName() {
        return this.metricName;
    }

    /**
     * A friendly name of the rule group
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public RuleGroupArgs(
        @Nullable Input<List<RuleGroupActivatedRuleArgs>> activatedRules,
        Input<String> metricName,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> tags) {
        this.activatedRules = activatedRules;
        this.metricName = Objects.requireNonNull(metricName, "expected parameter 'metricName' to be non-null");
        this.name = name;
        this.tags = tags;
    }

    private RuleGroupArgs() {
        this.activatedRules = Input.empty();
        this.metricName = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<RuleGroupActivatedRuleArgs>> activatedRules;
        private Input<String> metricName;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activatedRules = defaults.activatedRules;
    	      this.metricName = defaults.metricName;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setActivatedRules(@Nullable Input<List<RuleGroupActivatedRuleArgs>> activatedRules) {
            this.activatedRules = activatedRules;
            return this;
        }

        public Builder setActivatedRules(@Nullable List<RuleGroupActivatedRuleArgs> activatedRules) {
            this.activatedRules = Input.ofNullable(activatedRules);
            return this;
        }

        public Builder setMetricName(Input<String> metricName) {
            this.metricName = Objects.requireNonNull(metricName);
            return this;
        }

        public Builder setMetricName(String metricName) {
            this.metricName = Input.of(Objects.requireNonNull(metricName));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public RuleGroupArgs build() {
            return new RuleGroupArgs(activatedRules, metricName, name, tags);
        }
    }
}
