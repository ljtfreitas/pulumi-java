// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * An artifact that can be deployed in some runtime.
 * 
 */
public final class DeploymentNoteArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentNoteArgs Empty = new DeploymentNoteArgs();

    /**
     * Resource URI for the artifact being deployed.
     * 
     */
    @InputImport(name="resourceUri", required=true)
      private final Input<List<String>> resourceUri;

    public Input<List<String>> getResourceUri() {
        return this.resourceUri;
    }

    public DeploymentNoteArgs(Input<List<String>> resourceUri) {
        this.resourceUri = Objects.requireNonNull(resourceUri, "expected parameter 'resourceUri' to be non-null");
    }

    private DeploymentNoteArgs() {
        this.resourceUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentNoteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> resourceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentNoteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceUri = defaults.resourceUri;
        }

        public Builder setResourceUri(Input<List<String>> resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }

        public Builder setResourceUri(List<String> resourceUri) {
            this.resourceUri = Input.of(Objects.requireNonNull(resourceUri));
            return this;
        }
        public DeploymentNoteArgs build() {
            return new DeploymentNoteArgs(resourceUri);
        }
    }
}
