// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The options for the transit gateway vpc attachment.
 * 
 */
public final class OptionsPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final OptionsPropertiesArgs Empty = new OptionsPropertiesArgs();

    /**
     * Indicates whether to enable Ipv6 Support for Vpc Attachment. Valid Values: enable | disable
     * 
     */
    @Import(name="applianceModeSupport")
      private final @Nullable Output<String> applianceModeSupport;

    public Output<String> getApplianceModeSupport() {
        return this.applianceModeSupport == null ? Output.empty() : this.applianceModeSupport;
    }

    /**
     * Indicates whether to enable DNS Support for Vpc Attachment. Valid Values: enable | disable
     * 
     */
    @Import(name="dnsSupport")
      private final @Nullable Output<String> dnsSupport;

    public Output<String> getDnsSupport() {
        return this.dnsSupport == null ? Output.empty() : this.dnsSupport;
    }

    /**
     * Indicates whether to enable Ipv6 Support for Vpc Attachment. Valid Values: enable | disable
     * 
     */
    @Import(name="ipv6Support")
      private final @Nullable Output<String> ipv6Support;

    public Output<String> getIpv6Support() {
        return this.ipv6Support == null ? Output.empty() : this.ipv6Support;
    }

    public OptionsPropertiesArgs(
        @Nullable Output<String> applianceModeSupport,
        @Nullable Output<String> dnsSupport,
        @Nullable Output<String> ipv6Support) {
        this.applianceModeSupport = applianceModeSupport;
        this.dnsSupport = dnsSupport;
        this.ipv6Support = ipv6Support;
    }

    private OptionsPropertiesArgs() {
        this.applianceModeSupport = Output.empty();
        this.dnsSupport = Output.empty();
        this.ipv6Support = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OptionsPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> applianceModeSupport;
        private @Nullable Output<String> dnsSupport;
        private @Nullable Output<String> ipv6Support;

        public Builder() {
    	      // Empty
        }

        public Builder(OptionsPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applianceModeSupport = defaults.applianceModeSupport;
    	      this.dnsSupport = defaults.dnsSupport;
    	      this.ipv6Support = defaults.ipv6Support;
        }

        public Builder applianceModeSupport(@Nullable Output<String> applianceModeSupport) {
            this.applianceModeSupport = applianceModeSupport;
            return this;
        }

        public Builder applianceModeSupport(@Nullable String applianceModeSupport) {
            this.applianceModeSupport = Output.ofNullable(applianceModeSupport);
            return this;
        }

        public Builder dnsSupport(@Nullable Output<String> dnsSupport) {
            this.dnsSupport = dnsSupport;
            return this;
        }

        public Builder dnsSupport(@Nullable String dnsSupport) {
            this.dnsSupport = Output.ofNullable(dnsSupport);
            return this;
        }

        public Builder ipv6Support(@Nullable Output<String> ipv6Support) {
            this.ipv6Support = ipv6Support;
            return this;
        }

        public Builder ipv6Support(@Nullable String ipv6Support) {
            this.ipv6Support = Output.ofNullable(ipv6Support);
            return this;
        }
        public OptionsPropertiesArgs build() {
            return new OptionsPropertiesArgs(applianceModeSupport, dnsSupport, ipv6Support);
        }
    }
}
