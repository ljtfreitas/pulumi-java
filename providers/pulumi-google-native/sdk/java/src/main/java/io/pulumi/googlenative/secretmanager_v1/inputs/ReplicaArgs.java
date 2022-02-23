// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.secretmanager_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.secretmanager_v1.inputs.CustomerManagedEncryptionArgs;
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
     * Optional. The customer-managed encryption configuration of the User-Managed Replica. If no configuration is provided, Google-managed default encryption is used. Updates to the Secret encryption configuration only apply to SecretVersions added afterwards. They do not apply retroactively to existing SecretVersions.
     * 
     */
    @InputImport(name="customerManagedEncryption")
      private final @Nullable Input<CustomerManagedEncryptionArgs> customerManagedEncryption;

    public Input<CustomerManagedEncryptionArgs> getCustomerManagedEncryption() {
        return this.customerManagedEncryption == null ? Input.empty() : this.customerManagedEncryption;
    }

    /**
     * The canonical IDs of the location to replicate data. For example: `"us-east1"`.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    public ReplicaArgs(
        @Nullable Input<CustomerManagedEncryptionArgs> customerManagedEncryption,
        @Nullable Input<String> location) {
        this.customerManagedEncryption = customerManagedEncryption;
        this.location = location;
    }

    private ReplicaArgs() {
        this.customerManagedEncryption = Input.empty();
        this.location = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CustomerManagedEncryptionArgs> customerManagedEncryption;
        private @Nullable Input<String> location;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerManagedEncryption = defaults.customerManagedEncryption;
    	      this.location = defaults.location;
        }

        public Builder setCustomerManagedEncryption(@Nullable Input<CustomerManagedEncryptionArgs> customerManagedEncryption) {
            this.customerManagedEncryption = customerManagedEncryption;
            return this;
        }

        public Builder setCustomerManagedEncryption(@Nullable CustomerManagedEncryptionArgs customerManagedEncryption) {
            this.customerManagedEncryption = Input.ofNullable(customerManagedEncryption);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }
        public ReplicaArgs build() {
            return new ReplicaArgs(customerManagedEncryption, location);
        }
    }
}
