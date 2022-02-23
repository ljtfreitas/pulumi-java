// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleRpcStatusResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDialogflowV2beta1DocumentReloadStatusResponse {
    /**
     * The status of a reload attempt or the initial load.
     * 
     */
    private final GoogleRpcStatusResponse status;
    /**
     * The time of a reload attempt. This reload may have been triggered automatically or manually and may not have succeeded.
     * 
     */
    private final String time;

    @OutputCustomType.Constructor({"status","time"})
    private GoogleCloudDialogflowV2beta1DocumentReloadStatusResponse(
        GoogleRpcStatusResponse status,
        String time) {
        this.status = Objects.requireNonNull(status);
        this.time = Objects.requireNonNull(time);
    }

    /**
     * The status of a reload attempt or the initial load.
     * 
     */
    public GoogleRpcStatusResponse getStatus() {
        return this.status;
    }
    /**
     * The time of a reload attempt. This reload may have been triggered automatically or manually and may not have succeeded.
     * 
     */
    public String getTime() {
        return this.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1DocumentReloadStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleRpcStatusResponse status;
        private String time;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1DocumentReloadStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.status = defaults.status;
    	      this.time = defaults.time;
        }

        public Builder setStatus(GoogleRpcStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTime(String time) {
            this.time = Objects.requireNonNull(time);
            return this;
        }
        public GoogleCloudDialogflowV2beta1DocumentReloadStatusResponse build() {
            return new GoogleCloudDialogflowV2beta1DocumentReloadStatusResponse(status, time);
        }
    }
}
