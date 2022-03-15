// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The VPC Peering configuration is used to create VPC peering between Datastream and the consumer's VPC.
 * 
 */
public final class VpcPeeringConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcPeeringConfigArgs Empty = new VpcPeeringConfigArgs();

    /**
     * A free subnet for peering. (CIDR of /29) TODO(b/172995841) add validators.
     * 
     */
    @Import(name="subnet", required=true)
      private final Output<String> subnet;

    public Output<String> getSubnet() {
        return this.subnet;
    }

    /**
     * fully qualified name of the VPC Datastream will peer to.
     * 
     */
    @Import(name="vpcName", required=true)
      private final Output<String> vpcName;

    public Output<String> getVpcName() {
        return this.vpcName;
    }

    public VpcPeeringConfigArgs(
        Output<String> subnet,
        Output<String> vpcName) {
        this.subnet = Objects.requireNonNull(subnet, "expected parameter 'subnet' to be non-null");
        this.vpcName = Objects.requireNonNull(vpcName, "expected parameter 'vpcName' to be non-null");
    }

    private VpcPeeringConfigArgs() {
        this.subnet = Output.empty();
        this.vpcName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcPeeringConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> subnet;
        private Output<String> vpcName;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcPeeringConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnet = defaults.subnet;
    	      this.vpcName = defaults.vpcName;
        }

        public Builder subnet(Output<String> subnet) {
            this.subnet = Objects.requireNonNull(subnet);
            return this;
        }

        public Builder subnet(String subnet) {
            this.subnet = Output.of(Objects.requireNonNull(subnet));
            return this;
        }

        public Builder vpcName(Output<String> vpcName) {
            this.vpcName = Objects.requireNonNull(vpcName);
            return this;
        }

        public Builder vpcName(String vpcName) {
            this.vpcName = Output.of(Objects.requireNonNull(vpcName));
            return this;
        }
        public VpcPeeringConfigArgs build() {
            return new VpcPeeringConfigArgs(subnet, vpcName);
        }
    }
}
