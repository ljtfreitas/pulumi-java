// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The X12 envelope override settings.
 * 
 */
public final class X12EnvelopeOverrideResponse extends io.pulumi.resources.InvokeArgs {

    public static final X12EnvelopeOverrideResponse Empty = new X12EnvelopeOverrideResponse();

    /**
     * The date format.
     * 
     */
    @Import(name="dateFormat", required=true)
      private final String dateFormat;

    public String getDateFormat() {
        return this.dateFormat;
    }

    /**
     * The functional identifier code.
     * 
     */
    @Import(name="functionalIdentifierCode")
      private final @Nullable String functionalIdentifierCode;

    public Optional<String> getFunctionalIdentifierCode() {
        return this.functionalIdentifierCode == null ? Optional.empty() : Optional.ofNullable(this.functionalIdentifierCode);
    }

    /**
     * The header version.
     * 
     */
    @Import(name="headerVersion", required=true)
      private final String headerVersion;

    public String getHeaderVersion() {
        return this.headerVersion;
    }

    /**
     * The message id on which this envelope settings has to be applied.
     * 
     */
    @Import(name="messageId", required=true)
      private final String messageId;

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * The protocol version on which this envelope settings has to be applied.
     * 
     */
    @Import(name="protocolVersion", required=true)
      private final String protocolVersion;

    public String getProtocolVersion() {
        return this.protocolVersion;
    }

    /**
     * The receiver application id.
     * 
     */
    @Import(name="receiverApplicationId", required=true)
      private final String receiverApplicationId;

    public String getReceiverApplicationId() {
        return this.receiverApplicationId;
    }

    /**
     * The responsible agency code.
     * 
     */
    @Import(name="responsibleAgencyCode", required=true)
      private final String responsibleAgencyCode;

    public String getResponsibleAgencyCode() {
        return this.responsibleAgencyCode;
    }

    /**
     * The sender application id.
     * 
     */
    @Import(name="senderApplicationId", required=true)
      private final String senderApplicationId;

    public String getSenderApplicationId() {
        return this.senderApplicationId;
    }

    /**
     * The target namespace on which this envelope settings has to be applied.
     * 
     */
    @Import(name="targetNamespace", required=true)
      private final String targetNamespace;

    public String getTargetNamespace() {
        return this.targetNamespace;
    }

    /**
     * The time format.
     * 
     */
    @Import(name="timeFormat", required=true)
      private final String timeFormat;

    public String getTimeFormat() {
        return this.timeFormat;
    }

    public X12EnvelopeOverrideResponse(
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
        this.dateFormat = Objects.requireNonNull(dateFormat, "expected parameter 'dateFormat' to be non-null");
        this.functionalIdentifierCode = functionalIdentifierCode;
        this.headerVersion = Objects.requireNonNull(headerVersion, "expected parameter 'headerVersion' to be non-null");
        this.messageId = Objects.requireNonNull(messageId, "expected parameter 'messageId' to be non-null");
        this.protocolVersion = Objects.requireNonNull(protocolVersion, "expected parameter 'protocolVersion' to be non-null");
        this.receiverApplicationId = Objects.requireNonNull(receiverApplicationId, "expected parameter 'receiverApplicationId' to be non-null");
        this.responsibleAgencyCode = Objects.requireNonNull(responsibleAgencyCode, "expected parameter 'responsibleAgencyCode' to be non-null");
        this.senderApplicationId = Objects.requireNonNull(senderApplicationId, "expected parameter 'senderApplicationId' to be non-null");
        this.targetNamespace = Objects.requireNonNull(targetNamespace, "expected parameter 'targetNamespace' to be non-null");
        this.timeFormat = Objects.requireNonNull(timeFormat, "expected parameter 'timeFormat' to be non-null");
    }

    private X12EnvelopeOverrideResponse() {
        this.dateFormat = null;
        this.functionalIdentifierCode = null;
        this.headerVersion = null;
        this.messageId = null;
        this.protocolVersion = null;
        this.receiverApplicationId = null;
        this.responsibleAgencyCode = null;
        this.senderApplicationId = null;
        this.targetNamespace = null;
        this.timeFormat = null;
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

        public Builder dateFormat(String dateFormat) {
            this.dateFormat = Objects.requireNonNull(dateFormat);
            return this;
        }

        public Builder functionalIdentifierCode(@Nullable String functionalIdentifierCode) {
            this.functionalIdentifierCode = functionalIdentifierCode;
            return this;
        }

        public Builder headerVersion(String headerVersion) {
            this.headerVersion = Objects.requireNonNull(headerVersion);
            return this;
        }

        public Builder messageId(String messageId) {
            this.messageId = Objects.requireNonNull(messageId);
            return this;
        }

        public Builder protocolVersion(String protocolVersion) {
            this.protocolVersion = Objects.requireNonNull(protocolVersion);
            return this;
        }

        public Builder receiverApplicationId(String receiverApplicationId) {
            this.receiverApplicationId = Objects.requireNonNull(receiverApplicationId);
            return this;
        }

        public Builder responsibleAgencyCode(String responsibleAgencyCode) {
            this.responsibleAgencyCode = Objects.requireNonNull(responsibleAgencyCode);
            return this;
        }

        public Builder senderApplicationId(String senderApplicationId) {
            this.senderApplicationId = Objects.requireNonNull(senderApplicationId);
            return this;
        }

        public Builder targetNamespace(String targetNamespace) {
            this.targetNamespace = Objects.requireNonNull(targetNamespace);
            return this;
        }

        public Builder timeFormat(String timeFormat) {
            this.timeFormat = Objects.requireNonNull(timeFormat);
            return this;
        }
        public X12EnvelopeOverrideResponse build() {
            return new X12EnvelopeOverrideResponse(dateFormat, functionalIdentifierCode, headerVersion, messageId, protocolVersion, receiverApplicationId, responsibleAgencyCode, senderApplicationId, targetNamespace, timeFormat);
        }
    }
}
