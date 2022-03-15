// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.xray.outputs;

import io.pulumi.awsnative.xray.outputs.SamplingRule;
import io.pulumi.awsnative.xray.outputs.SamplingRuleRecord;
import io.pulumi.awsnative.xray.outputs.SamplingRuleUpdate;
import io.pulumi.awsnative.xray.outputs.TagsItemProperties;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetSamplingRuleResult {
    private final @Nullable String ruleARN;
    private final @Nullable String ruleName;
    private final @Nullable SamplingRule samplingRule;
    private final @Nullable SamplingRuleRecord samplingRuleRecord;
    private final @Nullable SamplingRuleUpdate samplingRuleUpdate;
    private final @Nullable List<TagsItemProperties> tags;

    @CustomType.Constructor
    private GetSamplingRuleResult(
        @CustomType.Parameter("ruleARN") @Nullable String ruleARN,
        @CustomType.Parameter("ruleName") @Nullable String ruleName,
        @CustomType.Parameter("samplingRule") @Nullable SamplingRule samplingRule,
        @CustomType.Parameter("samplingRuleRecord") @Nullable SamplingRuleRecord samplingRuleRecord,
        @CustomType.Parameter("samplingRuleUpdate") @Nullable SamplingRuleUpdate samplingRuleUpdate,
        @CustomType.Parameter("tags") @Nullable List<TagsItemProperties> tags) {
        this.ruleARN = ruleARN;
        this.ruleName = ruleName;
        this.samplingRule = samplingRule;
        this.samplingRuleRecord = samplingRuleRecord;
        this.samplingRuleUpdate = samplingRuleUpdate;
        this.tags = tags;
    }

    public Optional<String> getRuleARN() {
        return Optional.ofNullable(this.ruleARN);
    }
    public Optional<String> getRuleName() {
        return Optional.ofNullable(this.ruleName);
    }
    public Optional<SamplingRule> getSamplingRule() {
        return Optional.ofNullable(this.samplingRule);
    }
    public Optional<SamplingRuleRecord> getSamplingRuleRecord() {
        return Optional.ofNullable(this.samplingRuleRecord);
    }
    public Optional<SamplingRuleUpdate> getSamplingRuleUpdate() {
        return Optional.ofNullable(this.samplingRuleUpdate);
    }
    public List<TagsItemProperties> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSamplingRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String ruleARN;
        private @Nullable String ruleName;
        private @Nullable SamplingRule samplingRule;
        private @Nullable SamplingRuleRecord samplingRuleRecord;
        private @Nullable SamplingRuleUpdate samplingRuleUpdate;
        private @Nullable List<TagsItemProperties> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSamplingRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleARN = defaults.ruleARN;
    	      this.ruleName = defaults.ruleName;
    	      this.samplingRule = defaults.samplingRule;
    	      this.samplingRuleRecord = defaults.samplingRuleRecord;
    	      this.samplingRuleUpdate = defaults.samplingRuleUpdate;
    	      this.tags = defaults.tags;
        }

        public Builder ruleARN(@Nullable String ruleARN) {
            this.ruleARN = ruleARN;
            return this;
        }

        public Builder ruleName(@Nullable String ruleName) {
            this.ruleName = ruleName;
            return this;
        }

        public Builder samplingRule(@Nullable SamplingRule samplingRule) {
            this.samplingRule = samplingRule;
            return this;
        }

        public Builder samplingRuleRecord(@Nullable SamplingRuleRecord samplingRuleRecord) {
            this.samplingRuleRecord = samplingRuleRecord;
            return this;
        }

        public Builder samplingRuleUpdate(@Nullable SamplingRuleUpdate samplingRuleUpdate) {
            this.samplingRuleUpdate = samplingRuleUpdate;
            return this;
        }

        public Builder tags(@Nullable List<TagsItemProperties> tags) {
            this.tags = tags;
            return this;
        }
        public GetSamplingRuleResult build() {
            return new GetSamplingRuleResult(ruleARN, ruleName, samplingRule, samplingRuleRecord, samplingRuleUpdate, tags);
        }
    }
}
