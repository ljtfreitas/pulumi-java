// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2InfoTypeResponse;
import java.util.List;
import java.util.Objects;


public final class GooglePrivacyDlpV2ExcludeInfoTypesResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2ExcludeInfoTypesResponse Empty = new GooglePrivacyDlpV2ExcludeInfoTypesResponse();

    @InputImport(name="infoTypes", required=true)
    private final List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes;

    public List<GooglePrivacyDlpV2InfoTypeResponse> getInfoTypes() {
        return this.infoTypes;
    }

    public GooglePrivacyDlpV2ExcludeInfoTypesResponse(List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes) {
        this.infoTypes = Objects.requireNonNull(infoTypes, "expected parameter 'infoTypes' to be non-null");
    }

    private GooglePrivacyDlpV2ExcludeInfoTypesResponse() {
        this.infoTypes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ExcludeInfoTypesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ExcludeInfoTypesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.infoTypes = defaults.infoTypes;
        }

        public Builder setInfoTypes(List<GooglePrivacyDlpV2InfoTypeResponse> infoTypes) {
            this.infoTypes = Objects.requireNonNull(infoTypes);
            return this;
        }

        public GooglePrivacyDlpV2ExcludeInfoTypesResponse build() {
            return new GooglePrivacyDlpV2ExcludeInfoTypesResponse(infoTypes);
        }
    }
}