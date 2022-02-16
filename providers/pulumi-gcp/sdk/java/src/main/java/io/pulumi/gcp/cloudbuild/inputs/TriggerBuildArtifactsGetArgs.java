// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.cloudbuild.inputs.TriggerBuildArtifactsObjectsGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerBuildArtifactsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerBuildArtifactsGetArgs Empty = new TriggerBuildArtifactsGetArgs();

    @InputImport(name="images")
    private final @Nullable Input<List<String>> images;

    public Input<List<String>> getImages() {
        return this.images == null ? Input.empty() : this.images;
    }

    @InputImport(name="objects")
    private final @Nullable Input<TriggerBuildArtifactsObjectsGetArgs> objects;

    public Input<TriggerBuildArtifactsObjectsGetArgs> getObjects() {
        return this.objects == null ? Input.empty() : this.objects;
    }

    public TriggerBuildArtifactsGetArgs(
        @Nullable Input<List<String>> images,
        @Nullable Input<TriggerBuildArtifactsObjectsGetArgs> objects) {
        this.images = images;
        this.objects = objects;
    }

    private TriggerBuildArtifactsGetArgs() {
        this.images = Input.empty();
        this.objects = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildArtifactsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> images;
        private @Nullable Input<TriggerBuildArtifactsObjectsGetArgs> objects;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildArtifactsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.images = defaults.images;
    	      this.objects = defaults.objects;
        }

        public Builder setImages(@Nullable Input<List<String>> images) {
            this.images = images;
            return this;
        }

        public Builder setImages(@Nullable List<String> images) {
            this.images = Input.ofNullable(images);
            return this;
        }

        public Builder setObjects(@Nullable Input<TriggerBuildArtifactsObjectsGetArgs> objects) {
            this.objects = objects;
            return this;
        }

        public Builder setObjects(@Nullable TriggerBuildArtifactsObjectsGetArgs objects) {
            this.objects = Input.ofNullable(objects);
            return this;
        }

        public TriggerBuildArtifactsGetArgs build() {
            return new TriggerBuildArtifactsGetArgs(images, objects);
        }
    }
}