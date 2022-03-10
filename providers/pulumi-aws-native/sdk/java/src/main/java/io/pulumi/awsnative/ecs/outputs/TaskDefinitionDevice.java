// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskDefinitionDevice {
    private final @Nullable String containerPath;
    private final @Nullable String hostPath;
    private final @Nullable List<String> permissions;

    @OutputCustomType.Constructor
    private TaskDefinitionDevice(
        @OutputCustomType.Parameter("containerPath") @Nullable String containerPath,
        @OutputCustomType.Parameter("hostPath") @Nullable String hostPath,
        @OutputCustomType.Parameter("permissions") @Nullable List<String> permissions) {
        this.containerPath = containerPath;
        this.hostPath = hostPath;
        this.permissions = permissions;
    }

    public Optional<String> getContainerPath() {
        return Optional.ofNullable(this.containerPath);
    }
    public Optional<String> getHostPath() {
        return Optional.ofNullable(this.hostPath);
    }
    public List<String> getPermissions() {
        return this.permissions == null ? List.of() : this.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionDevice defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerPath;
        private @Nullable String hostPath;
        private @Nullable List<String> permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPath = defaults.containerPath;
    	      this.hostPath = defaults.hostPath;
    	      this.permissions = defaults.permissions;
        }

        public Builder setContainerPath(@Nullable String containerPath) {
            this.containerPath = containerPath;
            return this;
        }

        public Builder setHostPath(@Nullable String hostPath) {
            this.hostPath = hostPath;
            return this;
        }

        public Builder setPermissions(@Nullable List<String> permissions) {
            this.permissions = permissions;
            return this;
        }
        public TaskDefinitionDevice build() {
            return new TaskDefinitionDevice(containerPath, hostPath, permissions);
        }
    }
}
