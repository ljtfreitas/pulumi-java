// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ResourceResponse {
    /**
     * The unique URI of the resource. For example, `https://gcr.io/project/image@sha256:foo` for a Docker image.
     * 
     */
    private final String uri;

    @OutputCustomType.Constructor({"uri"})
    private ResourceResponse(String uri) {
        this.uri = Objects.requireNonNull(uri);
    }

    /**
     * The unique URI of the resource. For example, `https://gcr.io/project/image@sha256:foo` for a Docker image.
     * 
     */
    public String getUri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.uri = defaults.uri;
        }

        public Builder setUri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public ResourceResponse build() {
            return new ResourceResponse(uri);
        }
    }
}
