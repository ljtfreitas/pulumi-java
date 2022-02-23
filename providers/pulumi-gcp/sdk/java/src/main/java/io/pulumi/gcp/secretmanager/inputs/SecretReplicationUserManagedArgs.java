// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.secretmanager.inputs.SecretReplicationUserManagedReplicaArgs;
import java.util.List;
import java.util.Objects;


public final class SecretReplicationUserManagedArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretReplicationUserManagedArgs Empty = new SecretReplicationUserManagedArgs();

    /**
     * The list of Replicas for this Secret. Cannot be empty.
     * Structure is documented below.
     * 
     */
    @InputImport(name="replicas", required=true)
        private final Input<List<SecretReplicationUserManagedReplicaArgs>> replicas;

    public Input<List<SecretReplicationUserManagedReplicaArgs>> getReplicas() {
        return this.replicas;
    }

    public SecretReplicationUserManagedArgs(Input<List<SecretReplicationUserManagedReplicaArgs>> replicas) {
        this.replicas = Objects.requireNonNull(replicas, "expected parameter 'replicas' to be non-null");
    }

    private SecretReplicationUserManagedArgs() {
        this.replicas = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretReplicationUserManagedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<SecretReplicationUserManagedReplicaArgs>> replicas;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretReplicationUserManagedArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicas = defaults.replicas;
        }

        public Builder setReplicas(Input<List<SecretReplicationUserManagedReplicaArgs>> replicas) {
            this.replicas = Objects.requireNonNull(replicas);
            return this;
        }

        public Builder setReplicas(List<SecretReplicationUserManagedReplicaArgs> replicas) {
            this.replicas = Input.of(Objects.requireNonNull(replicas));
            return this;
        }
        public SecretReplicationUserManagedArgs build() {
            return new SecretReplicationUserManagedArgs(replicas);
        }
    }
}
