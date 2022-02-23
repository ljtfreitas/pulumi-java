// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigatewayv2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DomainNameMutualTlsAuthentication {
    /**
     * An Amazon S3 URL that specifies the truststore for mutual TLS authentication, for example, `s3://bucket-name/key-name`.
     * The truststore can contain certificates from public or private certificate authorities. To update the truststore, upload a new version to S3, and then update your custom domain name to use the new version.
     * 
     */
    private final String truststoreUri;
    /**
     * The version of the S3 object that contains the truststore. To specify a version, you must have versioning enabled for the S3 bucket.
     * 
     */
    private final @Nullable String truststoreVersion;

    @OutputCustomType.Constructor({"truststoreUri","truststoreVersion"})
    private DomainNameMutualTlsAuthentication(
        String truststoreUri,
        @Nullable String truststoreVersion) {
        this.truststoreUri = Objects.requireNonNull(truststoreUri);
        this.truststoreVersion = truststoreVersion;
    }

    /**
     * An Amazon S3 URL that specifies the truststore for mutual TLS authentication, for example, `s3://bucket-name/key-name`.
     * The truststore can contain certificates from public or private certificate authorities. To update the truststore, upload a new version to S3, and then update your custom domain name to use the new version.
     * 
     */
    public String getTruststoreUri() {
        return this.truststoreUri;
    }
    /**
     * The version of the S3 object that contains the truststore. To specify a version, you must have versioning enabled for the S3 bucket.
     * 
     */
    public Optional<String> getTruststoreVersion() {
        return Optional.ofNullable(this.truststoreVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainNameMutualTlsAuthentication defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String truststoreUri;
        private @Nullable String truststoreVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainNameMutualTlsAuthentication defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.truststoreUri = defaults.truststoreUri;
    	      this.truststoreVersion = defaults.truststoreVersion;
        }

        public Builder setTruststoreUri(String truststoreUri) {
            this.truststoreUri = Objects.requireNonNull(truststoreUri);
            return this;
        }

        public Builder setTruststoreVersion(@Nullable String truststoreVersion) {
            this.truststoreVersion = truststoreVersion;
            return this;
        }
        public DomainNameMutualTlsAuthentication build() {
            return new DomainNameMutualTlsAuthentication(truststoreUri, truststoreVersion);
        }
    }
}
