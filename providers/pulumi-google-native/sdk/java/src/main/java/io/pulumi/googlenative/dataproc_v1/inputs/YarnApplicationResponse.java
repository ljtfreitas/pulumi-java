// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * A YARN application created by a job. Application information is a subset of org.apache.hadoop.yarn.proto.YarnProtos.ApplicationReportProto.Beta Feature: This report is available for testing purposes only. It may be changed before final release.
 * 
 */
public final class YarnApplicationResponse extends io.pulumi.resources.InvokeArgs {

    public static final YarnApplicationResponse Empty = new YarnApplicationResponse();

    /**
     * The application name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The numerical progress of the application, from 1 to 100.
     * 
     */
    @Import(name="progress", required=true)
      private final Double progress;

    public Double getProgress() {
        return this.progress;
    }

    /**
     * The application state.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * Optional. The HTTP URL of the ApplicationMaster, HistoryServer, or TimelineServer that provides application-specific information. The URL uses the internal hostname, and requires a proxy server for resolution and, possibly, access.
     * 
     */
    @Import(name="trackingUrl", required=true)
      private final String trackingUrl;

    public String getTrackingUrl() {
        return this.trackingUrl;
    }

    public YarnApplicationResponse(
        String name,
        Double progress,
        String state,
        String trackingUrl) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.progress = Objects.requireNonNull(progress, "expected parameter 'progress' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.trackingUrl = Objects.requireNonNull(trackingUrl, "expected parameter 'trackingUrl' to be non-null");
    }

    private YarnApplicationResponse() {
        this.name = null;
        this.progress = null;
        this.state = null;
        this.trackingUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(YarnApplicationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private Double progress;
        private String state;
        private String trackingUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(YarnApplicationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.progress = defaults.progress;
    	      this.state = defaults.state;
    	      this.trackingUrl = defaults.trackingUrl;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder progress(Double progress) {
            this.progress = Objects.requireNonNull(progress);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder trackingUrl(String trackingUrl) {
            this.trackingUrl = Objects.requireNonNull(trackingUrl);
            return this;
        }
        public YarnApplicationResponse build() {
            return new YarnApplicationResponse(name, progress, state, trackingUrl);
        }
    }
}
