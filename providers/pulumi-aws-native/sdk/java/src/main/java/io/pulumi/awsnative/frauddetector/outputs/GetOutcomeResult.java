// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.frauddetector.outputs;

import io.pulumi.awsnative.frauddetector.outputs.OutcomeTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetOutcomeResult {
    /**
     * The outcome ARN.
     * 
     */
    private final @Nullable String arn;
    /**
     * The timestamp when the outcome was created.
     * 
     */
    private final @Nullable String createdTime;
    /**
     * The outcome description.
     * 
     */
    private final @Nullable String description;
    /**
     * The timestamp when the outcome was last updated.
     * 
     */
    private final @Nullable String lastUpdatedTime;
    /**
     * Tags associated with this outcome.
     * 
     */
    private final @Nullable List<OutcomeTag> tags;

    @OutputCustomType.Constructor({"arn","createdTime","description","lastUpdatedTime","tags"})
    private GetOutcomeResult(
        @Nullable String arn,
        @Nullable String createdTime,
        @Nullable String description,
        @Nullable String lastUpdatedTime,
        @Nullable List<OutcomeTag> tags) {
        this.arn = arn;
        this.createdTime = createdTime;
        this.description = description;
        this.lastUpdatedTime = lastUpdatedTime;
        this.tags = tags;
    }

    /**
     * The outcome ARN.
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The timestamp when the outcome was created.
     * 
     */
    public Optional<String> getCreatedTime() {
        return Optional.ofNullable(this.createdTime);
    }
    /**
     * The outcome description.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The timestamp when the outcome was last updated.
     * 
     */
    public Optional<String> getLastUpdatedTime() {
        return Optional.ofNullable(this.lastUpdatedTime);
    }
    /**
     * Tags associated with this outcome.
     * 
     */
    public List<OutcomeTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOutcomeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String createdTime;
        private @Nullable String description;
        private @Nullable String lastUpdatedTime;
        private @Nullable List<OutcomeTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOutcomeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.createdTime = defaults.createdTime;
    	      this.description = defaults.description;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setLastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder setTags(@Nullable List<OutcomeTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetOutcomeResult build() {
            return new GetOutcomeResult(arn, createdTime, description, lastUpdatedTime, tags);
        }
    }
}
