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
public final class TaskDefinitionTmpfs {
    private final @Nullable String containerPath;
    private final @Nullable List<String> mountOptions;
    private final Integer size;

    @CustomType.Constructor
    private TaskDefinitionTmpfs(
        @CustomType.Parameter("containerPath") @Nullable String containerPath,
        @CustomType.Parameter("mountOptions") @Nullable List<String> mountOptions,
        @CustomType.Parameter("size") Integer size) {
        this.containerPath = containerPath;
        this.mountOptions = mountOptions;
        this.size = size;
    }

    public Optional<String> getContainerPath() {
        return Optional.ofNullable(this.containerPath);
    }
    public List<String> getMountOptions() {
        return this.mountOptions == null ? List.of() : this.mountOptions;
    }
    public Integer getSize() {
        return this.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionTmpfs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerPath;
        private @Nullable List<String> mountOptions;
        private Integer size;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionTmpfs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPath = defaults.containerPath;
    	      this.mountOptions = defaults.mountOptions;
    	      this.size = defaults.size;
        }

        public Builder containerPath(@Nullable String containerPath) {
            this.containerPath = containerPath;
            return this;
        }

        public Builder mountOptions(@Nullable List<String> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        public Builder size(Integer size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }
        public TaskDefinitionTmpfs build() {
            return new TaskDefinitionTmpfs(containerPath, mountOptions, size);
        }
    }
}
