// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorityConfigSubjectConfigSubjectAltNameGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorityConfigSubjectConfigSubjectAltNameGetArgs Empty = new AuthorityConfigSubjectConfigSubjectAltNameGetArgs();

    /**
     * Contains only valid, fully-qualified host names.
     * 
     */
    @Import(name="dnsNames")
      private final @Nullable Output<List<String>> dnsNames;

    public Output<List<String>> dnsNames() {
        return this.dnsNames == null ? Codegen.empty() : this.dnsNames;
    }

    /**
     * Contains only valid RFC 2822 E-mail addresses.
     * 
     */
    @Import(name="emailAddresses")
      private final @Nullable Output<List<String>> emailAddresses;

    public Output<List<String>> emailAddresses() {
        return this.emailAddresses == null ? Codegen.empty() : this.emailAddresses;
    }

    /**
     * Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
     * 
     */
    @Import(name="ipAddresses")
      private final @Nullable Output<List<String>> ipAddresses;

    public Output<List<String>> ipAddresses() {
        return this.ipAddresses == null ? Codegen.empty() : this.ipAddresses;
    }

    /**
     * Contains only valid RFC 3986 URIs.
     * 
     */
    @Import(name="uris")
      private final @Nullable Output<List<String>> uris;

    public Output<List<String>> uris() {
        return this.uris == null ? Codegen.empty() : this.uris;
    }

    public AuthorityConfigSubjectConfigSubjectAltNameGetArgs(
        @Nullable Output<List<String>> dnsNames,
        @Nullable Output<List<String>> emailAddresses,
        @Nullable Output<List<String>> ipAddresses,
        @Nullable Output<List<String>> uris) {
        this.dnsNames = dnsNames;
        this.emailAddresses = emailAddresses;
        this.ipAddresses = ipAddresses;
        this.uris = uris;
    }

    private AuthorityConfigSubjectConfigSubjectAltNameGetArgs() {
        this.dnsNames = Codegen.empty();
        this.emailAddresses = Codegen.empty();
        this.ipAddresses = Codegen.empty();
        this.uris = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityConfigSubjectConfigSubjectAltNameGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> dnsNames;
        private @Nullable Output<List<String>> emailAddresses;
        private @Nullable Output<List<String>> ipAddresses;
        private @Nullable Output<List<String>> uris;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityConfigSubjectConfigSubjectAltNameGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsNames = defaults.dnsNames;
    	      this.emailAddresses = defaults.emailAddresses;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.uris = defaults.uris;
        }

        public Builder dnsNames(@Nullable Output<List<String>> dnsNames) {
            this.dnsNames = dnsNames;
            return this;
        }
        public Builder dnsNames(@Nullable List<String> dnsNames) {
            this.dnsNames = Codegen.ofNullable(dnsNames);
            return this;
        }
        public Builder dnsNames(String... dnsNames) {
            return dnsNames(List.of(dnsNames));
        }
        public Builder emailAddresses(@Nullable Output<List<String>> emailAddresses) {
            this.emailAddresses = emailAddresses;
            return this;
        }
        public Builder emailAddresses(@Nullable List<String> emailAddresses) {
            this.emailAddresses = Codegen.ofNullable(emailAddresses);
            return this;
        }
        public Builder emailAddresses(String... emailAddresses) {
            return emailAddresses(List.of(emailAddresses));
        }
        public Builder ipAddresses(@Nullable Output<List<String>> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public Builder ipAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = Codegen.ofNullable(ipAddresses);
            return this;
        }
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }
        public Builder uris(@Nullable Output<List<String>> uris) {
            this.uris = uris;
            return this;
        }
        public Builder uris(@Nullable List<String> uris) {
            this.uris = Codegen.ofNullable(uris);
            return this;
        }
        public Builder uris(String... uris) {
            return uris(List.of(uris));
        }        public AuthorityConfigSubjectConfigSubjectAltNameGetArgs build() {
            return new AuthorityConfigSubjectConfigSubjectAltNameGetArgs(dnsNames, emailAddresses, ipAddresses, uris);
        }
    }
}
