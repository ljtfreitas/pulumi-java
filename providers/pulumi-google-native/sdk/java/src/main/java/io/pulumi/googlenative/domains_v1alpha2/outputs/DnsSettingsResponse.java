// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.domains_v1alpha2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.domains_v1alpha2.outputs.CustomDnsResponse;
import io.pulumi.googlenative.domains_v1alpha2.outputs.GlueRecordResponse;
import io.pulumi.googlenative.domains_v1alpha2.outputs.GoogleDomainsDnsResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DnsSettingsResponse {
    /**
     * An arbitrary DNS provider identified by its name servers.
     * 
     */
    private final CustomDnsResponse customDns;
    /**
     * The list of glue records for this `Registration`. Commonly empty.
     * 
     */
    private final List<GlueRecordResponse> glueRecords;
    /**
     * The free DNS zone provided by [Google Domains](https://domains.google/).
     * 
     */
    private final GoogleDomainsDnsResponse googleDomainsDns;

    @OutputCustomType.Constructor({"customDns","glueRecords","googleDomainsDns"})
    private DnsSettingsResponse(
        CustomDnsResponse customDns,
        List<GlueRecordResponse> glueRecords,
        GoogleDomainsDnsResponse googleDomainsDns) {
        this.customDns = Objects.requireNonNull(customDns);
        this.glueRecords = Objects.requireNonNull(glueRecords);
        this.googleDomainsDns = Objects.requireNonNull(googleDomainsDns);
    }

    /**
     * An arbitrary DNS provider identified by its name servers.
     * 
     */
    public CustomDnsResponse getCustomDns() {
        return this.customDns;
    }
    /**
     * The list of glue records for this `Registration`. Commonly empty.
     * 
     */
    public List<GlueRecordResponse> getGlueRecords() {
        return this.glueRecords;
    }
    /**
     * The free DNS zone provided by [Google Domains](https://domains.google/).
     * 
     */
    public GoogleDomainsDnsResponse getGoogleDomainsDns() {
        return this.googleDomainsDns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DnsSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomDnsResponse customDns;
        private List<GlueRecordResponse> glueRecords;
        private GoogleDomainsDnsResponse googleDomainsDns;

        public Builder() {
    	      // Empty
        }

        public Builder(DnsSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customDns = defaults.customDns;
    	      this.glueRecords = defaults.glueRecords;
    	      this.googleDomainsDns = defaults.googleDomainsDns;
        }

        public Builder setCustomDns(CustomDnsResponse customDns) {
            this.customDns = Objects.requireNonNull(customDns);
            return this;
        }

        public Builder setGlueRecords(List<GlueRecordResponse> glueRecords) {
            this.glueRecords = Objects.requireNonNull(glueRecords);
            return this;
        }

        public Builder setGoogleDomainsDns(GoogleDomainsDnsResponse googleDomainsDns) {
            this.googleDomainsDns = Objects.requireNonNull(googleDomainsDns);
            return this;
        }
        public DnsSettingsResponse build() {
            return new DnsSettingsResponse(customDns, glueRecords, googleDomainsDns);
        }
    }
}
