// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.RouterBgpAdvertisedIpRangeGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouterBgpGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterBgpGetArgs Empty = new RouterBgpGetArgs();

    /**
     * User-specified flag to indicate which mode to use for advertisement.
     * Default value is `DEFAULT`.
     * Possible values are `DEFAULT` and `CUSTOM`.
     * 
     */
    @Import(name="advertiseMode")
      private final @Nullable Output<String> advertiseMode;

    public Output<String> getAdvertiseMode() {
        return this.advertiseMode == null ? Output.empty() : this.advertiseMode;
    }

    /**
     * User-specified list of prefix groups to advertise in custom mode.
     * This field can only be populated if advertiseMode is CUSTOM and
     * is advertised to all peers of the router. These groups will be
     * advertised in addition to any specified prefixes. Leave this field
     * blank to advertise no custom groups.
     * This enum field has the one valid value: ALL_SUBNETS
     * 
     */
    @Import(name="advertisedGroups")
      private final @Nullable Output<List<String>> advertisedGroups;

    public Output<List<String>> getAdvertisedGroups() {
        return this.advertisedGroups == null ? Output.empty() : this.advertisedGroups;
    }

    /**
     * User-specified list of individual IP ranges to advertise in
     * custom mode. This field can only be populated if advertiseMode
     * is CUSTOM and is advertised to all peers of the router. These IP
     * ranges will be advertised in addition to any specified groups.
     * Leave this field blank to advertise no custom IP ranges.
     * Structure is documented below.
     * 
     */
    @Import(name="advertisedIpRanges")
      private final @Nullable Output<List<RouterBgpAdvertisedIpRangeGetArgs>> advertisedIpRanges;

    public Output<List<RouterBgpAdvertisedIpRangeGetArgs>> getAdvertisedIpRanges() {
        return this.advertisedIpRanges == null ? Output.empty() : this.advertisedIpRanges;
    }

    /**
     * Local BGP Autonomous System Number (ASN). Must be an RFC6996
     * private ASN, either 16-bit or 32-bit. The value will be fixed for
     * this router resource. All VPN tunnels that link to this router
     * will have the same local ASN.
     * 
     */
    @Import(name="asn", required=true)
      private final Output<Integer> asn;

    public Output<Integer> getAsn() {
        return this.asn;
    }

    public RouterBgpGetArgs(
        @Nullable Output<String> advertiseMode,
        @Nullable Output<List<String>> advertisedGroups,
        @Nullable Output<List<RouterBgpAdvertisedIpRangeGetArgs>> advertisedIpRanges,
        Output<Integer> asn) {
        this.advertiseMode = advertiseMode;
        this.advertisedGroups = advertisedGroups;
        this.advertisedIpRanges = advertisedIpRanges;
        this.asn = Objects.requireNonNull(asn, "expected parameter 'asn' to be non-null");
    }

    private RouterBgpGetArgs() {
        this.advertiseMode = Output.empty();
        this.advertisedGroups = Output.empty();
        this.advertisedIpRanges = Output.empty();
        this.asn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterBgpGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> advertiseMode;
        private @Nullable Output<List<String>> advertisedGroups;
        private @Nullable Output<List<RouterBgpAdvertisedIpRangeGetArgs>> advertisedIpRanges;
        private Output<Integer> asn;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterBgpGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advertiseMode = defaults.advertiseMode;
    	      this.advertisedGroups = defaults.advertisedGroups;
    	      this.advertisedIpRanges = defaults.advertisedIpRanges;
    	      this.asn = defaults.asn;
        }

        public Builder advertiseMode(@Nullable Output<String> advertiseMode) {
            this.advertiseMode = advertiseMode;
            return this;
        }

        public Builder advertiseMode(@Nullable String advertiseMode) {
            this.advertiseMode = Output.ofNullable(advertiseMode);
            return this;
        }

        public Builder advertisedGroups(@Nullable Output<List<String>> advertisedGroups) {
            this.advertisedGroups = advertisedGroups;
            return this;
        }

        public Builder advertisedGroups(@Nullable List<String> advertisedGroups) {
            this.advertisedGroups = Output.ofNullable(advertisedGroups);
            return this;
        }

        public Builder advertisedIpRanges(@Nullable Output<List<RouterBgpAdvertisedIpRangeGetArgs>> advertisedIpRanges) {
            this.advertisedIpRanges = advertisedIpRanges;
            return this;
        }

        public Builder advertisedIpRanges(@Nullable List<RouterBgpAdvertisedIpRangeGetArgs> advertisedIpRanges) {
            this.advertisedIpRanges = Output.ofNullable(advertisedIpRanges);
            return this;
        }

        public Builder asn(Output<Integer> asn) {
            this.asn = Objects.requireNonNull(asn);
            return this;
        }

        public Builder asn(Integer asn) {
            this.asn = Output.of(Objects.requireNonNull(asn));
            return this;
        }
        public RouterBgpGetArgs build() {
            return new RouterBgpGetArgs(advertiseMode, advertisedGroups, advertisedIpRanges, asn);
        }
    }
}
