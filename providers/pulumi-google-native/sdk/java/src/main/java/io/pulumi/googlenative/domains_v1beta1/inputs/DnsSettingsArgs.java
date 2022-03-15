// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.domains_v1beta1.inputs.CustomDnsArgs;
import io.pulumi.googlenative.domains_v1beta1.inputs.GlueRecordArgs;
import io.pulumi.googlenative.domains_v1beta1.inputs.GoogleDomainsDnsArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the DNS configuration of a `Registration`, including name servers, DNSSEC, and glue records.
 * 
 */
public final class DnsSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DnsSettingsArgs Empty = new DnsSettingsArgs();

    /**
     * An arbitrary DNS provider identified by its name servers.
     * 
     */
    @Import(name="customDns")
      private final @Nullable Output<CustomDnsArgs> customDns;

    public Output<CustomDnsArgs> getCustomDns() {
        return this.customDns == null ? Output.empty() : this.customDns;
    }

    /**
     * The list of glue records for this `Registration`. Commonly empty.
     * 
     */
    @Import(name="glueRecords")
      private final @Nullable Output<List<GlueRecordArgs>> glueRecords;

    public Output<List<GlueRecordArgs>> getGlueRecords() {
        return this.glueRecords == null ? Output.empty() : this.glueRecords;
    }

    /**
     * The free DNS zone provided by [Google Domains](https://domains.google/).
     * 
     */
    @Import(name="googleDomainsDns")
      private final @Nullable Output<GoogleDomainsDnsArgs> googleDomainsDns;

    public Output<GoogleDomainsDnsArgs> getGoogleDomainsDns() {
        return this.googleDomainsDns == null ? Output.empty() : this.googleDomainsDns;
    }

    public DnsSettingsArgs(
        @Nullable Output<CustomDnsArgs> customDns,
        @Nullable Output<List<GlueRecordArgs>> glueRecords,
        @Nullable Output<GoogleDomainsDnsArgs> googleDomainsDns) {
        this.customDns = customDns;
        this.glueRecords = glueRecords;
        this.googleDomainsDns = googleDomainsDns;
    }

    private DnsSettingsArgs() {
        this.customDns = Output.empty();
        this.glueRecords = Output.empty();
        this.googleDomainsDns = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DnsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CustomDnsArgs> customDns;
        private @Nullable Output<List<GlueRecordArgs>> glueRecords;
        private @Nullable Output<GoogleDomainsDnsArgs> googleDomainsDns;

        public Builder() {
    	      // Empty
        }

        public Builder(DnsSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customDns = defaults.customDns;
    	      this.glueRecords = defaults.glueRecords;
    	      this.googleDomainsDns = defaults.googleDomainsDns;
        }

        public Builder customDns(@Nullable Output<CustomDnsArgs> customDns) {
            this.customDns = customDns;
            return this;
        }

        public Builder customDns(@Nullable CustomDnsArgs customDns) {
            this.customDns = Output.ofNullable(customDns);
            return this;
        }

        public Builder glueRecords(@Nullable Output<List<GlueRecordArgs>> glueRecords) {
            this.glueRecords = glueRecords;
            return this;
        }

        public Builder glueRecords(@Nullable List<GlueRecordArgs> glueRecords) {
            this.glueRecords = Output.ofNullable(glueRecords);
            return this;
        }

        public Builder googleDomainsDns(@Nullable Output<GoogleDomainsDnsArgs> googleDomainsDns) {
            this.googleDomainsDns = googleDomainsDns;
            return this;
        }

        public Builder googleDomainsDns(@Nullable GoogleDomainsDnsArgs googleDomainsDns) {
            this.googleDomainsDns = Output.ofNullable(googleDomainsDns);
            return this;
        }
        public DnsSettingsArgs build() {
            return new DnsSettingsArgs(customDns, glueRecords, googleDomainsDns);
        }
    }
}
