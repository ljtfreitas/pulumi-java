// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskDefinitionPortMapping {
    private final @Nullable Integer containerPort;
    private final @Nullable Integer hostPort;
    private final @Nullable String protocol;

    @OutputCustomType.Constructor({"containerPort","hostPort","protocol"})
    private TaskDefinitionPortMapping(
        @Nullable Integer containerPort,
        @Nullable Integer hostPort,
        @Nullable String protocol) {
        this.containerPort = containerPort;
        this.hostPort = hostPort;
        this.protocol = protocol;
    }

    public Optional<Integer> getContainerPort() {
        return Optional.ofNullable(this.containerPort);
    }
    public Optional<Integer> getHostPort() {
        return Optional.ofNullable(this.hostPort);
    }
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionPortMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer containerPort;
        private @Nullable Integer hostPort;
        private @Nullable String protocol;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionPortMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPort = defaults.containerPort;
    	      this.hostPort = defaults.hostPort;
    	      this.protocol = defaults.protocol;
        }

        public Builder setContainerPort(@Nullable Integer containerPort) {
            this.containerPort = containerPort;
            return this;
        }

        public Builder setHostPort(@Nullable Integer hostPort) {
            this.hostPort = hostPort;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public TaskDefinitionPortMapping build() {
            return new TaskDefinitionPortMapping(containerPort, hostPort, protocol);
        }
    }
}