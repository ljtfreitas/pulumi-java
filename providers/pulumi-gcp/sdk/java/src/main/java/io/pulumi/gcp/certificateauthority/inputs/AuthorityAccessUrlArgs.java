// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AuthorityAccessUrlArgs extends io.pulumi.resources.ResourceArgs {

    public static final AuthorityAccessUrlArgs Empty = new AuthorityAccessUrlArgs();

    @Import(name="caCertificateAccessUrl")
      private final @Nullable Output<String> caCertificateAccessUrl;

    public Output<String> getCaCertificateAccessUrl() {
        return this.caCertificateAccessUrl == null ? Output.empty() : this.caCertificateAccessUrl;
    }

    @Import(name="crlAccessUrls")
      private final @Nullable Output<List<String>> crlAccessUrls;

    public Output<List<String>> getCrlAccessUrls() {
        return this.crlAccessUrls == null ? Output.empty() : this.crlAccessUrls;
    }

    public AuthorityAccessUrlArgs(
        @Nullable Output<String> caCertificateAccessUrl,
        @Nullable Output<List<String>> crlAccessUrls) {
        this.caCertificateAccessUrl = caCertificateAccessUrl;
        this.crlAccessUrls = crlAccessUrls;
    }

    private AuthorityAccessUrlArgs() {
        this.caCertificateAccessUrl = Output.empty();
        this.crlAccessUrls = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorityAccessUrlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> caCertificateAccessUrl;
        private @Nullable Output<List<String>> crlAccessUrls;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorityAccessUrlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caCertificateAccessUrl = defaults.caCertificateAccessUrl;
    	      this.crlAccessUrls = defaults.crlAccessUrls;
        }

        public Builder caCertificateAccessUrl(@Nullable Output<String> caCertificateAccessUrl) {
            this.caCertificateAccessUrl = caCertificateAccessUrl;
            return this;
        }

        public Builder caCertificateAccessUrl(@Nullable String caCertificateAccessUrl) {
            this.caCertificateAccessUrl = Output.ofNullable(caCertificateAccessUrl);
            return this;
        }

        public Builder crlAccessUrls(@Nullable Output<List<String>> crlAccessUrls) {
            this.crlAccessUrls = crlAccessUrls;
            return this;
        }

        public Builder crlAccessUrls(@Nullable List<String> crlAccessUrls) {
            this.crlAccessUrls = Output.ofNullable(crlAccessUrls);
            return this;
        }
        public AuthorityAccessUrlArgs build() {
            return new AuthorityAccessUrlArgs(caCertificateAccessUrl, crlAccessUrls);
        }
    }
}
