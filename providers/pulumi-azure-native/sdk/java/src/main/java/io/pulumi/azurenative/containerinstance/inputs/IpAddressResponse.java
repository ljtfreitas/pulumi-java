// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.azurenative.containerinstance.inputs.PortResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IP address for the container group.
 * 
 */
public final class IpAddressResponse extends io.pulumi.resources.InvokeArgs {

    public static final IpAddressResponse Empty = new IpAddressResponse();

    /**
     * The Dns name label for the IP.
     * 
     */
    @InputImport(name="dnsNameLabel")
        private final @Nullable String dnsNameLabel;

    public Optional<String> getDnsNameLabel() {
        return this.dnsNameLabel == null ? Optional.empty() : Optional.ofNullable(this.dnsNameLabel);
    }

    /**
     * The FQDN for the IP.
     * 
     */
    @InputImport(name="fqdn", required=true)
        private final String fqdn;

    public String getFqdn() {
        return this.fqdn;
    }

    /**
     * The IP exposed to the public internet.
     * 
     */
    @InputImport(name="ip")
        private final @Nullable String ip;

    public Optional<String> getIp() {
        return this.ip == null ? Optional.empty() : Optional.ofNullable(this.ip);
    }

    /**
     * The list of ports exposed on the container group.
     * 
     */
    @InputImport(name="ports", required=true)
        private final List<PortResponse> ports;

    public List<PortResponse> getPorts() {
        return this.ports;
    }

    /**
     * Specifies if the IP is exposed to the public internet or private VNET.
     * 
     */
    @InputImport(name="type", required=true)
        private final String type;

    public String getType() {
        return this.type;
    }

    public IpAddressResponse(
        @Nullable String dnsNameLabel,
        String fqdn,
        @Nullable String ip,
        List<PortResponse> ports,
        String type) {
        this.dnsNameLabel = dnsNameLabel;
        this.fqdn = Objects.requireNonNull(fqdn, "expected parameter 'fqdn' to be non-null");
        this.ip = ip;
        this.ports = Objects.requireNonNull(ports, "expected parameter 'ports' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private IpAddressResponse() {
        this.dnsNameLabel = null;
        this.fqdn = null;
        this.ip = null;
        this.ports = List.of();
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpAddressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dnsNameLabel;
        private String fqdn;
        private @Nullable String ip;
        private List<PortResponse> ports;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(IpAddressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsNameLabel = defaults.dnsNameLabel;
    	      this.fqdn = defaults.fqdn;
    	      this.ip = defaults.ip;
    	      this.ports = defaults.ports;
    	      this.type = defaults.type;
        }

        public Builder setDnsNameLabel(@Nullable String dnsNameLabel) {
            this.dnsNameLabel = dnsNameLabel;
            return this;
        }

        public Builder setFqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }

        public Builder setIp(@Nullable String ip) {
            this.ip = ip;
            return this;
        }

        public Builder setPorts(List<PortResponse> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public IpAddressResponse build() {
            return new IpAddressResponse(dnsNameLabel, fqdn, ip, ports, type);
        }
    }
}
