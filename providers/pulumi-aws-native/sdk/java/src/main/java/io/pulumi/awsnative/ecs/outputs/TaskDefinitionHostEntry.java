// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskDefinitionHostEntry {
    private final @Nullable String hostname;
    private final @Nullable String ipAddress;

    @OutputCustomType.Constructor({"hostname","ipAddress"})
    private TaskDefinitionHostEntry(
        @Nullable String hostname,
        @Nullable String ipAddress) {
        this.hostname = hostname;
        this.ipAddress = ipAddress;
    }

    public Optional<String> getHostname() {
        return Optional.ofNullable(this.hostname);
    }
    public Optional<String> getIpAddress() {
        return Optional.ofNullable(this.ipAddress);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionHostEntry defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String hostname;
        private @Nullable String ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionHostEntry defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder setHostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public TaskDefinitionHostEntry build() {
            return new TaskDefinitionHostEntry(hostname, ipAddress);
        }
    }
}
