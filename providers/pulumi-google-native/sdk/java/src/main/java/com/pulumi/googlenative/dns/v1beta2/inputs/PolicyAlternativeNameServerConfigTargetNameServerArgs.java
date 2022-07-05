// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns.v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dns.v1beta2.enums.PolicyAlternativeNameServerConfigTargetNameServerForwardingPath;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PolicyAlternativeNameServerConfigTargetNameServerArgs extends com.pulumi.resources.ResourceArgs {

    public static final PolicyAlternativeNameServerConfigTargetNameServerArgs Empty = new PolicyAlternativeNameServerConfigTargetNameServerArgs();

    /**
     * Forwarding path for this TargetNameServer. If unset or set to DEFAULT, Cloud DNS makes forwarding decisions based on address ranges; that is, RFC1918 addresses go to the VPC network, non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries through the VPC network for this target.
     * 
     */
    @Import(name="forwardingPath")
    private @Nullable Output<PolicyAlternativeNameServerConfigTargetNameServerForwardingPath> forwardingPath;

    /**
     * @return Forwarding path for this TargetNameServer. If unset or set to DEFAULT, Cloud DNS makes forwarding decisions based on address ranges; that is, RFC1918 addresses go to the VPC network, non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries through the VPC network for this target.
     * 
     */
    public Optional<Output<PolicyAlternativeNameServerConfigTargetNameServerForwardingPath>> forwardingPath() {
        return Optional.ofNullable(this.forwardingPath);
    }

    /**
     * IPv4 address to forward to.
     * 
     */
    @Import(name="ipv4Address")
    private @Nullable Output<String> ipv4Address;

    /**
     * @return IPv4 address to forward to.
     * 
     */
    public Optional<Output<String>> ipv4Address() {
        return Optional.ofNullable(this.ipv4Address);
    }

    /**
     * IPv6 address to forward to. Does not accept both fields (ipv4 &amp; ipv6) being populated.
     * 
     */
    @Import(name="ipv6Address")
    private @Nullable Output<String> ipv6Address;

    /**
     * @return IPv6 address to forward to. Does not accept both fields (ipv4 &amp; ipv6) being populated.
     * 
     */
    public Optional<Output<String>> ipv6Address() {
        return Optional.ofNullable(this.ipv6Address);
    }

    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    private PolicyAlternativeNameServerConfigTargetNameServerArgs() {}

    private PolicyAlternativeNameServerConfigTargetNameServerArgs(PolicyAlternativeNameServerConfigTargetNameServerArgs $) {
        this.forwardingPath = $.forwardingPath;
        this.ipv4Address = $.ipv4Address;
        this.ipv6Address = $.ipv6Address;
        this.kind = $.kind;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyAlternativeNameServerConfigTargetNameServerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyAlternativeNameServerConfigTargetNameServerArgs $;

        public Builder() {
            $ = new PolicyAlternativeNameServerConfigTargetNameServerArgs();
        }

        public Builder(PolicyAlternativeNameServerConfigTargetNameServerArgs defaults) {
            $ = new PolicyAlternativeNameServerConfigTargetNameServerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param forwardingPath Forwarding path for this TargetNameServer. If unset or set to DEFAULT, Cloud DNS makes forwarding decisions based on address ranges; that is, RFC1918 addresses go to the VPC network, non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries through the VPC network for this target.
         * 
         * @return builder
         * 
         */
        public Builder forwardingPath(@Nullable Output<PolicyAlternativeNameServerConfigTargetNameServerForwardingPath> forwardingPath) {
            $.forwardingPath = forwardingPath;
            return this;
        }

        /**
         * @param forwardingPath Forwarding path for this TargetNameServer. If unset or set to DEFAULT, Cloud DNS makes forwarding decisions based on address ranges; that is, RFC1918 addresses go to the VPC network, non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries through the VPC network for this target.
         * 
         * @return builder
         * 
         */
        public Builder forwardingPath(PolicyAlternativeNameServerConfigTargetNameServerForwardingPath forwardingPath) {
            return forwardingPath(Output.of(forwardingPath));
        }

        /**
         * @param ipv4Address IPv4 address to forward to.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Address(@Nullable Output<String> ipv4Address) {
            $.ipv4Address = ipv4Address;
            return this;
        }

        /**
         * @param ipv4Address IPv4 address to forward to.
         * 
         * @return builder
         * 
         */
        public Builder ipv4Address(String ipv4Address) {
            return ipv4Address(Output.of(ipv4Address));
        }

        /**
         * @param ipv6Address IPv6 address to forward to. Does not accept both fields (ipv4 &amp; ipv6) being populated.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Address(@Nullable Output<String> ipv6Address) {
            $.ipv6Address = ipv6Address;
            return this;
        }

        /**
         * @param ipv6Address IPv6 address to forward to. Does not accept both fields (ipv4 &amp; ipv6) being populated.
         * 
         * @return builder
         * 
         */
        public Builder ipv6Address(String ipv6Address) {
            return ipv6Address(Output.of(ipv6Address));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public PolicyAlternativeNameServerConfigTargetNameServerArgs build() {
            return $;
        }
    }

}
