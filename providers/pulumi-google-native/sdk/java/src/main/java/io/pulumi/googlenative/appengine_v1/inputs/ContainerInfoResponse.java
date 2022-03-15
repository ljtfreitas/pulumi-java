// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Docker image that is used to create a container and start a VM instance for the version that you deploy. Only applicable for instances running in the App Engine flexible environment.
 * 
 */
public final class ContainerInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContainerInfoResponse Empty = new ContainerInfoResponse();

    /**
     * URI to the hosted container image in Google Container Registry. The URI must be fully qualified and include a tag or digest. Examples: "gcr.io/my-project/image:tag" or "gcr.io/my-project/image@digest"
     * 
     */
    @Import(name="image", required=true)
      private final String image;

    public String getImage() {
        return this.image;
    }

    public ContainerInfoResponse(String image) {
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
    }

    private ContainerInfoResponse() {
        this.image = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String image;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.image = defaults.image;
        }

        public Builder image(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public ContainerInfoResponse build() {
            return new ContainerInfoResponse(image);
        }
    }
}
