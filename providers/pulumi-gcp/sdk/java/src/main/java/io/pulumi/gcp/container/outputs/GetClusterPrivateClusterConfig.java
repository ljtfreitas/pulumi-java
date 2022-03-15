// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.container.outputs.GetClusterPrivateClusterConfigMasterGlobalAccessConfig;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClusterPrivateClusterConfig {
    private final Boolean enablePrivateEndpoint;
    private final Boolean enablePrivateNodes;
    private final List<GetClusterPrivateClusterConfigMasterGlobalAccessConfig> masterGlobalAccessConfigs;
    private final String masterIpv4CidrBlock;
    private final String peeringName;
    private final String privateEndpoint;
    private final String publicEndpoint;

    @CustomType.Constructor
    private GetClusterPrivateClusterConfig(
        @CustomType.Parameter("enablePrivateEndpoint") Boolean enablePrivateEndpoint,
        @CustomType.Parameter("enablePrivateNodes") Boolean enablePrivateNodes,
        @CustomType.Parameter("masterGlobalAccessConfigs") List<GetClusterPrivateClusterConfigMasterGlobalAccessConfig> masterGlobalAccessConfigs,
        @CustomType.Parameter("masterIpv4CidrBlock") String masterIpv4CidrBlock,
        @CustomType.Parameter("peeringName") String peeringName,
        @CustomType.Parameter("privateEndpoint") String privateEndpoint,
        @CustomType.Parameter("publicEndpoint") String publicEndpoint) {
        this.enablePrivateEndpoint = enablePrivateEndpoint;
        this.enablePrivateNodes = enablePrivateNodes;
        this.masterGlobalAccessConfigs = masterGlobalAccessConfigs;
        this.masterIpv4CidrBlock = masterIpv4CidrBlock;
        this.peeringName = peeringName;
        this.privateEndpoint = privateEndpoint;
        this.publicEndpoint = publicEndpoint;
    }

    public Boolean getEnablePrivateEndpoint() {
        return this.enablePrivateEndpoint;
    }
    public Boolean getEnablePrivateNodes() {
        return this.enablePrivateNodes;
    }
    public List<GetClusterPrivateClusterConfigMasterGlobalAccessConfig> getMasterGlobalAccessConfigs() {
        return this.masterGlobalAccessConfigs;
    }
    public String getMasterIpv4CidrBlock() {
        return this.masterIpv4CidrBlock;
    }
    public String getPeeringName() {
        return this.peeringName;
    }
    public String getPrivateEndpoint() {
        return this.privateEndpoint;
    }
    public String getPublicEndpoint() {
        return this.publicEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterPrivateClusterConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enablePrivateEndpoint;
        private Boolean enablePrivateNodes;
        private List<GetClusterPrivateClusterConfigMasterGlobalAccessConfig> masterGlobalAccessConfigs;
        private String masterIpv4CidrBlock;
        private String peeringName;
        private String privateEndpoint;
        private String publicEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterPrivateClusterConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enablePrivateEndpoint = defaults.enablePrivateEndpoint;
    	      this.enablePrivateNodes = defaults.enablePrivateNodes;
    	      this.masterGlobalAccessConfigs = defaults.masterGlobalAccessConfigs;
    	      this.masterIpv4CidrBlock = defaults.masterIpv4CidrBlock;
    	      this.peeringName = defaults.peeringName;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.publicEndpoint = defaults.publicEndpoint;
        }

        public Builder enablePrivateEndpoint(Boolean enablePrivateEndpoint) {
            this.enablePrivateEndpoint = Objects.requireNonNull(enablePrivateEndpoint);
            return this;
        }

        public Builder enablePrivateNodes(Boolean enablePrivateNodes) {
            this.enablePrivateNodes = Objects.requireNonNull(enablePrivateNodes);
            return this;
        }

        public Builder masterGlobalAccessConfigs(List<GetClusterPrivateClusterConfigMasterGlobalAccessConfig> masterGlobalAccessConfigs) {
            this.masterGlobalAccessConfigs = Objects.requireNonNull(masterGlobalAccessConfigs);
            return this;
        }

        public Builder masterIpv4CidrBlock(String masterIpv4CidrBlock) {
            this.masterIpv4CidrBlock = Objects.requireNonNull(masterIpv4CidrBlock);
            return this;
        }

        public Builder peeringName(String peeringName) {
            this.peeringName = Objects.requireNonNull(peeringName);
            return this;
        }

        public Builder privateEndpoint(String privateEndpoint) {
            this.privateEndpoint = Objects.requireNonNull(privateEndpoint);
            return this;
        }

        public Builder publicEndpoint(String publicEndpoint) {
            this.publicEndpoint = Objects.requireNonNull(publicEndpoint);
            return this;
        }
        public GetClusterPrivateClusterConfig build() {
            return new GetClusterPrivateClusterConfig(enablePrivateEndpoint, enablePrivateNodes, masterGlobalAccessConfigs, masterIpv4CidrBlock, peeringName, privateEndpoint, publicEndpoint);
        }
    }
}
