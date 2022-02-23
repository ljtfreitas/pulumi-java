// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskDefinitionHostVolumeProperties {
    private final @Nullable String sourcePath;

    @OutputCustomType.Constructor({"sourcePath"})
    private TaskDefinitionHostVolumeProperties(@Nullable String sourcePath) {
        this.sourcePath = sourcePath;
    }

    public Optional<String> getSourcePath() {
        return Optional.ofNullable(this.sourcePath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionHostVolumeProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String sourcePath;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionHostVolumeProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourcePath = defaults.sourcePath;
        }

        public Builder setSourcePath(@Nullable String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public TaskDefinitionHostVolumeProperties build() {
            return new TaskDefinitionHostVolumeProperties(sourcePath);
        }
    }
}
