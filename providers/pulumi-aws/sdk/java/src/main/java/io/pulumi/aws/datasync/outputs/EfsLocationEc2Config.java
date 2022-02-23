// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.datasync.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class EfsLocationEc2Config {
    /**
     * List of Amazon Resource Names (ARNs) of the EC2 Security Groups that are associated with the EFS Mount Target.
     * 
     */
    private final List<String> securityGroupArns;
    /**
     * Amazon Resource Name (ARN) of the EC2 Subnet that is associated with the EFS Mount Target.
     * 
     */
    private final String subnetArn;

    @OutputCustomType.Constructor({"securityGroupArns","subnetArn"})
    private EfsLocationEc2Config(
        List<String> securityGroupArns,
        String subnetArn) {
        this.securityGroupArns = Objects.requireNonNull(securityGroupArns);
        this.subnetArn = Objects.requireNonNull(subnetArn);
    }

    /**
     * List of Amazon Resource Names (ARNs) of the EC2 Security Groups that are associated with the EFS Mount Target.
     * 
     */
    public List<String> getSecurityGroupArns() {
        return this.securityGroupArns;
    }
    /**
     * Amazon Resource Name (ARN) of the EC2 Subnet that is associated with the EFS Mount Target.
     * 
     */
    public String getSubnetArn() {
        return this.subnetArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EfsLocationEc2Config defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> securityGroupArns;
        private String subnetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(EfsLocationEc2Config defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupArns = defaults.securityGroupArns;
    	      this.subnetArn = defaults.subnetArn;
        }

        public Builder setSecurityGroupArns(List<String> securityGroupArns) {
            this.securityGroupArns = Objects.requireNonNull(securityGroupArns);
            return this;
        }

        public Builder setSubnetArn(String subnetArn) {
            this.subnetArn = Objects.requireNonNull(subnetArn);
            return this;
        }
        public EfsLocationEc2Config build() {
            return new EfsLocationEc2Config(securityGroupArns, subnetArn);
        }
    }
}