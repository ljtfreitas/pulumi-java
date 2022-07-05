// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ContainerInfoResponse {
    /**
     * @return URI to the hosted container image in Google Container Registry. The URI must be fully qualified and include a tag or digest. Examples: &#34;gcr.io/my-project/image:tag&#34; or &#34;gcr.io/my-project/image@digest&#34;
     * 
     */
    private final String image;

    @CustomType.Constructor
    private ContainerInfoResponse(@CustomType.Parameter("image") String image) {
        this.image = image;
    }

    /**
     * @return URI to the hosted container image in Google Container Registry. The URI must be fully qualified and include a tag or digest. Examples: &#34;gcr.io/my-project/image:tag&#34; or &#34;gcr.io/my-project/image@digest&#34;
     * 
     */
    public String image() {
        return this.image;
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
        }        public ContainerInfoResponse build() {
            return new ContainerInfoResponse(image);
        }
    }
}
