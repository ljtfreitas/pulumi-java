// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GoogleRpcStatusResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Details information about an error encountered during job execution or the results of an unsuccessful activation of the JobTrigger.
 * 
 */
public final class GooglePrivacyDlpV2ErrorResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2ErrorResponse Empty = new GooglePrivacyDlpV2ErrorResponse();

    /**
     * Detailed error codes and messages.
     * 
     */
    @Import(name="details", required=true)
      private final GoogleRpcStatusResponse details;

    public GoogleRpcStatusResponse getDetails() {
        return this.details;
    }

    /**
     * The times the error occurred.
     * 
     */
    @Import(name="timestamps", required=true)
      private final List<String> timestamps;

    public List<String> getTimestamps() {
        return this.timestamps;
    }

    public GooglePrivacyDlpV2ErrorResponse(
        GoogleRpcStatusResponse details,
        List<String> timestamps) {
        this.details = Objects.requireNonNull(details, "expected parameter 'details' to be non-null");
        this.timestamps = Objects.requireNonNull(timestamps, "expected parameter 'timestamps' to be non-null");
    }

    private GooglePrivacyDlpV2ErrorResponse() {
        this.details = null;
        this.timestamps = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleRpcStatusResponse details;
        private List<String> timestamps;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
    	      this.timestamps = defaults.timestamps;
        }

        public Builder details(GoogleRpcStatusResponse details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public Builder timestamps(List<String> timestamps) {
            this.timestamps = Objects.requireNonNull(timestamps);
            return this;
        }
        public GooglePrivacyDlpV2ErrorResponse build() {
            return new GooglePrivacyDlpV2ErrorResponse(details, timestamps);
        }
    }
}
