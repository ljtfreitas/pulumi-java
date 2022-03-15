// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Global service auth configuration properties. These are the data-plane authorization keys and are used if a service doesn't define it's own.
 * 
 */
public final class ServiceAuthConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceAuthConfigurationArgs Empty = new ServiceAuthConfigurationArgs();

    /**
     * The primary auth key hash. This is not returned in response of GET/PUT on the resource.. To see this please call listKeys API.
     * 
     */
    @Import(name="primaryAuthKeyHash", required=true)
      private final Output<String> primaryAuthKeyHash;

    public Output<String> getPrimaryAuthKeyHash() {
        return this.primaryAuthKeyHash;
    }

    /**
     * The secondary auth key hash. This is not returned in response of GET/PUT on the resource.. To see this please call listKeys API.
     * 
     */
    @Import(name="secondaryAuthKeyHash", required=true)
      private final Output<String> secondaryAuthKeyHash;

    public Output<String> getSecondaryAuthKeyHash() {
        return this.secondaryAuthKeyHash;
    }

    public ServiceAuthConfigurationArgs(
        Output<String> primaryAuthKeyHash,
        Output<String> secondaryAuthKeyHash) {
        this.primaryAuthKeyHash = Objects.requireNonNull(primaryAuthKeyHash, "expected parameter 'primaryAuthKeyHash' to be non-null");
        this.secondaryAuthKeyHash = Objects.requireNonNull(secondaryAuthKeyHash, "expected parameter 'secondaryAuthKeyHash' to be non-null");
    }

    private ServiceAuthConfigurationArgs() {
        this.primaryAuthKeyHash = Output.empty();
        this.secondaryAuthKeyHash = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAuthConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> primaryAuthKeyHash;
        private Output<String> secondaryAuthKeyHash;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAuthConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primaryAuthKeyHash = defaults.primaryAuthKeyHash;
    	      this.secondaryAuthKeyHash = defaults.secondaryAuthKeyHash;
        }

        public Builder primaryAuthKeyHash(Output<String> primaryAuthKeyHash) {
            this.primaryAuthKeyHash = Objects.requireNonNull(primaryAuthKeyHash);
            return this;
        }

        public Builder primaryAuthKeyHash(String primaryAuthKeyHash) {
            this.primaryAuthKeyHash = Output.of(Objects.requireNonNull(primaryAuthKeyHash));
            return this;
        }

        public Builder secondaryAuthKeyHash(Output<String> secondaryAuthKeyHash) {
            this.secondaryAuthKeyHash = Objects.requireNonNull(secondaryAuthKeyHash);
            return this;
        }

        public Builder secondaryAuthKeyHash(String secondaryAuthKeyHash) {
            this.secondaryAuthKeyHash = Output.of(Objects.requireNonNull(secondaryAuthKeyHash));
            return this;
        }
        public ServiceAuthConfigurationArgs build() {
            return new ServiceAuthConfigurationArgs(primaryAuthKeyHash, secondaryAuthKeyHash);
        }
    }
}
