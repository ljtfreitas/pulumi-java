// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector.inputs;

import io.pulumi.awsnative.frauddetector.enums.DetectorRuleLanguage;
import io.pulumi.awsnative.frauddetector.inputs.DetectorOutcome;
import io.pulumi.awsnative.frauddetector.inputs.DetectorTag;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DetectorRule extends io.pulumi.resources.InvokeArgs {

    public static final DetectorRule Empty = new DetectorRule();

    @Import(name="arn")
      private final @Nullable String arn;

    public Optional<String> getArn() {
        return this.arn == null ? Optional.empty() : Optional.ofNullable(this.arn);
    }

    /**
     * The time when the event type was created.
     * 
     */
    @Import(name="createdTime")
      private final @Nullable String createdTime;

    public Optional<String> getCreatedTime() {
        return this.createdTime == null ? Optional.empty() : Optional.ofNullable(this.createdTime);
    }

    /**
     * The description.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @Import(name="detectorId")
      private final @Nullable String detectorId;

    public Optional<String> getDetectorId() {
        return this.detectorId == null ? Optional.empty() : Optional.ofNullable(this.detectorId);
    }

    @Import(name="expression")
      private final @Nullable String expression;

    public Optional<String> getExpression() {
        return this.expression == null ? Optional.empty() : Optional.ofNullable(this.expression);
    }

    @Import(name="language")
      private final @Nullable DetectorRuleLanguage language;

    public Optional<DetectorRuleLanguage> getLanguage() {
        return this.language == null ? Optional.empty() : Optional.ofNullable(this.language);
    }

    /**
     * The time when the event type was last updated.
     * 
     */
    @Import(name="lastUpdatedTime")
      private final @Nullable String lastUpdatedTime;

    public Optional<String> getLastUpdatedTime() {
        return this.lastUpdatedTime == null ? Optional.empty() : Optional.ofNullable(this.lastUpdatedTime);
    }

    @Import(name="outcomes")
      private final @Nullable List<DetectorOutcome> outcomes;

    public List<DetectorOutcome> getOutcomes() {
        return this.outcomes == null ? List.of() : this.outcomes;
    }

    @Import(name="ruleId")
      private final @Nullable String ruleId;

    public Optional<String> getRuleId() {
        return this.ruleId == null ? Optional.empty() : Optional.ofNullable(this.ruleId);
    }

    @Import(name="ruleVersion")
      private final @Nullable String ruleVersion;

    public Optional<String> getRuleVersion() {
        return this.ruleVersion == null ? Optional.empty() : Optional.ofNullable(this.ruleVersion);
    }

    /**
     * Tags associated with this event type.
     * 
     */
    @Import(name="tags")
      private final @Nullable List<DetectorTag> tags;

    public List<DetectorTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public DetectorRule(
        @Nullable String arn,
        @Nullable String createdTime,
        @Nullable String description,
        @Nullable String detectorId,
        @Nullable String expression,
        @Nullable DetectorRuleLanguage language,
        @Nullable String lastUpdatedTime,
        @Nullable List<DetectorOutcome> outcomes,
        @Nullable String ruleId,
        @Nullable String ruleVersion,
        @Nullable List<DetectorTag> tags) {
        this.arn = arn;
        this.createdTime = createdTime;
        this.description = description;
        this.detectorId = detectorId;
        this.expression = expression;
        this.language = language;
        this.lastUpdatedTime = lastUpdatedTime;
        this.outcomes = outcomes;
        this.ruleId = ruleId;
        this.ruleVersion = ruleVersion;
        this.tags = tags;
    }

    private DetectorRule() {
        this.arn = null;
        this.createdTime = null;
        this.description = null;
        this.detectorId = null;
        this.expression = null;
        this.language = null;
        this.lastUpdatedTime = null;
        this.outcomes = List.of();
        this.ruleId = null;
        this.ruleVersion = null;
        this.tags = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String createdTime;
        private @Nullable String description;
        private @Nullable String detectorId;
        private @Nullable String expression;
        private @Nullable DetectorRuleLanguage language;
        private @Nullable String lastUpdatedTime;
        private @Nullable List<DetectorOutcome> outcomes;
        private @Nullable String ruleId;
        private @Nullable String ruleVersion;
        private @Nullable List<DetectorTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.detectorId = defaults.detectorId;
    	      this.expression = defaults.expression;
    	      this.language = defaults.language;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.outcomes = defaults.outcomes;
    	      this.ruleId = defaults.ruleId;
    	      this.ruleVersion = defaults.ruleVersion;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder detectorId(@Nullable String detectorId) {
            this.detectorId = detectorId;
            return this;
        }

        public Builder expression(@Nullable String expression) {
            this.expression = expression;
            return this;
        }

        public Builder language(@Nullable DetectorRuleLanguage language) {
            this.language = language;
            return this;
        }

        public Builder lastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder outcomes(@Nullable List<DetectorOutcome> outcomes) {
            this.outcomes = outcomes;
            return this;
        }

        public Builder ruleId(@Nullable String ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        public Builder ruleVersion(@Nullable String ruleVersion) {
            this.ruleVersion = ruleVersion;
            return this;
        }

        public Builder tags(@Nullable List<DetectorTag> tags) {
            this.tags = tags;
            return this;
        }
        public DetectorRule build() {
            return new DetectorRule(arn, createdTime, description, detectorId, expression, language, lastUpdatedTime, outcomes, ruleId, ruleVersion, tags);
        }
    }
}
