// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class YarnApplicationResponse {
    /**
     * The application name.
     * 
     */
    private final String name;
    /**
     * The numerical progress of the application, from 1 to 100.
     * 
     */
    private final Double progress;
    /**
     * The application state.
     * 
     */
    private final String state;
    /**
     * The HTTP URL of the ApplicationMaster, HistoryServer, or TimelineServer that provides application-specific information. The URL uses the internal hostname, and requires a proxy server for resolution and, possibly, access.
     * 
     */
    private final String trackingUrl;

    @OutputCustomType.Constructor({"name","progress","state","trackingUrl"})
    private YarnApplicationResponse(
        String name,
        Double progress,
        String state,
        String trackingUrl) {
        this.name = Objects.requireNonNull(name);
        this.progress = Objects.requireNonNull(progress);
        this.state = Objects.requireNonNull(state);
        this.trackingUrl = Objects.requireNonNull(trackingUrl);
    }

    /**
     * The application name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The numerical progress of the application, from 1 to 100.
     * 
     */
    public Double getProgress() {
        return this.progress;
    }
    /**
     * The application state.
     * 
     */
    public String getState() {
        return this.state;
    }
    /**
     * The HTTP URL of the ApplicationMaster, HistoryServer, or TimelineServer that provides application-specific information. The URL uses the internal hostname, and requires a proxy server for resolution and, possibly, access.
     * 
     */
    public String getTrackingUrl() {
        return this.trackingUrl;
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

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProgress(Double progress) {
            this.progress = Objects.requireNonNull(progress);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTrackingUrl(String trackingUrl) {
            this.trackingUrl = Objects.requireNonNull(trackingUrl);
            return this;
        }
        public YarnApplicationResponse build() {
            return new YarnApplicationResponse(name, progress, state, trackingUrl);
        }
    }
}
