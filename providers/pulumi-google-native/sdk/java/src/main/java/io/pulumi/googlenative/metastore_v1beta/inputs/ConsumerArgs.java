// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains information of the customer's network configurations.
 * 
 */
public final class ConsumerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConsumerArgs Empty = new ConsumerArgs();

    /**
     * The subnetwork of the customer project from which an IP address is reserved and used as the Dataproc Metastore service's endpoint. It is accessible to hosts in the subnet and to all hosts in a subnet in the same region and same network. There must be at least one IP address available in the subnet's primary range. The subnet is specified in the following form:`projects/{project_number}/regions/{region_id}/subnetworks/{subnetwork_id}
     * 
     */
    @InputImport(name="subnetwork")
      private final @Nullable Input<String> subnetwork;

    public Input<String> getSubnetwork() {
        return this.subnetwork == null ? Input.empty() : this.subnetwork;
    }

    public ConsumerArgs(@Nullable Input<String> subnetwork) {
        this.subnetwork = subnetwork;
    }

    private ConsumerArgs() {
        this.subnetwork = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsumerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsumerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder setSubnetwork(@Nullable Input<String> subnetwork) {
            this.subnetwork = subnetwork;
            return this;
        }

        public Builder setSubnetwork(@Nullable String subnetwork) {
            this.subnetwork = Input.ofNullable(subnetwork);
            return this;
        }
        public ConsumerArgs build() {
            return new ConsumerArgs(subnetwork);
        }
    }
}
