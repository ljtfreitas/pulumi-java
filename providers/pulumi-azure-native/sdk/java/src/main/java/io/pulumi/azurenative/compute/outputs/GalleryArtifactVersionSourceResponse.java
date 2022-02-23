// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GalleryArtifactVersionSourceResponse {
    /**
     * The id of the gallery artifact version source. Can specify a disk uri, snapshot uri, user image or storage account resource.
     * 
     */
    private final @Nullable String id;
    /**
     * The uri of the gallery artifact version source. Currently used to specify vhd/blob source.
     * 
     */
    private final @Nullable String uri;

    @OutputCustomType.Constructor({"id","uri"})
    private GalleryArtifactVersionSourceResponse(
        @Nullable String id,
        @Nullable String uri) {
        this.id = id;
        this.uri = uri;
    }

    /**
     * The id of the gallery artifact version source. Can specify a disk uri, snapshot uri, user image or storage account resource.
     * 
     */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The uri of the gallery artifact version source. Currently used to specify vhd/blob source.
     * 
     */
    public Optional<String> getUri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GalleryArtifactVersionSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GalleryArtifactVersionSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.uri = defaults.uri;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }
        public GalleryArtifactVersionSourceResponse build() {
            return new GalleryArtifactVersionSourceResponse(id, uri);
        }
    }
}
