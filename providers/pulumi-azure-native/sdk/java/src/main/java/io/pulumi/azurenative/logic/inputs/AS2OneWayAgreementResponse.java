// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.AS2ProtocolSettingsResponse;
import io.pulumi.azurenative.logic.inputs.BusinessIdentityResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The integration account AS2 one-way agreement.
 * 
 */
public final class AS2OneWayAgreementResponse extends io.pulumi.resources.InvokeArgs {

    public static final AS2OneWayAgreementResponse Empty = new AS2OneWayAgreementResponse();

    /**
     * The AS2 protocol settings.
     * 
     */
    @Import(name="protocolSettings", required=true)
      private final AS2ProtocolSettingsResponse protocolSettings;

    public AS2ProtocolSettingsResponse getProtocolSettings() {
        return this.protocolSettings;
    }

    /**
     * The receiver business identity
     * 
     */
    @Import(name="receiverBusinessIdentity", required=true)
      private final BusinessIdentityResponse receiverBusinessIdentity;

    public BusinessIdentityResponse getReceiverBusinessIdentity() {
        return this.receiverBusinessIdentity;
    }

    /**
     * The sender business identity
     * 
     */
    @Import(name="senderBusinessIdentity", required=true)
      private final BusinessIdentityResponse senderBusinessIdentity;

    public BusinessIdentityResponse getSenderBusinessIdentity() {
        return this.senderBusinessIdentity;
    }

    public AS2OneWayAgreementResponse(
        AS2ProtocolSettingsResponse protocolSettings,
        BusinessIdentityResponse receiverBusinessIdentity,
        BusinessIdentityResponse senderBusinessIdentity) {
        this.protocolSettings = Objects.requireNonNull(protocolSettings, "expected parameter 'protocolSettings' to be non-null");
        this.receiverBusinessIdentity = Objects.requireNonNull(receiverBusinessIdentity, "expected parameter 'receiverBusinessIdentity' to be non-null");
        this.senderBusinessIdentity = Objects.requireNonNull(senderBusinessIdentity, "expected parameter 'senderBusinessIdentity' to be non-null");
    }

    private AS2OneWayAgreementResponse() {
        this.protocolSettings = null;
        this.receiverBusinessIdentity = null;
        this.senderBusinessIdentity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2OneWayAgreementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AS2ProtocolSettingsResponse protocolSettings;
        private BusinessIdentityResponse receiverBusinessIdentity;
        private BusinessIdentityResponse senderBusinessIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2OneWayAgreementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.protocolSettings = defaults.protocolSettings;
    	      this.receiverBusinessIdentity = defaults.receiverBusinessIdentity;
    	      this.senderBusinessIdentity = defaults.senderBusinessIdentity;
        }

        public Builder protocolSettings(AS2ProtocolSettingsResponse protocolSettings) {
            this.protocolSettings = Objects.requireNonNull(protocolSettings);
            return this;
        }

        public Builder receiverBusinessIdentity(BusinessIdentityResponse receiverBusinessIdentity) {
            this.receiverBusinessIdentity = Objects.requireNonNull(receiverBusinessIdentity);
            return this;
        }

        public Builder senderBusinessIdentity(BusinessIdentityResponse senderBusinessIdentity) {
            this.senderBusinessIdentity = Objects.requireNonNull(senderBusinessIdentity);
            return this;
        }
        public AS2OneWayAgreementResponse build() {
            return new AS2OneWayAgreementResponse(protocolSettings, receiverBusinessIdentity, senderBusinessIdentity);
        }
    }
}
