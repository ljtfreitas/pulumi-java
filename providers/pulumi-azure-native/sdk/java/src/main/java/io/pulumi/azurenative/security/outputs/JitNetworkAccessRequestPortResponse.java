// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JitNetworkAccessRequestPortResponse {
    /**
     * Mutually exclusive with the "allowedSourceAddressPrefixes" parameter. Should be an IP address or CIDR, for example "192.168.0.3" or "192.168.0.0/16".
     * 
     */
    private final @Nullable String allowedSourceAddressPrefix;
    /**
     * Mutually exclusive with the "allowedSourceAddressPrefix" parameter.
     * 
     */
    private final @Nullable List<String> allowedSourceAddressPrefixes;
    /**
     * The date & time at which the request ends in UTC
     * 
     */
    private final String endTimeUtc;
    /**
     * The port which is mapped to this port's `number` in the Azure Firewall, if applicable
     * 
     */
    private final @Nullable Integer mappedPort;
    private final Integer number;
    /**
     * The status of the port
     * 
     */
    private final String status;
    /**
     * A description of why the `status` has its value
     * 
     */
    private final String statusReason;

    @OutputCustomType.Constructor({"allowedSourceAddressPrefix","allowedSourceAddressPrefixes","endTimeUtc","mappedPort","number","status","statusReason"})
    private JitNetworkAccessRequestPortResponse(
        @Nullable String allowedSourceAddressPrefix,
        @Nullable List<String> allowedSourceAddressPrefixes,
        String endTimeUtc,
        @Nullable Integer mappedPort,
        Integer number,
        String status,
        String statusReason) {
        this.allowedSourceAddressPrefix = allowedSourceAddressPrefix;
        this.allowedSourceAddressPrefixes = allowedSourceAddressPrefixes;
        this.endTimeUtc = Objects.requireNonNull(endTimeUtc);
        this.mappedPort = mappedPort;
        this.number = Objects.requireNonNull(number);
        this.status = Objects.requireNonNull(status);
        this.statusReason = Objects.requireNonNull(statusReason);
    }

    /**
     * Mutually exclusive with the "allowedSourceAddressPrefixes" parameter. Should be an IP address or CIDR, for example "192.168.0.3" or "192.168.0.0/16".
     * 
     */
    public Optional<String> getAllowedSourceAddressPrefix() {
        return Optional.ofNullable(this.allowedSourceAddressPrefix);
    }
    /**
     * Mutually exclusive with the "allowedSourceAddressPrefix" parameter.
     * 
     */
    public List<String> getAllowedSourceAddressPrefixes() {
        return this.allowedSourceAddressPrefixes == null ? List.of() : this.allowedSourceAddressPrefixes;
    }
    /**
     * The date & time at which the request ends in UTC
     * 
     */
    public String getEndTimeUtc() {
        return this.endTimeUtc;
    }
    /**
     * The port which is mapped to this port's `number` in the Azure Firewall, if applicable
     * 
     */
    public Optional<Integer> getMappedPort() {
        return Optional.ofNullable(this.mappedPort);
    }
    public Integer getNumber() {
        return this.number;
    }
    /**
     * The status of the port
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * A description of why the `status` has its value
     * 
     */
    public String getStatusReason() {
        return this.statusReason;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JitNetworkAccessRequestPortResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String allowedSourceAddressPrefix;
        private @Nullable List<String> allowedSourceAddressPrefixes;
        private String endTimeUtc;
        private @Nullable Integer mappedPort;
        private Integer number;
        private String status;
        private String statusReason;

        public Builder() {
    	      // Empty
        }

        public Builder(JitNetworkAccessRequestPortResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedSourceAddressPrefix = defaults.allowedSourceAddressPrefix;
    	      this.allowedSourceAddressPrefixes = defaults.allowedSourceAddressPrefixes;
    	      this.endTimeUtc = defaults.endTimeUtc;
    	      this.mappedPort = defaults.mappedPort;
    	      this.number = defaults.number;
    	      this.status = defaults.status;
    	      this.statusReason = defaults.statusReason;
        }

        public Builder setAllowedSourceAddressPrefix(@Nullable String allowedSourceAddressPrefix) {
            this.allowedSourceAddressPrefix = allowedSourceAddressPrefix;
            return this;
        }

        public Builder setAllowedSourceAddressPrefixes(@Nullable List<String> allowedSourceAddressPrefixes) {
            this.allowedSourceAddressPrefixes = allowedSourceAddressPrefixes;
            return this;
        }

        public Builder setEndTimeUtc(String endTimeUtc) {
            this.endTimeUtc = Objects.requireNonNull(endTimeUtc);
            return this;
        }

        public Builder setMappedPort(@Nullable Integer mappedPort) {
            this.mappedPort = mappedPort;
            return this;
        }

        public Builder setNumber(Integer number) {
            this.number = Objects.requireNonNull(number);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatusReason(String statusReason) {
            this.statusReason = Objects.requireNonNull(statusReason);
            return this;
        }
        public JitNetworkAccessRequestPortResponse build() {
            return new JitNetworkAccessRequestPortResponse(allowedSourceAddressPrefix, allowedSourceAddressPrefixes, endTimeUtc, mappedPort, number, status, statusReason);
        }
    }
}
