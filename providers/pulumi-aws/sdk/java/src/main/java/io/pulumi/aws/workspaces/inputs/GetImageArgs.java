// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetImageArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetImageArgs Empty = new GetImageArgs();

    /**
     * The ID of the image.
     * 
     */
    @InputImport(name="imageId", required=true)
    private final String imageId;

    public String getImageId() {
        return this.imageId;
    }

    public GetImageArgs(String imageId) {
        this.imageId = Objects.requireNonNull(imageId, "expected parameter 'imageId' to be non-null");
    }

    private GetImageArgs() {
        this.imageId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String imageId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageId = defaults.imageId;
        }

        public Builder setImageId(String imageId) {
            this.imageId = Objects.requireNonNull(imageId);
            return this;
        }
        public GetImageArgs build() {
            return new GetImageArgs(imageId);
        }
    }
}
