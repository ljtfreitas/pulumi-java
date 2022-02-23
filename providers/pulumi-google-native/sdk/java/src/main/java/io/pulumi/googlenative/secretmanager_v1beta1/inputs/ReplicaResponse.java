// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a Replica for this Secret.
 * 
 */
public final class ReplicaResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReplicaResponse Empty = new ReplicaResponse();

    /**
     * The canonical IDs of the location to replicate data. For example: `"us-east1"`.
     * 
     */
    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    public ReplicaResponse(String location) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
    }

    private ReplicaResponse() {
        this.location = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicaResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicaResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public ReplicaResponse build() {
            return new ReplicaResponse(location);
        }
    }
}
