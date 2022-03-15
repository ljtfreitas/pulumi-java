// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.azurenative.logic.inputs.AS2AcknowledgementConnectionSettingsResponse;
import io.pulumi.azurenative.logic.inputs.AS2EnvelopeSettingsResponse;
import io.pulumi.azurenative.logic.inputs.AS2ErrorSettingsResponse;
import io.pulumi.azurenative.logic.inputs.AS2MdnSettingsResponse;
import io.pulumi.azurenative.logic.inputs.AS2MessageConnectionSettingsResponse;
import io.pulumi.azurenative.logic.inputs.AS2SecuritySettingsResponse;
import io.pulumi.azurenative.logic.inputs.AS2ValidationSettingsResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The AS2 agreement protocol settings.
 * 
 */
public final class AS2ProtocolSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AS2ProtocolSettingsResponse Empty = new AS2ProtocolSettingsResponse();

    /**
     * The acknowledgement connection settings.
     * 
     */
    @Import(name="acknowledgementConnectionSettings", required=true)
      private final AS2AcknowledgementConnectionSettingsResponse acknowledgementConnectionSettings;

    public AS2AcknowledgementConnectionSettingsResponse getAcknowledgementConnectionSettings() {
        return this.acknowledgementConnectionSettings;
    }

    /**
     * The envelope settings.
     * 
     */
    @Import(name="envelopeSettings", required=true)
      private final AS2EnvelopeSettingsResponse envelopeSettings;

    public AS2EnvelopeSettingsResponse getEnvelopeSettings() {
        return this.envelopeSettings;
    }

    /**
     * The error settings.
     * 
     */
    @Import(name="errorSettings", required=true)
      private final AS2ErrorSettingsResponse errorSettings;

    public AS2ErrorSettingsResponse getErrorSettings() {
        return this.errorSettings;
    }

    /**
     * The MDN settings.
     * 
     */
    @Import(name="mdnSettings", required=true)
      private final AS2MdnSettingsResponse mdnSettings;

    public AS2MdnSettingsResponse getMdnSettings() {
        return this.mdnSettings;
    }

    /**
     * The message connection settings.
     * 
     */
    @Import(name="messageConnectionSettings", required=true)
      private final AS2MessageConnectionSettingsResponse messageConnectionSettings;

    public AS2MessageConnectionSettingsResponse getMessageConnectionSettings() {
        return this.messageConnectionSettings;
    }

    /**
     * The security settings.
     * 
     */
    @Import(name="securitySettings", required=true)
      private final AS2SecuritySettingsResponse securitySettings;

    public AS2SecuritySettingsResponse getSecuritySettings() {
        return this.securitySettings;
    }

    /**
     * The validation settings.
     * 
     */
    @Import(name="validationSettings", required=true)
      private final AS2ValidationSettingsResponse validationSettings;

    public AS2ValidationSettingsResponse getValidationSettings() {
        return this.validationSettings;
    }

    public AS2ProtocolSettingsResponse(
        AS2AcknowledgementConnectionSettingsResponse acknowledgementConnectionSettings,
        AS2EnvelopeSettingsResponse envelopeSettings,
        AS2ErrorSettingsResponse errorSettings,
        AS2MdnSettingsResponse mdnSettings,
        AS2MessageConnectionSettingsResponse messageConnectionSettings,
        AS2SecuritySettingsResponse securitySettings,
        AS2ValidationSettingsResponse validationSettings) {
        this.acknowledgementConnectionSettings = Objects.requireNonNull(acknowledgementConnectionSettings, "expected parameter 'acknowledgementConnectionSettings' to be non-null");
        this.envelopeSettings = Objects.requireNonNull(envelopeSettings, "expected parameter 'envelopeSettings' to be non-null");
        this.errorSettings = Objects.requireNonNull(errorSettings, "expected parameter 'errorSettings' to be non-null");
        this.mdnSettings = Objects.requireNonNull(mdnSettings, "expected parameter 'mdnSettings' to be non-null");
        this.messageConnectionSettings = Objects.requireNonNull(messageConnectionSettings, "expected parameter 'messageConnectionSettings' to be non-null");
        this.securitySettings = Objects.requireNonNull(securitySettings, "expected parameter 'securitySettings' to be non-null");
        this.validationSettings = Objects.requireNonNull(validationSettings, "expected parameter 'validationSettings' to be non-null");
    }

    private AS2ProtocolSettingsResponse() {
        this.acknowledgementConnectionSettings = null;
        this.envelopeSettings = null;
        this.errorSettings = null;
        this.mdnSettings = null;
        this.messageConnectionSettings = null;
        this.securitySettings = null;
        this.validationSettings = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AS2ProtocolSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AS2AcknowledgementConnectionSettingsResponse acknowledgementConnectionSettings;
        private AS2EnvelopeSettingsResponse envelopeSettings;
        private AS2ErrorSettingsResponse errorSettings;
        private AS2MdnSettingsResponse mdnSettings;
        private AS2MessageConnectionSettingsResponse messageConnectionSettings;
        private AS2SecuritySettingsResponse securitySettings;
        private AS2ValidationSettingsResponse validationSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(AS2ProtocolSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acknowledgementConnectionSettings = defaults.acknowledgementConnectionSettings;
    	      this.envelopeSettings = defaults.envelopeSettings;
    	      this.errorSettings = defaults.errorSettings;
    	      this.mdnSettings = defaults.mdnSettings;
    	      this.messageConnectionSettings = defaults.messageConnectionSettings;
    	      this.securitySettings = defaults.securitySettings;
    	      this.validationSettings = defaults.validationSettings;
        }

        public Builder acknowledgementConnectionSettings(AS2AcknowledgementConnectionSettingsResponse acknowledgementConnectionSettings) {
            this.acknowledgementConnectionSettings = Objects.requireNonNull(acknowledgementConnectionSettings);
            return this;
        }

        public Builder envelopeSettings(AS2EnvelopeSettingsResponse envelopeSettings) {
            this.envelopeSettings = Objects.requireNonNull(envelopeSettings);
            return this;
        }

        public Builder errorSettings(AS2ErrorSettingsResponse errorSettings) {
            this.errorSettings = Objects.requireNonNull(errorSettings);
            return this;
        }

        public Builder mdnSettings(AS2MdnSettingsResponse mdnSettings) {
            this.mdnSettings = Objects.requireNonNull(mdnSettings);
            return this;
        }

        public Builder messageConnectionSettings(AS2MessageConnectionSettingsResponse messageConnectionSettings) {
            this.messageConnectionSettings = Objects.requireNonNull(messageConnectionSettings);
            return this;
        }

        public Builder securitySettings(AS2SecuritySettingsResponse securitySettings) {
            this.securitySettings = Objects.requireNonNull(securitySettings);
            return this;
        }

        public Builder validationSettings(AS2ValidationSettingsResponse validationSettings) {
            this.validationSettings = Objects.requireNonNull(validationSettings);
            return this;
        }
        public AS2ProtocolSettingsResponse build() {
            return new AS2ProtocolSettingsResponse(acknowledgementConnectionSettings, envelopeSettings, errorSettings, mdnSettings, messageConnectionSettings, securitySettings, validationSettings);
        }
    }
}
