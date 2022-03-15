// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.gameservices_v1beta.inputs.CloudAuditOptionsResponse;
import io.pulumi.googlenative.gameservices_v1beta.inputs.CounterOptionsResponse;
import io.pulumi.googlenative.gameservices_v1beta.inputs.DataAccessOptionsResponse;
import java.util.Objects;


/**
 * Specifies what kind of log the caller must write
 * 
 */
public final class LogConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final LogConfigResponse Empty = new LogConfigResponse();

    /**
     * Cloud audit options.
     * 
     */
    @Import(name="cloudAudit", required=true)
      private final CloudAuditOptionsResponse cloudAudit;

    public CloudAuditOptionsResponse getCloudAudit() {
        return this.cloudAudit;
    }

    /**
     * Counter options.
     * 
     */
    @Import(name="counter", required=true)
      private final CounterOptionsResponse counter;

    public CounterOptionsResponse getCounter() {
        return this.counter;
    }

    /**
     * Data access options.
     * 
     */
    @Import(name="dataAccess", required=true)
      private final DataAccessOptionsResponse dataAccess;

    public DataAccessOptionsResponse getDataAccess() {
        return this.dataAccess;
    }

    public LogConfigResponse(
        CloudAuditOptionsResponse cloudAudit,
        CounterOptionsResponse counter,
        DataAccessOptionsResponse dataAccess) {
        this.cloudAudit = Objects.requireNonNull(cloudAudit, "expected parameter 'cloudAudit' to be non-null");
        this.counter = Objects.requireNonNull(counter, "expected parameter 'counter' to be non-null");
        this.dataAccess = Objects.requireNonNull(dataAccess, "expected parameter 'dataAccess' to be non-null");
    }

    private LogConfigResponse() {
        this.cloudAudit = null;
        this.counter = null;
        this.dataAccess = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudAuditOptionsResponse cloudAudit;
        private CounterOptionsResponse counter;
        private DataAccessOptionsResponse dataAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(LogConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudAudit = defaults.cloudAudit;
    	      this.counter = defaults.counter;
    	      this.dataAccess = defaults.dataAccess;
        }

        public Builder cloudAudit(CloudAuditOptionsResponse cloudAudit) {
            this.cloudAudit = Objects.requireNonNull(cloudAudit);
            return this;
        }

        public Builder counter(CounterOptionsResponse counter) {
            this.counter = Objects.requireNonNull(counter);
            return this;
        }

        public Builder dataAccess(DataAccessOptionsResponse dataAccess) {
            this.dataAccess = Objects.requireNonNull(dataAccess);
            return this;
        }
        public LogConfigResponse build() {
            return new LogConfigResponse(cloudAudit, counter, dataAccess);
        }
    }
}
