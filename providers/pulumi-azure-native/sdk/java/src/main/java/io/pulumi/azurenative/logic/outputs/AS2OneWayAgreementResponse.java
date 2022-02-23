// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.AS2ProtocolSettingsResponse;
import io.pulumi.azurenative.logic.outputs.BusinessIdentityResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class AS2OneWayAgreementResponse {
    /**
     * The AS2 protocol settings.
     * 
     */
    private final AS2ProtocolSettingsResponse protocolSettings;
    /**
     * The receiver business identity
     * 
     */
    private final BusinessIdentityResponse receiverBusinessIdentity;
    /**
     * The sender business identity
     * 
     */
    private final BusinessIdentityResponse senderBusinessIdentity;

    @OutputCustomType.Constructor({"protocolSettings","receiverBusinessIdentity","senderBusinessIdentity"})
    private AS2OneWayAgreementResponse(
        AS2ProtocolSettingsResponse protocolSettings,
        BusinessIdentityResponse receiverBusinessIdentity,
        BusinessIdentityResponse senderBusinessIdentity) {
        this.protocolSettings = Objects.requireNonNull(protocolSettings);
        this.receiverBusinessIdentity = Objects.requireNonNull(receiverBusinessIdentity);
        this.senderBusinessIdentity = Objects.requireNonNull(senderBusinessIdentity);
    }

    /**
     * The AS2 protocol settings.
     * 
     */
    public AS2ProtocolSettingsResponse getProtocolSettings() {
        return this.protocolSettings;
    }
    /**
     * The receiver business identity
     * 
     */
    public BusinessIdentityResponse getReceiverBusinessIdentity() {
        return this.receiverBusinessIdentity;
    }
    /**
     * The sender business identity
     * 
     */
    public BusinessIdentityResponse getSenderBusinessIdentity() {
        return this.senderBusinessIdentity;
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

        public Builder setProtocolSettings(AS2ProtocolSettingsResponse protocolSettings) {
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
        public AS2OneWayAgreementResponse build() {
            return new AS2OneWayAgreementResponse(protocolSettings, receiverBusinessIdentity, senderBusinessIdentity);
        }
    }
}
