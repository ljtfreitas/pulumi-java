// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskDefinitionRuntimePlatform {
    private final @Nullable String cpuArchitecture;
    private final @Nullable String operatingSystemFamily;

    @OutputCustomType.Constructor({"cpuArchitecture","operatingSystemFamily"})
    private TaskDefinitionRuntimePlatform(
        @Nullable String cpuArchitecture,
        @Nullable String operatingSystemFamily) {
        this.cpuArchitecture = cpuArchitecture;
        this.operatingSystemFamily = operatingSystemFamily;
    }

    public Optional<String> getCpuArchitecture() {
        return Optional.ofNullable(this.cpuArchitecture);
    }
    public Optional<String> getOperatingSystemFamily() {
        return Optional.ofNullable(this.operatingSystemFamily);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionRuntimePlatform defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cpuArchitecture;
        private @Nullable String operatingSystemFamily;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionRuntimePlatform defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuArchitecture = defaults.cpuArchitecture;
    	      this.operatingSystemFamily = defaults.operatingSystemFamily;
        }

        public Builder setCpuArchitecture(@Nullable String cpuArchitecture) {
            this.cpuArchitecture = cpuArchitecture;
            return this;
        }

        public Builder setOperatingSystemFamily(@Nullable String operatingSystemFamily) {
            this.operatingSystemFamily = operatingSystemFamily;
            return this;
        }
        public TaskDefinitionRuntimePlatform build() {
            return new TaskDefinitionRuntimePlatform(cpuArchitecture, operatingSystemFamily);
        }
    }
}
