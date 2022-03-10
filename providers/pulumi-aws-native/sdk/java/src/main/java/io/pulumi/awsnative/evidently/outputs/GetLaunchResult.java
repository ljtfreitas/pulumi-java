// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.evidently.outputs;

import io.pulumi.awsnative.evidently.outputs.LaunchGroupObject;
import io.pulumi.awsnative.evidently.outputs.LaunchMetricDefinitionObject;
import io.pulumi.awsnative.evidently.outputs.LaunchStepConfig;
import io.pulumi.awsnative.evidently.outputs.LaunchTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLaunchResult {
    private final @Nullable String arn;
    private final @Nullable String description;
    private final @Nullable List<LaunchGroupObject> groups;
    private final @Nullable List<LaunchMetricDefinitionObject> metricMonitors;
    private final @Nullable String randomizationSalt;
    private final @Nullable List<LaunchStepConfig> scheduledSplitsConfig;
    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    private final @Nullable List<LaunchTag> tags;

    @OutputCustomType.Constructor
    private GetLaunchResult(
        @OutputCustomType.Parameter("arn") @Nullable String arn,
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("groups") @Nullable List<LaunchGroupObject> groups,
        @OutputCustomType.Parameter("metricMonitors") @Nullable List<LaunchMetricDefinitionObject> metricMonitors,
        @OutputCustomType.Parameter("randomizationSalt") @Nullable String randomizationSalt,
        @OutputCustomType.Parameter("scheduledSplitsConfig") @Nullable List<LaunchStepConfig> scheduledSplitsConfig,
        @OutputCustomType.Parameter("tags") @Nullable List<LaunchTag> tags) {
        this.arn = arn;
        this.description = description;
        this.groups = groups;
        this.metricMonitors = metricMonitors;
        this.randomizationSalt = randomizationSalt;
        this.scheduledSplitsConfig = scheduledSplitsConfig;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public List<LaunchGroupObject> getGroups() {
        return this.groups == null ? List.of() : this.groups;
    }
    public List<LaunchMetricDefinitionObject> getMetricMonitors() {
        return this.metricMonitors == null ? List.of() : this.metricMonitors;
    }
    public Optional<String> getRandomizationSalt() {
        return Optional.ofNullable(this.randomizationSalt);
    }
    public List<LaunchStepConfig> getScheduledSplitsConfig() {
        return this.scheduledSplitsConfig == null ? List.of() : this.scheduledSplitsConfig;
    }
    /**
     * An array of key-value pairs to apply to this resource.
     * 
    */
    public List<LaunchTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLaunchResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable List<LaunchGroupObject> groups;
        private @Nullable List<LaunchMetricDefinitionObject> metricMonitors;
        private @Nullable String randomizationSalt;
        private @Nullable List<LaunchStepConfig> scheduledSplitsConfig;
        private @Nullable List<LaunchTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLaunchResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.groups = defaults.groups;
    	      this.metricMonitors = defaults.metricMonitors;
    	      this.randomizationSalt = defaults.randomizationSalt;
    	      this.scheduledSplitsConfig = defaults.scheduledSplitsConfig;
    	      this.tags = defaults.tags;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setGroups(@Nullable List<LaunchGroupObject> groups) {
            this.groups = groups;
            return this;
        }

        public Builder setMetricMonitors(@Nullable List<LaunchMetricDefinitionObject> metricMonitors) {
            this.metricMonitors = metricMonitors;
            return this;
        }

        public Builder setRandomizationSalt(@Nullable String randomizationSalt) {
            this.randomizationSalt = randomizationSalt;
            return this;
        }

        public Builder setScheduledSplitsConfig(@Nullable List<LaunchStepConfig> scheduledSplitsConfig) {
            this.scheduledSplitsConfig = scheduledSplitsConfig;
            return this;
        }

        public Builder setTags(@Nullable List<LaunchTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetLaunchResult build() {
            return new GetLaunchResult(arn, description, groups, metricMonitors, randomizationSalt, scheduledSplitsConfig, tags);
        }
    }
}
