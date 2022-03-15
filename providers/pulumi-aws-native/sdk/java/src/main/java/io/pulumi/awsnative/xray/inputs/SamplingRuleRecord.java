// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.xray.inputs;

import io.pulumi.awsnative.xray.inputs.SamplingRule;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SamplingRuleRecord extends io.pulumi.resources.InvokeArgs {

    public static final SamplingRuleRecord Empty = new SamplingRuleRecord();

    /**
     * When the rule was created, in Unix time seconds.
     * 
     */
    @Import(name="createdAt")
      private final @Nullable String createdAt;

    public Optional<String> getCreatedAt() {
        return this.createdAt == null ? Optional.empty() : Optional.ofNullable(this.createdAt);
    }

    /**
     * When the rule was modified, in Unix time seconds.
     * 
     */
    @Import(name="modifiedAt")
      private final @Nullable String modifiedAt;

    public Optional<String> getModifiedAt() {
        return this.modifiedAt == null ? Optional.empty() : Optional.ofNullable(this.modifiedAt);
    }

    @Import(name="samplingRule")
      private final @Nullable SamplingRule samplingRule;

    public Optional<SamplingRule> getSamplingRule() {
        return this.samplingRule == null ? Optional.empty() : Optional.ofNullable(this.samplingRule);
    }

    public SamplingRuleRecord(
        @Nullable String createdAt,
        @Nullable String modifiedAt,
        @Nullable SamplingRule samplingRule) {
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.samplingRule = samplingRule;
    }

    private SamplingRuleRecord() {
        this.createdAt = null;
        this.modifiedAt = null;
        this.samplingRule = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SamplingRuleRecord defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String createdAt;
        private @Nullable String modifiedAt;
        private @Nullable SamplingRule samplingRule;

        public Builder() {
    	      // Empty
        }

        public Builder(SamplingRuleRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.modifiedAt = defaults.modifiedAt;
    	      this.samplingRule = defaults.samplingRule;
        }

        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder modifiedAt(@Nullable String modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }

        public Builder samplingRule(@Nullable SamplingRule samplingRule) {
            this.samplingRule = samplingRule;
            return this;
        }
        public SamplingRuleRecord build() {
            return new SamplingRuleRecord(createdAt, modifiedAt, samplingRule);
        }
    }
}
