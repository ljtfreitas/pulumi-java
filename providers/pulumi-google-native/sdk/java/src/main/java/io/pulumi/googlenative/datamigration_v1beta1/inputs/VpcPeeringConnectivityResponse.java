// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The details of the VPC where the source database is located in Google Cloud. We will use this information to set up the VPC peering connection between Cloud SQL and this VPC.
 * 
 */
public final class VpcPeeringConnectivityResponse extends io.pulumi.resources.InvokeArgs {

    public static final VpcPeeringConnectivityResponse Empty = new VpcPeeringConnectivityResponse();

    /**
     * The name of the VPC network to peer with the Cloud SQL private network.
     * 
     */
    @InputImport(name="vpc", required=true)
      private final String vpc;

    public String getVpc() {
        return this.vpc;
    }

    public VpcPeeringConnectivityResponse(String vpc) {
        this.vpc = Objects.requireNonNull(vpc, "expected parameter 'vpc' to be non-null");
    }

    private VpcPeeringConnectivityResponse() {
        this.vpc = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcPeeringConnectivityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String vpc;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcPeeringConnectivityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpc = defaults.vpc;
        }

        public Builder setVpc(String vpc) {
            this.vpc = Objects.requireNonNull(vpc);
            return this;
        }
        public VpcPeeringConnectivityResponse build() {
            return new VpcPeeringConnectivityResponse(vpc);
        }
    }
}
