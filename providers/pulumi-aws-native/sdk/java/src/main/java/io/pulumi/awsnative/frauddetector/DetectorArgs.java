// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector;

import io.pulumi.awsnative.frauddetector.enums.DetectorRuleExecutionMode;
import io.pulumi.awsnative.frauddetector.enums.DetectorVersionStatus;
import io.pulumi.awsnative.frauddetector.inputs.DetectorEventTypeArgs;
import io.pulumi.awsnative.frauddetector.inputs.DetectorModelArgs;
import io.pulumi.awsnative.frauddetector.inputs.DetectorRuleArgs;
import io.pulumi.awsnative.frauddetector.inputs.DetectorTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DetectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorArgs Empty = new DetectorArgs();

    /**
     * The models to associate with this detector.
     * 
     */
    @InputImport(name="associatedModels")
        private final @Nullable Input<List<DetectorModelArgs>> associatedModels;

    public Input<List<DetectorModelArgs>> getAssociatedModels() {
        return this.associatedModels == null ? Input.empty() : this.associatedModels;
    }

    /**
     * The description of the detector.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The ID of the detector
     * 
     */
    @InputImport(name="detectorId", required=true)
        private final Input<String> detectorId;

    public Input<String> getDetectorId() {
        return this.detectorId;
    }

    /**
     * The desired detector version status for the detector
     * 
     */
    @InputImport(name="detectorVersionStatus")
        private final @Nullable Input<DetectorVersionStatus> detectorVersionStatus;

    public Input<DetectorVersionStatus> getDetectorVersionStatus() {
        return this.detectorVersionStatus == null ? Input.empty() : this.detectorVersionStatus;
    }

    /**
     * The event type to associate this detector with.
     * 
     */
    @InputImport(name="eventType", required=true)
        private final Input<DetectorEventTypeArgs> eventType;

    public Input<DetectorEventTypeArgs> getEventType() {
        return this.eventType;
    }

    @InputImport(name="ruleExecutionMode")
        private final @Nullable Input<DetectorRuleExecutionMode> ruleExecutionMode;

    public Input<DetectorRuleExecutionMode> getRuleExecutionMode() {
        return this.ruleExecutionMode == null ? Input.empty() : this.ruleExecutionMode;
    }

    @InputImport(name="rules", required=true)
        private final Input<List<DetectorRuleArgs>> rules;

    public Input<List<DetectorRuleArgs>> getRules() {
        return this.rules;
    }

    /**
     * Tags associated with this detector.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<List<DetectorTagArgs>> tags;

    public Input<List<DetectorTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public DetectorArgs(
        @Nullable Input<List<DetectorModelArgs>> associatedModels,
        @Nullable Input<String> description,
        Input<String> detectorId,
        @Nullable Input<DetectorVersionStatus> detectorVersionStatus,
        Input<DetectorEventTypeArgs> eventType,
        @Nullable Input<DetectorRuleExecutionMode> ruleExecutionMode,
        Input<List<DetectorRuleArgs>> rules,
        @Nullable Input<List<DetectorTagArgs>> tags) {
        this.associatedModels = associatedModels;
        this.description = description;
        this.detectorId = Objects.requireNonNull(detectorId, "expected parameter 'detectorId' to be non-null");
        this.detectorVersionStatus = detectorVersionStatus;
        this.eventType = Objects.requireNonNull(eventType, "expected parameter 'eventType' to be non-null");
        this.ruleExecutionMode = ruleExecutionMode;
        this.rules = Objects.requireNonNull(rules, "expected parameter 'rules' to be non-null");
        this.tags = tags;
    }

    private DetectorArgs() {
        this.associatedModels = Input.empty();
        this.description = Input.empty();
        this.detectorId = Input.empty();
        this.detectorVersionStatus = Input.empty();
        this.eventType = Input.empty();
        this.ruleExecutionMode = Input.empty();
        this.rules = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DetectorModelArgs>> associatedModels;
        private @Nullable Input<String> description;
        private Input<String> detectorId;
        private @Nullable Input<DetectorVersionStatus> detectorVersionStatus;
        private Input<DetectorEventTypeArgs> eventType;
        private @Nullable Input<DetectorRuleExecutionMode> ruleExecutionMode;
        private Input<List<DetectorRuleArgs>> rules;
        private @Nullable Input<List<DetectorTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associatedModels = defaults.associatedModels;
    	      this.description = defaults.description;
    	      this.detectorId = defaults.detectorId;
    	      this.detectorVersionStatus = defaults.detectorVersionStatus;
    	      this.eventType = defaults.eventType;
    	      this.ruleExecutionMode = defaults.ruleExecutionMode;
    	      this.rules = defaults.rules;
    	      this.tags = defaults.tags;
        }

        public Builder setAssociatedModels(@Nullable Input<List<DetectorModelArgs>> associatedModels) {
            this.associatedModels = associatedModels;
            return this;
        }

        public Builder setAssociatedModels(@Nullable List<DetectorModelArgs> associatedModels) {
            this.associatedModels = Input.ofNullable(associatedModels);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDetectorId(Input<String> detectorId) {
            this.detectorId = Objects.requireNonNull(detectorId);
            return this;
        }

        public Builder setDetectorId(String detectorId) {
            this.detectorId = Input.of(Objects.requireNonNull(detectorId));
            return this;
        }

        public Builder setDetectorVersionStatus(@Nullable Input<DetectorVersionStatus> detectorVersionStatus) {
            this.detectorVersionStatus = detectorVersionStatus;
            return this;
        }

        public Builder setDetectorVersionStatus(@Nullable DetectorVersionStatus detectorVersionStatus) {
            this.detectorVersionStatus = Input.ofNullable(detectorVersionStatus);
            return this;
        }

        public Builder setEventType(Input<DetectorEventTypeArgs> eventType) {
            this.eventType = Objects.requireNonNull(eventType);
            return this;
        }

        public Builder setEventType(DetectorEventTypeArgs eventType) {
            this.eventType = Input.of(Objects.requireNonNull(eventType));
            return this;
        }

        public Builder setRuleExecutionMode(@Nullable Input<DetectorRuleExecutionMode> ruleExecutionMode) {
            this.ruleExecutionMode = ruleExecutionMode;
            return this;
        }

        public Builder setRuleExecutionMode(@Nullable DetectorRuleExecutionMode ruleExecutionMode) {
            this.ruleExecutionMode = Input.ofNullable(ruleExecutionMode);
            return this;
        }

        public Builder setRules(Input<List<DetectorRuleArgs>> rules) {
            this.rules = Objects.requireNonNull(rules);
            return this;
        }

        public Builder setRules(List<DetectorRuleArgs> rules) {
            this.rules = Input.of(Objects.requireNonNull(rules));
            return this;
        }

        public Builder setTags(@Nullable Input<List<DetectorTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<DetectorTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public DetectorArgs build() {
            return new DetectorArgs(associatedModels, description, detectorId, detectorVersionStatus, eventType, ruleExecutionMode, rules, tags);
        }
    }
}
