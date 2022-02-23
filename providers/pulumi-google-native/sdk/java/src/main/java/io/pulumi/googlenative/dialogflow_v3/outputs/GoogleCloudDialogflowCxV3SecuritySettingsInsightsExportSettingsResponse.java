// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsResponse {
    /**
     * If enabled, we will automatically exports conversations to Insights and Insights runs its analyzers.
     * 
     */
    private final Boolean enableInsightsExport;

    @OutputCustomType.Constructor({"enableInsightsExport"})
    private GoogleCloudDialogflowCxV3SecuritySettingsInsightsExportSettingsResponse(Boolean enableInsightsExport) {
        this.enableInsightsExport = Objects.requireNonNull(enableInsightsExport);
    }

    /**
     * If enabled, we will automatically exports conversations to Insights and Insights runs its analyzers.
     * 
     */
    public Boolean getEnableInsightsExport() {
        return this.enableInsightsExport;
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
