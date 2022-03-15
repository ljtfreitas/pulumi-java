// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFunctionVpcConfig {
    private final List<String> securityGroupIds;
    private final List<String> subnetIds;
    private final String vpcId;

    @CustomType.Constructor
    private GetFunctionVpcConfig(
        @CustomType.Parameter("securityGroupIds") List<String> securityGroupIds,
        @CustomType.Parameter("subnetIds") List<String> subnetIds,
        @CustomType.Parameter("vpcId") String vpcId) {
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
        this.vpcId = vpcId;
    }

    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }
    public List<String> getSubnetIds() {
        return this.subnetIds;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionVpcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> securityGroupIds;
        private List<String> subnetIds;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionVpcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder securityGroupIds(List<String> securityGroupIds) {
            this.securityGroupIds = Objects.requireNonNull(securityGroupIds);
            return this;
        }

        public Builder subnetIds(List<String> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public GetFunctionVpcConfig build() {
            return new GetFunctionVpcConfig(securityGroupIds, subnetIds, vpcId);
        }
    }
}
