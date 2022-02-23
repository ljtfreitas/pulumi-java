// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2ValueResponse;
import java.util.Objects;


/**
 * Replace each input value with a given `Value`.
 * 
 */
public final class GooglePrivacyDlpV2ReplaceValueConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2ReplaceValueConfigResponse Empty = new GooglePrivacyDlpV2ReplaceValueConfigResponse();

    /**
     * Value to replace it with.
     * 
     */
    @InputImport(name="newValue", required=true)
      private final GooglePrivacyDlpV2ValueResponse newValue;

    public GooglePrivacyDlpV2ValueResponse getNewValue() {
        return this.newValue;
    }

    public GooglePrivacyDlpV2ReplaceValueConfigResponse(GooglePrivacyDlpV2ValueResponse newValue) {
        this.newValue = Objects.requireNonNull(newValue, "expected parameter 'newValue' to be non-null");
    }

    private GooglePrivacyDlpV2ReplaceValueConfigResponse() {
        this.newValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ReplaceValueConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2ValueResponse newValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ReplaceValueConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.newValue = defaults.newValue;
        }

        public Builder setNewValue(GooglePrivacyDlpV2ValueResponse newValue) {
            this.newValue = Objects.requireNonNull(newValue);
            return this;
        }
        public GooglePrivacyDlpV2ReplaceValueConfigResponse build() {
            return new GooglePrivacyDlpV2ReplaceValueConfigResponse(newValue);
        }
    }
}
