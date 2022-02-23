// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.composer.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;


public final class GetEnvironmentConfigWorkloadsConfigWebServer extends io.pulumi.resources.InvokeArgs {

    public static final GetEnvironmentConfigWorkloadsConfigWebServer Empty = new GetEnvironmentConfigWorkloadsConfigWebServer();

    @InputImport(name="cpu", required=true)
        private final Double cpu;

    public Double getCpu() {
        return this.cpu;
    }

    @InputImport(name="memoryGb", required=true)
        private final Double memoryGb;

    public Double getMemoryGb() {
        return this.memoryGb;
    }

    @InputImport(name="storageGb", required=true)
        private final Double storageGb;

    public Double getStorageGb() {
        return this.storageGb;
    }

    public GetEnvironmentConfigWorkloadsConfigWebServer(
        Double cpu,
        Double memoryGb,
        Double storageGb) {
        this.cpu = Objects.requireNonNull(cpu, "expected parameter 'cpu' to be non-null");
        this.memoryGb = Objects.requireNonNull(memoryGb, "expected parameter 'memoryGb' to be non-null");
        this.storageGb = Objects.requireNonNull(storageGb, "expected parameter 'storageGb' to be non-null");
    }

    private GetEnvironmentConfigWorkloadsConfigWebServer() {
        this.cpu = null;
        this.memoryGb = null;
        this.storageGb = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentConfigWorkloadsConfigWebServer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double cpu;
        private Double memoryGb;
        private Double storageGb;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentConfigWorkloadsConfigWebServer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.memoryGb = defaults.memoryGb;
    	      this.storageGb = defaults.storageGb;
        }

        public Builder setCpu(Double cpu) {
            this.cpu = Objects.requireNonNull(cpu);
            return this;
        }

        public Builder setMemoryGb(Double memoryGb) {
            this.memoryGb = Objects.requireNonNull(memoryGb);
            return this;
        }

        public Builder setStorageGb(Double storageGb) {
            this.storageGb = Objects.requireNonNull(storageGb);
            return this;
        }
        public GetEnvironmentConfigWorkloadsConfigWebServer build() {
            return new GetEnvironmentConfigWorkloadsConfigWebServer(cpu, memoryGb, storageGb);
        }
    }
}
