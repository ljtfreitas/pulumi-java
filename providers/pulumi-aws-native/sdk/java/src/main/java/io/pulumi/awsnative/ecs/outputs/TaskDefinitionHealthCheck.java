// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskDefinitionHealthCheck {
    /**
     * A string array representing the command that the container runs to determine if it is healthy.
     * 
     */
    private final @Nullable List<String> command;
    /**
     * The time period in seconds between each health check execution. You may specify between 5 and 300 seconds. The default value is 30 seconds.
     * 
     */
    private final @Nullable Integer interval;
    /**
     * The number of times to retry a failed health check before the container is considered unhealthy. You may specify between 1 and 10 retries. The default value is three retries.
     * 
     */
    private final @Nullable Integer retries;
    /**
     * The optional grace period within which to provide containers time to bootstrap before failed health checks count towards the maximum number of retries. You may specify between 0 and 300 seconds. The startPeriod is disabled by default.
     * 
     */
    private final @Nullable Integer startPeriod;
    /**
     * The time period in seconds to wait for a health check to succeed before it is considered a failure. You may specify between 2 and 60 seconds. The default value is 5 seconds.
     * 
     */
    private final @Nullable Integer timeout;

    @CustomType.Constructor
    private TaskDefinitionHealthCheck(
        @CustomType.Parameter("command") @Nullable List<String> command,
        @CustomType.Parameter("interval") @Nullable Integer interval,
        @CustomType.Parameter("retries") @Nullable Integer retries,
        @CustomType.Parameter("startPeriod") @Nullable Integer startPeriod,
        @CustomType.Parameter("timeout") @Nullable Integer timeout) {
        this.command = command;
        this.interval = interval;
        this.retries = retries;
        this.startPeriod = startPeriod;
        this.timeout = timeout;
    }

    /**
     * A string array representing the command that the container runs to determine if it is healthy.
     * 
    */
    public List<String> getCommand() {
        return this.command == null ? List.of() : this.command;
    }
    /**
     * The time period in seconds between each health check execution. You may specify between 5 and 300 seconds. The default value is 30 seconds.
     * 
    */
    public Optional<Integer> getInterval() {
        return Optional.ofNullable(this.interval);
    }
    /**
     * The number of times to retry a failed health check before the container is considered unhealthy. You may specify between 1 and 10 retries. The default value is three retries.
     * 
    */
    public Optional<Integer> getRetries() {
        return Optional.ofNullable(this.retries);
    }
    /**
     * The optional grace period within which to provide containers time to bootstrap before failed health checks count towards the maximum number of retries. You may specify between 0 and 300 seconds. The startPeriod is disabled by default.
     * 
    */
    public Optional<Integer> getStartPeriod() {
        return Optional.ofNullable(this.startPeriod);
    }
    /**
     * The time period in seconds to wait for a health check to succeed before it is considered a failure. You may specify between 2 and 60 seconds. The default value is 5 seconds.
     * 
    */
    public Optional<Integer> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionHealthCheck defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> command;
        private @Nullable Integer interval;
        private @Nullable Integer retries;
        private @Nullable Integer startPeriod;
        private @Nullable Integer timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionHealthCheck defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.command = defaults.command;
    	      this.interval = defaults.interval;
    	      this.retries = defaults.retries;
    	      this.startPeriod = defaults.startPeriod;
    	      this.timeout = defaults.timeout;
        }

        public Builder command(@Nullable List<String> command) {
            this.command = command;
            return this;
        }

        public Builder interval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }

        public Builder retries(@Nullable Integer retries) {
            this.retries = retries;
            return this;
        }

        public Builder startPeriod(@Nullable Integer startPeriod) {
            this.startPeriod = startPeriod;
            return this;
        }

        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }
        public TaskDefinitionHealthCheck build() {
            return new TaskDefinitionHealthCheck(command, interval, retries, startPeriod, timeout);
        }
    }
}
