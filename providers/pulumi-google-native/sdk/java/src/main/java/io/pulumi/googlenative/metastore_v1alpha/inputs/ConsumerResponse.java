// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.metastore_v1alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Contains information of the customer's network configurations.
 * 
 */
public final class ConsumerResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConsumerResponse Empty = new ConsumerResponse();

    /**
     * The URI of the endpoint used to access the metastore service.
     * 
     */
    @Import(name="endpointUri", required=true)
      private final String endpointUri;

    public String getEndpointUri() {
        return this.endpointUri;
    }

    /**
     * The subnetwork of the customer project from which an IP address is reserved and used as the Dataproc Metastore service's endpoint. It is accessible to hosts in the subnet and to all hosts in a subnet in the same region and same network. There must be at least one IP address available in the subnet's primary range. The subnet is specified in the following form:`projects/{project_number}/regions/{region_id}/subnetworks/{subnetwork_id}
     * 
     */
    @Import(name="subnetwork", required=true)
      private final String subnetwork;

    public String getSubnetwork() {
        return this.subnetwork;
    }

    public ConsumerResponse(
        String endpointUri,
        String subnetwork) {
        this.endpointUri = Objects.requireNonNull(endpointUri, "expected parameter 'endpointUri' to be non-null");
        this.subnetwork = Objects.requireNonNull(subnetwork, "expected parameter 'subnetwork' to be non-null");
    }

    private ConsumerResponse() {
        this.endpointUri = null;
        this.subnetwork = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsumerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointUri;
        private String subnetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsumerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointUri = defaults.endpointUri;
    	      this.subnetwork = defaults.subnetwork;
        }

        public Builder endpointUri(String endpointUri) {
            this.endpointUri = Objects.requireNonNull(endpointUri);
            return this;
        }

        public Builder subnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }
        public ConsumerResponse build() {
            return new ConsumerResponse(endpointUri, subnetwork);
        }
    }
}
