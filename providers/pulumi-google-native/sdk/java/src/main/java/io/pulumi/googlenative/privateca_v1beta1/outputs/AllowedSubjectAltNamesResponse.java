// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AllowedSubjectAltNamesResponse {
    /**
     * Optional. Specifies if to allow custom X509Extension values.
     * 
     */
    private final Boolean allowCustomSans;
    /**
     * Optional. Specifies if glob patterns used for allowed_dns_names allow wildcard certificates. If this is set, certificate requests with wildcard domains will be permitted to match a glob pattern specified in allowed_dns_names. Otherwise, certificate requests with wildcard domains will be permitted only if allowed_dns_names contains a literal wildcard.
     * 
     */
    private final Boolean allowGlobbingDnsWildcards;
    /**
     * Optional. Contains valid, fully-qualified host names. Glob patterns are also supported. To allow an explicit wildcard certificate, escape with backlash (i.e. `\*`). E.g. for globbed entries: `*bar.com` will allow `foo.bar.com`, but not `*.bar.com`, unless the allow_globbing_dns_wildcards field is set. E.g. for wildcard entries: `\*.bar.com` will allow `*.bar.com`, but not `foo.bar.com`.
     * 
     */
    private final List<String> allowedDnsNames;
    /**
     * Optional. Contains valid RFC 2822 E-mail addresses. Glob patterns are also supported.
     * 
     */
    private final List<String> allowedEmailAddresses;
    /**
     * Optional. Contains valid 32-bit IPv4 addresses and subnet ranges or RFC 4291 IPv6 addresses and subnet ranges. Subnet ranges are specified using the '/' notation (e.g. 10.0.0.0/8, 2001:700:300:1800::/64). Glob patterns are supported only for ip address entries (i.e. not for subnet ranges).
     * 
     */
    private final List<String> allowedIps;
    /**
     * Optional. Contains valid RFC 3986 URIs. Glob patterns are also supported. To match across path seperators (i.e. '/') use the double star glob pattern (i.e. '**').
     * 
     */
    private final List<String> allowedUris;

    @CustomType.Constructor
    private AllowedSubjectAltNamesResponse(
        @CustomType.Parameter("allowCustomSans") Boolean allowCustomSans,
        @CustomType.Parameter("allowGlobbingDnsWildcards") Boolean allowGlobbingDnsWildcards,
        @CustomType.Parameter("allowedDnsNames") List<String> allowedDnsNames,
        @CustomType.Parameter("allowedEmailAddresses") List<String> allowedEmailAddresses,
        @CustomType.Parameter("allowedIps") List<String> allowedIps,
        @CustomType.Parameter("allowedUris") List<String> allowedUris) {
        this.allowCustomSans = allowCustomSans;
        this.allowGlobbingDnsWildcards = allowGlobbingDnsWildcards;
        this.allowedDnsNames = allowedDnsNames;
        this.allowedEmailAddresses = allowedEmailAddresses;
        this.allowedIps = allowedIps;
        this.allowedUris = allowedUris;
    }

    /**
     * Optional. Specifies if to allow custom X509Extension values.
     * 
    */
    public Boolean getAllowCustomSans() {
        return this.allowCustomSans;
    }
    /**
     * Optional. Specifies if glob patterns used for allowed_dns_names allow wildcard certificates. If this is set, certificate requests with wildcard domains will be permitted to match a glob pattern specified in allowed_dns_names. Otherwise, certificate requests with wildcard domains will be permitted only if allowed_dns_names contains a literal wildcard.
     * 
    */
    public Boolean getAllowGlobbingDnsWildcards() {
        return this.allowGlobbingDnsWildcards;
    }
    /**
     * Optional. Contains valid, fully-qualified host names. Glob patterns are also supported. To allow an explicit wildcard certificate, escape with backlash (i.e. `\*`). E.g. for globbed entries: `*bar.com` will allow `foo.bar.com`, but not `*.bar.com`, unless the allow_globbing_dns_wildcards field is set. E.g. for wildcard entries: `\*.bar.com` will allow `*.bar.com`, but not `foo.bar.com`.
     * 
    */
    public List<String> getAllowedDnsNames() {
        return this.allowedDnsNames;
    }
    /**
     * Optional. Contains valid RFC 2822 E-mail addresses. Glob patterns are also supported.
     * 
    */
    public List<String> getAllowedEmailAddresses() {
        return this.allowedEmailAddresses;
    }
    /**
     * Optional. Contains valid 32-bit IPv4 addresses and subnet ranges or RFC 4291 IPv6 addresses and subnet ranges. Subnet ranges are specified using the '/' notation (e.g. 10.0.0.0/8, 2001:700:300:1800::/64). Glob patterns are supported only for ip address entries (i.e. not for subnet ranges).
     * 
    */
    public List<String> getAllowedIps() {
        return this.allowedIps;
    }
    /**
     * Optional. Contains valid RFC 3986 URIs. Glob patterns are also supported. To match across path seperators (i.e. '/') use the double star glob pattern (i.e. '**').
     * 
    */
    public List<String> getAllowedUris() {
        return this.allowedUris;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllowedSubjectAltNamesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowCustomSans;
        private Boolean allowGlobbingDnsWildcards;
        private List<String> allowedDnsNames;
        private List<String> allowedEmailAddresses;
        private List<String> allowedIps;
        private List<String> allowedUris;

        public Builder() {
    	      // Empty
        }

        public Builder(AllowedSubjectAltNamesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowCustomSans = defaults.allowCustomSans;
    	      this.allowGlobbingDnsWildcards = defaults.allowGlobbingDnsWildcards;
    	      this.allowedDnsNames = defaults.allowedDnsNames;
    	      this.allowedEmailAddresses = defaults.allowedEmailAddresses;
    	      this.allowedIps = defaults.allowedIps;
    	      this.allowedUris = defaults.allowedUris;
        }

        public Builder allowCustomSans(Boolean allowCustomSans) {
            this.allowCustomSans = Objects.requireNonNull(allowCustomSans);
            return this;
        }

        public Builder allowGlobbingDnsWildcards(Boolean allowGlobbingDnsWildcards) {
            this.allowGlobbingDnsWildcards = Objects.requireNonNull(allowGlobbingDnsWildcards);
            return this;
        }

        public Builder allowedDnsNames(List<String> allowedDnsNames) {
            this.allowedDnsNames = Objects.requireNonNull(allowedDnsNames);
            return this;
        }

        public Builder allowedEmailAddresses(List<String> allowedEmailAddresses) {
            this.allowedEmailAddresses = Objects.requireNonNull(allowedEmailAddresses);
            return this;
        }

        public Builder allowedIps(List<String> allowedIps) {
            this.allowedIps = Objects.requireNonNull(allowedIps);
            return this;
        }

        public Builder allowedUris(List<String> allowedUris) {
            this.allowedUris = Objects.requireNonNull(allowedUris);
            return this;
        }
        public AllowedSubjectAltNamesResponse build() {
            return new AllowedSubjectAltNamesResponse(allowCustomSans, allowGlobbingDnsWildcards, allowedDnsNames, allowedEmailAddresses, allowedIps, allowedUris);
        }
    }
}
