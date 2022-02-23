// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultVpcArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefaultVpcArgs Empty = new DefaultVpcArgs();

    /**
     * A boolean flag to enable/disable ClassicLink
     * for the VPC. Only valid in regions and accounts that support EC2 Classic.
     * See the [ClassicLink documentation](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/vpc-classiclink.html) for more information. Defaults false.
     * 
     */
    @InputImport(name="enableClassiclink")
    private final @Nullable Input<Boolean> enableClassiclink;

    public Input<Boolean> getEnableClassiclink() {
        return this.enableClassiclink == null ? Input.empty() : this.enableClassiclink;
    }

    @InputImport(name="enableClassiclinkDnsSupport")
    private final @Nullable Input<Boolean> enableClassiclinkDnsSupport;

    public Input<Boolean> getEnableClassiclinkDnsSupport() {
        return this.enableClassiclinkDnsSupport == null ? Input.empty() : this.enableClassiclinkDnsSupport;
    }

    /**
     * A boolean flag to enable/disable DNS hostnames in the VPC. Defaults false.
     * 
     */
    @InputImport(name="enableDnsHostnames")
    private final @Nullable Input<Boolean> enableDnsHostnames;

    public Input<Boolean> getEnableDnsHostnames() {
        return this.enableDnsHostnames == null ? Input.empty() : this.enableDnsHostnames;
    }

    /**
     * A boolean flag to enable/disable DNS support in the VPC. Defaults true.
     * 
     */
    @InputImport(name="enableDnsSupport")
    private final @Nullable Input<Boolean> enableDnsSupport;

    public Input<Boolean> getEnableDnsSupport() {
        return this.enableDnsSupport == null ? Input.empty() : this.enableDnsSupport;
    }

    @InputImport(name="ipv4IpamPoolId")
    private final @Nullable Input<String> ipv4IpamPoolId;

    public Input<String> getIpv4IpamPoolId() {
        return this.ipv4IpamPoolId == null ? Input.empty() : this.ipv4IpamPoolId;
    }

    @InputImport(name="ipv4NetmaskLength")
    private final @Nullable Input<Integer> ipv4NetmaskLength;

    public Input<Integer> getIpv4NetmaskLength() {
        return this.ipv4NetmaskLength == null ? Input.empty() : this.ipv4NetmaskLength;
    }

    /**
     * The IPv6 CIDR block of the VPC
     * 
     */
    @InputImport(name="ipv6CidrBlock")
    private final @Nullable Input<String> ipv6CidrBlock;

    public Input<String> getIpv6CidrBlock() {
        return this.ipv6CidrBlock == null ? Input.empty() : this.ipv6CidrBlock;
    }

    @InputImport(name="ipv6CidrBlockNetworkBorderGroup")
    private final @Nullable Input<String> ipv6CidrBlockNetworkBorderGroup;

    public Input<String> getIpv6CidrBlockNetworkBorderGroup() {
        return this.ipv6CidrBlockNetworkBorderGroup == null ? Input.empty() : this.ipv6CidrBlockNetworkBorderGroup;
    }

    @InputImport(name="ipv6IpamPoolId")
    private final @Nullable Input<String> ipv6IpamPoolId;

    public Input<String> getIpv6IpamPoolId() {
        return this.ipv6IpamPoolId == null ? Input.empty() : this.ipv6IpamPoolId;
    }

    @InputImport(name="ipv6NetmaskLength")
    private final @Nullable Input<Integer> ipv6NetmaskLength;

    public Input<Integer> getIpv6NetmaskLength() {
        return this.ipv6NetmaskLength == null ? Input.empty() : this.ipv6NetmaskLength;
    }

    /**
     * A map of tags to assign to the resource.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public DefaultVpcArgs(
        @Nullable Input<Boolean> enableClassiclink,
        @Nullable Input<Boolean> enableClassiclinkDnsSupport,
        @Nullable Input<Boolean> enableDnsHostnames,
        @Nullable Input<Boolean> enableDnsSupport,
        @Nullable Input<String> ipv4IpamPoolId,
        @Nullable Input<Integer> ipv4NetmaskLength,
        @Nullable Input<String> ipv6CidrBlock,
        @Nullable Input<String> ipv6CidrBlockNetworkBorderGroup,
        @Nullable Input<String> ipv6IpamPoolId,
        @Nullable Input<Integer> ipv6NetmaskLength,
        @Nullable Input<Map<String,String>> tags) {
        this.enableClassiclink = enableClassiclink;
        this.enableClassiclinkDnsSupport = enableClassiclinkDnsSupport;
        this.enableDnsHostnames = enableDnsHostnames;
        this.enableDnsSupport = enableDnsSupport;
        this.ipv4IpamPoolId = ipv4IpamPoolId;
        this.ipv4NetmaskLength = ipv4NetmaskLength;
        this.ipv6CidrBlock = ipv6CidrBlock;
        this.ipv6CidrBlockNetworkBorderGroup = ipv6CidrBlockNetworkBorderGroup;
        this.ipv6IpamPoolId = ipv6IpamPoolId;
        this.ipv6NetmaskLength = ipv6NetmaskLength;
        this.tags = tags;
    }

    private DefaultVpcArgs() {
        this.enableClassiclink = Input.empty();
        this.enableClassiclinkDnsSupport = Input.empty();
        this.enableDnsHostnames = Input.empty();
        this.enableDnsSupport = Input.empty();
        this.ipv4IpamPoolId = Input.empty();
        this.ipv4NetmaskLength = Input.empty();
        this.ipv6CidrBlock = Input.empty();
        this.ipv6CidrBlockNetworkBorderGroup = Input.empty();
        this.ipv6IpamPoolId = Input.empty();
        this.ipv6NetmaskLength = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultVpcArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enableClassiclink;
        private @Nullable Input<Boolean> enableClassiclinkDnsSupport;
        private @Nullable Input<Boolean> enableDnsHostnames;
        private @Nullable Input<Boolean> enableDnsSupport;
        private @Nullable Input<String> ipv4IpamPoolId;
        private @Nullable Input<Integer> ipv4NetmaskLength;
        private @Nullable Input<String> ipv6CidrBlock;
        private @Nullable Input<String> ipv6CidrBlockNetworkBorderGroup;
        private @Nullable Input<String> ipv6IpamPoolId;
        private @Nullable Input<Integer> ipv6NetmaskLength;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultVpcArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableClassiclink = defaults.enableClassiclink;
    	      this.enableClassiclinkDnsSupport = defaults.enableClassiclinkDnsSupport;
    	      this.enableDnsHostnames = defaults.enableDnsHostnames;
    	      this.enableDnsSupport = defaults.enableDnsSupport;
    	      this.ipv4IpamPoolId = defaults.ipv4IpamPoolId;
    	      this.ipv4NetmaskLength = defaults.ipv4NetmaskLength;
    	      this.ipv6CidrBlock = defaults.ipv6CidrBlock;
    	      this.ipv6CidrBlockNetworkBorderGroup = defaults.ipv6CidrBlockNetworkBorderGroup;
    	      this.ipv6IpamPoolId = defaults.ipv6IpamPoolId;
    	      this.ipv6NetmaskLength = defaults.ipv6NetmaskLength;
    	      this.tags = defaults.tags;
        }

        public Builder setEnableClassiclink(@Nullable Input<Boolean> enableClassiclink) {
            this.enableClassiclink = enableClassiclink;
            return this;
        }

        public Builder setEnableClassiclink(@Nullable Boolean enableClassiclink) {
            this.enableClassiclink = Input.ofNullable(enableClassiclink);
            return this;
        }

        public Builder setEnableClassiclinkDnsSupport(@Nullable Input<Boolean> enableClassiclinkDnsSupport) {
            this.enableClassiclinkDnsSupport = enableClassiclinkDnsSupport;
            return this;
        }

        public Builder setEnableClassiclinkDnsSupport(@Nullable Boolean enableClassiclinkDnsSupport) {
            this.enableClassiclinkDnsSupport = Input.ofNullable(enableClassiclinkDnsSupport);
            return this;
        }

        public Builder setEnableDnsHostnames(@Nullable Input<Boolean> enableDnsHostnames) {
            this.enableDnsHostnames = enableDnsHostnames;
            return this;
        }

        public Builder setEnableDnsHostnames(@Nullable Boolean enableDnsHostnames) {
            this.enableDnsHostnames = Input.ofNullable(enableDnsHostnames);
            return this;
        }

        public Builder setEnableDnsSupport(@Nullable Input<Boolean> enableDnsSupport) {
            this.enableDnsSupport = enableDnsSupport;
            return this;
        }

        public Builder setEnableDnsSupport(@Nullable Boolean enableDnsSupport) {
            this.enableDnsSupport = Input.ofNullable(enableDnsSupport);
            return this;
        }

        public Builder setIpv4IpamPoolId(@Nullable Input<String> ipv4IpamPoolId) {
            this.ipv4IpamPoolId = ipv4IpamPoolId;
            return this;
        }

        public Builder setIpv4IpamPoolId(@Nullable String ipv4IpamPoolId) {
            this.ipv4IpamPoolId = Input.ofNullable(ipv4IpamPoolId);
            return this;
        }

        public Builder setIpv4NetmaskLength(@Nullable Input<Integer> ipv4NetmaskLength) {
            this.ipv4NetmaskLength = ipv4NetmaskLength;
            return this;
        }

        public Builder setIpv4NetmaskLength(@Nullable Integer ipv4NetmaskLength) {
            this.ipv4NetmaskLength = Input.ofNullable(ipv4NetmaskLength);
            return this;
        }

        public Builder setIpv6CidrBlock(@Nullable Input<String> ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        public Builder setIpv6CidrBlock(@Nullable String ipv6CidrBlock) {
            this.ipv6CidrBlock = Input.ofNullable(ipv6CidrBlock);
            return this;
        }

        public Builder setIpv6CidrBlockNetworkBorderGroup(@Nullable Input<String> ipv6CidrBlockNetworkBorderGroup) {
            this.ipv6CidrBlockNetworkBorderGroup = ipv6CidrBlockNetworkBorderGroup;
            return this;
        }

        public Builder setIpv6CidrBlockNetworkBorderGroup(@Nullable String ipv6CidrBlockNetworkBorderGroup) {
            this.ipv6CidrBlockNetworkBorderGroup = Input.ofNullable(ipv6CidrBlockNetworkBorderGroup);
            return this;
        }

        public Builder setIpv6IpamPoolId(@Nullable Input<String> ipv6IpamPoolId) {
            this.ipv6IpamPoolId = ipv6IpamPoolId;
            return this;
        }

        public Builder setIpv6IpamPoolId(@Nullable String ipv6IpamPoolId) {
            this.ipv6IpamPoolId = Input.ofNullable(ipv6IpamPoolId);
            return this;
        }

        public Builder setIpv6NetmaskLength(@Nullable Input<Integer> ipv6NetmaskLength) {
            this.ipv6NetmaskLength = ipv6NetmaskLength;
            return this;
        }

        public Builder setIpv6NetmaskLength(@Nullable Integer ipv6NetmaskLength) {
            this.ipv6NetmaskLength = Input.ofNullable(ipv6NetmaskLength);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public DefaultVpcArgs build() {
            return new DefaultVpcArgs(enableClassiclink, enableClassiclinkDnsSupport, enableDnsHostnames, enableDnsSupport, ipv4IpamPoolId, ipv4NetmaskLength, ipv6CidrBlock, ipv6CidrBlockNetworkBorderGroup, ipv6IpamPoolId, ipv6NetmaskLength, tags);
        }
    }
}
