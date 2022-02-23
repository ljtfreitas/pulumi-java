// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.secretmanager.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.secretmanager.inputs.GetSecretReplicationUserManagedReplicaCustomerManagedEncryption;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetSecretReplicationUserManagedReplica extends io.pulumi.resources.InvokeArgs {

    public static final GetSecretReplicationUserManagedReplica Empty = new GetSecretReplicationUserManagedReplica();

    @InputImport(name="customerManagedEncryptions", required=true)
        private final List<GetSecretReplicationUserManagedReplicaCustomerManagedEncryption> customerManagedEncryptions;

    public List<GetSecretReplicationUserManagedReplicaCustomerManagedEncryption> getCustomerManagedEncryptions() {
        return this.customerManagedEncryptions;
    }

    @InputImport(name="location", required=true)
        private final String location;

    public String getLocation() {
        return this.location;
    }

    public GetSecretReplicationUserManagedReplica(
        List<GetSecretReplicationUserManagedReplicaCustomerManagedEncryption> customerManagedEncryptions,
        String location) {
        this.customerManagedEncryptions = Objects.requireNonNull(customerManagedEncryptions, "expected parameter 'customerManagedEncryptions' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
    }

    private GetSecretReplicationUserManagedReplica() {
        this.customerManagedEncryptions = List.of();
        this.location = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretReplicationUserManagedReplica defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetSecretReplicationUserManagedReplicaCustomerManagedEncryption> customerManagedEncryptions;
        private String location;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecretReplicationUserManagedReplica defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerManagedEncryptions = defaults.customerManagedEncryptions;
    	      this.location = defaults.location;
        }

        public Builder setCustomerManagedEncryptions(List<GetSecretReplicationUserManagedReplicaCustomerManagedEncryption> customerManagedEncryptions) {
            this.customerManagedEncryptions = Objects.requireNonNull(customerManagedEncryptions);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public GetSecretReplicationUserManagedReplica build() {
            return new GetSecretReplicationUserManagedReplica(customerManagedEncryptions, location);
        }
    }
}
