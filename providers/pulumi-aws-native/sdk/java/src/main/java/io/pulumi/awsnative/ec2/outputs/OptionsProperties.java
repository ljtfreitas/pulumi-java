// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OptionsProperties {
    /**
     * Indicates whether to enable Ipv6 Support for Vpc Attachment. Valid Values: enable | disable
     * 
     */
    private final @Nullable String applianceModeSupport;
    /**
     * Indicates whether to enable DNS Support for Vpc Attachment. Valid Values: enable | disable
     * 
     */
    private final @Nullable String dnsSupport;
    /**
     * Indicates whether to enable Ipv6 Support for Vpc Attachment. Valid Values: enable | disable
     * 
     */
    private final @Nullable String ipv6Support;

    @OutputCustomType.Constructor({"applianceModeSupport","dnsSupport","ipv6Support"})
    private OptionsProperties(
        @Nullable String applianceModeSupport,
        @Nullable String dnsSupport,
        @Nullable String ipv6Support) {
        this.applianceModeSupport = applianceModeSupport;
        this.dnsSupport = dnsSupport;
        this.ipv6Support = ipv6Support;
    }

    /**
     * Indicates whether to enable Ipv6 Support for Vpc Attachment. Valid Values: enable | disable
     * 
     */
    public Optional<String> getApplianceModeSupport() {
        return Optional.ofNullable(this.applianceModeSupport);
    }
    /**
     * Indicates whether to enable DNS Support for Vpc Attachment. Valid Values: enable | disable
     * 
     */
    public Optional<String> getDnsSupport() {
        return Optional.ofNullable(this.dnsSupport);
    }
    /**
     * Indicates whether to enable Ipv6 Support for Vpc Attachment. Valid Values: enable | disable
     * 
     */
    public Optional<String> getIpv6Support() {
        return Optional.ofNullable(this.ipv6Support);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OptionsProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String applianceModeSupport;
        private @Nullable String dnsSupport;
        private @Nullable String ipv6Support;

        public Builder() {
    	      // Empty
        }

        public Builder(OptionsProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applianceModeSupport = defaults.applianceModeSupport;
    	      this.dnsSupport = defaults.dnsSupport;
    	      this.ipv6Support = defaults.ipv6Support;
        }

        public Builder setApplianceModeSupport(@Nullable String applianceModeSupport) {
            this.applianceModeSupport = applianceModeSupport;
            return this;
        }

        public Builder setDnsSupport(@Nullable String dnsSupport) {
            this.dnsSupport = dnsSupport;
            return this;
        }

        public Builder setIpv6Support(@Nullable String ipv6Support) {
            this.ipv6Support = ipv6Support;
            return this;
        }
        public OptionsProperties build() {
            return new OptionsProperties(applianceModeSupport, dnsSupport, ipv6Support);
        }
    }
}
