// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs;

import io.pulumi.awsnative.ecs.inputs.TaskDefinitionContainerDefinitionArgs;
import io.pulumi.awsnative.ecs.inputs.TaskDefinitionEphemeralStorageArgs;
import io.pulumi.awsnative.ecs.inputs.TaskDefinitionInferenceAcceleratorArgs;
import io.pulumi.awsnative.ecs.inputs.TaskDefinitionPlacementConstraintArgs;
import io.pulumi.awsnative.ecs.inputs.TaskDefinitionProxyConfigurationArgs;
import io.pulumi.awsnative.ecs.inputs.TaskDefinitionRuntimePlatformArgs;
import io.pulumi.awsnative.ecs.inputs.TaskDefinitionTagArgs;
import io.pulumi.awsnative.ecs.inputs.TaskDefinitionVolumeArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionArgs Empty = new TaskDefinitionArgs();

    @Import(name="containerDefinitions")
      private final @Nullable Output<List<TaskDefinitionContainerDefinitionArgs>> containerDefinitions;

    public Output<List<TaskDefinitionContainerDefinitionArgs>> getContainerDefinitions() {
        return this.containerDefinitions == null ? Output.empty() : this.containerDefinitions;
    }

    @Import(name="cpu")
      private final @Nullable Output<String> cpu;

    public Output<String> getCpu() {
        return this.cpu == null ? Output.empty() : this.cpu;
    }

    @Import(name="ephemeralStorage")
      private final @Nullable Output<TaskDefinitionEphemeralStorageArgs> ephemeralStorage;

    public Output<TaskDefinitionEphemeralStorageArgs> getEphemeralStorage() {
        return this.ephemeralStorage == null ? Output.empty() : this.ephemeralStorage;
    }

    @Import(name="executionRoleArn")
      private final @Nullable Output<String> executionRoleArn;

    public Output<String> getExecutionRoleArn() {
        return this.executionRoleArn == null ? Output.empty() : this.executionRoleArn;
    }

    @Import(name="family")
      private final @Nullable Output<String> family;

    public Output<String> getFamily() {
        return this.family == null ? Output.empty() : this.family;
    }

    @Import(name="inferenceAccelerators")
      private final @Nullable Output<List<TaskDefinitionInferenceAcceleratorArgs>> inferenceAccelerators;

    public Output<List<TaskDefinitionInferenceAcceleratorArgs>> getInferenceAccelerators() {
        return this.inferenceAccelerators == null ? Output.empty() : this.inferenceAccelerators;
    }

    @Import(name="ipcMode")
      private final @Nullable Output<String> ipcMode;

    public Output<String> getIpcMode() {
        return this.ipcMode == null ? Output.empty() : this.ipcMode;
    }

    @Import(name="memory")
      private final @Nullable Output<String> memory;

    public Output<String> getMemory() {
        return this.memory == null ? Output.empty() : this.memory;
    }

    @Import(name="networkMode")
      private final @Nullable Output<String> networkMode;

    public Output<String> getNetworkMode() {
        return this.networkMode == null ? Output.empty() : this.networkMode;
    }

    @Import(name="pidMode")
      private final @Nullable Output<String> pidMode;

    public Output<String> getPidMode() {
        return this.pidMode == null ? Output.empty() : this.pidMode;
    }

    @Import(name="placementConstraints")
      private final @Nullable Output<List<TaskDefinitionPlacementConstraintArgs>> placementConstraints;

    public Output<List<TaskDefinitionPlacementConstraintArgs>> getPlacementConstraints() {
        return this.placementConstraints == null ? Output.empty() : this.placementConstraints;
    }

    @Import(name="proxyConfiguration")
      private final @Nullable Output<TaskDefinitionProxyConfigurationArgs> proxyConfiguration;

    public Output<TaskDefinitionProxyConfigurationArgs> getProxyConfiguration() {
        return this.proxyConfiguration == null ? Output.empty() : this.proxyConfiguration;
    }

    @Import(name="requiresCompatibilities")
      private final @Nullable Output<List<String>> requiresCompatibilities;

    public Output<List<String>> getRequiresCompatibilities() {
        return this.requiresCompatibilities == null ? Output.empty() : this.requiresCompatibilities;
    }

    @Import(name="runtimePlatform")
      private final @Nullable Output<TaskDefinitionRuntimePlatformArgs> runtimePlatform;

    public Output<TaskDefinitionRuntimePlatformArgs> getRuntimePlatform() {
        return this.runtimePlatform == null ? Output.empty() : this.runtimePlatform;
    }

    @Import(name="tags")
      private final @Nullable Output<List<TaskDefinitionTagArgs>> tags;

    public Output<List<TaskDefinitionTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    @Import(name="taskRoleArn")
      private final @Nullable Output<String> taskRoleArn;

    public Output<String> getTaskRoleArn() {
        return this.taskRoleArn == null ? Output.empty() : this.taskRoleArn;
    }

    @Import(name="volumes")
      private final @Nullable Output<List<TaskDefinitionVolumeArgs>> volumes;

    public Output<List<TaskDefinitionVolumeArgs>> getVolumes() {
        return this.volumes == null ? Output.empty() : this.volumes;
    }

    public TaskDefinitionArgs(
        @Nullable Output<List<TaskDefinitionContainerDefinitionArgs>> containerDefinitions,
        @Nullable Output<String> cpu,
        @Nullable Output<TaskDefinitionEphemeralStorageArgs> ephemeralStorage,
        @Nullable Output<String> executionRoleArn,
        @Nullable Output<String> family,
        @Nullable Output<List<TaskDefinitionInferenceAcceleratorArgs>> inferenceAccelerators,
        @Nullable Output<String> ipcMode,
        @Nullable Output<String> memory,
        @Nullable Output<String> networkMode,
        @Nullable Output<String> pidMode,
        @Nullable Output<List<TaskDefinitionPlacementConstraintArgs>> placementConstraints,
        @Nullable Output<TaskDefinitionProxyConfigurationArgs> proxyConfiguration,
        @Nullable Output<List<String>> requiresCompatibilities,
        @Nullable Output<TaskDefinitionRuntimePlatformArgs> runtimePlatform,
        @Nullable Output<List<TaskDefinitionTagArgs>> tags,
        @Nullable Output<String> taskRoleArn,
        @Nullable Output<List<TaskDefinitionVolumeArgs>> volumes) {
        this.containerDefinitions = containerDefinitions;
        this.cpu = cpu;
        this.ephemeralStorage = ephemeralStorage;
        this.executionRoleArn = executionRoleArn;
        this.family = family;
        this.inferenceAccelerators = inferenceAccelerators;
        this.ipcMode = ipcMode;
        this.memory = memory;
        this.networkMode = networkMode;
        this.pidMode = pidMode;
        this.placementConstraints = placementConstraints;
        this.proxyConfiguration = proxyConfiguration;
        this.requiresCompatibilities = requiresCompatibilities;
        this.runtimePlatform = runtimePlatform;
        this.tags = tags;
        this.taskRoleArn = taskRoleArn;
        this.volumes = volumes;
    }

    private TaskDefinitionArgs() {
        this.containerDefinitions = Output.empty();
        this.cpu = Output.empty();
        this.ephemeralStorage = Output.empty();
        this.executionRoleArn = Output.empty();
        this.family = Output.empty();
        this.inferenceAccelerators = Output.empty();
        this.ipcMode = Output.empty();
        this.memory = Output.empty();
        this.networkMode = Output.empty();
        this.pidMode = Output.empty();
        this.placementConstraints = Output.empty();
        this.proxyConfiguration = Output.empty();
        this.requiresCompatibilities = Output.empty();
        this.runtimePlatform = Output.empty();
        this.tags = Output.empty();
        this.taskRoleArn = Output.empty();
        this.volumes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<TaskDefinitionContainerDefinitionArgs>> containerDefinitions;
        private @Nullable Output<String> cpu;
        private @Nullable Output<TaskDefinitionEphemeralStorageArgs> ephemeralStorage;
        private @Nullable Output<String> executionRoleArn;
        private @Nullable Output<String> family;
        private @Nullable Output<List<TaskDefinitionInferenceAcceleratorArgs>> inferenceAccelerators;
        private @Nullable Output<String> ipcMode;
        private @Nullable Output<String> memory;
        private @Nullable Output<String> networkMode;
        private @Nullable Output<String> pidMode;
        private @Nullable Output<List<TaskDefinitionPlacementConstraintArgs>> placementConstraints;
        private @Nullable Output<TaskDefinitionProxyConfigurationArgs> proxyConfiguration;
        private @Nullable Output<List<String>> requiresCompatibilities;
        private @Nullable Output<TaskDefinitionRuntimePlatformArgs> runtimePlatform;
        private @Nullable Output<List<TaskDefinitionTagArgs>> tags;
        private @Nullable Output<String> taskRoleArn;
        private @Nullable Output<List<TaskDefinitionVolumeArgs>> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerDefinitions = defaults.containerDefinitions;
    	      this.cpu = defaults.cpu;
    	      this.ephemeralStorage = defaults.ephemeralStorage;
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.family = defaults.family;
    	      this.inferenceAccelerators = defaults.inferenceAccelerators;
    	      this.ipcMode = defaults.ipcMode;
    	      this.memory = defaults.memory;
    	      this.networkMode = defaults.networkMode;
    	      this.pidMode = defaults.pidMode;
    	      this.placementConstraints = defaults.placementConstraints;
    	      this.proxyConfiguration = defaults.proxyConfiguration;
    	      this.requiresCompatibilities = defaults.requiresCompatibilities;
    	      this.runtimePlatform = defaults.runtimePlatform;
    	      this.tags = defaults.tags;
    	      this.taskRoleArn = defaults.taskRoleArn;
    	      this.volumes = defaults.volumes;
        }

        public Builder containerDefinitions(@Nullable Output<List<TaskDefinitionContainerDefinitionArgs>> containerDefinitions) {
            this.containerDefinitions = containerDefinitions;
            return this;
        }

        public Builder containerDefinitions(@Nullable List<TaskDefinitionContainerDefinitionArgs> containerDefinitions) {
            this.containerDefinitions = Output.ofNullable(containerDefinitions);
            return this;
        }

        public Builder cpu(@Nullable Output<String> cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder cpu(@Nullable String cpu) {
            this.cpu = Output.ofNullable(cpu);
            return this;
        }

        public Builder ephemeralStorage(@Nullable Output<TaskDefinitionEphemeralStorageArgs> ephemeralStorage) {
            this.ephemeralStorage = ephemeralStorage;
            return this;
        }

        public Builder ephemeralStorage(@Nullable TaskDefinitionEphemeralStorageArgs ephemeralStorage) {
            this.ephemeralStorage = Output.ofNullable(ephemeralStorage);
            return this;
        }

        public Builder executionRoleArn(@Nullable Output<String> executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }

        public Builder executionRoleArn(@Nullable String executionRoleArn) {
            this.executionRoleArn = Output.ofNullable(executionRoleArn);
            return this;
        }

        public Builder family(@Nullable Output<String> family) {
            this.family = family;
            return this;
        }

        public Builder family(@Nullable String family) {
            this.family = Output.ofNullable(family);
            return this;
        }

        public Builder inferenceAccelerators(@Nullable Output<List<TaskDefinitionInferenceAcceleratorArgs>> inferenceAccelerators) {
            this.inferenceAccelerators = inferenceAccelerators;
            return this;
        }

        public Builder inferenceAccelerators(@Nullable List<TaskDefinitionInferenceAcceleratorArgs> inferenceAccelerators) {
            this.inferenceAccelerators = Output.ofNullable(inferenceAccelerators);
            return this;
        }

        public Builder ipcMode(@Nullable Output<String> ipcMode) {
            this.ipcMode = ipcMode;
            return this;
        }

        public Builder ipcMode(@Nullable String ipcMode) {
            this.ipcMode = Output.ofNullable(ipcMode);
            return this;
        }

        public Builder memory(@Nullable Output<String> memory) {
            this.memory = memory;
            return this;
        }

        public Builder memory(@Nullable String memory) {
            this.memory = Output.ofNullable(memory);
            return this;
        }

        public Builder networkMode(@Nullable Output<String> networkMode) {
            this.networkMode = networkMode;
            return this;
        }

        public Builder networkMode(@Nullable String networkMode) {
            this.networkMode = Output.ofNullable(networkMode);
            return this;
        }

        public Builder pidMode(@Nullable Output<String> pidMode) {
            this.pidMode = pidMode;
            return this;
        }

        public Builder pidMode(@Nullable String pidMode) {
            this.pidMode = Output.ofNullable(pidMode);
            return this;
        }

        public Builder placementConstraints(@Nullable Output<List<TaskDefinitionPlacementConstraintArgs>> placementConstraints) {
            this.placementConstraints = placementConstraints;
            return this;
        }

        public Builder placementConstraints(@Nullable List<TaskDefinitionPlacementConstraintArgs> placementConstraints) {
            this.placementConstraints = Output.ofNullable(placementConstraints);
            return this;
        }

        public Builder proxyConfiguration(@Nullable Output<TaskDefinitionProxyConfigurationArgs> proxyConfiguration) {
            this.proxyConfiguration = proxyConfiguration;
            return this;
        }

        public Builder proxyConfiguration(@Nullable TaskDefinitionProxyConfigurationArgs proxyConfiguration) {
            this.proxyConfiguration = Output.ofNullable(proxyConfiguration);
            return this;
        }

        public Builder requiresCompatibilities(@Nullable Output<List<String>> requiresCompatibilities) {
            this.requiresCompatibilities = requiresCompatibilities;
            return this;
        }

        public Builder requiresCompatibilities(@Nullable List<String> requiresCompatibilities) {
            this.requiresCompatibilities = Output.ofNullable(requiresCompatibilities);
            return this;
        }

        public Builder runtimePlatform(@Nullable Output<TaskDefinitionRuntimePlatformArgs> runtimePlatform) {
            this.runtimePlatform = runtimePlatform;
            return this;
        }

        public Builder runtimePlatform(@Nullable TaskDefinitionRuntimePlatformArgs runtimePlatform) {
            this.runtimePlatform = Output.ofNullable(runtimePlatform);
            return this;
        }

        public Builder tags(@Nullable Output<List<TaskDefinitionTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<TaskDefinitionTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder taskRoleArn(@Nullable Output<String> taskRoleArn) {
            this.taskRoleArn = taskRoleArn;
            return this;
        }

        public Builder taskRoleArn(@Nullable String taskRoleArn) {
            this.taskRoleArn = Output.ofNullable(taskRoleArn);
            return this;
        }

        public Builder volumes(@Nullable Output<List<TaskDefinitionVolumeArgs>> volumes) {
            this.volumes = volumes;
            return this;
        }

        public Builder volumes(@Nullable List<TaskDefinitionVolumeArgs> volumes) {
            this.volumes = Output.ofNullable(volumes);
            return this;
        }
        public TaskDefinitionArgs build() {
            return new TaskDefinitionArgs(containerDefinitions, cpu, ephemeralStorage, executionRoleArn, family, inferenceAccelerators, ipcMode, memory, networkMode, pidMode, placementConstraints, proxyConfiguration, requiresCompatibilities, runtimePlatform, tags, taskRoleArn, volumes);
        }
    }
}
