// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AwsNodePoolConfigSshConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsNodePoolConfigSshConfigArgs Empty = new AwsNodePoolConfigSshConfigArgs();

    /**
     * Required. The name of the EC2 key pair used to login into cluster machines.
     * 
     */
    @InputImport(name="ec2KeyPair", required=true)
        private final Input<String> ec2KeyPair;

    public Input<String> getEc2KeyPair() {
        return this.ec2KeyPair;
    }

    public AwsNodePoolConfigSshConfigArgs(Input<String> ec2KeyPair) {
        this.ec2KeyPair = Objects.requireNonNull(ec2KeyPair, "expected parameter 'ec2KeyPair' to be non-null");
    }

    private AwsNodePoolConfigSshConfigArgs() {
        this.ec2KeyPair = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsNodePoolConfigSshConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> ec2KeyPair;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsNodePoolConfigSshConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ec2KeyPair = defaults.ec2KeyPair;
        }

        public Builder setEc2KeyPair(Input<String> ec2KeyPair) {
            this.ec2KeyPair = Objects.requireNonNull(ec2KeyPair);
            return this;
        }

        public Builder setEc2KeyPair(String ec2KeyPair) {
            this.ec2KeyPair = Input.of(Objects.requireNonNull(ec2KeyPair));
            return this;
        }
        public AwsNodePoolConfigSshConfigArgs build() {
            return new AwsNodePoolConfigSshConfigArgs(ec2KeyPair);
        }
    }
}
