// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.inputs;

import io.pulumi.aws.wafregional.inputs.RulePredicateGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleState extends io.pulumi.resources.ResourceArgs {

    public static final RuleState Empty = new RuleState();

    /**
     * The ARN of the WAF Regional Rule.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The name or description for the Amazon CloudWatch metric of this rule.
     * 
     */
    @Import(name="metricName")
      private final @Nullable Output<String> metricName;

    public Output<String> getMetricName() {
        return this.metricName == null ? Output.empty() : this.metricName;
    }

    /**
     * The name or description of the rule.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The objects to include in a rule (documented below).
     * 
     */
    @Import(name="predicates")
      private final @Nullable Output<List<RulePredicateGetArgs>> predicates;

    public Output<List<RulePredicateGetArgs>> getPredicates() {
        return this.predicates == null ? Output.empty() : this.predicates;
    }

    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public RuleState(
        @Nullable Output<String> arn,
        @Nullable Output<String> metricName,
        @Nullable Output<String> name,
        @Nullable Output<List<RulePredicateGetArgs>> predicates,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.metricName = metricName;
        this.name = name;
        this.predicates = predicates;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private RuleState() {
        this.arn = Output.empty();
        this.metricName = Output.empty();
        this.name = Output.empty();
        this.predicates = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> metricName;
        private @Nullable Output<String> name;
        private @Nullable Output<List<RulePredicateGetArgs>> predicates;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.metricName = defaults.metricName;
    	      this.name = defaults.name;
    	      this.predicates = defaults.predicates;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder metricName(@Nullable Output<String> metricName) {
            this.metricName = metricName;
            return this;
        }

        public Builder metricName(@Nullable String metricName) {
            this.metricName = Output.ofNullable(metricName);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder predicates(@Nullable Output<List<RulePredicateGetArgs>> predicates) {
            this.predicates = predicates;
            return this;
        }

        public Builder predicates(@Nullable List<RulePredicateGetArgs> predicates) {
            this.predicates = Output.ofNullable(predicates);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public RuleState build() {
            return new RuleState(arn, metricName, name, predicates, tags, tagsAll);
        }
    }
}
