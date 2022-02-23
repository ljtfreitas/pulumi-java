// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PolicyAlternativeNameServerConfigTargetNameServerResponse extends io.pulumi.resources.InvokeArgs {

    public static final PolicyAlternativeNameServerConfigTargetNameServerResponse Empty = new PolicyAlternativeNameServerConfigTargetNameServerResponse();

    /**
     * Forwarding path for this TargetNameServer. If unset or set to DEFAULT, Cloud DNS makes forwarding decisions based on address ranges; that is, RFC1918 addresses go to the VPC network, non-RFC1918 addresses go to the internet. When set to PRIVATE, Cloud DNS always sends queries through the VPC network for this target.
     * 
     */
    @InputImport(name="forwardingPath", required=true)
      private final String forwardingPath;

    public String getForwardingPath() {
        return this.forwardingPath;
    }

    /**
     * IPv4 address to forward to.
     * 
     */
    @InputImport(name="ipv4Address", required=true)
      private final String ipv4Address;

    public String getIpv4Address() {
        return this.ipv4Address;
    }

    /**
     * IPv6 address to forward to. Does not accept both fields (ipv4 & ipv6) being populated.
     * 
     */
    @InputImport(name="ipv6Address", required=true)
      private final String ipv6Address;

    public String getIpv6Address() {
        return this.ipv6Address;
    }

    @InputImport(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    public PolicyAlternativeNameServerConfigTargetNameServerResponse(
        String forwardingPath,
        String ipv4Address,
        String ipv6Address,
        String kind) {
        this.forwardingPath = Objects.requireNonNull(forwardingPath, "expected parameter 'forwardingPath' to be non-null");
        this.ipv4Address = Objects.requireNonNull(ipv4Address, "expected parameter 'ipv4Address' to be non-null");
        this.ipv6Address = Objects.requireNonNull(ipv6Address, "expected parameter 'ipv6Address' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
    }

    private PolicyAlternativeNameServerConfigTargetNameServerResponse() {
        this.forwardingPath = null;
        this.ipv4Address = null;
        this.ipv6Address = null;
        this.kind = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyAlternativeNameServerConfigTargetNameServerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String forwardingPath;
        private String ipv4Address;
        private String ipv6Address;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyAlternativeNameServerConfigTargetNameServerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardingPath = defaults.forwardingPath;
    	      this.ipv4Address = defaults.ipv4Address;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.kind = defaults.kind;
        }

        public Builder setForwardingPath(String forwardingPath) {
            this.forwardingPath = Objects.requireNonNull(forwardingPath);
            return this;
        }

        public Builder setIpv4Address(String ipv4Address) {
            this.ipv4Address = Objects.requireNonNull(ipv4Address);
            return this;
        }

        public Builder setIpv6Address(String ipv6Address) {
            this.ipv6Address = Objects.requireNonNull(ipv6Address);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public PolicyAlternativeNameServerConfigTargetNameServerResponse build() {
            return new PolicyAlternativeNameServerConfigTargetNameServerResponse(forwardingPath, ipv4Address, ipv6Address, kind);
        }
    }
}
