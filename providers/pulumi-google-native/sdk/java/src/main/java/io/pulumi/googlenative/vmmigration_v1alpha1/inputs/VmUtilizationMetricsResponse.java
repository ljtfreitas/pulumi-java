// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Utilization metrics values for a single VM.
 * 
 */
public final class VmUtilizationMetricsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VmUtilizationMetricsResponse Empty = new VmUtilizationMetricsResponse();

    /**
     * Average CPU usage, percent.
     * 
     */
    @InputImport(name="cpuAverage", required=true)
      private final Integer cpuAverage;

    public Integer getCpuAverage() {
        return this.cpuAverage;
    }

    /**
     * Average CPU usage, percent.
     * 
     */
    @InputImport(name="cpuAveragePercent", required=true)
      private final Integer cpuAveragePercent;

    public Integer getCpuAveragePercent() {
        return this.cpuAveragePercent;
    }

    /**
     * Max CPU usage, percent.
     * 
     */
    @InputImport(name="cpuMax", required=true)
      private final Integer cpuMax;

    public Integer getCpuMax() {
        return this.cpuMax;
    }

    /**
     * Max CPU usage, percent.
     * 
     */
    @InputImport(name="cpuMaxPercent", required=true)
      private final Integer cpuMaxPercent;

    public Integer getCpuMaxPercent() {
        return this.cpuMaxPercent;
    }

    /**
     * Average disk IO rate, in kilobytes per second.
     * 
     */
    @InputImport(name="diskIoRateAverage", required=true)
      private final String diskIoRateAverage;

    public String getDiskIoRateAverage() {
        return this.diskIoRateAverage;
    }

    /**
     * Average disk IO rate, in kilobytes per second.
     * 
     */
    @InputImport(name="diskIoRateAverageKbps", required=true)
      private final String diskIoRateAverageKbps;

    public String getDiskIoRateAverageKbps() {
        return this.diskIoRateAverageKbps;
    }

    /**
     * Max disk IO rate, in kilobytes per second.
     * 
     */
    @InputImport(name="diskIoRateMax", required=true)
      private final String diskIoRateMax;

    public String getDiskIoRateMax() {
        return this.diskIoRateMax;
    }

    /**
     * Max disk IO rate, in kilobytes per second.
     * 
     */
    @InputImport(name="diskIoRateMaxKbps", required=true)
      private final String diskIoRateMaxKbps;

    public String getDiskIoRateMaxKbps() {
        return this.diskIoRateMaxKbps;
    }

    /**
     * Average memory usage, percent.
     * 
     */
    @InputImport(name="memoryAverage", required=true)
      private final Integer memoryAverage;

    public Integer getMemoryAverage() {
        return this.memoryAverage;
    }

    /**
     * Average memory usage, percent.
     * 
     */
    @InputImport(name="memoryAveragePercent", required=true)
      private final Integer memoryAveragePercent;

    public Integer getMemoryAveragePercent() {
        return this.memoryAveragePercent;
    }

    /**
     * Max memory usage, percent.
     * 
     */
    @InputImport(name="memoryMax", required=true)
      private final Integer memoryMax;

    public Integer getMemoryMax() {
        return this.memoryMax;
    }

    /**
     * Max memory usage, percent.
     * 
     */
    @InputImport(name="memoryMaxPercent", required=true)
      private final Integer memoryMaxPercent;

    public Integer getMemoryMaxPercent() {
        return this.memoryMaxPercent;
    }

    /**
     * Average network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    @InputImport(name="networkThroughputAverage", required=true)
      private final String networkThroughputAverage;

    public String getNetworkThroughputAverage() {
        return this.networkThroughputAverage;
    }

    /**
     * Average network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    @InputImport(name="networkThroughputAverageKbps", required=true)
      private final String networkThroughputAverageKbps;

    public String getNetworkThroughputAverageKbps() {
        return this.networkThroughputAverageKbps;
    }

    /**
     * Max network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    @InputImport(name="networkThroughputMax", required=true)
      private final String networkThroughputMax;

    public String getNetworkThroughputMax() {
        return this.networkThroughputMax;
    }

    /**
     * Max network throughput (combined transmit-rates and receive-rates), in kilobytes per second.
     * 
     */
    @InputImport(name="networkThroughputMaxKbps", required=true)
      private final String networkThroughputMaxKbps;

    public String getNetworkThroughputMaxKbps() {
        return this.networkThroughputMaxKbps;
    }

    public VmUtilizationMetricsResponse(
        Integer cpuAverage,
        Integer cpuAveragePercent,
        Integer cpuMax,
        Integer cpuMaxPercent,
        String diskIoRateAverage,
        String diskIoRateAverageKbps,
        String diskIoRateMax,
        String diskIoRateMaxKbps,
        Integer memoryAverage,
        Integer memoryAveragePercent,
        Integer memoryMax,
        Integer memoryMaxPercent,
        String networkThroughputAverage,
        String networkThroughputAverageKbps,
        String networkThroughputMax,
        String networkThroughputMaxKbps) {
        this.cpuAverage = Objects.requireNonNull(cpuAverage, "expected parameter 'cpuAverage' to be non-null");
        this.cpuAveragePercent = Objects.requireNonNull(cpuAveragePercent, "expected parameter 'cpuAveragePercent' to be non-null");
        this.cpuMax = Objects.requireNonNull(cpuMax, "expected parameter 'cpuMax' to be non-null");
        this.cpuMaxPercent = Objects.requireNonNull(cpuMaxPercent, "expected parameter 'cpuMaxPercent' to be non-null");
        this.diskIoRateAverage = Objects.requireNonNull(diskIoRateAverage, "expected parameter 'diskIoRateAverage' to be non-null");
        this.diskIoRateAverageKbps = Objects.requireNonNull(diskIoRateAverageKbps, "expected parameter 'diskIoRateAverageKbps' to be non-null");
        this.diskIoRateMax = Objects.requireNonNull(diskIoRateMax, "expected parameter 'diskIoRateMax' to be non-null");
        this.diskIoRateMaxKbps = Objects.requireNonNull(diskIoRateMaxKbps, "expected parameter 'diskIoRateMaxKbps' to be non-null");
        this.memoryAverage = Objects.requireNonNull(memoryAverage, "expected parameter 'memoryAverage' to be non-null");
        this.memoryAveragePercent = Objects.requireNonNull(memoryAveragePercent, "expected parameter 'memoryAveragePercent' to be non-null");
        this.memoryMax = Objects.requireNonNull(memoryMax, "expected parameter 'memoryMax' to be non-null");
        this.memoryMaxPercent = Objects.requireNonNull(memoryMaxPercent, "expected parameter 'memoryMaxPercent' to be non-null");
        this.networkThroughputAverage = Objects.requireNonNull(networkThroughputAverage, "expected parameter 'networkThroughputAverage' to be non-null");
        this.networkThroughputAverageKbps = Objects.requireNonNull(networkThroughputAverageKbps, "expected parameter 'networkThroughputAverageKbps' to be non-null");
        this.networkThroughputMax = Objects.requireNonNull(networkThroughputMax, "expected parameter 'networkThroughputMax' to be non-null");
        this.networkThroughputMaxKbps = Objects.requireNonNull(networkThroughputMaxKbps, "expected parameter 'networkThroughputMaxKbps' to be non-null");
    }

    private VmUtilizationMetricsResponse() {
        this.cpuAverage = null;
        this.cpuAveragePercent = null;
        this.cpuMax = null;
        this.cpuMaxPercent = null;
        this.diskIoRateAverage = null;
        this.diskIoRateAverageKbps = null;
        this.diskIoRateMax = null;
        this.diskIoRateMaxKbps = null;
        this.memoryAverage = null;
        this.memoryAveragePercent = null;
        this.memoryMax = null;
        this.memoryMaxPercent = null;
        this.networkThroughputAverage = null;
        this.networkThroughputAverageKbps = null;
        this.networkThroughputMax = null;
        this.networkThroughputMaxKbps = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmUtilizationMetricsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer cpuAverage;
        private Integer cpuAveragePercent;
        private Integer cpuMax;
        private Integer cpuMaxPercent;
        private String diskIoRateAverage;
        private String diskIoRateAverageKbps;
        private String diskIoRateMax;
        private String diskIoRateMaxKbps;
        private Integer memoryAverage;
        private Integer memoryAveragePercent;
        private Integer memoryMax;
        private Integer memoryMaxPercent;
        private String networkThroughputAverage;
        private String networkThroughputAverageKbps;
        private String networkThroughputMax;
        private String networkThroughputMaxKbps;

        public Builder() {
    	      // Empty
        }

        public Builder(VmUtilizationMetricsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuAverage = defaults.cpuAverage;
    	      this.cpuAveragePercent = defaults.cpuAveragePercent;
    	      this.cpuMax = defaults.cpuMax;
    	      this.cpuMaxPercent = defaults.cpuMaxPercent;
    	      this.diskIoRateAverage = defaults.diskIoRateAverage;
    	      this.diskIoRateAverageKbps = defaults.diskIoRateAverageKbps;
    	      this.diskIoRateMax = defaults.diskIoRateMax;
    	      this.diskIoRateMaxKbps = defaults.diskIoRateMaxKbps;
    	      this.memoryAverage = defaults.memoryAverage;
    	      this.memoryAveragePercent = defaults.memoryAveragePercent;
    	      this.memoryMax = defaults.memoryMax;
    	      this.memoryMaxPercent = defaults.memoryMaxPercent;
    	      this.networkThroughputAverage = defaults.networkThroughputAverage;
    	      this.networkThroughputAverageKbps = defaults.networkThroughputAverageKbps;
    	      this.networkThroughputMax = defaults.networkThroughputMax;
    	      this.networkThroughputMaxKbps = defaults.networkThroughputMaxKbps;
        }

        public Builder setCpuAverage(Integer cpuAverage) {
            this.cpuAverage = Objects.requireNonNull(cpuAverage);
            return this;
        }

        public Builder setCpuAveragePercent(Integer cpuAveragePercent) {
            this.cpuAveragePercent = Objects.requireNonNull(cpuAveragePercent);
            return this;
        }

        public Builder setCpuMax(Integer cpuMax) {
            this.cpuMax = Objects.requireNonNull(cpuMax);
            return this;
        }

        public Builder setCpuMaxPercent(Integer cpuMaxPercent) {
            this.cpuMaxPercent = Objects.requireNonNull(cpuMaxPercent);
            return this;
        }

        public Builder setDiskIoRateAverage(String diskIoRateAverage) {
            this.diskIoRateAverage = Objects.requireNonNull(diskIoRateAverage);
            return this;
        }

        public Builder setDiskIoRateAverageKbps(String diskIoRateAverageKbps) {
            this.diskIoRateAverageKbps = Objects.requireNonNull(diskIoRateAverageKbps);
            return this;
        }

        public Builder setDiskIoRateMax(String diskIoRateMax) {
            this.diskIoRateMax = Objects.requireNonNull(diskIoRateMax);
            return this;
        }

        public Builder setDiskIoRateMaxKbps(String diskIoRateMaxKbps) {
            this.diskIoRateMaxKbps = Objects.requireNonNull(diskIoRateMaxKbps);
            return this;
        }

        public Builder setMemoryAverage(Integer memoryAverage) {
            this.memoryAverage = Objects.requireNonNull(memoryAverage);
            return this;
        }

        public Builder setMemoryAveragePercent(Integer memoryAveragePercent) {
            this.memoryAveragePercent = Objects.requireNonNull(memoryAveragePercent);
            return this;
        }

        public Builder setMemoryMax(Integer memoryMax) {
            this.memoryMax = Objects.requireNonNull(memoryMax);
            return this;
        }

        public Builder setMemoryMaxPercent(Integer memoryMaxPercent) {
            this.memoryMaxPercent = Objects.requireNonNull(memoryMaxPercent);
            return this;
        }

        public Builder setNetworkThroughputAverage(String networkThroughputAverage) {
            this.networkThroughputAverage = Objects.requireNonNull(networkThroughputAverage);
            return this;
        }

        public Builder setNetworkThroughputAverageKbps(String networkThroughputAverageKbps) {
            this.networkThroughputAverageKbps = Objects.requireNonNull(networkThroughputAverageKbps);
            return this;
        }

        public Builder setNetworkThroughputMax(String networkThroughputMax) {
            this.networkThroughputMax = Objects.requireNonNull(networkThroughputMax);
            return this;
        }

        public Builder setNetworkThroughputMaxKbps(String networkThroughputMaxKbps) {
            this.networkThroughputMaxKbps = Objects.requireNonNull(networkThroughputMaxKbps);
            return this;
        }
        public VmUtilizationMetricsResponse build() {
            return new VmUtilizationMetricsResponse(cpuAverage, cpuAveragePercent, cpuMax, cpuMaxPercent, diskIoRateAverage, diskIoRateAverageKbps, diskIoRateMax, diskIoRateMaxKbps, memoryAverage, memoryAveragePercent, memoryMax, memoryMaxPercent, networkThroughputAverage, networkThroughputAverageKbps, networkThroughputMax, networkThroughputMaxKbps);
        }
    }
}
