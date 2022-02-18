// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Wait statistics gathered during query batch execution
 * 
 */
public final class WaitStatisticsResponse extends io.pulumi.resources.InvokeArgs {

    public static final WaitStatisticsResponse Empty = new WaitStatisticsResponse();

    /**
     * Total no. of waits
     * 
     */
    @InputImport(name="waitCount", required=true)
    private final Double waitCount;

    public Double getWaitCount() {
        return this.waitCount;
    }

    /**
     * Total wait time in millisecond(s)
     * 
     */
    @InputImport(name="waitTimeMs", required=true)
    private final Double waitTimeMs;

    public Double getWaitTimeMs() {
        return this.waitTimeMs;
    }

    /**
     * Type of the Wait
     * 
     */
    @InputImport(name="waitType", required=true)
    private final String waitType;

    public String getWaitType() {
        return this.waitType;
    }

    public WaitStatisticsResponse(
        Double waitCount,
        Double waitTimeMs,
        String waitType) {
        this.waitCount = Objects.requireNonNull(waitCount, "expected parameter 'waitCount' to be non-null");
        this.waitTimeMs = waitTimeMs == null ? 0e+00 : Objects.requireNonNull(waitTimeMs, "expected parameter 'waitTimeMs' to be non-null");
        this.waitType = Objects.requireNonNull(waitType, "expected parameter 'waitType' to be non-null");
    }

    private WaitStatisticsResponse() {
        this.waitCount = null;
        this.waitTimeMs = null;
        this.waitType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WaitStatisticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double waitCount;
        private Double waitTimeMs;
        private String waitType;

        public Builder() {
    	      // Empty
        }

        public Builder(WaitStatisticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.waitCount = defaults.waitCount;
    	      this.waitTimeMs = defaults.waitTimeMs;
    	      this.waitType = defaults.waitType;
        }

        public Builder setWaitCount(Double waitCount) {
            this.waitCount = Objects.requireNonNull(waitCount);
            return this;
        }

        public Builder setWaitTimeMs(Double waitTimeMs) {
            this.waitTimeMs = Objects.requireNonNull(waitTimeMs);
            return this;
        }

        public Builder setWaitType(String waitType) {
            this.waitType = Objects.requireNonNull(waitType);
            return this;
        }

        public WaitStatisticsResponse build() {
            return new WaitStatisticsResponse(waitCount, waitTimeMs, waitType);
        }
    }
}
