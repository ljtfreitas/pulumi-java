// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lightsail.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Port of the Instance.
 * 
 */
public final class InstancePortArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstancePortArgs Empty = new InstancePortArgs();

    /**
     * Access Direction for Protocol of the Instance(inbound/outbound).
     * 
     */
    @Import(name="accessDirection")
      private final @Nullable Output<String> accessDirection;

    public Output<String> getAccessDirection() {
        return this.accessDirection == null ? Output.empty() : this.accessDirection;
    }

    /**
     * Access From Protocol of the Instance.
     * 
     */
    @Import(name="accessFrom")
      private final @Nullable Output<String> accessFrom;

    public Output<String> getAccessFrom() {
        return this.accessFrom == null ? Output.empty() : this.accessFrom;
    }

    /**
     * Access Type Protocol of the Instance.
     * 
     */
    @Import(name="accessType")
      private final @Nullable Output<String> accessType;

    public Output<String> getAccessType() {
        return this.accessType == null ? Output.empty() : this.accessType;
    }

    @Import(name="cidrListAliases")
      private final @Nullable Output<List<String>> cidrListAliases;

    public Output<List<String>> getCidrListAliases() {
        return this.cidrListAliases == null ? Output.empty() : this.cidrListAliases;
    }

    @Import(name="cidrs")
      private final @Nullable Output<List<String>> cidrs;

    public Output<List<String>> getCidrs() {
        return this.cidrs == null ? Output.empty() : this.cidrs;
    }

    /**
     * CommonName for Protocol of the Instance.
     * 
     */
    @Import(name="commonName")
      private final @Nullable Output<String> commonName;

    public Output<String> getCommonName() {
        return this.commonName == null ? Output.empty() : this.commonName;
    }

    /**
     * From Port of the Instance.
     * 
     */
    @Import(name="fromPort")
      private final @Nullable Output<Integer> fromPort;

    public Output<Integer> getFromPort() {
        return this.fromPort == null ? Output.empty() : this.fromPort;
    }

    @Import(name="ipv6Cidrs")
      private final @Nullable Output<List<String>> ipv6Cidrs;

    public Output<List<String>> getIpv6Cidrs() {
        return this.ipv6Cidrs == null ? Output.empty() : this.ipv6Cidrs;
    }

    /**
     * Port Protocol of the Instance.
     * 
     */
    @Import(name="protocol")
      private final @Nullable Output<String> protocol;

    public Output<String> getProtocol() {
        return this.protocol == null ? Output.empty() : this.protocol;
    }

    /**
     * To Port of the Instance.
     * 
     */
    @Import(name="toPort")
      private final @Nullable Output<Integer> toPort;

    public Output<Integer> getToPort() {
        return this.toPort == null ? Output.empty() : this.toPort;
    }

    public InstancePortArgs(
        @Nullable Output<String> accessDirection,
        @Nullable Output<String> accessFrom,
        @Nullable Output<String> accessType,
        @Nullable Output<List<String>> cidrListAliases,
        @Nullable Output<List<String>> cidrs,
        @Nullable Output<String> commonName,
        @Nullable Output<Integer> fromPort,
        @Nullable Output<List<String>> ipv6Cidrs,
        @Nullable Output<String> protocol,
        @Nullable Output<Integer> toPort) {
        this.accessDirection = accessDirection;
        this.accessFrom = accessFrom;
        this.accessType = accessType;
        this.cidrListAliases = cidrListAliases;
        this.cidrs = cidrs;
        this.commonName = commonName;
        this.fromPort = fromPort;
        this.ipv6Cidrs = ipv6Cidrs;
        this.protocol = protocol;
        this.toPort = toPort;
    }

    private InstancePortArgs() {
        this.accessDirection = Output.empty();
        this.accessFrom = Output.empty();
        this.accessType = Output.empty();
        this.cidrListAliases = Output.empty();
        this.cidrs = Output.empty();
        this.commonName = Output.empty();
        this.fromPort = Output.empty();
        this.ipv6Cidrs = Output.empty();
        this.protocol = Output.empty();
        this.toPort = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstancePortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accessDirection;
        private @Nullable Output<String> accessFrom;
        private @Nullable Output<String> accessType;
        private @Nullable Output<List<String>> cidrListAliases;
        private @Nullable Output<List<String>> cidrs;
        private @Nullable Output<String> commonName;
        private @Nullable Output<Integer> fromPort;
        private @Nullable Output<List<String>> ipv6Cidrs;
        private @Nullable Output<String> protocol;
        private @Nullable Output<Integer> toPort;

        public Builder() {
    	      // Empty
        }

        public Builder(InstancePortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessDirection = defaults.accessDirection;
    	      this.accessFrom = defaults.accessFrom;
    	      this.accessType = defaults.accessType;
    	      this.cidrListAliases = defaults.cidrListAliases;
    	      this.cidrs = defaults.cidrs;
    	      this.commonName = defaults.commonName;
    	      this.fromPort = defaults.fromPort;
    	      this.ipv6Cidrs = defaults.ipv6Cidrs;
    	      this.protocol = defaults.protocol;
    	      this.toPort = defaults.toPort;
        }

        public Builder accessDirection(@Nullable Output<String> accessDirection) {
            this.accessDirection = accessDirection;
            return this;
        }

        public Builder accessDirection(@Nullable String accessDirection) {
            this.accessDirection = Output.ofNullable(accessDirection);
            return this;
        }

        public Builder accessFrom(@Nullable Output<String> accessFrom) {
            this.accessFrom = accessFrom;
            return this;
        }

        public Builder accessFrom(@Nullable String accessFrom) {
            this.accessFrom = Output.ofNullable(accessFrom);
            return this;
        }

        public Builder accessType(@Nullable Output<String> accessType) {
            this.accessType = accessType;
            return this;
        }

        public Builder accessType(@Nullable String accessType) {
            this.accessType = Output.ofNullable(accessType);
            return this;
        }

        public Builder cidrListAliases(@Nullable Output<List<String>> cidrListAliases) {
            this.cidrListAliases = cidrListAliases;
            return this;
        }

        public Builder cidrListAliases(@Nullable List<String> cidrListAliases) {
            this.cidrListAliases = Output.ofNullable(cidrListAliases);
            return this;
        }

        public Builder cidrs(@Nullable Output<List<String>> cidrs) {
            this.cidrs = cidrs;
            return this;
        }

        public Builder cidrs(@Nullable List<String> cidrs) {
            this.cidrs = Output.ofNullable(cidrs);
            return this;
        }

        public Builder commonName(@Nullable Output<String> commonName) {
            this.commonName = commonName;
            return this;
        }

        public Builder commonName(@Nullable String commonName) {
            this.commonName = Output.ofNullable(commonName);
            return this;
        }

        public Builder fromPort(@Nullable Output<Integer> fromPort) {
            this.fromPort = fromPort;
            return this;
        }

        public Builder fromPort(@Nullable Integer fromPort) {
            this.fromPort = Output.ofNullable(fromPort);
            return this;
        }

        public Builder ipv6Cidrs(@Nullable Output<List<String>> ipv6Cidrs) {
            this.ipv6Cidrs = ipv6Cidrs;
            return this;
        }

        public Builder ipv6Cidrs(@Nullable List<String> ipv6Cidrs) {
            this.ipv6Cidrs = Output.ofNullable(ipv6Cidrs);
            return this;
        }

        public Builder protocol(@Nullable Output<String> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder protocol(@Nullable String protocol) {
            this.protocol = Output.ofNullable(protocol);
            return this;
        }

        public Builder toPort(@Nullable Output<Integer> toPort) {
            this.toPort = toPort;
            return this;
        }

        public Builder toPort(@Nullable Integer toPort) {
            this.toPort = Output.ofNullable(toPort);
            return this;
        }
        public InstancePortArgs build() {
            return new InstancePortArgs(accessDirection, accessFrom, accessType, cidrListAliases, cidrs, commonName, fromPort, ipv6Cidrs, protocol, toPort);
        }
    }
}
