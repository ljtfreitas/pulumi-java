// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AS2ValidationSettingsResponse {
    private final Boolean checkCertificateRevocationListOnReceive;
    private final Boolean checkCertificateRevocationListOnSend;
    private final Boolean checkDuplicateMessage;
    private final Boolean compressMessage;
    private final Boolean encryptMessage;
    private final String encryptionAlgorithm;
    private final Integer interchangeDuplicatesValidityDays;
    private final Boolean overrideMessageProperties;
    private final Boolean signMessage;
    private final @Nullable String signingAlgorithm;

    @OutputCustomType.Constructor({"checkCertificateRevocationListOnReceive","checkCertificateRevocationListOnSend","checkDuplicateMessage","compressMessage","encryptMessage","encryptionAlgorithm","interchangeDuplicatesValidityDays","overrideMessageProperties","signMessage","signingAlgorithm"})
    private AS2ValidationSettingsResponse(
        Boolean checkCertificateRevocationListOnReceive,
        Boolean checkCertificateRevocationListOnSend,
        Boolean checkDuplicateMessage,
        Boolean compressMessage,
        Boolean encryptMessage,
        String encryptionAlgorithm,
        Integer interchangeDuplicatesValidityDays,
        Boolean overrideMessageProperties,
        Boolean signMessage,
        @Nullable String signingAlgorithm) {
        this.checkCertificateRevocationListOnReceive = Objects.requireNonNull(checkCertificateRevocationListOnReceive);
        this.checkCertificateRevocationListOnSend = Objects.requireNonNull(checkCertificateRevocationListOnSend);
        this.checkDuplicateMessage = Objects.requireNonNull(checkDuplicateMessage);
        this.compressMessage = Objects.requireNonNull(compressMessage);
        this.encryptMessage = Objects.requireNonNull(encryptMessage);
        this.encryptionAlgorithm = Objects.requireNonNull(encryptionAlgorithm);
        this.interchangeDuplicatesValidityDays = Objects.requireNonNull(interchangeDuplicatesValidityDays);
        this.overrideMessageProperties = Objects.requireNonNull(overrideMessageProperties);
        this.signMessage = Objects.requireNonNull(signMessage);
        this.signingAlgorithm = signingAlgorithm;
    }

    public Boolean getCheckCertificateRevocationListOnReceive() {
        return this.checkCertificateRevocationListOnReceive;
    }
    public Boolean getCheckCertificateRevocationListOnSend() {
        return this.checkCertificateRevocationListOnSend;
    }
    public Boolean getCheckDuplicateMessage() {
        return this.checkDuplicateMessage;
    }
    public Boolean getCompressMessage() {
        return this.compressMessage;
    }
    public Boolean getEncryptMessage() {
        return this.encryptMessage;
    }
    public String getEncryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }
    public Integer getInterchangeDuplicatesValidityDays() {
        return this.interchangeDuplicatesValidityDays;
    }
    public Boolean getOverrideMessageProperties() {
        return this.overrideMessageProperties;
    }
    public Boolean getSignMessage() {
        return this.signMessage;
    }
    public Optional<String> getSigningAlgorithm() {
        return Optional.ofNullable(this.signingAlgorithm);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2ValidationSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean checkCertificateRevocationListOnReceive;
        private Boolean checkCertificateRevocationListOnSend;
        private Boolean checkDuplicateMessage;
        private Boolean compressMessage;
        private Boolean encryptMessage;
        private String encryptionAlgorithm;
        private Integer interchangeDuplicatesValidityDays;
        private Boolean overrideMessageProperties;
        private Boolean signMessage;
        private @Nullable String signingAlgorithm;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2ValidationSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkCertificateRevocationListOnReceive = defaults.checkCertificateRevocationListOnReceive;
    	      this.checkCertificateRevocationListOnSend = defaults.checkCertificateRevocationListOnSend;
    	      this.checkDuplicateMessage = defaults.checkDuplicateMessage;
    	      this.compressMessage = defaults.compressMessage;
    	      this.encryptMessage = defaults.encryptMessage;
    	      this.encryptionAlgorithm = defaults.encryptionAlgorithm;
    	      this.interchangeDuplicatesValidityDays = defaults.interchangeDuplicatesValidityDays;
    	      this.overrideMessageProperties = defaults.overrideMessageProperties;
    	      this.signMessage = defaults.signMessage;
    	      this.signingAlgorithm = defaults.signingAlgorithm;
        }

        public Builder setCheckCertificateRevocationListOnReceive(Boolean checkCertificateRevocationListOnReceive) {
            this.checkCertificateRevocationListOnReceive = Objects.requireNonNull(checkCertificateRevocationListOnReceive);
            return this;
        }

        public Builder setCheckCertificateRevocationListOnSend(Boolean checkCertificateRevocationListOnSend) {
            this.checkCertificateRevocationListOnSend = Objects.requireNonNull(checkCertificateRevocationListOnSend);
            return this;
        }

        public Builder setCheckDuplicateMessage(Boolean checkDuplicateMessage) {
            this.checkDuplicateMessage = Objects.requireNonNull(checkDuplicateMessage);
            return this;
        }

        public Builder setCompressMessage(Boolean compressMessage) {
            this.compressMessage = Objects.requireNonNull(compressMessage);
            return this;
        }

        public Builder setEncryptMessage(Boolean encryptMessage) {
            this.encryptMessage = Objects.requireNonNull(encryptMessage);
            return this;
        }

        public Builder setEncryptionAlgorithm(String encryptionAlgorithm) {
            this.encryptionAlgorithm = Objects.requireNonNull(encryptionAlgorithm);
            return this;
        }

        public Builder setInterchangeDuplicatesValidityDays(Integer interchangeDuplicatesValidityDays) {
            this.interchangeDuplicatesValidityDays = Objects.requireNonNull(interchangeDuplicatesValidityDays);
            return this;
        }

        public Builder setOverrideMessageProperties(Boolean overrideMessageProperties) {
            this.overrideMessageProperties = Objects.requireNonNull(overrideMessageProperties);
            return this;
        }

        public Builder setSignMessage(Boolean signMessage) {
            this.signMessage = Objects.requireNonNull(signMessage);
            return this;
        }

        public Builder setSigningAlgorithm(@Nullable String signingAlgorithm) {
            this.signingAlgorithm = signingAlgorithm;
            return this;
        }

        public AS2ValidationSettingsResponse build() {
            return new AS2ValidationSettingsResponse(checkCertificateRevocationListOnReceive, checkCertificateRevocationListOnSend, checkDuplicateMessage, compressMessage, encryptMessage, encryptionAlgorithm, interchangeDuplicatesValidityDays, overrideMessageProperties, signMessage, signingAlgorithm);
        }
    }
}