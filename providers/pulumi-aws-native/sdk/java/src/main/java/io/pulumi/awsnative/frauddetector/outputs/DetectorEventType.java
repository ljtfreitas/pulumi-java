// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector.outputs;

import io.pulumi.awsnative.frauddetector.outputs.DetectorEntityType;
import io.pulumi.awsnative.frauddetector.outputs.DetectorEventVariable;
import io.pulumi.awsnative.frauddetector.outputs.DetectorLabel;
import io.pulumi.awsnative.frauddetector.outputs.DetectorTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DetectorEventType {
    /**
     * The ARN of the event type.
     * 
     */
    private final @Nullable String arn;
    /**
     * The time when the event type was created.
     * 
     */
    private final @Nullable String createdTime;
    /**
     * The description of the event type.
     * 
     */
    private final @Nullable String description;
    private final @Nullable List<DetectorEntityType> entityTypes;
    private final @Nullable List<DetectorEventVariable> eventVariables;
    private final @Nullable Boolean inline;
    private final @Nullable List<DetectorLabel> labels;
    /**
     * The time when the event type was last updated.
     * 
     */
    private final @Nullable String lastUpdatedTime;
    /**
     * The name for the event type
     * 
     */
    private final @Nullable String name;
    /**
     * Tags associated with this event type.
     * 
     */
    private final @Nullable List<DetectorTag> tags;

    @CustomType.Constructor
    private DetectorEventType(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("createdTime") @Nullable String createdTime,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("entityTypes") @Nullable List<DetectorEntityType> entityTypes,
        @CustomType.Parameter("eventVariables") @Nullable List<DetectorEventVariable> eventVariables,
        @CustomType.Parameter("inline") @Nullable Boolean inline,
        @CustomType.Parameter("labels") @Nullable List<DetectorLabel> labels,
        @CustomType.Parameter("lastUpdatedTime") @Nullable String lastUpdatedTime,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("tags") @Nullable List<DetectorTag> tags) {
        this.arn = arn;
        this.createdTime = createdTime;
        this.description = description;
        this.entityTypes = entityTypes;
        this.eventVariables = eventVariables;
        this.inline = inline;
        this.labels = labels;
        this.lastUpdatedTime = lastUpdatedTime;
        this.name = name;
        this.tags = tags;
    }

    /**
     * The ARN of the event type.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The time when the event type was created.
     * 
    */
    public Optional<String> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    /**
     * The description of the event type.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public List<DetectorEntityType> getEntityTypes() {
        return this.entityTypes == null ? List.of() : this.entityTypes;
    }
    public List<DetectorEventVariable> getEventVariables() {
        return this.eventVariables == null ? List.of() : this.eventVariables;
    }
    public Optional<Boolean> getInline() {
        return Optional.ofNullable(this.inline);
    }
    public List<DetectorLabel> getLabels() {
        return this.labels == null ? List.of() : this.labels;
    }
    /**
     * The time when the event type was last updated.
     * 
    */
    public Optional<String> getLastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }
    /**
     * The name for the event type
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Tags associated with this event type.
     * 
    */
    public List<DetectorTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorEventType defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String createdTime;
        private @Nullable String description;
        private @Nullable List<DetectorEntityType> entityTypes;
        private @Nullable List<DetectorEventVariable> eventVariables;
        private @Nullable Boolean inline;
        private @Nullable List<DetectorLabel> labels;
        private @Nullable String lastUpdatedTime;
        private @Nullable String name;
        private @Nullable List<DetectorTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorEventType defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.entityTypes = defaults.entityTypes;
    	      this.eventVariables = defaults.eventVariables;
    	      this.inline = defaults.inline;
    	      this.labels = defaults.labels;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.name = defaults.name;
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

        public Builder entityTypes(@Nullable List<DetectorEntityType> entityTypes) {
            this.entityTypes = entityTypes;
            return this;
        }

        public Builder eventVariables(@Nullable List<DetectorEventVariable> eventVariables) {
            this.eventVariables = eventVariables;
            return this;
        }

        public Builder inline(@Nullable Boolean inline) {
            this.inline = inline;
            return this;
        }

        public Builder labels(@Nullable List<DetectorLabel> labels) {
            this.labels = labels;
            return this;
        }

        public Builder lastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder tags(@Nullable List<DetectorTag> tags) {
            this.tags = tags;
            return this;
        }
        public DetectorEventType build() {
            return new DetectorEventType(arn, createdTime, description, entityTypes, eventVariables, inline, labels, lastUpdatedTime, name, tags);
        }
    }
}
