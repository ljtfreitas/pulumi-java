// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.composer_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


/**
 * Configuration for resources used by Airflow web server.
 * 
 */
public final class WebServerResourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final WebServerResourceResponse Empty = new WebServerResourceResponse();

    /**
     * Optional. CPU request and limit for Airflow web server.
     * 
     */
    @Import(name="cpu", required=true)
      private final Double cpu;

    public Double getCpu() {
        return this.cpu;
    }

    /**
     * Optional. Memory (GB) request and limit for Airflow web server.
     * 
     */
    @Import(name="memoryGb", required=true)
      private final Double memoryGb;

    public Double getMemoryGb() {
        return this.memoryGb;
    }

    /**
     * Optional. Storage (GB) request and limit for Airflow web server.
     * 
     */
    @Import(name="storageGb", required=true)
      private final Double storageGb;

    public Double getStorageGb() {
        return this.storageGb;
    }

    public WebServerResourceResponse(
        Double cpu,
        Double memoryGb,
        Double storageGb) {
        this.cpu = Objects.requireNonNull(cpu, "expected parameter 'cpu' to be non-null");
        this.memoryGb = Objects.requireNonNull(memoryGb, "expected parameter 'memoryGb' to be non-null");
        this.storageGb = Objects.requireNonNull(storageGb, "expected parameter 'storageGb' to be non-null");
    }

    private WebServerResourceResponse() {
        this.cpu = null;
        this.memoryGb = null;
        this.storageGb = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebServerResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double cpu;
        private Double memoryGb;
        private Double storageGb;

        public Builder() {
    	      // Empty
        }

        public Builder(WebServerResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.memoryGb = defaults.memoryGb;
    	      this.storageGb = defaults.storageGb;
        }

        public Builder cpu(Double cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }

        public Builder memoryGb(Double memoryGb) {
            this.memoryGb = Objects.requireNonNull(memoryGb);
            return this;
        }

        public Builder storageGb(Double storageGb) {
            this.storageGb = Objects.requireNonNull(storageGb);
            return this;
        }
        public WebServerResourceResponse build() {
            return new WebServerResourceResponse(cpu, memoryGb, storageGb);
        }
    }
}
