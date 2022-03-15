// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An artifact that can be deployed in some runtime.
 * 
 */
public final class DeployableResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeployableResponse Empty = new DeployableResponse();

    /**
     * Resource URI for the artifact being deployed.
     * 
     */
    @Import(name="resourceUri", required=true)
      private final List<String> resourceUri;

    public List<String> getResourceUri() {
        return this.resourceUri;
    }

    public DeployableResponse(List<String> resourceUri) {
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
    }

    private DeployableResponse() {
        this.resourceUri = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeployableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(DeployableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder resourceUri(List<String> resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }
        public DeployableResponse build() {
            return new DeployableResponse(resourceUri);
        }
    }
}
