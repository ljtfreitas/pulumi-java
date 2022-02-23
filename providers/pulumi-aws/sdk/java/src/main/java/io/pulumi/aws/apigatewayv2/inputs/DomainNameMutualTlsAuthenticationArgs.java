// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainNameMutualTlsAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainNameMutualTlsAuthenticationArgs Empty = new DomainNameMutualTlsAuthenticationArgs();

    /**
     * An Amazon S3 URL that specifies the truststore for mutual TLS authentication, for example, `s3://bucket-name/key-name`.
     * The truststore can contain certificates from public or private certificate authorities. To update the truststore, upload a new version to S3, and then update your custom domain name to use the new version.
     * 
     */
    @InputImport(name="truststoreUri", required=true)
    private final Input<String> truststoreUri;

    public Input<String> getTruststoreUri() {
        return this.truststoreUri;
    }

    /**
     * The version of the S3 object that contains the truststore. To specify a version, you must have versioning enabled for the S3 bucket.
     * 
     */
    @InputImport(name="truststoreVersion")
    private final @Nullable Input<String> truststoreVersion;

    public Input<String> getTruststoreVersion() {
        return this.truststoreVersion == null ? Input.empty() : this.truststoreVersion;
    }

    public DomainNameMutualTlsAuthenticationArgs(
        Input<String> truststoreUri,
        @Nullable Input<String> truststoreVersion) {
        this.truststoreUri = Objects.requireNonNull(truststoreUri, "expected parameter 'truststoreUri' to be non-null");
        this.truststoreVersion = truststoreVersion;
    }

    private DomainNameMutualTlsAuthenticationArgs() {
        this.truststoreUri = Input.empty();
        this.truststoreVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainNameMutualTlsAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> truststoreUri;
        private @Nullable Input<String> truststoreVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainNameMutualTlsAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.truststoreUri = defaults.truststoreUri;
    	      this.truststoreVersion = defaults.truststoreVersion;
        }

        public Builder setTruststoreUri(Input<String> truststoreUri) {
            this.truststoreUri = Objects.requireNonNull(truststoreUri);
            return this;
        }

        public Builder setTruststoreUri(String truststoreUri) {
            this.truststoreUri = Input.of(Objects.requireNonNull(truststoreUri));
            return this;
        }

        public Builder setTruststoreVersion(@Nullable Input<String> truststoreVersion) {
            this.truststoreVersion = truststoreVersion;
            return this;
        }

        public Builder setTruststoreVersion(@Nullable String truststoreVersion) {
            this.truststoreVersion = Input.ofNullable(truststoreVersion);
            return this;
        }
        public DomainNameMutualTlsAuthenticationArgs build() {
            return new DomainNameMutualTlsAuthenticationArgs(truststoreUri, truststoreVersion);
        }
    }
}
