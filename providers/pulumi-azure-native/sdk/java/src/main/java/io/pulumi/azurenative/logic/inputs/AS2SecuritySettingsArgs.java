// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The AS2 agreement security settings.
 * 
 */
public final class AS2SecuritySettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AS2SecuritySettingsArgs Empty = new AS2SecuritySettingsArgs();

    /**
     * The value indicating whether to enable NRR for inbound decoded messages.
     * 
     */
    @Import(name="enableNRRForInboundDecodedMessages", required=true)
      private final Output<Boolean> enableNRRForInboundDecodedMessages;

    public Output<Boolean> getEnableNRRForInboundDecodedMessages() {
        return this.enableNRRForInboundDecodedMessages;
    }

    /**
     * The value indicating whether to enable NRR for inbound encoded messages.
     * 
     */
    @Import(name="enableNRRForInboundEncodedMessages", required=true)
      private final Output<Boolean> enableNRRForInboundEncodedMessages;

    public Output<Boolean> getEnableNRRForInboundEncodedMessages() {
        return this.enableNRRForInboundEncodedMessages;
    }

    /**
     * The value indicating whether to enable NRR for inbound MDN.
     * 
     */
    @Import(name="enableNRRForInboundMDN", required=true)
      private final Output<Boolean> enableNRRForInboundMDN;

    public Output<Boolean> getEnableNRRForInboundMDN() {
        return this.enableNRRForInboundMDN;
    }

    /**
     * The value indicating whether to enable NRR for outbound decoded messages.
     * 
     */
    @Import(name="enableNRRForOutboundDecodedMessages", required=true)
      private final Output<Boolean> enableNRRForOutboundDecodedMessages;

    public Output<Boolean> getEnableNRRForOutboundDecodedMessages() {
        return this.enableNRRForOutboundDecodedMessages;
    }

    /**
     * The value indicating whether to enable NRR for outbound encoded messages.
     * 
     */
    @Import(name="enableNRRForOutboundEncodedMessages", required=true)
      private final Output<Boolean> enableNRRForOutboundEncodedMessages;

    public Output<Boolean> getEnableNRRForOutboundEncodedMessages() {
        return this.enableNRRForOutboundEncodedMessages;
    }

    /**
     * The value indicating whether to enable NRR for outbound MDN.
     * 
     */
    @Import(name="enableNRRForOutboundMDN", required=true)
      private final Output<Boolean> enableNRRForOutboundMDN;

    public Output<Boolean> getEnableNRRForOutboundMDN() {
        return this.enableNRRForOutboundMDN;
    }

    /**
     * The name of the encryption certificate.
     * 
     */
    @Import(name="encryptionCertificateName")
      private final @Nullable Output<String> encryptionCertificateName;

    public Output<String> getEncryptionCertificateName() {
        return this.encryptionCertificateName == null ? Output.empty() : this.encryptionCertificateName;
    }

    /**
     * The value indicating whether to send or request a MDN.
     * 
     */
    @Import(name="overrideGroupSigningCertificate", required=true)
      private final Output<Boolean> overrideGroupSigningCertificate;

    public Output<Boolean> getOverrideGroupSigningCertificate() {
        return this.overrideGroupSigningCertificate;
    }

    /**
     * The Sha2 algorithm format. Valid values are Sha2, ShaHashSize, ShaHyphenHashSize, Sha2UnderscoreHashSize.
     * 
     */
    @Import(name="sha2AlgorithmFormat")
      private final @Nullable Output<String> sha2AlgorithmFormat;

    public Output<String> getSha2AlgorithmFormat() {
        return this.sha2AlgorithmFormat == null ? Output.empty() : this.sha2AlgorithmFormat;
    }

    /**
     * The name of the signing certificate.
     * 
     */
    @Import(name="signingCertificateName")
      private final @Nullable Output<String> signingCertificateName;

    public Output<String> getSigningCertificateName() {
        return this.signingCertificateName == null ? Output.empty() : this.signingCertificateName;
    }

    public AS2SecuritySettingsArgs(
        Output<Boolean> enableNRRForInboundDecodedMessages,
        Output<Boolean> enableNRRForInboundEncodedMessages,
        Output<Boolean> enableNRRForInboundMDN,
        Output<Boolean> enableNRRForOutboundDecodedMessages,
        Output<Boolean> enableNRRForOutboundEncodedMessages,
        Output<Boolean> enableNRRForOutboundMDN,
        @Nullable Output<String> encryptionCertificateName,
        Output<Boolean> overrideGroupSigningCertificate,
        @Nullable Output<String> sha2AlgorithmFormat,
        @Nullable Output<String> signingCertificateName) {
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

    private AS2SecuritySettingsArgs() {
        this.enableNRRForInboundDecodedMessages = Output.empty();
        this.enableNRRForInboundEncodedMessages = Output.empty();
        this.enableNRRForInboundMDN = Output.empty();
        this.enableNRRForOutboundDecodedMessages = Output.empty();
        this.enableNRRForOutboundEncodedMessages = Output.empty();
        this.enableNRRForOutboundMDN = Output.empty();
        this.encryptionCertificateName = Output.empty();
        this.overrideGroupSigningCertificate = Output.empty();
        this.sha2AlgorithmFormat = Output.empty();
        this.signingCertificateName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2SecuritySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> enableNRRForInboundDecodedMessages;
        private Output<Boolean> enableNRRForInboundEncodedMessages;
        private Output<Boolean> enableNRRForInboundMDN;
        private Output<Boolean> enableNRRForOutboundDecodedMessages;
        private Output<Boolean> enableNRRForOutboundEncodedMessages;
        private Output<Boolean> enableNRRForOutboundMDN;
        private @Nullable Output<String> encryptionCertificateName;
        private Output<Boolean> overrideGroupSigningCertificate;
        private @Nullable Output<String> sha2AlgorithmFormat;
        private @Nullable Output<String> signingCertificateName;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2SecuritySettingsArgs defaults) {
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

        public Builder enableNRRForInboundDecodedMessages(Output<Boolean> enableNRRForInboundDecodedMessages) {
            this.enableNRRForInboundDecodedMessages = Objects.requireNonNull(enableNRRForInboundDecodedMessages);
            return this;
        }

        public Builder enableNRRForInboundDecodedMessages(Boolean enableNRRForInboundDecodedMessages) {
            this.enableNRRForInboundDecodedMessages = Output.of(Objects.requireNonNull(enableNRRForInboundDecodedMessages));
            return this;
        }

        public Builder enableNRRForInboundEncodedMessages(Output<Boolean> enableNRRForInboundEncodedMessages) {
            this.enableNRRForInboundEncodedMessages = Objects.requireNonNull(enableNRRForInboundEncodedMessages);
            return this;
        }

        public Builder enableNRRForInboundEncodedMessages(Boolean enableNRRForInboundEncodedMessages) {
            this.enableNRRForInboundEncodedMessages = Output.of(Objects.requireNonNull(enableNRRForInboundEncodedMessages));
            return this;
        }

        public Builder enableNRRForInboundMDN(Output<Boolean> enableNRRForInboundMDN) {
            this.enableNRRForInboundMDN = Objects.requireNonNull(enableNRRForInboundMDN);
            return this;
        }

        public Builder enableNRRForInboundMDN(Boolean enableNRRForInboundMDN) {
            this.enableNRRForInboundMDN = Output.of(Objects.requireNonNull(enableNRRForInboundMDN));
            return this;
        }

        public Builder enableNRRForOutboundDecodedMessages(Output<Boolean> enableNRRForOutboundDecodedMessages) {
            this.enableNRRForOutboundDecodedMessages = Objects.requireNonNull(enableNRRForOutboundDecodedMessages);
            return this;
        }

        public Builder enableNRRForOutboundDecodedMessages(Boolean enableNRRForOutboundDecodedMessages) {
            this.enableNRRForOutboundDecodedMessages = Output.of(Objects.requireNonNull(enableNRRForOutboundDecodedMessages));
            return this;
        }

        public Builder enableNRRForOutboundEncodedMessages(Output<Boolean> enableNRRForOutboundEncodedMessages) {
            this.enableNRRForOutboundEncodedMessages = Objects.requireNonNull(enableNRRForOutboundEncodedMessages);
            return this;
        }

        public Builder enableNRRForOutboundEncodedMessages(Boolean enableNRRForOutboundEncodedMessages) {
            this.enableNRRForOutboundEncodedMessages = Output.of(Objects.requireNonNull(enableNRRForOutboundEncodedMessages));
            return this;
        }

        public Builder enableNRRForOutboundMDN(Output<Boolean> enableNRRForOutboundMDN) {
            this.enableNRRForOutboundMDN = Objects.requireNonNull(enableNRRForOutboundMDN);
            return this;
        }

        public Builder enableNRRForOutboundMDN(Boolean enableNRRForOutboundMDN) {
            this.enableNRRForOutboundMDN = Output.of(Objects.requireNonNull(enableNRRForOutboundMDN));
            return this;
        }

        public Builder encryptionCertificateName(@Nullable Output<String> encryptionCertificateName) {
            this.encryptionCertificateName = encryptionCertificateName;
            return this;
        }

        public Builder encryptionCertificateName(@Nullable String encryptionCertificateName) {
            this.encryptionCertificateName = Output.ofNullable(encryptionCertificateName);
            return this;
        }

        public Builder overrideGroupSigningCertificate(Output<Boolean> overrideGroupSigningCertificate) {
            this.overrideGroupSigningCertificate = Objects.requireNonNull(overrideGroupSigningCertificate);
            return this;
        }

        public Builder overrideGroupSigningCertificate(Boolean overrideGroupSigningCertificate) {
            this.overrideGroupSigningCertificate = Output.of(Objects.requireNonNull(overrideGroupSigningCertificate));
            return this;
        }

        public Builder sha2AlgorithmFormat(@Nullable Output<String> sha2AlgorithmFormat) {
            this.sha2AlgorithmFormat = sha2AlgorithmFormat;
            return this;
        }

        public Builder sha2AlgorithmFormat(@Nullable String sha2AlgorithmFormat) {
            this.sha2AlgorithmFormat = Output.ofNullable(sha2AlgorithmFormat);
            return this;
        }

        public Builder signingCertificateName(@Nullable Output<String> signingCertificateName) {
            this.signingCertificateName = signingCertificateName;
            return this;
        }

        public Builder signingCertificateName(@Nullable String signingCertificateName) {
            this.signingCertificateName = Output.ofNullable(signingCertificateName);
            return this;
        }
        public AS2SecuritySettingsArgs build() {
            return new AS2SecuritySettingsArgs(enableNRRForInboundDecodedMessages, enableNRRForInboundEncodedMessages, enableNRRForInboundMDN, enableNRRForOutboundDecodedMessages, enableNRRForOutboundEncodedMessages, enableNRRForOutboundMDN, encryptionCertificateName, overrideGroupSigningCertificate, sha2AlgorithmFormat, signingCertificateName);
        }
    }
}
