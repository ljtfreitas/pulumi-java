// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionRuntimePlatformArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionRuntimePlatformArgs Empty = new TaskDefinitionRuntimePlatformArgs();

    /**
     * Must be set to either `X86_64` or `ARM64`; see [cpu architecture](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#runtime-platform)
     * 
     */
    @InputImport(name="cpuArchitecture")
    private final @Nullable Input<String> cpuArchitecture;

    public Input<String> getCpuArchitecture() {
        return this.cpuArchitecture == null ? Input.empty() : this.cpuArchitecture;
    }

    /**
     * If the `requires_compatibilities` is `FARGATE` this field is required; must be set to a valid option from the [operating system family in the runtime platform](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_definition_parameters.html#runtime-platform) setting
     * 
     */
    @InputImport(name="operatingSystemFamily")
    private final @Nullable Input<String> operatingSystemFamily;

    public Input<String> getOperatingSystemFamily() {
        return this.operatingSystemFamily == null ? Input.empty() : this.operatingSystemFamily;
    }

    public TaskDefinitionRuntimePlatformArgs(
        @Nullable Input<String> cpuArchitecture,
        @Nullable Input<String> operatingSystemFamily) {
        this.cpuArchitecture = cpuArchitecture;
        this.operatingSystemFamily = operatingSystemFamily;
    }

    private TaskDefinitionRuntimePlatformArgs() {
        this.cpuArchitecture = Input.empty();
        this.operatingSystemFamily = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionRuntimePlatformArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> cpuArchitecture;
        private @Nullable Input<String> operatingSystemFamily;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionRuntimePlatformArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuArchitecture = defaults.cpuArchitecture;
    	      this.operatingSystemFamily = defaults.operatingSystemFamily;
        }

        public Builder setCpuArchitecture(@Nullable Input<String> cpuArchitecture) {
            this.cpuArchitecture = cpuArchitecture;
            return this;
        }

        public Builder setCpuArchitecture(@Nullable String cpuArchitecture) {
            this.cpuArchitecture = Input.ofNullable(cpuArchitecture);
            return this;
        }

        public Builder setOperatingSystemFamily(@Nullable Input<String> operatingSystemFamily) {
            this.operatingSystemFamily = operatingSystemFamily;
            return this;
        }

        public Builder setOperatingSystemFamily(@Nullable String operatingSystemFamily) {
            this.operatingSystemFamily = Input.ofNullable(operatingSystemFamily);
            return this;
        }
        public TaskDefinitionRuntimePlatformArgs build() {
            return new TaskDefinitionRuntimePlatformArgs(cpuArchitecture, operatingSystemFamily);
        }
    }
}
