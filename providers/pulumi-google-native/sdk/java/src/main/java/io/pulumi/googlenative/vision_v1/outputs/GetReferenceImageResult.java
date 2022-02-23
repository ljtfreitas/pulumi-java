// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vision_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.vision_v1.outputs.BoundingPolyResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetReferenceImageResult {
    /**
     * Optional. Bounding polygons around the areas of interest in the reference image. If this field is empty, the system will try to detect regions of interest. At most 10 bounding polygons will be used. The provided shape is converted into a non-rotated rectangle. Once converted, the small edge of the rectangle must be greater than or equal to 300 pixels. The aspect ratio must be 1:4 or less (i.e. 1:3 is ok; 1:5 is not).
     * 
     */
    private final List<BoundingPolyResponse> boundingPolys;
    /**
     * The resource name of the reference image. Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID/referenceImages/IMAGE_ID`. This field is ignored when creating a reference image.
     * 
     */
    private final String name;
    /**
     * The Google Cloud Storage URI of the reference image. The URI must start with `gs://`.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor({"boundingPolys","name","uri"})
    private GetReferenceImageResult(
        List<BoundingPolyResponse> boundingPolys,
        String name,
        String uri) {
        this.boundingPolys = Objects.requireNonNull(boundingPolys);
        this.name = Objects.requireNonNull(name);
        this.uri = Objects.requireNonNull(uri);
    }

    /**
     * Optional. Bounding polygons around the areas of interest in the reference image. If this field is empty, the system will try to detect regions of interest. At most 10 bounding polygons will be used. The provided shape is converted into a non-rotated rectangle. Once converted, the small edge of the rectangle must be greater than or equal to 300 pixels. The aspect ratio must be 1:4 or less (i.e. 1:3 is ok; 1:5 is not).
     * 
     */
    public List<BoundingPolyResponse> getBoundingPolys() {
        return this.boundingPolys;
    }
    /**
     * The resource name of the reference image. Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID/referenceImages/IMAGE_ID`. This field is ignored when creating a reference image.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The Google Cloud Storage URI of the reference image. The URI must start with `gs://`.
     * 
     */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReferenceImageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BoundingPolyResponse> boundingPolys;
        private String name;
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GetReferenceImageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boundingPolys = defaults.boundingPolys;
    	      this.name = defaults.name;
    	      this.uri = defaults.uri;
        }

        public Builder setBoundingPolys(List<BoundingPolyResponse> boundingPolys) {
            this.boundingPolys = Objects.requireNonNull(boundingPolys);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public GetReferenceImageResult build() {
            return new GetReferenceImageResult(boundingPolys, name, uri);
        }
    }
}
