// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codeguruprofiler.outputs;

import io.pulumi.awsnative.codeguruprofiler.outputs.AgentPermissionsProperties;
import io.pulumi.awsnative.codeguruprofiler.outputs.ProfilingGroupChannel;
import io.pulumi.awsnative.codeguruprofiler.outputs.ProfilingGroupTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetProfilingGroupResult {
    /**
     * The agent permissions attached to this profiling group.
     * 
     */
    private final @Nullable AgentPermissionsProperties agentPermissions;
    /**
     * Configuration for Notification Channels for Anomaly Detection feature in CodeGuru Profiler which enables customers to detect anomalies in the application profile for those methods that represent the highest proportion of CPU time or latency
     * 
     */
    private final @Nullable List<ProfilingGroupChannel> anomalyDetectionNotificationConfiguration;
    /**
     * The Amazon Resource Name (ARN) of the specified profiling group.
     * 
     */
    private final @Nullable String arn;
    /**
     * The tags associated with a profiling group.
     * 
     */
    private final @Nullable List<ProfilingGroupTag> tags;

    @OutputCustomType.Constructor({"agentPermissions","anomalyDetectionNotificationConfiguration","arn","tags"})
    private GetProfilingGroupResult(
        @Nullable AgentPermissionsProperties agentPermissions,
        @Nullable List<ProfilingGroupChannel> anomalyDetectionNotificationConfiguration,
        @Nullable String arn,
        @Nullable List<ProfilingGroupTag> tags) {
        this.agentPermissions = agentPermissions;
        this.anomalyDetectionNotificationConfiguration = anomalyDetectionNotificationConfiguration;
        this.arn = arn;
        this.tags = tags;
    }

    /**
     * The agent permissions attached to this profiling group.
     * 
     */
    public Optional<AgentPermissionsProperties> getAgentPermissions() {
        return Optional.ofNullable(this.agentPermissions);
    }
    /**
     * Configuration for Notification Channels for Anomaly Detection feature in CodeGuru Profiler which enables customers to detect anomalies in the application profile for those methods that represent the highest proportion of CPU time or latency
     * 
     */
    public List<ProfilingGroupChannel> getAnomalyDetectionNotificationConfiguration() {
        return this.anomalyDetectionNotificationConfiguration == null ? List.of() : this.anomalyDetectionNotificationConfiguration;
    }
    /**
     * The Amazon Resource Name (ARN) of the specified profiling group.
     * 
     */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The tags associated with a profiling group.
     * 
     */
    public List<ProfilingGroupTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProfilingGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AgentPermissionsProperties agentPermissions;
        private @Nullable List<ProfilingGroupChannel> anomalyDetectionNotificationConfiguration;
        private @Nullable String arn;
        private @Nullable List<ProfilingGroupTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProfilingGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentPermissions = defaults.agentPermissions;
    	      this.anomalyDetectionNotificationConfiguration = defaults.anomalyDetectionNotificationConfiguration;
    	      this.arn = defaults.arn;
    	      this.tags = defaults.tags;
        }

        public Builder setAgentPermissions(@Nullable AgentPermissionsProperties agentPermissions) {
            this.agentPermissions = agentPermissions;
            return this;
        }

        public Builder setAnomalyDetectionNotificationConfiguration(@Nullable List<ProfilingGroupChannel> anomalyDetectionNotificationConfiguration) {
            this.anomalyDetectionNotificationConfiguration = anomalyDetectionNotificationConfiguration;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setTags(@Nullable List<ProfilingGroupTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetProfilingGroupResult build() {
            return new GetProfilingGroupResult(agentPermissions, anomalyDetectionNotificationConfiguration, arn, tags);
        }
    }
}
