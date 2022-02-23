// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.outputs;

import io.pulumi.azurenative.batch.outputs.ContainerRegistryResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskContainerSettingsResponse {
    /**
     * These additional options are supplied as arguments to the "docker create" command, in addition to those controlled by the Batch Service.
     * 
     */
    private final @Nullable String containerRunOptions;
    /**
     * This is the full image reference, as would be specified to "docker pull". If no tag is provided as part of the image name, the tag ":latest" is used as a default.
     * 
     */
    private final String imageName;
    /**
     * This setting can be omitted if was already provided at pool creation.
     * 
     */
    private final @Nullable ContainerRegistryResponse registry;
    private final @Nullable String workingDirectory;

    @OutputCustomType.Constructor({"containerRunOptions","imageName","registry","workingDirectory"})
    private TaskContainerSettingsResponse(
        @Nullable String containerRunOptions,
        String imageName,
        @Nullable ContainerRegistryResponse registry,
        @Nullable String workingDirectory) {
        this.containerRunOptions = containerRunOptions;
        this.imageName = Objects.requireNonNull(imageName);
        this.registry = registry;
        this.workingDirectory = workingDirectory;
    }

    /**
     * These additional options are supplied as arguments to the "docker create" command, in addition to those controlled by the Batch Service.
     * 
     */
    public Optional<String> getContainerRunOptions() {
        return Optional.ofNullable(this.containerRunOptions);
    }
    /**
     * This is the full image reference, as would be specified to "docker pull". If no tag is provided as part of the image name, the tag ":latest" is used as a default.
     * 
     */
    public String getImageName() {
        return this.imageName;
    }
    /**
     * This setting can be omitted if was already provided at pool creation.
     * 
     */
    public Optional<ContainerRegistryResponse> getRegistry() {
        return Optional.ofNullable(this.registry);
    }
    public Optional<String> getWorkingDirectory() {
        return Optional.ofNullable(this.workingDirectory);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskContainerSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerRunOptions;
        private String imageName;
        private @Nullable ContainerRegistryResponse registry;
        private @Nullable String workingDirectory;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskContainerSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerRunOptions = defaults.containerRunOptions;
    	      this.imageName = defaults.imageName;
    	      this.registry = defaults.registry;
    	      this.workingDirectory = defaults.workingDirectory;
        }

        public Builder setContainerRunOptions(@Nullable String containerRunOptions) {
            this.containerRunOptions = containerRunOptions;
            return this;
        }

        public Builder setImageName(String imageName) {
            this.imageName = Objects.requireNonNull(imageName);
            return this;
        }

        public Builder setRegistry(@Nullable ContainerRegistryResponse registry) {
            this.registry = registry;
            return this;
        }

        public Builder setWorkingDirectory(@Nullable String workingDirectory) {
            this.workingDirectory = workingDirectory;
            return this;
        }
        public TaskContainerSettingsResponse build() {
            return new TaskContainerSettingsResponse(containerRunOptions, imageName, registry, workingDirectory);
        }
    }
}
