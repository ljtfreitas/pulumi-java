// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.connect.outputs;

import io.pulumi.awsnative.connect.outputs.HoursOfOperationConfig;
import io.pulumi.awsnative.connect.outputs.HoursOfOperationTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetHoursOfOperationResult {
    /**
     * Configuration information for the hours of operation: day, start time, and end time.
     * 
     */
    private final @Nullable List<HoursOfOperationConfig> config;
    /**
     * The description of the hours of operation.
     * 
     */
    private final @Nullable String description;
    /**
     * The Amazon Resource Name (ARN) for the hours of operation.
     * 
     */
    private final @Nullable String hoursOfOperationArn;
    /**
     * The identifier of the Amazon Connect instance.
     * 
     */
    private final @Nullable String instanceArn;
    /**
     * The name of the hours of operation.
     * 
     */
    private final @Nullable String name;
    /**
     * One or more tags.
     * 
     */
    private final @Nullable List<HoursOfOperationTag> tags;
    /**
     * The time zone of the hours of operation.
     * 
     */
    private final @Nullable String timeZone;

    @OutputCustomType.Constructor({"config","description","hoursOfOperationArn","instanceArn","name","tags","timeZone"})
    private GetHoursOfOperationResult(
        @Nullable List<HoursOfOperationConfig> config,
        @Nullable String description,
        @Nullable String hoursOfOperationArn,
        @Nullable String instanceArn,
        @Nullable String name,
        @Nullable List<HoursOfOperationTag> tags,
        @Nullable String timeZone) {
        this.config = config;
        this.description = description;
        this.hoursOfOperationArn = hoursOfOperationArn;
        this.instanceArn = instanceArn;
        this.name = name;
        this.tags = tags;
        this.timeZone = timeZone;
    }

    /**
     * Configuration information for the hours of operation: day, start time, and end time.
     * 
     */
    public List<HoursOfOperationConfig> getConfig() {
        return this.config == null ? List.of() : this.config;
    }
    /**
     * The description of the hours of operation.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The Amazon Resource Name (ARN) for the hours of operation.
     * 
     */
    public Optional<String> getHoursOfOperationArn() {
        return Optional.ofNullable(this.hoursOfOperationArn);
    }
    /**
     * The identifier of the Amazon Connect instance.
     * 
     */
    public Optional<String> getInstanceArn() {
        return Optional.ofNullable(this.instanceArn);
    }
    /**
     * The name of the hours of operation.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * One or more tags.
     * 
     */
    public List<HoursOfOperationTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * The time zone of the hours of operation.
     * 
     */
    public Optional<String> getTimeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHoursOfOperationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<HoursOfOperationConfig> config;
        private @Nullable String description;
        private @Nullable String hoursOfOperationArn;
        private @Nullable String instanceArn;
        private @Nullable String name;
        private @Nullable List<HoursOfOperationTag> tags;
        private @Nullable String timeZone;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHoursOfOperationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.config = defaults.config;
    	      this.description = defaults.description;
    	      this.hoursOfOperationArn = defaults.hoursOfOperationArn;
    	      this.instanceArn = defaults.instanceArn;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.timeZone = defaults.timeZone;
        }

        public Builder setConfig(@Nullable List<HoursOfOperationConfig> config) {
            this.config = config;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setHoursOfOperationArn(@Nullable String hoursOfOperationArn) {
            this.hoursOfOperationArn = hoursOfOperationArn;
            return this;
        }

        public Builder setInstanceArn(@Nullable String instanceArn) {
            this.instanceArn = instanceArn;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setTags(@Nullable List<HoursOfOperationTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }
        public GetHoursOfOperationResult build() {
            return new GetHoursOfOperationResult(config, description, hoursOfOperationArn, instanceArn, name, tags, timeZone);
        }
    }
}
