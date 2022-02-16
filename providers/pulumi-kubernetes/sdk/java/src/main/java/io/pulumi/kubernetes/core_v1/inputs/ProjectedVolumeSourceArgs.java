// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.VolumeProjectionArgs;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectedVolumeSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectedVolumeSourceArgs Empty = new ProjectedVolumeSourceArgs();

    @InputImport(name="defaultMode")
    private final @Nullable Input<Integer> defaultMode;

    public Input<Integer> getDefaultMode() {
        return this.defaultMode == null ? Input.empty() : this.defaultMode;
    }

    @InputImport(name="sources", required=true)
    private final Input<List<VolumeProjectionArgs>> sources;

    public Input<List<VolumeProjectionArgs>> getSources() {
        return this.sources;
    }

    public ProjectedVolumeSourceArgs(
        @Nullable Input<Integer> defaultMode,
        Input<List<VolumeProjectionArgs>> sources) {
        this.defaultMode = defaultMode;
        this.sources = Objects.requireNonNull(sources, "expected parameter 'sources' to be non-null");
    }

    private ProjectedVolumeSourceArgs() {
        this.defaultMode = Input.empty();
        this.sources = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectedVolumeSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> defaultMode;
        private Input<List<VolumeProjectionArgs>> sources;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectedVolumeSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMode = defaults.defaultMode;
    	      this.sources = defaults.sources;
        }

        public Builder setDefaultMode(@Nullable Input<Integer> defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }

        public Builder setDefaultMode(@Nullable Integer defaultMode) {
            this.defaultMode = Input.ofNullable(defaultMode);
            return this;
        }

        public Builder setSources(Input<List<VolumeProjectionArgs>> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }

        public Builder setSources(List<VolumeProjectionArgs> sources) {
            this.sources = Input.of(Objects.requireNonNull(sources));
            return this;
        }

        public ProjectedVolumeSourceArgs build() {
            return new ProjectedVolumeSourceArgs(defaultMode, sources);
        }
    }
}