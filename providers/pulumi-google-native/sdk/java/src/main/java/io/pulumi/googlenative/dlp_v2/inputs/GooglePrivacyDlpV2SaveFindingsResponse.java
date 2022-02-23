// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2OutputStorageConfigResponse;
import java.util.Objects;


/**
 * If set, the detailed findings will be persisted to the specified OutputStorageConfig. Only a single instance of this action can be specified. Compatible with: Inspect, Risk
 * 
 */
public final class GooglePrivacyDlpV2SaveFindingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2SaveFindingsResponse Empty = new GooglePrivacyDlpV2SaveFindingsResponse();

    /**
     * Location to store findings outside of DLP.
     * 
     */
    @InputImport(name="outputConfig", required=true)
      private final GooglePrivacyDlpV2OutputStorageConfigResponse outputConfig;

    public GooglePrivacyDlpV2OutputStorageConfigResponse getOutputConfig() {
        return this.outputConfig;
    }

    public GooglePrivacyDlpV2SaveFindingsResponse(GooglePrivacyDlpV2OutputStorageConfigResponse outputConfig) {
        this.outputConfig = Objects.requireNonNull(outputConfig, "expected parameter 'outputConfig' to be non-null");
    }

    private GooglePrivacyDlpV2SaveFindingsResponse() {
        this.outputConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2SaveFindingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GooglePrivacyDlpV2OutputStorageConfigResponse outputConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2SaveFindingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.outputConfig = defaults.outputConfig;
        }

        public Builder setOutputConfig(GooglePrivacyDlpV2OutputStorageConfigResponse outputConfig) {
            this.outputConfig = Objects.requireNonNull(outputConfig);
            return this;
        }
        public GooglePrivacyDlpV2SaveFindingsResponse build() {
            return new GooglePrivacyDlpV2SaveFindingsResponse(outputConfig);
        }
    }
}
