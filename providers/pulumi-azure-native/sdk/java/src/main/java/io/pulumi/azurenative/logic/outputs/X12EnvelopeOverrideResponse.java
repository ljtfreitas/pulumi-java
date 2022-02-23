// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class X12EnvelopeOverrideResponse {
    /**
     * The date format.
     * 
     */
    private final String dateFormat;
    /**
     * The functional identifier code.
     * 
     */
    private final @Nullable String functionalIdentifierCode;
    /**
     * The header version.
     * 
     */
    private final String headerVersion;
    /**
     * The message id on which this envelope settings has to be applied.
     * 
     */
    private final String messageId;
    /**
     * The protocol version on which this envelope settings has to be applied.
     * 
     */
    private final String protocolVersion;
    /**
     * The receiver application id.
     * 
     */
    private final String receiverApplicationId;
    /**
     * The responsible agency code.
     * 
     */
    private final String responsibleAgencyCode;
    /**
     * The sender application id.
     * 
     */
    private final String senderApplicationId;
    /**
     * The target namespace on which this envelope settings has to be applied.
     * 
     */
    private final String targetNamespace;
    /**
     * The time format.
     * 
     */
    private final String timeFormat;

    @OutputCustomType.Constructor({"dateFormat","functionalIdentifierCode","headerVersion","messageId","protocolVersion","receiverApplicationId","responsibleAgencyCode","senderApplicationId","targetNamespace","timeFormat"})
    private X12EnvelopeOverrideResponse(
        String dateFormat,
        @Nullable String functionalIdentifierCode,
        String headerVersion,
        String messageId,
        String protocolVersion,
        String receiverApplicationId,
        String responsibleAgencyCode,
        String senderApplicationId,
        String targetNamespace,
        String timeFormat) {
        this.dateFormat = Objects.requireNonNull(dateFormat);
        this.functionalIdentifierCode = functionalIdentifierCode;
        this.headerVersion = Objects.requireNonNull(headerVersion);
        this.messageId = Objects.requireNonNull(messageId);
        this.protocolVersion = Objects.requireNonNull(protocolVersion);
        this.receiverApplicationId = Objects.requireNonNull(receiverApplicationId);
        this.responsibleAgencyCode = Objects.requireNonNull(responsibleAgencyCode);
        this.senderApplicationId = Objects.requireNonNull(senderApplicationId);
        this.targetNamespace = Objects.requireNonNull(targetNamespace);
        this.timeFormat = Objects.requireNonNull(timeFormat);
    }

    /**
     * The date format.
     * 
     */
    public String getDateFormat() {
        return this.dateFormat;
    }
    /**
     * The functional identifier code.
     * 
     */
    public Optional<String> getFunctionalIdentifierCode() {
        return Optional.ofNullable(this.functionalIdentifierCode);
    }
    /**
     * The header version.
     * 
     */
    public String getHeaderVersion() {
        return this.headerVersion;
    }
    /**
     * The message id on which this envelope settings has to be applied.
     * 
     */
    public String getMessageId() {
        return this.messageId;
    }
    /**
     * The protocol version on which this envelope settings has to be applied.
     * 
     */
    public String getProtocolVersion() {
        return this.protocolVersion;
    }
    /**
     * The receiver application id.
     * 
     */
    public String getReceiverApplicationId() {
        return this.receiverApplicationId;
    }
    /**
     * The responsible agency code.
     * 
     */
    public String getResponsibleAgencyCode() {
        return this.responsibleAgencyCode;
    }
    /**
     * The sender application id.
     * 
     */
    public String getSenderApplicationId() {
        return this.senderApplicationId;
    }
    /**
     * The target namespace on which this envelope settings has to be applied.
     * 
     */
    public String getTargetNamespace() {
        return this.targetNamespace;
    }
    /**
     * The time format.
     * 
     */
    public String getTimeFormat() {
        return this.timeFormat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12EnvelopeOverrideResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dateFormat;
        private @Nullable String functionalIdentifierCode;
        private String headerVersion;
        private String messageId;
        private String protocolVersion;
        private String receiverApplicationId;
        private String responsibleAgencyCode;
        private String senderApplicationId;
        private String targetNamespace;
        private String timeFormat;

        public Builder() {
    	      // Empty
        }

        public Builder(X12EnvelopeOverrideResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dateFormat = defaults.dateFormat;
    	      this.functionalIdentifierCode = defaults.functionalIdentifierCode;
    	      this.headerVersion = defaults.headerVersion;
    	      this.messageId = defaults.messageId;
    	      this.protocolVersion = defaults.protocolVersion;
    	      this.receiverApplicationId = defaults.receiverApplicationId;
    	      this.responsibleAgencyCode = defaults.responsibleAgencyCode;
    	      this.senderApplicationId = defaults.senderApplicationId;
    	      this.targetNamespace = defaults.targetNamespace;
    	      this.timeFormat = defaults.timeFormat;
        }

        public Builder setDateFormat(String dateFormat) {
            this.dateFormat = Objects.requireNonNull(dateFormat);
            return this;
        }

        public Builder setFunctionalIdentifierCode(@Nullable String functionalIdentifierCode) {
            this.functionalIdentifierCode = functionalIdentifierCode;
            return this;
        }

        public Builder setHeaderVersion(String headerVersion) {
            this.headerVersion = Objects.requireNonNull(headerVersion);
            return this;
        }

        public Builder setMessageId(String messageId) {
            this.messageId = Objects.requireNonNull(messageId);
            return this;
        }

        public Builder setProtocolVersion(String protocolVersion) {
            this.protocolVersion = Objects.requireNonNull(protocolVersion);
            return this;
        }

        public Builder setReceiverApplicationId(String receiverApplicationId) {
            this.receiverApplicationId = Objects.requireNonNull(receiverApplicationId);
            return this;
        }

        public Builder setResponsibleAgencyCode(String responsibleAgencyCode) {
            this.responsibleAgencyCode = Objects.requireNonNull(responsibleAgencyCode);
            return this;
        }

        public Builder setSenderApplicationId(String senderApplicationId) {
            this.senderApplicationId = Objects.requireNonNull(senderApplicationId);
            return this;
        }

        public Builder setTargetNamespace(String targetNamespace) {
            this.targetNamespace = Objects.requireNonNull(targetNamespace);
            return this;
        }

        public Builder setTimeFormat(String timeFormat) {
            this.timeFormat = Objects.requireNonNull(timeFormat);
            return this;
        }
        public X12EnvelopeOverrideResponse build() {
            return new X12EnvelopeOverrideResponse(dateFormat, functionalIdentifierCode, headerVersion, messageId, protocolVersion, receiverApplicationId, responsibleAgencyCode, senderApplicationId, targetNamespace, timeFormat);
        }
    }
}
