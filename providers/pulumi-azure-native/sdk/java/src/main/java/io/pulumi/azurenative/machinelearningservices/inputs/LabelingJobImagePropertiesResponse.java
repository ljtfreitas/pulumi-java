// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LabelingJobImagePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final LabelingJobImagePropertiesResponse Empty = new LabelingJobImagePropertiesResponse();

    /**
     * Annotation type of image labeling tasks.
     * 
     */
    @Import(name="annotationType")
      private final @Nullable String annotationType;

    public Optional<String> getAnnotationType() {
        return this.annotationType == null ? Optional.empty() : Optional.ofNullable(this.annotationType);
    }

    /**
     * Media type of data asset.
     * 
     */
    @Import(name="mediaType", required=true)
      private final String mediaType;

    public String getMediaType() {
        return this.mediaType;
    }

    public LabelingJobImagePropertiesResponse(
        @Nullable String annotationType,
        String mediaType) {
        this.annotationType = annotationType;
        this.mediaType = Objects.requireNonNull(mediaType, "expected parameter 'mediaType' to be non-null");
    }

    private LabelingJobImagePropertiesResponse() {
        this.annotationType = null;
        this.mediaType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelingJobImagePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String annotationType;
        private String mediaType;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelingJobImagePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotationType = defaults.annotationType;
    	      this.mediaType = defaults.mediaType;
        }

        public Builder annotationType(@Nullable String annotationType) {
            this.annotationType = annotationType;
            return this;
        }

        public Builder mediaType(String mediaType) {
            this.mediaType = Objects.requireNonNull(mediaType);
            return this;
        }
        public LabelingJobImagePropertiesResponse build() {
            return new LabelingJobImagePropertiesResponse(annotationType, mediaType);
        }
    }
}
