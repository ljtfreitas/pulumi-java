// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.appengine.v1.inputs.CertificateRawDataArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthorizedCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthorizedCertificateArgs Empty = new AuthorizedCertificateArgs();

    @Import(name="appId", required=true)
    private Output<String> appId;

    public Output<String> appId() {
        return this.appId;
    }

    /**
     * The SSL certificate serving the AuthorizedCertificate resource. This must be obtained independently from a certificate authority.
     * 
     */
    @Import(name="certificateRawData")
    private @Nullable Output<CertificateRawDataArgs> certificateRawData;

    /**
     * @return The SSL certificate serving the AuthorizedCertificate resource. This must be obtained independently from a certificate authority.
     * 
     */
    public Optional<Output<CertificateRawDataArgs>> certificateRawData() {
        return Optional.ofNullable(this.certificateRawData);
    }

    /**
     * The user-specified display name of the certificate. This is not guaranteed to be unique. Example: My Certificate.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return The user-specified display name of the certificate. This is not guaranteed to be unique. Example: My Certificate.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    private AuthorizedCertificateArgs() {}

    private AuthorizedCertificateArgs(AuthorizedCertificateArgs $) {
        this.appId = $.appId;
        this.certificateRawData = $.certificateRawData;
        this.displayName = $.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthorizedCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorizedCertificateArgs $;

        public Builder() {
            $ = new AuthorizedCertificateArgs();
        }

        public Builder(AuthorizedCertificateArgs defaults) {
            $ = new AuthorizedCertificateArgs(Objects.requireNonNull(defaults));
        }

        public Builder appId(Output<String> appId) {
            $.appId = appId;
            return this;
        }

        public Builder appId(String appId) {
            return appId(Output.of(appId));
        }

        /**
         * @param certificateRawData The SSL certificate serving the AuthorizedCertificate resource. This must be obtained independently from a certificate authority.
         * 
         * @return builder
         * 
         */
        public Builder certificateRawData(@Nullable Output<CertificateRawDataArgs> certificateRawData) {
            $.certificateRawData = certificateRawData;
            return this;
        }

        /**
         * @param certificateRawData The SSL certificate serving the AuthorizedCertificate resource. This must be obtained independently from a certificate authority.
         * 
         * @return builder
         * 
         */
        public Builder certificateRawData(CertificateRawDataArgs certificateRawData) {
            return certificateRawData(Output.of(certificateRawData));
        }

        /**
         * @param displayName The user-specified display name of the certificate. This is not guaranteed to be unique. Example: My Certificate.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName The user-specified display name of the certificate. This is not guaranteed to be unique. Example: My Certificate.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        public AuthorizedCertificateArgs build() {
            $.appId = Objects.requireNonNull($.appId, "expected parameter 'appId' to be non-null");
            return $;
        }
    }

}
