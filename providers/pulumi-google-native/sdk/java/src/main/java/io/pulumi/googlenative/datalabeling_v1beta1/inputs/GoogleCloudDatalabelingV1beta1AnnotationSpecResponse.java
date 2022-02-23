// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Container of information related to one possible annotation that can be used in a labeling task. For example, an image classification task where images are labeled as `dog` or `cat` must reference an AnnotationSpec for `dog` and an AnnotationSpec for `cat`.
 * 
 */
public final class GoogleCloudDatalabelingV1beta1AnnotationSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDatalabelingV1beta1AnnotationSpecResponse Empty = new GoogleCloudDatalabelingV1beta1AnnotationSpecResponse();

    /**
     * Optional. User-provided description of the annotation specification. The description can be up to 10,000 characters long.
     * 
     */
    @InputImport(name="description", required=true)
      private final String description;

    public String getDescription() {
        return this.description;
    }

    /**
     * The display name of the AnnotationSpec. Maximum of 64 characters.
     * 
     */
    @InputImport(name="displayName", required=true)
      private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * This is the integer index of the AnnotationSpec. The index for the whole AnnotationSpecSet is sequential starting from 0. For example, an AnnotationSpecSet with classes `dog` and `cat`, might contain one AnnotationSpec with `{ display_name: "dog", index: 0 }` and one AnnotationSpec with `{ display_name: "cat", index: 1 }`. This is especially useful for model training as it encodes the string labels into numeric values.
     * 
     */
    @InputImport(name="index", required=true)
      private final Integer index;

    public Integer getIndex() {
        return this.index;
    }

    public GoogleCloudDatalabelingV1beta1AnnotationSpecResponse(
        String description,
        String displayName,
        Integer index) {
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.index = Objects.requireNonNull(index, "expected parameter 'index' to be non-null");
    }

    private GoogleCloudDatalabelingV1beta1AnnotationSpecResponse() {
        this.description = null;
        this.displayName = null;
        this.index = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatalabelingV1beta1AnnotationSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private String displayName;
        private Integer index;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatalabelingV1beta1AnnotationSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.index = defaults.index;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setIndex(Integer index) {
            this.index = Objects.requireNonNull(index);
            return this;
        }
        public GoogleCloudDatalabelingV1beta1AnnotationSpecResponse build() {
            return new GoogleCloudDatalabelingV1beta1AnnotationSpecResponse(description, displayName, index);
        }
    }
}
