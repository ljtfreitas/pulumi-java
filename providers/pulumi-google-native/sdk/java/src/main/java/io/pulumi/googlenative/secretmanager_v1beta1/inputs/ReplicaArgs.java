// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a Replica for this Secret.
 * 
 */
public final class ReplicaArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicaArgs Empty = new ReplicaArgs();

    /**
     * The canonical IDs of the location to replicate data. For example: `"us-east1"`.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    public ReplicaArgs(@Nullable Output<String> location) {
        this.location = location;
    }

    private ReplicaArgs() {
        this.location = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> location;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public ReplicaArgs build() {
            return new ReplicaArgs(location);
        }
    }
}
