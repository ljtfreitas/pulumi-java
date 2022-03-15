// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ImageBuilderVpcConfig {
    /**
     * Identifiers of the security groups for the image builder or image builder.
     * 
     */
    private final @Nullable List<String> securityGroupIds;
    /**
     * Identifiers of the subnets to which a network interface is attached from the image builder instance or image builder instance.
     * 
     */
    private final @Nullable List<String> subnetIds;

    @CustomType.Constructor
    private ImageBuilderVpcConfig(
        @CustomType.Parameter("securityGroupIds") @Nullable List<String> securityGroupIds,
        @CustomType.Parameter("subnetIds") @Nullable List<String> subnetIds) {
        this.securityGroupIds = securityGroupIds;
        this.subnetIds = subnetIds;
    }

    /**
     * Identifiers of the security groups for the image builder or image builder.
     * 
    */
    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }
    /**
     * Identifiers of the subnets to which a network interface is attached from the image builder instance or image builder instance.
     * 
    */
    public List<String> getSubnetIds() {
        return this.subnetIds == null ? List.of() : this.subnetIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageBuilderVpcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> securityGroupIds;
        private @Nullable List<String> subnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageBuilderVpcConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetIds = defaults.subnetIds;
        }

        public Builder securityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder subnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }
        public ImageBuilderVpcConfig build() {
            return new ImageBuilderVpcConfig(securityGroupIds, subnetIds);
        }
    }
}
