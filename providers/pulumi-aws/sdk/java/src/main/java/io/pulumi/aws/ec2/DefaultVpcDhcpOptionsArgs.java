// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultVpcDhcpOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefaultVpcDhcpOptionsArgs Empty = new DefaultVpcDhcpOptionsArgs();

    /**
     * List of NETBIOS name servers.
     * 
     */
    @InputImport(name="netbiosNameServers")
    private final @Nullable Input<List<String>> netbiosNameServers;

    public Input<List<String>> getNetbiosNameServers() {
        return this.netbiosNameServers == null ? Input.empty() : this.netbiosNameServers;
    }

    /**
     * The NetBIOS node type (1, 2, 4, or 8). AWS recommends to specify 2 since broadcast and multicast are not supported in their network. For more information about these node types, see [RFC 2132](http://www.ietf.org/rfc/rfc2132.txt).
     * 
     */
    @InputImport(name="netbiosNodeType")
    private final @Nullable Input<String> netbiosNodeType;

    public Input<String> getNetbiosNodeType() {
        return this.netbiosNodeType == null ? Input.empty() : this.netbiosNodeType;
    }

    /**
     * The ID of the AWS account that owns the DHCP options set.
     * 
     */
    @InputImport(name="ownerId")
    private final @Nullable Input<String> ownerId;

    public Input<String> getOwnerId() {
        return this.ownerId == null ? Input.empty() : this.ownerId;
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

    public DefaultVpcDhcpOptionsArgs(
        @Nullable Input<List<String>> netbiosNameServers,
        @Nullable Input<String> netbiosNodeType,
        @Nullable Input<String> ownerId,
        @Nullable Input<Map<String,String>> tags) {
        this.netbiosNameServers = netbiosNameServers;
        this.netbiosNodeType = netbiosNodeType;
        this.ownerId = ownerId;
        this.tags = tags;
    }

    private DefaultVpcDhcpOptionsArgs() {
        this.netbiosNameServers = Input.empty();
        this.netbiosNodeType = Input.empty();
        this.ownerId = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultVpcDhcpOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> netbiosNameServers;
        private @Nullable Input<String> netbiosNodeType;
        private @Nullable Input<String> ownerId;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultVpcDhcpOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.netbiosNameServers = defaults.netbiosNameServers;
    	      this.netbiosNodeType = defaults.netbiosNodeType;
    	      this.ownerId = defaults.ownerId;
    	      this.tags = defaults.tags;
        }

        public Builder setNetbiosNameServers(@Nullable Input<List<String>> netbiosNameServers) {
            this.netbiosNameServers = netbiosNameServers;
            return this;
        }

        public Builder setNetbiosNameServers(@Nullable List<String> netbiosNameServers) {
            this.netbiosNameServers = Input.ofNullable(netbiosNameServers);
            return this;
        }

        public Builder setNetbiosNodeType(@Nullable Input<String> netbiosNodeType) {
            this.netbiosNodeType = netbiosNodeType;
            return this;
        }

        public Builder setNetbiosNodeType(@Nullable String netbiosNodeType) {
            this.netbiosNodeType = Input.ofNullable(netbiosNodeType);
            return this;
        }

        public Builder setOwnerId(@Nullable Input<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setOwnerId(@Nullable String ownerId) {
            this.ownerId = Input.ofNullable(ownerId);
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
        public DefaultVpcDhcpOptionsArgs build() {
            return new DefaultVpcDhcpOptionsArgs(netbiosNameServers, netbiosNodeType, ownerId, tags);
        }
    }
}