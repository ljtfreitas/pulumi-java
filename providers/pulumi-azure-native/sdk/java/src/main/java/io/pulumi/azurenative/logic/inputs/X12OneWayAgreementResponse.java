// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.BusinessIdentityResponse;
import io.pulumi.azurenative.logic.inputs.X12ProtocolSettingsResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * The X12 one-way agreement.
 * 
 */
public final class X12OneWayAgreementResponse extends io.pulumi.resources.InvokeArgs {

    public static final X12OneWayAgreementResponse Empty = new X12OneWayAgreementResponse();

    /**
     * The X12 protocol settings.
     * 
     */
    @InputImport(name="protocolSettings", required=true)
        private final X12ProtocolSettingsResponse protocolSettings;

    public X12ProtocolSettingsResponse getProtocolSettings() {
        return this.protocolSettings;
    }

    /**
     * The receiver business identity
     * 
     */
    @InputImport(name="receiverBusinessIdentity", required=true)
        private final BusinessIdentityResponse receiverBusinessIdentity;

    public BusinessIdentityResponse getReceiverBusinessIdentity() {
        return this.receiverBusinessIdentity;
    }

    /**
     * The sender business identity
     * 
     */
    @InputImport(name="senderBusinessIdentity", required=true)
        private final BusinessIdentityResponse senderBusinessIdentity;

    public BusinessIdentityResponse getSenderBusinessIdentity() {
        return this.senderBusinessIdentity;
    }

    public X12OneWayAgreementResponse(
        X12ProtocolSettingsResponse protocolSettings,
        BusinessIdentityResponse receiverBusinessIdentity,
        BusinessIdentityResponse senderBusinessIdentity) {
        this.protocolSettings = Objects.requireNonNull(protocolSettings, "expected parameter 'protocolSettings' to be non-null");
        this.receiverBusinessIdentity = Objects.requireNonNull(receiverBusinessIdentity, "expected parameter 'receiverBusinessIdentity' to be non-null");
        this.senderBusinessIdentity = Objects.requireNonNull(senderBusinessIdentity, "expected parameter 'senderBusinessIdentity' to be non-null");
    }

    private X12OneWayAgreementResponse() {
        this.protocolSettings = null;
        this.receiverBusinessIdentity = null;
        this.senderBusinessIdentity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12OneWayAgreementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private X12ProtocolSettingsResponse protocolSettings;
        private BusinessIdentityResponse receiverBusinessIdentity;
        private BusinessIdentityResponse senderBusinessIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(X12OneWayAgreementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.protocolSettings = defaults.protocolSettings;
    	      this.receiverBusinessIdentity = defaults.receiverBusinessIdentity;
    	      this.senderBusinessIdentity = defaults.senderBusinessIdentity;
        }

        public Builder setProtocolSettings(X12ProtocolSettingsResponse protocolSettings) {
            this.protocolSettings = Objects.requireNonNull(protocolSettings);
            return this;
        }

        public Builder setReceiverBusinessIdentity(BusinessIdentityResponse receiverBusinessIdentity) {
            this.receiverBusinessIdentity = Objects.requireNonNull(receiverBusinessIdentity);
            return this;
        }

        public Builder setSenderBusinessIdentity(BusinessIdentityResponse senderBusinessIdentity) {
            this.senderBusinessIdentity = Objects.requireNonNull(senderBusinessIdentity);
            return this;
        }
        public X12OneWayAgreementResponse build() {
            return new X12OneWayAgreementResponse(protocolSettings, receiverBusinessIdentity, senderBusinessIdentity);
        }
    }
}
