// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * Settings for exporting conversations to [Insights](https://cloud.google.com/contact-center/insights/docs).
 * 
 */
public final class GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsResponse Empty = new GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsResponse();

    /**
     * If enabled, we will automatically exports conversations to Insights and Insights runs its analyzers.
     * 
     */
    @InputImport(name="enableInsightsExport", required=true)
      private final Boolean enableInsightsExport;

    public Boolean getEnableInsightsExport() {
        return this.enableInsightsExport;
    }

    public GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsResponse(Boolean enableInsightsExport) {
        this.enableInsightsExport = Objects.requireNonNull(enableInsightsExport, "expected parameter 'enableInsightsExport' to be non-null");
    }

    private GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsResponse() {
        this.enableInsightsExport = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableInsightsExport;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableInsightsExport = defaults.enableInsightsExport;
        }

        public Builder setEnableInsightsExport(Boolean enableInsightsExport) {
            this.enableInsightsExport = Objects.requireNonNull(enableInsightsExport);
            return this;
        }
        public GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsResponse build() {
            return new GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsResponse(enableInsightsExport);
        }
    }
}
