// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionTmpfsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionTmpfsArgs Empty = new TaskDefinitionTmpfsArgs();

    @Import(name="containerPath")
      private final @Nullable Output<String> containerPath;

    public Output<String> getContainerPath() {
        return this.containerPath == null ? Output.empty() : this.containerPath;
    }

    @Import(name="mountOptions")
      private final @Nullable Output<List<String>> mountOptions;

    public Output<List<String>> getMountOptions() {
        return this.mountOptions == null ? Output.empty() : this.mountOptions;
    }

    @Import(name="size", required=true)
      private final Output<Integer> size;

    public Output<Integer> getSize() {
        return this.size;
    }

    public TaskDefinitionTmpfsArgs(
        @Nullable Output<String> containerPath,
        @Nullable Output<List<String>> mountOptions,
        Output<Integer> size) {
        this.containerPath = containerPath;
        this.mountOptions = mountOptions;
        this.size = Objects.requireNonNull(size, "expected parameter 'size' to be non-null");
    }

    private TaskDefinitionTmpfsArgs() {
        this.containerPath = Output.empty();
        this.mountOptions = Output.empty();
        this.size = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionTmpfsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> containerPath;
        private @Nullable Output<List<String>> mountOptions;
        private Output<Integer> size;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionTmpfsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerPath = defaults.containerPath;
    	      this.mountOptions = defaults.mountOptions;
    	      this.size = defaults.size;
        }

        public Builder containerPath(@Nullable Output<String> containerPath) {
            this.containerPath = containerPath;
            return this;
        }

        public Builder containerPath(@Nullable String containerPath) {
            this.containerPath = Output.ofNullable(containerPath);
            return this;
        }

        public Builder mountOptions(@Nullable Output<List<String>> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        public Builder mountOptions(@Nullable List<String> mountOptions) {
            this.mountOptions = Output.ofNullable(mountOptions);
            return this;
        }

        public Builder size(Output<Integer> size) {
            this.size = Objects.requireNonNull(size);
            return this;
        }

        public Builder size(Integer size) {
            this.size = Output.of(Objects.requireNonNull(size));
            return this;
        }
        public TaskDefinitionTmpfsArgs build() {
            return new TaskDefinitionTmpfsArgs(containerPath, mountOptions, size);
        }
    }
}
