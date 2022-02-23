// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * For use with `Date`, `Timestamp`, and `TimeOfDay`, extract or preserve a portion of the value.
 * 
 */
public final class GooglePrivacyDlpV2TimePartConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2TimePartConfigResponse Empty = new GooglePrivacyDlpV2TimePartConfigResponse();

    /**
     * The part of the time to keep.
     * 
     */
    @InputImport(name="partToExtract", required=true)
      private final String partToExtract;

    public String getPartToExtract() {
        return this.partToExtract;
    }

    public GooglePrivacyDlpV2TimePartConfigResponse(String partToExtract) {
        this.partToExtract = Objects.requireNonNull(partToExtract, "expected parameter 'partToExtract' to be non-null");
    }

    private GooglePrivacyDlpV2TimePartConfigResponse() {
        this.partToExtract = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2TimePartConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String partToExtract;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2TimePartConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partToExtract = defaults.partToExtract;
        }

        public Builder setPartToExtract(String partToExtract) {
            this.partToExtract = Objects.requireNonNull(partToExtract);
            return this;
        }
        public GooglePrivacyDlpV2TimePartConfigResponse build() {
            return new GooglePrivacyDlpV2TimePartConfigResponse(partToExtract);
        }
    }
}
