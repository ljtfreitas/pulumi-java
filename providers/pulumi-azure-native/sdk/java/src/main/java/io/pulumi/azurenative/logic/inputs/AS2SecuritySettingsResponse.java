// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The AS2 agreement security settings.
 * 
 */
public final class AS2SecuritySettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AS2SecuritySettingsResponse Empty = new AS2SecuritySettingsResponse();

    /**
     * The value indicating whether to enable NRR for inbound decoded messages.
     * 
     */
    @InputImport(name="enableNRRForInboundDecodedMessages", required=true)
        private final Boolean enableNRRForInboundDecodedMessages;

    public Boolean getEnableNRRForInboundDecodedMessages() {
        return this.enableNRRForInboundDecodedMessages;
    }

    /**
     * The value indicating whether to enable NRR for inbound encoded messages.
     * 
     */
    @InputImport(name="enableNRRForInboundEncodedMessages", required=true)
        private final Boolean enableNRRForInboundEncodedMessages;

    public Boolean getEnableNRRForInboundEncodedMessages() {
        return this.enableNRRForInboundEncodedMessages;
    }

    /**
     * The value indicating whether to enable NRR for inbound MDN.
     * 
     */
    @InputImport(name="enableNRRForInboundMDN", required=true)
        private final Boolean enableNRRForInboundMDN;

    public Boolean getEnableNRRForInboundMDN() {
        return this.enableNRRForInboundMDN;
    }

    /**
     * The value indicating whether to enable NRR for outbound decoded messages.
     * 
     */
    @InputImport(name="enableNRRForOutboundDecodedMessages", required=true)
        private final Boolean enableNRRForOutboundDecodedMessages;

    public Boolean getEnableNRRForOutboundDecodedMessages() {
        return this.enableNRRForOutboundDecodedMessages;
    }

    /**
     * The value indicating whether to enable NRR for outbound encoded messages.
     * 
     */
    @InputImport(name="enableNRRForOutboundEncodedMessages", required=true)
        private final Boolean enableNRRForOutboundEncodedMessages;

    public Boolean getEnableNRRForOutboundEncodedMessages() {
        return this.enableNRRForOutboundEncodedMessages;
    }

    /**
     * The value indicating whether to enable NRR for outbound MDN.
     * 
     */
    @InputImport(name="enableNRRForOutboundMDN", required=true)
        private final Boolean enableNRRForOutboundMDN;

    public Boolean getEnableNRRForOutboundMDN() {
        return this.enableNRRForOutboundMDN;
    }

    /**
     * The name of the encryption certificate.
     * 
     */
    @InputImport(name="encryptionCertificateName")
        private final @Nullable String encryptionCertificateName;

    public Optional<String> getEncryptionCertificateName() {
        return this.encryptionCertificateName == null ? Optional.empty() : Optional.ofNullable(this.encryptionCertificateName);
    }

    /**
     * The value indicating whether to send or request a MDN.
     * 
     */
    @InputImport(name="overrideGroupSigningCertificate", required=true)
        private final Boolean overrideGroupSigningCertificate;

    public Boolean getOverrideGroupSigningCertificate() {
        return this.overrideGroupSigningCertificate;
    }

    /**
     * The Sha2 algorithm format. Valid values are Sha2, ShaHashSize, ShaHyphenHashSize, Sha2UnderscoreHashSize.
     * 
     */
    @InputImport(name="sha2AlgorithmFormat")
        private final @Nullable String sha2AlgorithmFormat;

    public Optional<String> getSha2AlgorithmFormat() {
        return this.sha2AlgorithmFormat == null ? Optional.empty() : Optional.ofNullable(this.sha2AlgorithmFormat);
    }

    /**
     * The name of the signing certificate.
     * 
     */
    @InputImport(name="signingCertificateName")
        private final @Nullable String signingCertificateName;

    public Optional<String> getSigningCertificateName() {
        return this.signingCertificateName == null ? Optional.empty() : Optional.ofNullable(this.signingCertificateName);
    }

    public AS2SecuritySettingsResponse(
        Boolean enableNRRForInboundDecodedMessages,
        Boolean enableNRRForInboundEncodedMessages,
        Boolean enableNRRForInboundMDN,
        Boolean enableNRRForOutboundDecodedMessages,
        Boolean enableNRRForOutboundEncodedMessages,
        Boolean enableNRRForOutboundMDN,
        @Nullable String encryptionCertificateName,
        Boolean overrideGroupSigningCertificate,
        @Nullable String sha2AlgorithmFormat,
        @Nullable String signingCertificateName) {
        this.enableNRRForInboundDecodedMessages = Objects.requireNonNull(enableNRRForInboundDecodedMessages, "expected parameter 'enableNRRForInboundDecodedMessages' to be non-null");
        this.enableNRRForInboundEncodedMessages = Objects.requireNonNull(enableNRRForInboundEncodedMessages, "expected parameter 'enableNRRForInboundEncodedMessages' to be non-null");
        this.enableNRRForInboundMDN = Objects.requireNonNull(enableNRRForInboundMDN, "expected parameter 'enableNRRForInboundMDN' to be non-null");
        this.enableNRRForOutboundDecodedMessages = Objects.requireNonNull(enableNRRForOutboundDecodedMessages, "expected parameter 'enableNRRForOutboundDecodedMessages' to be non-null");
        this.enableNRRForOutboundEncodedMessages = Objects.requireNonNull(enableNRRForOutboundEncodedMessages, "expected parameter 'enableNRRForOutboundEncodedMessages' to be non-null");
        this.enableNRRForOutboundMDN = Objects.requireNonNull(enableNRRForOutboundMDN, "expected parameter 'enableNRRForOutboundMDN' to be non-null");
        this.encryptionCertificateName = encryptionCertificateName;
        this.overrideGroupSigningCertificate = Objects.requireNonNull(overrideGroupSigningCertificate, "expected parameter 'overrideGroupSigningCertificate' to be non-null");
        this.sha2AlgorithmFormat = sha2AlgorithmFormat;
        this.signingCertificateName = signingCertificateName;
    }

    private AS2SecuritySettingsResponse() {
        this.enableNRRForInboundDecodedMessages = null;
        this.enableNRRForInboundEncodedMessages = null;
        this.enableNRRForInboundMDN = null;
        this.enableNRRForOutboundDecodedMessages = null;
        this.enableNRRForOutboundEncodedMessages = null;
        this.enableNRRForOutboundMDN = null;
        this.encryptionCertificateName = null;
        this.overrideGroupSigningCertificate = null;
        this.sha2AlgorithmFormat = null;
        this.signingCertificateName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2SecuritySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableNRRForInboundDecodedMessages;
        private Boolean enableNRRForInboundEncodedMessages;
        private Boolean enableNRRForInboundMDN;
        private Boolean enableNRRForOutboundDecodedMessages;
        private Boolean enableNRRForOutboundEncodedMessages;
        private Boolean enableNRRForOutboundMDN;
        private @Nullable String encryptionCertificateName;
        private Boolean overrideGroupSigningCertificate;
        private @Nullable String sha2AlgorithmFormat;
        private @Nullable String signingCertificateName;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2SecuritySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableNRRForInboundDecodedMessages = defaults.enableNRRForInboundDecodedMessages;
    	      this.enableNRRForInboundEncodedMessages = defaults.enableNRRForInboundEncodedMessages;
    	      this.enableNRRForInboundMDN = defaults.enableNRRForInboundMDN;
    	      this.enableNRRForOutboundDecodedMessages = defaults.enableNRRForOutboundDecodedMessages;
    	      this.enableNRRForOutboundEncodedMessages = defaults.enableNRRForOutboundEncodedMessages;
    	      this.enableNRRForOutboundMDN = defaults.enableNRRForOutboundMDN;
    	      this.encryptionCertificateName = defaults.encryptionCertificateName;
    	      this.overrideGroupSigningCertificate = defaults.overrideGroupSigningCertificate;
    	      this.sha2AlgorithmFormat = defaults.sha2AlgorithmFormat;
    	      this.signingCertificateName = defaults.signingCertificateName;
        }

        public Builder setEnableNRRForInboundDecodedMessages(Boolean enableNRRForInboundDecodedMessages) {
            this.enableNRRForInboundDecodedMessages = Objects.requireNonNull(enableNRRForInboundDecodedMessages);
            return this;
        }

        public Builder setEnableNRRForInboundEncodedMessages(Boolean enableNRRForInboundEncodedMessages) {
            this.enableNRRForInboundEncodedMessages = Objects.requireNonNull(enableNRRForInboundEncodedMessages);
            return this;
        }

        public Builder setEnableNRRForInboundMDN(Boolean enableNRRForInboundMDN) {
            this.enableNRRForInboundMDN = Objects.requireNonNull(enableNRRForInboundMDN);
            return this;
        }

        public Builder setEnableNRRForOutboundDecodedMessages(Boolean enableNRRForOutboundDecodedMessages) {
            this.enableNRRForOutboundDecodedMessages = Objects.requireNonNull(enableNRRForOutboundDecodedMessages);
            return this;
        }

        public Builder setEnableNRRForOutboundEncodedMessages(Boolean enableNRRForOutboundEncodedMessages) {
            this.enableNRRForOutboundEncodedMessages = Objects.requireNonNull(enableNRRForOutboundEncodedMessages);
            return this;
        }

        public Builder setEnableNRRForOutboundMDN(Boolean enableNRRForOutboundMDN) {
            this.enableNRRForOutboundMDN = Objects.requireNonNull(enableNRRForOutboundMDN);
            return this;
        }

        public Builder setEncryptionCertificateName(@Nullable String encryptionCertificateName) {
            this.encryptionCertificateName = encryptionCertificateName;
            return this;
        }

        public Builder setOverrideGroupSigningCertificate(Boolean overrideGroupSigningCertificate) {
            this.overrideGroupSigningCertificate = Objects.requireNonNull(overrideGroupSigningCertificate);
            return this;
        }

        public Builder setSha2AlgorithmFormat(@Nullable String sha2AlgorithmFormat) {
            this.sha2AlgorithmFormat = sha2AlgorithmFormat;
            return this;
        }

        public Builder setSigningCertificateName(@Nullable String signingCertificateName) {
            this.signingCertificateName = signingCertificateName;
            return this;
        }
        public AS2SecuritySettingsResponse build() {
            return new AS2SecuritySettingsResponse(enableNRRForInboundDecodedMessages, enableNRRForInboundEncodedMessages, enableNRRForInboundMDN, enableNRRForOutboundDecodedMessages, enableNRRForOutboundEncodedMessages, enableNRRForOutboundMDN, encryptionCertificateName, overrideGroupSigningCertificate, sha2AlgorithmFormat, signingCertificateName);
        }
    }
}
