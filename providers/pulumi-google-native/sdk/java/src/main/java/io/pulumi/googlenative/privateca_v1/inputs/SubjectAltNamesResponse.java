// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.privateca_v1.inputs.X509ExtensionResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * SubjectAltNames corresponds to a more modern way of listing what the asserted identity is in a certificate (i.e., compared to the "common name" in the distinguished name).
 * 
 */
public final class SubjectAltNamesResponse extends io.pulumi.resources.InvokeArgs {

    public static final SubjectAltNamesResponse Empty = new SubjectAltNamesResponse();

    /**
     * Contains additional subject alternative name values.
     * 
     */
    @Import(name="customSans", required=true)
      private final List<X509ExtensionResponse> customSans;

    public List<X509ExtensionResponse> getCustomSans() {
        return this.customSans;
    }

    /**
     * Contains only valid, fully-qualified host names.
     * 
     */
    @Import(name="dnsNames", required=true)
      private final List<String> dnsNames;

    public List<String> getDnsNames() {
        return this.dnsNames;
    }

    /**
     * Contains only valid RFC 2822 E-mail addresses.
     * 
     */
    @Import(name="emailAddresses", required=true)
      private final List<String> emailAddresses;

    public List<String> getEmailAddresses() {
        return this.emailAddresses;
    }

    /**
     * Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
     * 
     */
    @Import(name="ipAddresses", required=true)
      private final List<String> ipAddresses;

    public List<String> getIpAddresses() {
        return this.ipAddresses;
    }

    /**
     * Contains only valid RFC 3986 URIs.
     * 
     */
    @Import(name="uris", required=true)
      private final List<String> uris;

    public List<String> getUris() {
        return this.uris;
    }

    public SubjectAltNamesResponse(
        List<X509ExtensionResponse> customSans,
        List<String> dnsNames,
        List<String> emailAddresses,
        List<String> ipAddresses,
        List<String> uris) {
        this.customSans = Objects.requireNonNull(customSans, "expected parameter 'customSans' to be non-null");
        this.dnsNames = Objects.requireNonNull(dnsNames, "expected parameter 'dnsNames' to be non-null");
        this.emailAddresses = Objects.requireNonNull(emailAddresses, "expected parameter 'emailAddresses' to be non-null");
        this.ipAddresses = Objects.requireNonNull(ipAddresses, "expected parameter 'ipAddresses' to be non-null");
        this.uris = Objects.requireNonNull(uris, "expected parameter 'uris' to be non-null");
    }

    private SubjectAltNamesResponse() {
        this.customSans = List.of();
        this.dnsNames = List.of();
        this.emailAddresses = List.of();
        this.ipAddresses = List.of();
        this.uris = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubjectAltNamesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<X509ExtensionResponse> customSans;
        private List<String> dnsNames;
        private List<String> emailAddresses;
        private List<String> ipAddresses;
        private List<String> uris;

        public Builder() {
    	      // Empty
        }

        public Builder(SubjectAltNamesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customSans = defaults.customSans;
    	      this.dnsNames = defaults.dnsNames;
    	      this.emailAddresses = defaults.emailAddresses;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.uris = defaults.uris;
        }

        public Builder customSans(List<X509ExtensionResponse> customSans) {
            this.customSans = Objects.requireNonNull(customSans);
            return this;
        }

        public Builder dnsNames(List<String> dnsNames) {
            this.dnsNames = Objects.requireNonNull(dnsNames);
            return this;
        }

        public Builder emailAddresses(List<String> emailAddresses) {
            this.emailAddresses = Objects.requireNonNull(emailAddresses);
            return this;
        }

        public Builder ipAddresses(List<String> ipAddresses) {
            this.ipAddresses = Objects.requireNonNull(ipAddresses);
            return this;
        }

        public Builder uris(List<String> uris) {
            this.uris = Objects.requireNonNull(uris);
            return this;
        }
        public SubjectAltNamesResponse build() {
            return new SubjectAltNamesResponse(customSans, dnsNames, emailAddresses, ipAddresses, uris);
        }
    }
}
