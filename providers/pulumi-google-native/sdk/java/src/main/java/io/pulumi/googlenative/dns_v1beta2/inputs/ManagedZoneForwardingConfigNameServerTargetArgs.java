// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dns_v1beta2.enums.ManagedZoneForwardingConfigNameServerTargetForwardingPath;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedZoneForwardingConfigNameServerTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZoneForwardingConfigNameServerTargetArgs Empty = new ManagedZoneForwardingConfigNameServerTargetArgs();

    /**
     * Forwarding path for this NameServerTarget. If unset or set to DEFAULT, Cloud DNS makes forwarding decisions based on IP address ranges; that is, RFC1918 addresses go to the VPC network, non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries through the VPC network for this target.
     * 
     */
    @Import(name="forwardingPath")
      private final @Nullable Output<ManagedZoneForwardingConfigNameServerTargetForwardingPath> forwardingPath;

    public Output<ManagedZoneForwardingConfigNameServerTargetForwardingPath> getForwardingPath() {
        return this.forwardingPath == null ? Output.empty() : this.forwardingPath;
    }

    /**
     * IPv4 address of a target name server.
     * 
     */
    @Import(name="ipv4Address")
      private final @Nullable Output<String> ipv4Address;

    public Output<String> getIpv4Address() {
        return this.ipv4Address == null ? Output.empty() : this.ipv4Address;
    }

    /**
     * IPv6 address of a target name server. Does not accept both fields (ipv4 & ipv6) being populated.
     * 
     */
    @Import(name="ipv6Address")
      private final @Nullable Output<String> ipv6Address;

    public Output<String> getIpv6Address() {
        return this.ipv6Address == null ? Output.empty() : this.ipv6Address;
    }

    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    public ManagedZoneForwardingConfigNameServerTargetArgs(
        @Nullable Output<ManagedZoneForwardingConfigNameServerTargetForwardingPath> forwardingPath,
        @Nullable Output<String> ipv4Address,
        @Nullable Output<String> ipv6Address,
        @Nullable Output<String> kind) {
        this.forwardingPath = forwardingPath;
        this.ipv4Address = ipv4Address;
        this.ipv6Address = ipv6Address;
        this.kind = kind;
    }

    private ManagedZoneForwardingConfigNameServerTargetArgs() {
        this.forwardingPath = Output.empty();
        this.ipv4Address = Output.empty();
        this.ipv6Address = Output.empty();
        this.kind = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneForwardingConfigNameServerTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ManagedZoneForwardingConfigNameServerTargetForwardingPath> forwardingPath;
        private @Nullable Output<String> ipv4Address;
        private @Nullable Output<String> ipv6Address;
        private @Nullable Output<String> kind;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneForwardingConfigNameServerTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardingPath = defaults.forwardingPath;
    	      this.ipv4Address = defaults.ipv4Address;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.kind = defaults.kind;
        }

        public Builder forwardingPath(@Nullable Output<ManagedZoneForwardingConfigNameServerTargetForwardingPath> forwardingPath) {
            this.forwardingPath = forwardingPath;
            return this;
        }

        public Builder forwardingPath(@Nullable ManagedZoneForwardingConfigNameServerTargetForwardingPath forwardingPath) {
            this.forwardingPath = Output.ofNullable(forwardingPath);
            return this;
        }

        public Builder ipv4Address(@Nullable Output<String> ipv4Address) {
            this.ipv4Address = ipv4Address;
            return this;
        }

        public Builder ipv4Address(@Nullable String ipv4Address) {
            this.ipv4Address = Output.ofNullable(ipv4Address);
            return this;
        }

        public Builder ipv6Address(@Nullable Output<String> ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }

        public Builder ipv6Address(@Nullable String ipv6Address) {
            this.ipv6Address = Output.ofNullable(ipv6Address);
            return this;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }
        public ManagedZoneForwardingConfigNameServerTargetArgs build() {
            return new ManagedZoneForwardingConfigNameServerTargetArgs(forwardingPath, ipv4Address, ipv6Address, kind);
        }
    }
}
